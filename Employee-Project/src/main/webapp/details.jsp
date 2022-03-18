<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EMPLOYEE DETAILS</title>
<style>
.div{
margin: 30px auto;
padding: 10px;
width:400px;
display:flex;
flex-direction:column;
align-items: center;
text-align: center;
border-radius: 10px;
box-shadow: 2px 2px 2px #888;
background:#0804;
}
</style>
</head>
<body>
<div class="div">
<h3>ID:</h3>
<p>${id}</p>
<h3>NAME:</h3>
<p>${firstname} ${lastname}</p>
<h3>AGE:</h3>
<p>${age}</p>
<h3>SALARY:</h3>
<p>${salary}</p>
<h3>DESIGNATION:</h3>
<p>${designation}</p>
<a href="/home">Return Home</a>
</div>
</body>
</html>