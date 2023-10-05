<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Record</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>

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
        
         <div style="height: 70px"></div>

 <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <h3 class="text-center">Add Record</h3>
                <form method="post" action="submit_action.jsp">
                   <div class="form-group">
                        <label for="state">State:</label>
                        <select class="form-control" id="state" name="state" required>
                            <option value="">Select a state</option>
                            <option value="state1">State 1</option>
                            <option value="state2">State 2</option>
                            <option value="state3">State 3</option>
                        </select>
                    </div>
                    
                     <div class="form-group">
                        <label for="state">District:</label>
                        <select class="form-control" id="state" name="state" required>
                            <option value="">Select a District</option>
                            <option value="state1">State 1</option>
                            <option value="state2">State 2</option>
                            <option value="state3">State 3</option>
                        </select>
                    </div>

                        <div class="form-group">
                        <label for="state">Talhuk:</label>
                        <select class="form-control" id="state" name="state" required>
                            <option value="">Select a Talhuk</option>
                            <option value="state1">State 1</option>
                            <option value="state2">State 2</option>
                            <option value="state3">State 3</option>
                        </select>
                    </div>
                    
                      <div class="form-group">
                        <label for="state">Hobli:</label>
                        <select class="form-control" id="state" name="state" required>
                            <option value="">Select a Hobli</option>
                            <option value="state1">State 1</option>
                            <option value="state2">State 2</option>
                            <option value="state3">State 3</option>
                        </select>
                    </div>
                    
                     <div class="form-group">
                        <label for="village">Village:</label>
                        <input type="text" class="form-control" id="village" name="village" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="city">OwnerName:</label>
                        <input type="text" class="form-control" id="city" name="city" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="phone">MobileNo:</label>
                        <input type="tel" class="form-control" id="phone" name="mobileNo" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="adharNo">AdharNo:</label>
                        <input type="number" class="form-control" id="adharNo" name="adharNo" required>
                    </div>
                   
                    <div class="form-group">
                        <label for="hissaNo:">HissaNo:</label>
                        <input type="text" class="form-control" id="hissaNo:" name="hissaNo:" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="surveyNumber">SurveyNumber:</label>
                        <input type="number" class="form-control" id="surveyNumber" name="surveyNumber" required>
                    </div>
                     <div class="form-group">
                        <label for="year">Year:</label>
                        <input type="number" class="form-control" id="year" name="year" required>
                    </div>
                    
                   
                   
                    <button type="submit" class="btn btn-warning">Submit</button>
                </form>
            </div>
        </div>
    </div>

    <!-- Include Bootstrap JS (optional) -->
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