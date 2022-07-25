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
<th>doctor_id</th>
<th>doctor_name</th>
<th>dob</th>
<th>doctor_speciality</th>
<th>phone_no</th>
<th>city</th>
<th>standard_fees</th>
</tr>
</thead>
<tbody>
<c:forEach var="doc" items="${alldoctors}"> 
<tr>
<td>${doc.doctor_id}</td>
<td>${doc.doctor_name}</td>
<td>${doc.dob}</td>
<td>${doc.doctor_speciality}</td>
<td>${doc.phone_no}</td>
<td>${doc.city}</td>
<td>${doc.standard_fees}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>