<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="style/style1.css"/>
<script type="text/javascript">
function goToOrg()
{
	window.location("AddOrganisation.jsp");
}
function goToMenu()
{
	window.location("index.html");
}
</script>
</head>
<body>
<br><br><br>
<center><h2><b>Organization added successfully</b></h2></center><br><br><br>
<center><h2><b>Add 1 more?</b></h2></center>
<center><input type="submit" value="Click Here" onclick="goToOrg();"></center><br>
<center><h2><b>Go Back?</b></h2></center>
<center><input type="submit" value="Menu" onclick="goToMenu();"></center><br>
</body>

<footer>
<center>
<br><br>
<div align="center">
<font color="990000">
<br><br>
<h4>&copy Organisation Management System</h4>
<h4>&reg Yogesh Amruta Hima Tejaswani</h4>
</font>
</div>
</center>
</footer>
</html>
