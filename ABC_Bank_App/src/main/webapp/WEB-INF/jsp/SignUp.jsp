<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/stylesheet.css">
</head>
<body>
<form action="submit1" method="post">
		<div style="background-color: #d3d3d3; height: 300px; width: 300px;margin-left:40%">
		
		<input type="text" placeholder="username" maxlength="10" style="height:30px;width:160px;margin-left:20%;margin-top: 5%;text-align:center;font-size: 1em;font-weight:bold" name="username"> 
		<input type="text" placeholder="password" style="height:30px;width:160px;margin-left:20%;margin-top: 5%;text-align:center;font-size: 1em;font-weight:bold" name="password"> 
		<br>
		<div class="search_categories">
    		<div class="select">
		<select name="role">
			<option value="user">user</option>
			<option value="admin">admin</option>
		</select>
		</div>
		</div>
		<br> <input type="submit" style="height:30px;width:160px;margin-left:20%;margin-top: 5%;background-color:#ADD8E6;border-radius:5px;border:3px solid black;font-size: 1em;font-weight:bold;color:white">
		<input type="submit" value="register">
		</div>
	</form>
</body>
</html>