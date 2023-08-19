<%@page import="dto.AllStudentDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
body{
background-image: url("https://cdn.pixabay.com/photo/2019/09/16/12/45/book-4480899_1280.jpg");
background-attachment:fixed;

}
h1{
background-color: white;
}
*{
padding: 0px;
margin: 0}
table{
margin-top: -10px;}
</style>
</head>
<body>
<% 
ArrayList<AllStudentDTO> data=(ArrayList)request.getAttribute("data");
%>

<table class="table">
<h1 style="text-align: center">STUDENT INFORMATION</h1>
<thead>
<tr>
<th scope="col">STUDENT NAME</th>
<th scope="col">STUDENT ROLL</th>
<th scope="col">STUDENT EMAIL</th>
<th scope="col">STUDENT COURSE</th>
<th scope="col">STUDENT PASS</th>
<th scope="col">STUDENT BRANCH</th>
</tr>
</thead>

<tbody>
<% for(AllStudentDTO d:data){ %>
<tr>
<td><%=d.getName()%></td>
<td><%=d.getRoll()%></td>
<td><%=d.getEmail()%></td>
<td><%=d.getCourse()%></td>
<td><%=d.getPassword()%></td>
<td><%=d.getBranch()%></td>
</tr>
<%} %>
</tbody>

</table>





</body>
</html>