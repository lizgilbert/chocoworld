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
          <div>
          <label>Bno</label> <input name='dbno'
            value='<c:out value="${diary.dbno }"/>' readonly="readonly">
        </div><br>

   <div>          
   <label>Title</label> <input name='title'
            value='<c:out value="${diary.title }"/>' readonly="readonly">
        </div><br>

        <div>
          <label>Text area</label>
          <textarea rows="3" name='content'
            readonly="readonly"><c:out value="${diary.content}" /></textarea>
        </div><br>

        <div>
          <label>Writer</label> <input name='writer'
            value='<c:out value="${diary.writer }"/>' readonly="readonly">
        </div><br>

