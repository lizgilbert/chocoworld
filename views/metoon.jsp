<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
* {
	margin: 0px auto; padding: 0px; vertical-align: middle; text-align:center
}
	  html,body{width:100%;height:70%; }
      html{overflow-y:scroll}
      body,div,dl,dt,dd,ul,ol,li,h1,h2,h3,h4,h5,form,fieldset,p,button{margin:0;padding:0}
      body,h2,h3,h4,input,button{font-family:NanumGothicWeb,verdana,dotum, 
                                             sans-serif;	font-size: 17px;
color:#383d41}
	  a{text-decoration:none}

</style>
<title>Insert title here</title>
</head>
<body>

<img alt="illust" src="/resources/img/webtoon.jpeg" width:"600"/>
<%-- 			<table>
					<thead>
						<tr>
							<th>#</th>
							<th>Title</th>
							<th>Writer</th>
							<th>Register</th>
							<th>Update</th>
						</tr>
					</thead>

          <c:forEach items="${list}" var="toon">
            <tr>
              <td><c:out value="${toon.bno}" /></td>
               <td><c:out value="${toon.title}" /></td>
              <td><c:out value="${toon.writer}" /></td>
              <td><fmt:formatDate pattern="yyyy-MM-dd"
                  value="${toon.regdate}" /></td>
              <td><fmt:formatDate pattern="yyyy-MM-dd"
                  value="${toon.updateDate}" /></td>
            </tr>
          </c:forEach>

				</table> --%>

</body>
</html>