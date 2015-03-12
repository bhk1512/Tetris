package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>D-TV</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("  <div class=\"menuZone\">\n");
      out.write("    <ul>\n");
      out.write("      <li class=\"first\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("      <li><a href=\"about_us.jsp\">About Us</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"services.jsp\">Services</a></li>\n");
      out.write("      <li><a href=\"faq.jsp\">FAQ'S</a></li>\n");
      out.write("      <li><a href=\"contact_us.jsp\">Contact Us</a></li>\n");
      out.write("      <li><a href=\"privacy.jsp\">Privacy</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"body\" align=\"center\">\n");
      out.write("    <style type=\"text\">\n");
      out.write("        a{\n");
      out.write("            background-color: blue;\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("        h1{font-weight: bold;\n");
      out.write("            font-family: cursive;\n");
      out.write("           margin-left: 80px;\n");
      out.write("           margin-top: 100px;\n");
      out.write("           color:cadetblue;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        h2{font-weight: bold;            \n");
      out.write("           font-family: aerial;\n");
      out.write("           margin-top: 110px; \n");
      out.write("           text-align: center; \n");
      out.write("           color:gray;\n");
      out.write("           top:400px;\n");
      out.write("           left:400px;}\n");
      out.write("        form{\n");
      out.write("            font-family: fantasy;\n");
      out.write("            font-size: 20px;\n");
      out.write("            background-color: #97B1C2;\n");
      out.write("            margin-left: 280px;\n");
      out.write("            margin-right: 300px;\n");
      out.write("            margin-bottom: 100px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            border-style: solid;\n");
      out.write("            border-width: 2px;\n");
      out.write("            border-color: black;\n");
      out.write("            border-style: solid;\n");
      out.write("            text-align: center;\n");
      out.write("             color:black;\n");
      out.write("             }\n");
      out.write("        body{\n");
      out.write("            text-align: center;\n");
      out.write("            background-position: 400px  400px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("     <h2> LOGIN </h2>\n");
      out.write("     <form>\n");
      out.write("         </br>\n");
      out.write("         </br>\n");
      out.write("     Username: <input type=\"text\" name=\"Username\" value=\"Enter name here\"> </input>\n");
      out.write("     </br>\n");
      out.write("     </br>\n");
      out.write("     Password: <input type=\"password\" name=\"Password\" > </input>\n");
      out.write("     </br>\n");
      out.write("     </br>\n");
      out.write("     \n");
      out.write("     <input type=\"submit\" value=\"Login\"> </input>   \n");
      out.write("     </br>\n");
      out.write("     </br>\n");
      out.write("     </form>\n");
      out.write("     <form action=\"register.jsp\" method=\"get\">\n");
      out.write("     <input type=\"submit\" value=\"New User?\"></input>\n");
      out.write("     </form>\n");
      out.write("     </br>\n");
      out.write("     </br>\n");
      out.write("     Remember me: <input type=\"checkbox\" name=\"remember\" value=\"Remember me\"> </input>\n");
      out.write("     </br>\n");
      out.write("     </br>\n");
      out.write("     </form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
