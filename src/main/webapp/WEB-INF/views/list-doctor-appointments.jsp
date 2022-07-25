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
<div id="root">
        <div id="form">
            <form:form action="" method="post" modelAttribute="getdoc">
                <div>
                    <label for="doctor_id">Doctor Id</label>
                    <div>
                        <form:input path="doctor_id" />
                    </div>
                </div>
                <div>
                    <label for="doctor_name">Doctor Name</label>
                    <div>
                        <form:input path="doctor_name" />
                    </div>
                </div>
                <div>
                    <label for="dob">Date of Birth</label>
                    <div>
                        <form:input path="dob" />
                    </div>
                </div>
                <div>
                    <label for="speciality">Speciality</label>
                    <div>
                        <form:input path="speciality" />
                    </div>
                </div>
                <div>
                    <label for="city">City</label>
                    <div>
                        <form:input path="city" />
                    </div>
                </div>
                <div>
                    <label for="phone_no">Phone Number/label>
                    <div>
                        <form:input path="phone_no" />
                    </div>
                </div>
                <div>
                    <label for="standard_fees">Standard Fees</label>
                    <div>
                        <form:input path="standard_fees" />
                    </div>
                </div>
            </form:form>
        </div>


<div id="table root">
<table>
<thead>
<tr>
<th>appointment_id</th>
<th>appointment_name</th>
<th>appointment_date</th>
<th>patient_name</th>
<th>fees_collected</th>
</tr>
</thead>
<tbody>
<c:forEach var="app" items="${alldoctors}"> 
<tr>
<td>${app.appointment_id}</td>
<td>${app.appointment_name}</td>
<td>${app.appointment_date}</td>
<td>${doc.patient_name}</td>
<td>${doc.fees_collected}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>