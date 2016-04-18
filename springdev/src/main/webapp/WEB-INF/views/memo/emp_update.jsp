<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<form action="empUpdateAction" role="form" method="post">
	<table border="1" class="table table-striped table-bordered">
		<caption>사원 조회</caption>
		<tr>
			<th>사번</th>
			<td>${empVO.empno}
				<input class="form-control" type="hidden" hidden="hidden" name="empno" value="${empVO.empno}" id="empno"/>
			</td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input class="form-control" type="text" name="ename" value="${empVO.ename}"/></td>
		</tr>
		<tr>
			<th>급여</th>
			<td><input class="form-control" type="number" name="sal" step="10000" value="${empVO.sal}"></td>
		</tr>
		<tr>
			<th>부서</th>
			<td>
				<select class="form-control" name="deptno">
				<c:forEach items="${deptList}" var="dept">
					<option value="${dept.deptno}"
					<c:if test="${empVO.deptVO.deptno == dept.deptno}">
						selected="selected" 						
					</c:if>
					>
					${dept.deptno} : ${dept.dname}
					</option>
					
				</c:forEach>
				
				</select>
			</td>
		</tr>
		
	</table>
	<input type="button" value="목록" class="btn" onclick="location.href='empList'"/> 
	<input type="submit" value="수정" class="btn"/>
</form>
</div>
</body>
</html>