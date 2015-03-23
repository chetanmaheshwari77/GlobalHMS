<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="style/style.css"/>

<script type="text/javascript">
function validateUser()
{
	if( document.addUserForm.fstnm.value == "" )
	   {
	     alert( "Please provide your first name!" );
	     document.addUserForm.fstnm.focus() ;
	     return false;
	   }
	
	if( document.addUserForm.lstnm.value == "" )
	   {
	     alert( "Please provide your last name!" );
	     document.addUserForm.lstnm.focus() ;
	     return false;
	   }
	
	
	if(document.addUserForm.email.value == "")
	   {
	     alert( "Please enter your email id!" );
	     document.addUserForm.email.focus();
	     return false;
	   }
	
	if(document.addUserForm.email.value !="")
		{
		 var x=document.addUserForm.email.value;
		 
		 var atpos=x.indexOf("@");
		 var dotpos=x.lastIndexOf(".");
		 
		 if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
			 {
			   alert("Not a valid e-mail address");
			   document.addUserForm.email.focus();
			   return false;
			 }
		} 
	
}
</script>

</head>
<body bgcolor="99FF99">
<br><br><br>
<center><h2><b>Add User</b></h2></center><br><br>
<center><form name="addUserForm" method="post" action="AddEmpController">
<table border="3">
<tr>
<td><b>LOGIN_UID: </b></td>
<td><input type="text" name="lognuid"></td>
</tr>
<tr>
<td><b>ORGANISATION_ID: </b></td>
<td><input type="text" name="orgid"></td>
</tr>
<tr>
<td><b>FIRST_NAME: </b></td>
<td><input type="text" name="fstnm"></td>
</tr>
<tr>
<td><b>LAST_NAME: </b></td>
<td><input type="text" name="lstnm"></td>
</tr>
<tr>
<td><b>EMAIL: </b></td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td><input type="submit" value="Submit" onclick="return validateUser()"></td>
<td><input type="reset" value="Clear"></td>
</tr>
</table>
</form>
</center>
</body>

<br><br>
<center>
<hr></hr>
<div align="center">
<font color="white">
<h4>&copy Organization Management System</h4>
<h4>&reg Chetan Maheshwari</h4>
</font>
</div>
</center>

</html>
