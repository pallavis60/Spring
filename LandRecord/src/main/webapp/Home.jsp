<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<style>

#home{
color: white;
text-transform: uppercase;
font-size: large;
font-weight:bold; 
margin-left: 100px;

}
h6{
color: red;
}
#home:hover{
color: orange;
}

h4{
text-align: center;
}
h5{
color: green;
}


</style>


</head>
<body>


<nav class="navbar navbar-expand-lg navbar-light bg-dark">
    <div class="container">
        <a class="navbar-brand" id="home" href="Index.jsp">Home</a>
        </div>
        </nav>
              
 <div style="height: 70px"></div>
 
 
<h4>LogIn</h4>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
         <form action="home" method="get" >
                <div class="form-group">
                    <label for="email">Enter your email:</label>
                    <input type="email" class="form-control" name="email" value="<%= (request.getParameter("email") != null) ? request.getParameter("email") : "" %>" required > 
                </div>
                      <h5>${otpSent }</h5>
                      <h6> ${emailValidate }</h6>
                      <h6> ${AccountNotExist}</h6>
          
                <button type="submit" class="btn btn-warning">Send OTP</button>
                 </form>
                  <form action="sendOtp" method="post" >
                <div class="form-group">
                    <label for="otp">Enter OTP:</label>
                    <input type="password" class="form-control" name="otp"  required >
                </div>
                <h6>${otp }</h6>
                <button type="submit" class="btn btn-warning">Submit</button>
                
                
            </form>
                 
               
        </div> 
    </div>
</div>




<!-- Link to Bootstrap JS and jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

 <div style="height: 120px"></div>


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