<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- Custom CSS -->
<link href="/resources/css/sb-admin-2.css" rel="stylesheet">
<style>
* {
	margin: 0px auto; padding: 0px; vertical-align: middle; text-align:center
}
	  html,body{width:100%;height:70%}
      html{overflow-y:scroll}
      body,div,dl,dt,dd,ul,ol,li,h1,h2,h3,h4,h5,form,fieldset,p,button{margin:0;padding:0}
      body,h1,h2,h3,h4,input,button{font-family:NanumGothicWeb,verdana,dotum, 
                                             sans-serif;font-size:15px;color:#383d41}
	  a{text-decoration:none}

</style>
</head>
<body>
	<table class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th>#</th>
				<th>Writer</th>
				<th>Title</th>
				<th>Register</th>
				<th>Update</th>
			</tr>
		</thead>

		<c:forEach items="${list}" var="diary">
			<tr>
				<td><c:out value="${diary.dbno}" /></td>
				<td><c:out value="${diary.writer}" /></td>
				<td><a href='/get?dbno=<c:out value="${diary.dbno}"/>'><c:out value="${diary.title }"/></a></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd"
						value="${diary.regdate}" /></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd"
						value="${diary.updatedate}" /></td>
			</tr>
		</c:forEach>

	</table>
	 <form id='actionForm' action="list" method='get'>
     </form>
	<a href="/diary"><img src="/resources/img/journal.png" width="60"></a>
</body>
</html>


