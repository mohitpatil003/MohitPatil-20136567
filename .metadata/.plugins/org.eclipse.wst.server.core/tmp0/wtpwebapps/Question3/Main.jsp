<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.lang.*"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>

<body>
	
	<%
	int amount = Integer.parseInt(request.getParameter("amount"));
	int time = Integer.parseInt(request.getParameter("time"));
	int rate = Integer.parseInt(request.getParameter("rate"));
	int ramount = ((amount*time*rate)/100);
	int tamount = ramount + amount;
	int mamount = (amount*rate)/100; 
	%>
	
	<h1>Total amount: <%= tamount %></h1>
	<h1>Monthly amount: <%= mamount %></h1>
	
</body>

</html>