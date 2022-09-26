<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Employee</title>
</head>
<body>

<form action="updateEmp"method="post">
<pre>
Id: <input type="text" name="id" value="${employee.id}" readonly/>
Employee Number: <input type="text" name="empnum" value="${employee.empnum}"/>
Employee Name: <input type="text" name="ename" value="${employee.ename}"/>
Team: Development<input type="radio" name="team" value="DEVEPLOMENT" ${employee.team=='DEVEPLOMENT'?'checked':''}/>
		Testing<input type="radio" name="team" value="TESTING" ${employee.team=='TESTING'?'checked':''}/>
Employee Age: <input type="text" name="age" value="${employee.age}"/>
<input type="submit" value="SAVE"/>	
</pre>	
</form>
</body>
</html> 