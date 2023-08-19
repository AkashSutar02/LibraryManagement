<%@page import="javax.accessibility.AccessibleStateSet"%>
<%@page import="dto.StatDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.Execute"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
<body>
<%
ArrayList<StatDTO> iss=(ArrayList)request.getAttribute("is");
ArrayList<StatDTO> reu=(ArrayList)request.getAttribute("reu");

%>
<table class="table">
<h1 style="text-align: center">Issue Book</h1>
<thead>
<tr>
<th scope="col">Student Id</th>
<th scope="col">Student Name</th>
<th scope="col">Book name</th>
<th scope="col">Issue Date</th>
</tr>
</thead>

<tbody>
<% for(StatDTO d:iss){ %>
<tr>
<td><%=d.getId()%></td>
<td><%=d.getName()%></td>
<td><%=d.getBookname()%></td>
<td><%=d.getDate()%></td>
</tr>
<%} %>
</tbody>

</table>

<br><br>
<hr>
<br><br>
<table class="table">
<h1 style="text-align: center">Return Book</h1>

<thead>
<tr>
<th scope="col">Student Id</th>
<th scope="col">Student Name</th>
<th scope="col">Book name</th>
<th scope="col">Issue Date</th>
</tr>
</thead>

<tbody>

<%for(StatDTO d1: reu){ %>


<td><%=d1.getId()%></td>
<td><%=d1.getName()%></td>
<td><%=d1.getBookname()%></td>
<td><%=d1.getDate()%></td>
</tr>

<%} %>

</tbody>





</table>






</body>
</html>