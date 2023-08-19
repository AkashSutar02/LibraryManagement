<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>


<style >
body{background-image:url("https://cdn.pixabay.com/photo/2016/02/16/21/07/books-1204029_1280.jpg");

}
.card{
	background-image: url("https://cdn.pixabay.com/photo/2017/08/06/22/01/books-2596809_1280.jpg");
	
	
	width:700px;
    height: 550px
}
.forms-inputs{
	position: relative
	}
	

.forms-inputs input{
	height: 50px;
	border: 2px solid white;
	}
.forms-inputs input:focus{
	box-shadow: none;
	outline: none;
	border: 2px solid red;}
	
	.btn{
	height: 50px;
	margin-left: 140px;
	
	
	}	
	.form-data{
	color: #75e817;
	
	}
	input{
	color:	white;
	 background-color: transparent;
	}
	


</style>
</head>
<body>



<form action="returnBook" method="post">
<div class="container mt-5">
    <div class="row d-flex justify-content-center" style="margin-top: 100px">
        <div class="col-md-6">
            <div class="card px-5 py-5" id="form1">
                <div class="form-data">
                    <div class="forms-inputs mb-4"> 
                    <span style="font-size:1.50rem;">Enter roll number</span> 
                   <input type="number" name="roll" style="margin-left: 15px; padding-left: 50px;"/>  
                    </div>
                    <div class="forms-inputs mb-4"> <span style="font-size:1.5rem;">Enter Book Id</span> 
                   		<input type="number" name="bid" style="margin-left: 25px ;padding-left:50px"/>
                    </div>
                     <div class="forms-inputs mb-4"> <span style="font-size:1.5rem;">Due date</span> 
                   		<input type="date" name="idate" style="margin-left: 85px ;padding-left:50px" />
                    </div>
                    
                    
                    <div class="mb-3" align="center" >
                     <button type="submit" class="btn btn-primary" >Due Book</button> </div>
                </div>
               
            </div>
        </div>
    </div>
</div>
</form>



</body>
</html>