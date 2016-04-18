<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- style type="text/css">

@import url('<c:url value="/resources/css/pc.css"/>');
</style-->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="<c:url value='/resources/js/jquery-2.2.2.js'/>"></script>
  <script src="<c:url value='/resources/se2/js/HuskyEZCreator.js'/>"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
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

<div class="container col-lg-9 col-md-9">
<form:form action="../memo/insert" method="post" commandName="memoVO">
<table class="table table-striped table-bordered" role="form">
	<caption>메모 입력</caption>
	<tr>
		<th>제목</th>
		<td><input class="form-control" type="text" name="title" autofocus="autofocus" value="${memoVO.title}"/>
			<form:errors path="title" class="bg-danger"/>
			</td>
	</tr>
	<tr>
		<th>이름</th>
		<td><input class="form-control" type="text" name="name" value="${memoVO.name}"/>
		<form:errors path="name" class="bg-danger"/>
		</td>
	</tr>
	<tr>
		<th>이메일</th>
		<td><input class="form-control" type="text" name="email" value="${memoVO.email}"/>
		<form:errors path="email" class="bg-danger"/>
		</td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input class="form-control" type="password" name="pwd" value="${memoVO.pwd}"/>
		<form:errors path="pwd" class="bg-danger"/>
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
		<form:errors path="content"  class="bg-danger"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input class="form-control" type="submit" id="btnOk" value="완료"/>
		</td>
	</tr>
</table>
</form:form>
</div>

</body>
</html>