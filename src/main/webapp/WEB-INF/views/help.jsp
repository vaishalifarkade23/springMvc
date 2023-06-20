<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!--     to add expression language -->
    <%@page isELIgnored="false" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>help</title>
</head>
<body>
<% 

// String name=(String)request.getAttribute("name");
// Integer roll=(Integer)request.getAttribute("roll");
// LocalDateTime nowtime = (LocalDateTime)request.getAttribute("time");
 %> 

<h1>help page loading</h1>
<h1>My name is:
<!-- printing data using  jsp expression tag -->
<%-- <%= name %>  --%>

<!-- printing data using expression language -->
${name }
    Roll no:${roll }
<%--     <%= roll %> --%>
    Date n time :
    ${time }
<%--     <%=nowtime %> --%>

<%-- Marks are:${marks } --%>

</h1><hr>
<!-- using JSTL TO  to triverse the collection-->
<c:forEach var="item" items="${marks }">
<%-- <h2>${item}</h2> --%>
<c:out value="${item}"></c:out>
</c:forEach>

<h1>prachi is my name</h1>
</body>
</html>