<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>
<div id="table root">
<table>
<thead>
<tr>
<th>employee_id</th>
<th>first_name</th>
<th>last_name</th>
<th>email</th>
<th>hire_date</th>
<th>job_id</th>
<th>salary</th>
</tr>
</thead>
<tbody>
<c:forEach var="emp" items="${allemployes}"> 
<tr>
<td>${emp.employee_id}</td>
<td>${emp.first_name}</td>
<td>${emp.last_name}</td>
<td>${emp.email}</td>
<td>${emp.hire_date}</td>
<td>${emp.job_id}</td>
<td>${emp.salary}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>