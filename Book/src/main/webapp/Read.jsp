<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
h5{
color: red;
}

</style>


</head>
<body>

<div class="container text-center mt-5">
<form action="read"  method="get">
 <h1>See The Available Books</h1>
 <button type="submit" class="btn btn-primary">Available Books</button>
</form>

</div>


<div class="container">
        <h1 class="h1tag"></h1>
        <table class="table table-bordered" border=1>
        
       <c:forEach var="list"  items="${dto }">
            <thead >
                <tr>
                     <th   class="border">BookNo.</th>
                    <th  class="border">BookName</th>
                    <th  class="border"> Author</th>
                    <th  class="border">Publisher 3</th>
                    <th  class="border">published Year</th>
                    <th  class="border">language </th>
                  
                </tr>
            </thead>
            <tbody>
                <tr >
                 <td  class="border"><h6>${list.id }</h6></td>
                    <td  class="border"><h6>${list.bookName }</h6></td>
                    <td  class="border"><h6>${list.author }</h6></td>
                    <td  class="border"><h6>${list.publisher }</h6></td>
                    <td  class="border"><h6>${list.publishedIn }</h6></td>
                      <td  class="border"><h6>${list.language }</h6></td>
                    
                </tr>
                
                </c:forEach>
                
            </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap/dist/js/bootstrap.min.js"></script>



<div class="container text-center mt-5">
<form action="find"  method="get">

<h2>Search The Content Of The book</h2>
<input type="text" name="bookName" placeholder="Enter Book Name"> 
    <button type="submit" class="btn btn-primary">SearchBook</button>

<h5>${nameValidate }</h5>
<h5>${find }</h5>


</form>
</div>



  

<!-- Include Bootstrap JavaScript and Popper.js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.5.0/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@2.11.6/dist/umd/popper.min.js"></script>



</body>
</html>