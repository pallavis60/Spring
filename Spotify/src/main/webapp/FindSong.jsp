<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find your choice</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
 
 <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
 <style>
 .card-header{
 
 background-color: blue;
 text-transform: capitalize;
 font-weight:bolder;
 text-align: center;
 color: white;
 font-size: larger;

 
 
 }
 
 #dataSaved{
 text-align: center;
 color: green;
 
 }
 
 #card{
  background:fuchsia;
  color: white;
  
 }
 #url{
 
 color:red;
 }
 .input{
 position:relative;
 left:250px;
 border-color: blue;

 
 }
 .button{
 
position:relative;
 left:250px;
 border-color: blue;
 color: white;
 background: blue;
  
 }
 h5{
 
 color: red;
 position:relative;
 left:250px;
 }
 
 
 </style>
 
 
</head>
<body>
<form action="find"  method="get" >
<input  class="input" type="text" name="songTitle" placeholder="Enter Song Name">


<button class="button" type="submit">Find Song</button>
<h5>${nameValidation }</h5>
<h5>${SongNotFound }</h5>


</form>


<div class="container mt-5" >
        <div class="row justify-content-center" >
            <div class="col-md-6">
                <div class="card" id="card">
                    <div class="card-header">
                        Song Details
                    </div>
                    <div class="card-body">
                        <h4 class="card-title">Song Title : ${ finded.songTitle }</h4>
                        <p class="card-text">Artist:  ${ finded.artistName }</p>
                        <p class="card-text">MovieName:  ${finded.movieName }</p>
                        <p class="card-text">Duration: ${finded.duration } </p>
                        <p class="card-text">Artist:  ${finded.artistName} </p>
                        <p class="card-text" id="url">URL: ${finded.songUrl } <a href="#songURL">Song URL</a></p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Add Bootstrap JS and jQuery scripts here (required for Bootstrap functionality) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>




</body>
</html>