<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Songs</title>
</head>
<body>

<form action="save"  method="post">
<input type="text"  name="songTitle"  placeholder="SongTitle">
<input type="text"  name="movieName"  placeholder="movieName">
<input type="text"  name="artistName"  placeholder="ArtistName">
<input type="text"  name="duration"  placeholder="Duration">
<input type="number"  name="rating"  placeholder="Rating">

<button type="submit">Submit</button>

<h4>${dtoValidate}</h4>
<h4>${SongTitle }</h4>
<h4>${ArtistName}</h4>
<h4>${Duration}</h4>
<h4>${rating}</h4>



</form>

</body>
</html>