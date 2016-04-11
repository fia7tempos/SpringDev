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
  <script type="text/javascript">
  	function fn_delete(btn){
  		var r = confirm('정말로 '+btn.name+'번 사원을 죽이겠습니까?');
  		if(r){
  			location.href= 'empDelete?empno='+btn.name;  			
  		} 		
  	}
  </script>
</head>
<body>
<div class="container col-lg-8 ">
<table class="table table-striped table-bordered">
<tr>
	<th>사번</th>
	<th>이름</th>
	<th>급여</th>
	<th>부서</th>
	<th>삭제</th>
</tr>
<c:forEach items="${list}" var="vo">
<tr>
	<td><a href="empUpdate?empno=${vo.empno}">${vo.empno}</td>
	<td>${vo.ename}</td>
	<td>${vo.sal}</td>
	<td>${vo.deptVO.dname}</td>
	<td><input class="btn" type="button" name="${vo.empno}" value="암살" onclick="fn_delete(this)"/> </td>
</tr>
</c:forEach>
<tr>
	<th colspan="2">총 급여 합계:</th>
	<td colspan="3">${totalSal}</td>
</tr>
</table>
<a href="empInsert">사원 추가</a>
</div>
<br/>

</body>
</html>