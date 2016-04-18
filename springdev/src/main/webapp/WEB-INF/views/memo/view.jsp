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
  <script src="<c:url value='/resources/se2/js/HuskyEZCreator.js'/>"></script>
  <script type="text/javascript">
  var editors = [];
  

  
  $(document).ready(function(){
	 $("#btnOk").click(function(){
		 editors[0].exec("UPDATE_CONTENTS_FIELD",[]); 
	 }); 
  });
  </script>
  
</head>
<body>

<form:form action="../memo/update" method="post" commandName="memoVO">
<div class="container col-lg-8">
<div class="jumbotron">
    <h1>View Memo</h1>
    <h2>상세보기</h2> 
    <p>ViewResolver : view</p> 
    <p>ViewResolver : view</p> 
  </div>
  
<table class="table table-striped table-bordered" role="form">
	<caption>상세보기</caption>
	<tr>
		<th>글번호</th>
		<td>${memoVO.no} <input type="hidden" name="no" value="${memoVO.no}">
			</td>
	</tr>
	<tr>
		<th>제목</th>
		<td><input class="form-control" type="text" name="title" autofocus="autofocus" value="${memoVO.title}"/>
			</td>
	</tr>
	<tr>
		<th>이름</th>
		<td><input class="form-control" type="text" name="name" value="${memoVO.name}"/>
		</td>
	</tr>
	<tr>
		<th>등록일</th>
		<td>${memoVO.regdate} <input type="hidden" name="regdate" value="${memoVO.regdate}">
		</td>
	</tr>
	<tr>
		<th>이메일</th>
		<td><input class="form-control" type="text" name="email" value="${memoVO.email}"/>
		</td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input class="form-control" type="password" name="pwd" value="${memoVO.pwd}"/>
		</td>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea id="content" name="content" class="form-control" style="width:645px;height:230px;">
		${memoVO.content}
		</textarea>
		<script type="text/javascript">
			
			nhn.husky.EZCreator.createInIFrame({
				oAppRef:editors,
				elPlaceHolder:"content",
				sSkinURI:"<c:url value='/resources/se2/SmartEditor2Skin.html' />",
				fCreator:"createEditor2",
				htParams: { fOnBeforeUnload : function(){}}	
			});
		</script>
		</td>
	</tr>
</table>
<input type="submit" id="btnOk" class="btn"/> 
</div>
</form:form>

</body>
</html>