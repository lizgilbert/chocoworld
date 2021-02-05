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


</style>
</head>
<form id="get_diary">
          <div>
          <label>Bno</label> <input name='dbno'
            value='<c:out value="${diary.dbno }"/>'readonly="readonly"/>
        </div>

   <div>          
   <label>Title</label> <input name='title'
            value='<c:out value="${diary.title }"/>' readonly="readonly"/>

        <div>
         <!--  <label>Text area</label> -->
          <textarea name='content'
            readonly="readonly" style="background-color: #e5e0e6;"><c:out value="${diary.content}" /></textarea>
        </div>

        <div>
          <label>Writer</label> <input name='writer'
            value='<c:out value="${diary.writer }"/>' readonly="readonly"/>
        </div>
        </form>

