<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="style/style1.css"/>
<script type="text/javascript">
function goToUser()
{
	window.location("AddUser.jsp");
}
function goBackMenu()
{
	window.location("Index.html");
}
</script>
</head>
<body>
<br><br><br>
<center><h2><b><font color="330000">User added successfully!</font></b></h2></center><br>
<center><h2><b><font color="330000">Add 1 more?</font></b></h2></center>
<center><input type="submit" value="Click Here" onclick="goToUser();"></center><br>
<center><h2><b><font color="330000">Go Back?</font></b></h2></center>
<center><input type="submit" value="Menu" onclick="goBackMenu();"></center><br>
</body>

<footer>
<center>
<div align="center">
<font color="330000">
<br><br><br>
<h4>&copy Organization Management System</h4>
<h4>&reg Chetan Maheshwari</h4>
</font>
</div>
</center>
</footer>
</html>
