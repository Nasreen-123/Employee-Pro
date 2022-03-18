<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADMIN PAGE</title>
<style type="text/css">
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
<form action="/login" method="POST"></form>
<form action="/create">
Create Employee:<br><input type="submit" value="CREATE"/>
</form>
<form action="/search" method="get">
Search Employee:<br><input type="submit" value="SEARCH"/>
</form>
<form action="/update">
Update Employee:<br><input type="submit" value="UPDATE"/>
</form>
<form action="/delete">
Delete Employee:<br><input type="submit" value="DELETE"/>
</form>
</div>
</body>
</html>