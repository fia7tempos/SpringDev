<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

@import url('<c:url value="/resources/css/pc.css"/>');
</style>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
</head>
<body>

<div class="container col-lg-5">
<table class="table table-striped table-bordered" role="form">
	<caption>메모 입력</caption>
	<tr>
		<th>제목</th>
		<td>${memoVO.title}
			</td>
	</tr>
	<tr>
		<th>이름</th>
		<td>${memoVO.name}
		</td>
	</tr>
	<tr>
		<th>이메일</th>
		<td>${memoVO.email}
		</td>
	</tr>
	<tr>
		<th>내용</th>
		<td>
		${memoVO.content}
		</td>
	</tr>
</table>
</div>

</body>
</html>