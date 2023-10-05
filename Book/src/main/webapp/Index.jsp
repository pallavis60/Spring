<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IndexPage</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

<style type="text/css">


#body{
background-color: yellow;

background-image: url('https://img.freepik.com/premium-photo/blurred-library-interior-space-with-bookshelves_766625-8440.jpg?w=2000');
 background-size: cover;
    background-repeat: no-repeat;
    background-attachment: fixed;

}

.tell{
color: white;
position: relative;
left:300px;
font-size: larger;
font-weight: bolder;
}
.world{

position: relative;
right:240px;
font-weight: bold;
}

#div{
padding-top: 100px;
}

.welcome{
font-weight: bolder;
color: navy;

}
.para{
color: black;
font-weight: bolder;

}



</style>


</head>
<body id="body">
<nav class="navbar navbar-expand-lg navbar-light  bg-primary ">
    <div class="container">
    
    <span class="tell">TELL</span>
     <span class="world">A World of Books</span>
       
        </div>
</nav>


<div  id="div" class="container text-center mt-5">
    <h1 class="welcome">Welcome to the Book App</h1>
    <p class="para"]>Discover and explore a world of books.</p>
    
    <!-- Create two buttons using Bootstrap classes -->
    <a href="Create.jsp" class="btn btn-primary btn-lg mx-2">Add Books</a>
    <a href="Read.jsp" class="btn btn-success btn-lg mx-2">Explore Books</a>
</div>

<!-- Include Bootstrap JavaScript and Popper.js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.5.0/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@2.11.6/dist/umd/popper.min.js"></script>




</body>
</html>