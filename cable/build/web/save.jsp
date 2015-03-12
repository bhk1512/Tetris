
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*"%>
<%try{
System.out.print(request.getParameter("fname"));

String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String mobile=request.getParameter("mobile");
String add=request.getParameter("add");
String city=request.getParameter("city");
String state=request.getParameter("state");
String email=request.getParameter("email");

Connection con=DriverManager.getConnection("d_tv_database","root", "BK@coolmind" );
PreparedStatement ps=con.prepareStatement("insert into student2 values(?,?,?,?,?,?,?)");


ps.setString(1,fname);
ps.setString(2,lname);
ps.setString(3,mobile);
ps.setString(4,email);
ps.setString(5,add);
ps.setString(6,city);
ps.setString(7,state);
int s=ps.executeUpdate();
System.out.print(s);
}catch(SQLException e2){
e2.printStackTrace();
}
%>

