<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/user_stylesheet.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="script.js"></script>
</head>
<body>
	<h1>welcome ${username}</h1>
	<div id="strecth">
	<ul >
	
		<li>
		<a href="update_details">
			Update Details</a>
		</li>
		
		<li>
			<a href="transaction_details">Transaction Details</a>
		</li>
		<li>
			<a href="summary_details">Account Summary</a> 
		</li>
	</ul>
	</div>
</body>
</html>