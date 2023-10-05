<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
h1{

color: purple;

}
h4{
color:fuchsia;
}

</style>


</head>
<body>

<h1>The Content Of the your searched book <br></h1>



<div class="container mt-5">
    <h2>Book Title::</h2>
    
    <h4> ${dto.bookName } :</h4>
    
    <!-- Content area using Bootstrap container class -->
    <div class="container bg-light p-4">
       
       <h5>${dto.content }</h5>
 
    </div>
    <p>read full book ........<button>Download</button><p>  
</div>

<!-- Include Bootstrap JavaScript and Popper.js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.5.0/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@2.11.6/dist/umd/popper.min.js"></script>

</body>
</html>