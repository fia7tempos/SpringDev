<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
</head>
<body>

<form:form action="delete" method="post">
<div class="container col-lg-8">
<div class="jumbotron">
    <h1>DELETE 메모</h1>
    <h2>조심히 지워주세용</h2> 
    <p>흑흑</p> 
    <p>잘가</p> 
  </div>
  
<table class="table table-striped table-bordered" role="form">
	<caption>상세보기</caption>
	<tr>
		<th>글번호</th>
		<td>${no} <input type="hidden" name="no" value="${no}">
			</td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input class="form-control" type="password" name="pwd" value="${memoVO.pwd}" autofocus="autofocus"/>
		</td>
	</tr>
</table>
<input type="submit" id="btnOk" class="btn"/> 
</div>
</form:form>

</body>
</html>