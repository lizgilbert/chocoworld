<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%
	Date nowTime = new Date();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Diary</title>

</head>
<body>
    <div>
							<form role="form" action="/diary" method="post">
							  <div>
                                  <label>Title</label>
                                  <input placeholder="제목" type="text" name="title" autofocus></div>
                              <br>
                                <div>
                                  <label>Date</label>
                                  <input type="date" value=<%=nowTime %>>
                                  <!-- <button type="button"><img src="/resources/img/calendar.png" width="20"></button> -->
                              </div>
                              <br>
							
							  <div>
                                  <label>Content</label>
                                  <textarea rows="5" cols="50" name="content"></textarea>
                              </div>
                              <br>
                              <div>
                                  <label>Writer</label>
                                  <input name="writer">
                              </div>
                              <br>
                              <button type="submit">Submit Button</button>
                              <button type="reset">Reset Button</button>
							</form>                           
                        </div>
</body>
</html>