<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete And Updated</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

<style>

h6{
color:red;

}


</style>


</head>
<body>

<div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header" id="header">
                        Update Song
                    </div>
                    <div class="card-body">
                      
<form action="update"  method="post" class="updateForm">
                            <div class="form-group">
                                <label for="songTitle">Song Title</label>
                                <input type="text" class="form-control" id="songTitle" placeholder="Enter the song title" name="songTitle">
                            </div>
                            
<h6>${songTitleValidate }</h6>
                            
                            <div class="form-group">
                                <label for="aristName">ArtistName</label>
                                <input type="text" class="form-control" id="artistName" placeholder="Update The ArtistName"  name="artistName">
                            </div>
<h6>${artistvalidate}</h6>
                                                        
                            <button type="submit" class="btn btn-primary">Update</button>
                            <h4>${dataUpdated }</h4>
                            
                        </form>
                       
                    </div>
                </div>
            </div>
        </div>
    </div>
    
 <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
    
    
    
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header" id="header">
                        Delete Song
                    </div>
                    <div class="card-body">
                      
<form action="delete"  method="post" class="dleteFrom">
                            <div class="form-group">
                                <label for="songTitle">Song Title</label>
                                <input type="text" class="form-control" id="songTitle" placeholder="Enter the song title" name="songTitle">
                            </div>
                            
<h6>${songTitleValidate }</h6>
                                                         
                            <button type="submit" class="btn btn-primary">Delete</button>
                           <h6>${deleted }</h6>
                            
                        </form>
                       
                    </div>
                </div>
            </div>
        </div>
    </div>
    
 <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    




</body>
</html>