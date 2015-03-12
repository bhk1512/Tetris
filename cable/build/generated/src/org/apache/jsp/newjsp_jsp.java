package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("function checkForm()\n");
      out.write("{\n");
      out.write("\n");
      out.write("if((document.Login.uname.value.length==0))\n");
      out.write("{\n");
      out.write("alert(\"Please enter User name \");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if((document.Login.password.value.length==0))\n");
      out.write("{\n");
      out.write("alert(\"Please enter  password\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("/*if(!((document.Login.uname.value==\"wipro\")&&(document.Login.password.value==\"wipro\")))\n");
      out.write("\t{\n");
      out.write("\talert(\"enter correct  user id and password\");\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("return true;\n");
      out.write("\t}*/\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<body align=\"center\" bgcolor=\"#CCFFCC#CC9900#9999FF#9900CC#339966#000000#CC9900#CC99FF\" >\n");
      out.write("<h1 align=\"center\"><font color=\"\">TELEPHONE BILLING SYSTEM</font></h1>\n");
      out.write("<form name=\"Login\"  action=\"login_conn.jsp\" method=\"get\" onSubmit=\" return checkForm()\">\n");
      out.write("<input type=\"hidden\" name=\"ID\" value=\"SUBMIT\">\n");
      out.write("<p align=\"center\">\n");
      out.write("<pre>\n");
      out.write("<marquee><img src=\"1.bmp\">\t</marquee>\n");
      out.write("\t\t\t\tUser Name <input type=\"text\" name=\"uname\"><br><br>\t\t\t\t  \n");
      out.write("\t\t\t\tPassword  <input type=\"password\" name=\"password\">\t\t\t\t\n");
      out.write("\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"SUBMIT\"  >\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t    <a href=\"adminlog.jsp\">Admin Login</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      <b>New user</b>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"signup.jsp\">Sign up</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <b> New Connection</b>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <a href=\"New_connection.jsp\">Register Here</a>\n");
      out.write("\n");
      out.write("</pre>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\n");
      out.write("\n");
      out.write("                                                                                 \n");
      out.write("\n");
      out.write("</p>\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
