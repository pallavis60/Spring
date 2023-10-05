<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
 crossorigin="anonymous">

<style>
 h6{
 color: red;
 }
 h5{
 color:green;
 
 }
 

</style>
</head>
<body>


 <div class="container mt-5">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <h2 class="text-center">Student Registration  Form</h2>
                
                 <h6>${dtoNull }</h6>
              <h5>${dtoSaved }</h5>
               <h6>${dtoNotSaved }</h6>
                
                <form  action="register"  method="post">
                    <!-- Field 1: Name -->
                    <div class="form-group">
                        <label for="name">Name:</label>
                        <input type="text" class="form-control" id="name"  name="name" required>
                    </div>
                    <h6>${name }</h6>
                    
                    <!-- Field 2: Email -->
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" class="form-control" id="email" name="email"  required>
                    </div>
                    <h6>${email }</h6>
                    
                    <!-- Field 3: Phone Number -->
                    <div class="form-group">
                        <label for="phone">Phone Number:</label>
                        <input type="tel" class="form-control" id="phone" name="number" required>
                    </div>
                    <h6>${number }</h6>
                    
                     <div class="form-group">
                        <label for="name">FatherName:</label>
                        <input type="text" class="form-control" id="fatherName"  name="fatherName" required>
                    </div>
                    <h6>${fatherName }</h6>
                    
                     <div class="form-group">
                        <label for="name">MotherName:</label>
                        <input type="text" class="form-control" id="motherName"  name="motherName" required>
                    </div>
                    <h6>${motherName }</h6>
                    
                    <!-- Field 4: Date of Birth -->
                    <div class="form-group">
                        <label for="dob">Date of Birth:</label>
                        <input type="date" class="form-control" id="dob" name="dateOfBirth" required>
                    </div>
                    <h6>${date }</h6>
                    
                    <!-- Field 5: Gender -->
                    <div class="form-group">
                        <label for="gender">Location:</label>
                        <select class="form-control"  name="location" required>
                            <option value="">Select Location</option>
                            <option value="Karnataka">Karnataka</option>
                            <option value="Tamilnadu">Tamilnadu</option>
                            <option value="Andrapradesh">Andrapradesh</option>
                             <option value="other">Others</option>
                            
                        </select>
                    </div>
                    <h6>${location }</h6>
                    
                   
                    
                    <!-- Submit Button -->
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
                
            </div>
        </div>
    </div>
    
    <!-- Include Bootstrap JS and jQuery links -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>