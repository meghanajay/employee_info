<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h2>Employees:</h2>

<table>
<tr>
<th>id</th>
<th>empnum</th>
<th>ename</th>
<th>team</th>
<th>age</th>
</tr>
<c:forEach items="${employees}" var="employee">
<tr>
<td>${employee.id}</td>
<td>${employee.empnum}</td>
<td>${employee.ename}</td>
<td>${employee.team}</td>
<td>${employee.age}</td>
<td><a href="deleteEmployee?id=${employee.id}">Delete</a></td>
<td><a href="showUpdate?id=${employee.id}">Edit</a></td>
</tr>
</c:forEach>
</table>
<a href="showCreate">Add Employee</a>
</body>
</html>