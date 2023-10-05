 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LandRecord</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>

footer{
padding-top: 70px;
}

#land{

color: white;
text-transform: uppercase;
font-size: large;
font-weight:bolder; 

}
#land:hover{
color: orange;
}



#admin,#user{
color: white;
text-transform: uppercase;
font-size: large;
font-weight:bold; 
margin-right: 100px;

}
#admin:hover{

color:orange;


}
#user:hover{
color:orange;
}


</style>

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-dark">
    <div class="container">
        <a class="navbar-brand" id="land" href="#">LandRecorder</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" id="admin" href="Home.jsp">Admin</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" id="user" href="#">User</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Add Bootstrap JS (Popper.js and jQuery are required) -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<div style="height: 500px">


</div>
 <footer class="footer bg-dark text-light py-3">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <p><a href="pallavxworkz.123@gmail.com">&copy; 2023 LandRecorder. All rights reserved.</a></p>
                </div>
                <div class="col-md-6 text-right">
                    <p><a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a></p>
                </div>
            </div>
        </div>
    </footer>





</body>
</html>