<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/stylesheet.css">
</head>
<body>

	<form action="submit"  method="post">
		<div style="background-color: #d3d3d3; height: 300px; width: 300px;margin-left:40%">
		
		<input type="text" placeholder="username" name="username" maxlength="10" style="height:30px;width:160px;margin-left:20%;margin-top: 5%;text-align:center;font-size: 1em;font-weight:bold"> 
		<input type="text" placeholder="password" name="password" style="height:30px;width:160px;margin-left:20%;margin-top: 5%;text-align:center;font-size: 1em;font-weight:bold"> 
		<br>
		<div class="search_categories">
    		<div class="select">
		<select name="role">
			<option value="user" >user</option>
			<option value="admin">admin</option>
		</select>
		</div>
		</div>
		<br> <input type="submit" style="height:30px;width:160px;margin-left:20%;margin-top: 5%;background-color:#ADD8E6;border-radius:5px;border:3px solid black;font-size: 1em;font-weight:bold;color:white">
		<div><a href="register">Sign Up</a>
		</div>
		
		</div>
	</form>
	${msg}
</body>
</html>