
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
    </ul>
  </div>
    <div class="clear"></div>


    <div class="body" align="center">
    <style type="text">
        a{
            background-color: blue;
            text-decoration: underline;
        }
        h1{font-weight: bold;
            font-family: cursive;
           margin-left: 80px;
           margin-top: 100px;
           color:cadetblue;
            
        }
        h2{font-weight: bold;            
           font-family: aerial;
           margin-top: 110px; 
           text-align: center; 
           color:gray;
           top:400px;
           left:400px;}
        form{
            font-family: fantasy;
            font-size: 20px;
            background-color: #97B1C2;
            margin-left: 280px;
            margin-right: 300px;
            margin-bottom: 100px;
            margin-top: 10px;
            border-style: solid;
            border-width: 2px;
            border-color: black;
            border-style: solid;
            text-align: center;
             color:black;
             }
        body{
            text-align: center;
            background-position: 400px  400px;
        }
    </style>
     <h2> LOGIN </h2>
     <form>
         </br>
         </br>
     Username: <input type="text" name="Username" value="Enter name here"> </input>
     </br>
     </br>
     Password: <input type="password" name="Password" > </input>
     </br>
     </br>
     
     <input type="submit" value="Login"> </input>   
     </br>
     </br>
     </form>
     <form action="register.jsp" method="get">
     <input type="submit" value="New User?"></input>
     </form>
     </br>
     </br>
     Remember me: <input type="checkbox" name="remember" value="Remember me"> </input>
     </br>
     </br>
     </form>
</div>
</div>
</body>
</html>