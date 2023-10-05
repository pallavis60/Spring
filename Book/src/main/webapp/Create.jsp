<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

<style>

h6{

color: red;

}

h2{

color: teal;
font-weight: bolder;
text-decoration: underline;
text-align: center; 
}

body {
	background-color: silver;
}
</style>

</head>
<body>



<div class="container mt-5">
    <h2>Add a New Book</h2>
    
    
  
<form action="addbook"  method="post">
        <div class="mb-3">
            <label for="bookName" class="form-label">BookName</label>
            <input type="text" class="form-control" id="bookName" name="bookName" required>
        </div>
        <h6>${BookName }</h6>
        
        <div class="mb-3">
            <label for="author" class="form-label">Author</label>
            <input type="text" class="form-control" id="author" name="author" required>
        </div>
        <h6>${Author }</h6>
        
         <div class="mb-3">
            <label for="publisher" class="form-label">Publisher</label>
            <input type="text" class="form-control" id="publisher" name="publisher" required>
        </div>
        <h6>${publisher }</h6>
        
         <div class="mb-3">
            <label for="published-year" class="form-label">Published Year</label>
            <input type="number" class="form-control" id="published-year" name="publishedIn" required>
        </div>
        <h6>${pulishedIn }</h6>
        
        
        <div class="mb-3">
            <label for="language" class="form-label">Language</label>
            <select class="form-select"  id="language" name="language" required>
                <option value="" selected disabled>Select Language</option>
                <option value="fiction">English</option>
                <option value="non-fiction">Kannada</option>
                <option value="fantasy">Tamil</option>
                 <option value="fantasy">Telgu</option>
                  <option value="fantasy">Hindi</option>
                <!-- Add more genre options as needed -->
            </select>
            
            <h6>${lang}</h6>
        </div>
        
        <div class="mb-3">
            <label for="description" class="form-label">Content</label>
            <textarea class="form-control" id="description" name="content" rows="4" required></textarea>
        </div>
        
        <h6>${content }</h6>
       
        <button type="submit" class="btn btn-success">Add Book</button>
         <h6>${dtoValidate }</h6>
<h6>${doExist }</h6>
<h6>${saved }</h6>
        
    </form>
</div>

<!-- Include Bootstrap JavaScript and Popper.js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.5.0/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@2.11.6/dist/umd/popper.min.js"></script>



</body>
</html>