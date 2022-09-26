<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Employee</title>
</head>
<body>

<form action="saveEmp"method="post">
<pre>
Id: <input type="text" name="id"/>
Employee Number: <input type="text" name="empnum"/>
Employee Name: <input type="text" name="ename"/>
Team: Development<input type="radio" name="team" value="DEVEPLOMENT"/>
		Testing<input type="radio" name="team" value="TESTING"/>
Employee Age: <input type="text" name="age"/>
<input type="submit" value="SAVE"/>	
</pre>	
</form>
${msg}
<a href="displayEmployees">View All</a>
</body>
</html> 