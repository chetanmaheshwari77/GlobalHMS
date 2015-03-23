<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="style/style.css"/>
 
<script type="text/javascript">

function validateOrg()
{
	if( document.addOrgForm.orgnm.value == "" )
	   {
	     alert( "Please provide the organization name!" );
	     document.addOrgForm.orgnm.focus() ;
	     return false;
	   }
	
	if( document.addOrgForm.strln1adr.value == "" )
	   {
	     alert( "Please enter your address" );
	     document.addOrgForm.strln1adr.focus() ;
	     return false;
	   }
	
	if( document.addOrgForm.strln2adr.value == "" )
	   {
	     alert( "Please enter your address" );
	     document.addOrgForm.strln2adr.focus() ;
	     return false;
	   }
	
	if( document.addOrgForm.citynm.value == "" )
	   {
	     alert( "Please enter your city" );
	     document.addOrgForm.citynm.focus() ;
	     return false;
	   }
	
	if( document.addOrgForm.state.value == "" )
	   {
	     alert( "Please enter your state" );
	     document.addOrgForm.state.focus() ;
	     return false;
	   }
	
	if( document.addOrgForm.cntryname.value == "" )
	   {
	     alert( "Please enter your country" );
	     document.addOrgForm.cntryname.focus() ;
	     return false;
	   }
	
	if( document.addOrgForm.pstlcde.value == "" )
	   {
	     alert( "Please enter your postal code" );
	     document.addOrgForm.pstlcde.focus() ;
	     return false;
	   }
	
	if( document.addOrgForm.pstlpls4cde.value == "" )
	   {
	     alert( "Please enter your postal code" );
	     document.addOrgForm.pstlpls4cde.focus() ;
	     return false;
	   }
	
	if( document.addOrgForm.upddt.value == "" )
	   {
	     alert( "Please enter the UPD_DT field!" );
	     document.addOrgForm.upddt.focus() ;
	     return false;
	   }
}

</script>
</head>

<body>
<center><h2><b>Add Organization</b></h2></center><br><br>
<center>
<form name="addOrgForm" method="post" action="AddOrgController">
<table border="3">

<tr>
<td><b>ORGANIZATION_NAME: </b></td>
<td><input type="text" name="orgnm"></td>
</tr>
<tr>
<td><b>ADDRESS LANE 1: </b></td>
<td><textarea rows="4" cols="18" name="strln1adr"></textarea></td>
</tr>
<tr>
<td><b>ADDRESS LANE 2: </b></td>
<td><textarea rows="4" cols="18" name="strln2adr"></textarea></td>
</tr>
<tr>
<td><b>CITY_NAME: </b></td>
<td><input type="text" name="citynm"></td>
</tr>
<tr>
<td><b>STATE: </b></td>
<td><input type="text" name="state"></td>
</tr>
<tr>
<td><b>COUNTRY NAME: </b></td>
<td><input type="text"  name="cntryname"></td>
</tr>
<tr>
<td><b>POSTAL CODE: </b></td>
<td><input type="text"  name="pstlcde"></td>
</tr>
<tr>
<td><b>PSTL_PLS_4_CDE: </b></td>
<td><input type="text"  name="pstlpls4cde"></td>
</tr>
<!--  <tr>
<td><b>ACTV_IND: </b></td>
<td><input type="text"  name="actvind"></td>
</tr>
-->
 <tr>
<td><b>UPDATE DATE(mm/dd/yyyy): </b></td>
<td><input type="text"  name="upddt"></td>
</tr>
<tr>
<td><input type="submit" value="Submit" onclick="return validateOrg();"></td>
<td><input type="reset" value="Clear"></td>
</tr>
</table>
</form>
</center>
</body>

<footer>
<br><br>
<div align="center">
<font color="white">
<h4>&copy Organization Management System</h4>
<h4>&reg Chetan Maheshwari</h4>
</font>
</div>
</footer>

</html>