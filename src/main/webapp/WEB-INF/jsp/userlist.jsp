<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	String myData = (String) getServletContext().getAttribute("myData");
%>

<h2>This is SpringMVC demo page</h2>
<c:forEach items="${users}" var="user">
	<c:out value="${user.username}" /><br/>
	<c:out value="${user.age}" /><br/>
</c:forEach>

<h2>show my data</h2>
<h3><%=myData %></h3>