<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="container col-lg-5">
<form action="empInsertAction" method="post">
<table class="table table-striped table-bordered" role="form">
	<caption>사원 입력</caption>
	<tr>
		<th>이름</th>
		<td><input class="form-control" type="text" name="ename"/></td>
	</tr>
	<tr>
		<th>급여</th>
		<td><input class="form-control" type="number" name="sal"/></td>
	</tr>
	<tr>
		<th>부서</th>
		<td>
			<select class="form-control" name="deptno">
				<c:forEach items="${deptList}" var="dept">
					<option value="${dept.deptno}">${dept.deptno} : ${dept.dname}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input class="form-control" type="submit" value="완료"/>
		</td>
	</tr>
</table>
</form>
</div>

</body>
</html>