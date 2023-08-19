<%@page import="dto.AllBookDTO"%>
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
ArrayList<AllBookDTO> b=(ArrayList)request.getAttribute("data");
%>


<table class="table">
<h1 style="text-align: center">BOOK INFORMATION</h1>
<thead>
<tr>
<th scope="col">BOOK ID</th>
<th scope="col">BOOK NAME</th>
<th scope="col">BOOK AUTHOR</th>

</tr>
</thead>

<tbody>
<% for(AllBookDTO d:b){ %>
<tr>
<td><%=d.getBookId() %></td>
<td><%=d.getBookname()%></td>
<td><%=d.getAuthorename()%></td>

</tr>
<%} %>
</tbody>

</table>


</body>
</html>