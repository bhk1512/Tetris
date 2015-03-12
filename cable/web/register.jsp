
<%@page import="java.io.PrintWriter"%>

<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.*"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.Transaction"%>

<%@page import="regis.UserDetails"%>
<%@page import="regis.main"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>D-TV</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <div id="wrapper">
  <div class="menuZone">
    <ul>
      <li class="first"><a href="index.jsp">Home</a></li>
      <li><a href="about_us.jsp">About Us</a></li>
      
      <li><a href="services.jsp">Services</a></li>
      <li><a href="faq.jsp">FAQ'S</a></li>
      <li><a href="contact_us.jsp">Contact Us</a></li>
      <li><a href="privacy.jsp">Privacy</a></li>
   <li><a href="login.jsp">Login</a></li>
    </ul>
  </div>
    </div>
  
    <div class="clear"></div>
    
<div class="box4">
<p dir="ltr">&nbsp;</p>


<h1 align="center">
<b>REGISTRATION FORM</b>
</h1>
<%!String fname,lname,email,mobile,add,city,state;%>
<form action="index.jsp" method="get">
    
 
<div>
<label for="inputFirstname">First Name
</label>
<div>
<input type="text" name="firstname" maxlength="12"
placeholder="firstname"></input>
</div>
</div>
 
<div>
<label for="inputLastname">Last Name </label>
<div>
<input type="text" name="lastname" maxlength="12"
placeholder="lastname"></input>
</div>
</div>
 
<div>
<label for="inputMobile">Mobile</label>
<div>
<input type="text" name="mobile" maxlength="10"
placeholder="Ex:95xxxx4104"></input>
 
</div>
</div>
 
<div>
<label for="inputEmail">E-mail</label>
<div>
<input type="text" name="email" maxlength="50"
placeholder="rakesh@gmail.com"></input>
</div>
</div>
 
<div>
<label for="gender">Gender</label>
<div>
<input type="radio" name="optionsRadios" id="optionsRadios1"
value="Male" checked>Male <input type="radio"
name="optionsRadios" id="optionsRadios2" value="Female">Female
</div>
</div>
 
<div>
<label for="inputAddress">Address </label>
<div>
<input type="text" name="address" maxlength="70" id="address"
placeholder="Address"></input>
</div>
</div>
 
<div>
<label for="inputCity">City </label>
<div>
<input type="text" name="city" id="city" placeholder="Noida"></input>
</div>
</div>
 
<div>
<label for="inputState">State </label>
<div>
<input type="text" id="state" name="state" id="state"
       placeholder="Delhi"></input>
</div>
</div>
 
<div>
<div>
<input type="reset" value="Reset" />
<input
type="submit" value="Submit" />
</div>
</div>
   
 
</form>
    </div>
            <div class="clear"></div>
    
        <div class="clear"></div>
        
        
 

</body>
</html>
