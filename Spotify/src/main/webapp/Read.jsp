<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read</title>

 <link href="https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
 <style type="text/css">
 
 .border {
    border: 7px solid #ccc;
    color: blue;
   
    
}

#button{

position: relative;
left:400px;
top:35px;
background: fuchsia;

}
button:hover {
	color:aqua;
}

.h1tag{
color: maroon;

}

</style>

</head>
<body>


<form action="read"   method="get">

<button  id="button"  type="submit">Display Songs</button>

</form>


<div class="container">
        <h1 class="h1tag">Available Songs</h1>
        <table class="table table-bordered" border=1>
        
        <c:forEach var="list" items="${readDto}">
            <thead >
                <tr>
                     <th   class="border">SerialNo</th>
                    <th  class="border">SongName1</th>
                    <th  class="border"> MovieName</th>
                    <th  class="border">ArtistName 3</th>
                    <th  class="border">Duration</th>
                    <th  class="border">Rating </th>
                     <th  class="border"> Song URL</th>
                </tr>
            </thead>
            <tbody>
                <tr >
                 <td  class="border"><h6>${list.id }</h6></td>
                    <td  class="border"><h6>${list.songTitle }</h6></td>
                    <td  class="border"><h6>${list.movieName }</h6></td>
                    <td  class="border"><h6>${list.artistName }</h6></td>
                    <td  class="border"><h6>${list.duration }</h6></td>
                      <td  class="border"><h6>${list.rating }</h6></td>
                    <td  class="border"><h6>${list.songUrl }</h6></td>
                </tr>
                
                </c:forEach>
                
            </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap/dist/js/bootstrap.min.js"></script>





</body>
</html>