<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	
<script type="text/javascript">
	function confirm_delete(no){
		if(confirm('정말로 삭제하시겠습니까.')){
			location.href='delete?no='+no;
			return true;
		}
		return false;
	}
</script>
</head>
<body>
	<div class="container col-lg-8 ">
		<div class="jumbotron">
			<h1>Memo Test</h1>
			<p>Memo List </p>
			<p>spring MVC annotation test </p>
		</div>
		<table class="table table-striped table-bordered">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>이름</th>
				<th>날짜</th>
				<th>삭제</th>
			</tr>
			<c:forEach items="${memoList}" var="vo">
				<tr>
					<td>${vo.no}</td>
					<td><a href="view?no=${vo.no}">${vo.title}</a></td>
					<td>${vo.name}</td>
					<td>${vo.regdate}</td>
					<td><input type="button" value="삭제"
						onclick="javascript:confirm_delete(${vo.no});"
					/></td>
				</tr>
			</c:forEach>

		</table>
		<a href="insert">메모 추가</a>
	</div>
	<br />

</body>
</html>