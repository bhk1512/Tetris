package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import org.hibernate.SessionFactory;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import regis.UserDetails;
import regis.main;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String fname,lname,email,mobile,add,city,state;
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
      response.setContentType("text/html;charset=ISO-8859-1");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("    <div id=\"wrapper\">\n");
      out.write("  <div class=\"menuZone\">\n");
      out.write("    <ul>\n");
      out.write("      <li class=\"first\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("      <li><a href=\"about_us.jsp\">About Us</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"services.jsp\">Services</a></li>\n");
      out.write("      <li><a href=\"faq.jsp\">FAQ'S</a></li>\n");
      out.write("      <li><a href=\"contact_us.jsp\">Contact Us</a></li>\n");
      out.write("      <li><a href=\"privacy.jsp\">Privacy</a></li>\n");
      out.write("   <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("    \n");
      out.write("<div class=\"box4\">\n");
      out.write("<p dir=\"ltr\">&nbsp;</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1 align=\"center\">\n");
      out.write("<b>REGISTRATION FORM</b>\n");
      out.write("</h1>\n");
      out.write("\n");
      out.write("<form action=\"index.jsp\" method=\"get\">\n");
      out.write("    \n");
      out.write(" \n");
      out.write("<div>\n");
      out.write("<label for=\"inputFirstname\">First Name\n");
      out.write("</label>\n");
      out.write("<div>\n");
      out.write("<input type=\"text\" name=\"firstname\" maxlength=\"12\"\n");
      out.write("placeholder=\"firstname\"></input>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<div>\n");
      out.write("<label for=\"inputLastname\">Last Name </label>\n");
      out.write("<div>\n");
      out.write("<input type=\"text\" name=\"lastname\" maxlength=\"12\"\n");
      out.write("placeholder=\"lastname\"></input>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<div>\n");
      out.write("<label for=\"inputMobile\">Mobile</label>\n");
      out.write("<div>\n");
      out.write("<input type=\"text\" name=\"mobile\" maxlength=\"10\"\n");
      out.write("placeholder=\"Ex:95xxxx4104\"></input>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<div>\n");
      out.write("<label for=\"inputEmail\">E-mail</label>\n");
      out.write("<div>\n");
      out.write("<input type=\"text\" name=\"email\" maxlength=\"50\"\n");
      out.write("placeholder=\"rakesh@gmail.com\"></input>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<div>\n");
      out.write("<label for=\"gender\">Gender</label>\n");
      out.write("<div>\n");
      out.write("<input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios1\"\n");
      out.write("value=\"Male\" checked>Male <input type=\"radio\"\n");
      out.write("name=\"optionsRadios\" id=\"optionsRadios2\" value=\"Female\">Female\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<div>\n");
      out.write("<label for=\"inputAddress\">Address </label>\n");
      out.write("<div>\n");
      out.write("<input type=\"text\" name=\"address\" maxlength=\"70\" id=\"address\"\n");
      out.write("placeholder=\"Address\"></input>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<div>\n");
      out.write("<label for=\"inputCity\">City </label>\n");
      out.write("<div>\n");
      out.write("<input type=\"text\" name=\"city\" id=\"city\" placeholder=\"Noida\"></input>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<div>\n");
      out.write("<label for=\"inputState\">State </label>\n");
      out.write("<div>\n");
      out.write("<input type=\"text\" id=\"state\" name=\"state\" id=\"state\"\n");
      out.write("       placeholder=\"Delhi\"></input>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<div>\n");
      out.write("<div>\n");
      out.write("<input type=\"reset\" value=\"Reset\" />\n");
      out.write("<input\n");
      out.write("type=\"submit\" value=\"Submit\" />\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write(" \n");
      out.write("</form>\n");
      out.write("    </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("    \n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write(" \n");
      out.write("\n");
      out.write("</body>\n");
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
