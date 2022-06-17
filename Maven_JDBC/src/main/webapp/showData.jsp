<%@page import="com.ahimdata.model.Datas"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
<h1>...............</h1>
<%
	Datas d1= (Datas)request.getAttribute("anydatas");
	out.print(d1);
%>
</body>
</html>