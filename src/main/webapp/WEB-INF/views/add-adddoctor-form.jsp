<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addemployee</title>
</head>
<body>
<div id="root">
<div id="form">
<form:form action="add" method="post" modelAttribute="adddoctor">
<div>
       <label for="doctor_id">doctorId</label>
       <div >
        <form:input path="doctor_id"  />
       </div>
      </div>
      <div>
       <label for="doctor_name">doctorName</label>
       <div >
        <form:input path="doctor_name"  />
       </div>
      </div>
      <div>
       <label for="dob">DOB</label>
       <div >
        <form:input path="dob"  />
       </div>
      </div>
      <div>
       <label for="doctor_speciality">doctorspeciality</label>
       <div >
        <form:input path="doctor_speciality"  />
       </div>
      </div>
      <div>
       <label for="phone_no">PhoneNumber</label>
       <div >
        <form:input path="phone_no"  />
       </div>
      </div>
      <div>
       <label for="city">City </label>
       <div >
        <form:input path="city"  />
       </div>
      </div>
      <div>
       <label for="standard_fees">Standardfees</label>
       <div >
        <form:input path="standard_fees"  />
       </div>
      </div>
<form:button>Add doctors</form:button>
</div>
</form:form>
</div>
</body>
</html>