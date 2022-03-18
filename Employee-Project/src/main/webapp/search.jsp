<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SEARCH EMPLOYEE</title>
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
<p><font color="green">${message}</font></p>
<form action="/searchemployee" method="post">
ID:<br><input type="text" name="id"/><br>
<input type="submit" value="submit" />
</form>
</div>

</body>
</html>