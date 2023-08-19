<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
<style type="text/css">
.btn{
text-decoration:none;
 
background-color: transparent;  
color:white; 
height: 80px; 
font-size: 1.80rem;
margin: auto;
}
body{

background-image: url("https://cdn.pixabay.com/photo/2014/09/05/18/32/old-books-436498_1280.jpg");
}
.card{
background-color:transparent;

border-radius: 10px;
}
.card:hover {
 border:none;
	color: #eba0d4;
}

</style>

</head>
<body>



<form action="home" method="post">


<div class="container">
<div class="row" style="margin-top: 100px">
<div class="col">
<div class="card border-success">
      <button class="btn" type="submit" name="btn1" value="NewStudent"><b>New Student</b></button>
   
</div>

</div>
<div class="col">
<div class="card border-success">
   <button class="btn" type="submit" name="btn1" value="NewBook"><b>New Book</b></button>
   
</div>

</div>
  <div class="col">
<div class="card border-success">
     <button class="btn" type="submit" name="btn1" value="Stat" ><b>Statistic</b></button>
   
</div>

</div>

</div>





<div class="row" style="margin-top: 100px">
<div class="col">
<div class="card border-success">
       <button class="btn" type="submit" name="btn1" value="BookIssue"><b>Issue Book</b></button>
   
</div>

</div>
<div class="col">
<div class="card border-success">
      <button class="btn" type="submit" name="btn1" value="ReturnBook"><b>Return Book</b></button>
   
</div>

</div>
  <div class="col">
<div class="card border-success">
     <button class="btn" type="submit" name="btn1" value="logout" ><b>Logout</b></button>
   
</div>

</div>

</div>






<div class="row" style="margin-top: 100px">
<div class="col">
<div class="card border-success">
     <button class="btn" type="submit" name="btn1" value="allStudent" ><b>Show All Students</b></button>
   
</div>

</div>
<div class="col">
<div class="card border-success">
     <button class="btn" type="submit" name="btn1" value="AllBooks" style="margin-left: auto;"><b>Show All Books</b></button>
   
</div>
</div>
  <div class="col">
<div class="card border-success">
      <h2 class="btn" ><b>VISIT AGAIN</b></h2>
   
</div>

</div>

</div>


</div>
</form>



</body>
</html>