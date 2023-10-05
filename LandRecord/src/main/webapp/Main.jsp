<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style type="text/css">
#AdminName{
color: white;
margin-left: 100px;
text-transform: uppercase;
font-size: large;
font-weight:bold; 
}
#AdminName:hover {
	color: orange;
}

#logOut{
color: orange;
text-transform: uppercase;
font-size: large;
font-weight:bold; 
margin-right: 100px;
margin-bottom: 20px;

}
#logOut:hover {
	color:white;
}

button{
color: white;
position: relative;
left: 550px;

}

</style>

</head>
<body>

<header   style="height:70px">
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
    <div class="container">
        <a class="navbar-brand"  id="AdminName"><span style="color:orange;">AdminName:</span> ${dto.adminName }</a>
        </div>
       
         <li class="nav-item">
                    <a class="nav-link" id="logOut" href="Home.jsp">LogOut</a>
                </li>
      
        </nav>
        </header>
        
         <div style="height: 100px"></div>
        
       <a href="AddRecord.jsp"><button  class="btn btn-warning" type="submit">AddRecord</button></a> 
       
         <a href="ViewRecord"><button class="btn btn-warning"  type="submit">ViewRecord</button></a>
        
        
        
        
         <div style="height: 330px"></div>


 <footer style="height:50px" class="footer bg-dark text-light py-3">
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