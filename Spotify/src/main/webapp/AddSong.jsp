<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Songs</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>

.model{
color: red; 
}

#header{

background-color: maroon;
color: white;
text-align: center;
font-weight: bolder;

}

.model1{
color:red;
text-align: center;
}

</style>
</head>
<body>

 <h4 class="model1">${dtoValidate}</h4>

<div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header" id="header">
                        Add a Song
                    </div>
                    <div class="card-body">
                      
<form action="save"  method="post">
                            <div class="form-group">
                                <label for="songTitle">Song Title</label>
                                <input type="text" class="form-control" id="songTitle" placeholder="Enter the song title" name="songTitle">
                            </div>
                            
<h6 class="model">${SongTitle }</h6>
                            <div class="form-group">
                                <label for="movieName">MovieName</label>
                                <input type="text" class="form-control" id="movieName" placeholder="Enter the Movie name" name="movieName">
                            </div>
                                                        
<h6 class="model">${MovieName}</h6>
                            

                            <div class="form-group">
                                <label for="aristName">ArtistName</label>
                                <input type="text" class="form-control" id="aristName" placeholder="Enter the Artist Name"  name="artistName">
                            </div>
 <h6 class="model">${ArtistName}</h6>
                            
                             <div class="form-group">
                                <label for="songURL">Song URL</label>
                                <input type="text" class="form-control" id="songURL" placeholder="Enter the song URL"  name="songUrl">
                            </div>
 <h6 class="model">${url}</h6>
                             <div class="form-group">
                                <label for="duration">Duration</label>
                                <input type="text" class="form-control" id="duration" placeholder="Enter Song Duration" name="duration">
                            </div>
                            
<h6 class="model">${Duration}</h6>
                            
                            <div class="form-group">
                                <label for="rating">Rating</label>
                                <input type="number" class="form-control" id="rating" placeholder="Enter  Rating"  name="rating">
                            </div>
                            
<h6 class="model">${rating}</h6>
                            
                            <button type="submit" class="btn btn-primary">Add Song</button>
                            
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