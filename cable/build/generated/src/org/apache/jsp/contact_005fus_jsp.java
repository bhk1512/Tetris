package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_005fus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>D-TV - Contact Us</title>\n");
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
      out.write("      <li><a class=\"current\" href=\"contact_us.jsp\">Contact Us</a></li>\n");
      out.write("      <li><a href=\"privacy.jsp\">Privacy</a></li>\n");
      out.write("      <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"clear\"></div>\n");
      out.write("  <div class=\"banner\">\n");
      out.write("    <div class=\"bannerText1\">\n");
      out.write("      <h1>WHY D-TV ?</h1>\n");
      out.write("      <ul>\n");
      out.write("        <li>Over <span class=\"yelloText\">125+</span> Channels</li>\n");
      out.write("        <li>Starting Package from<span class=\"yelloText\"> Rs.230 only</span></li>\n");
      out.write("        <li>Free Installation and 24/7 Live Support!</li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"pdf\">\n");
      out.write("        <div class=\"inner\">\n");
      out.write("          <div style=\"float:left;\">\n");
      out.write("            <h3>ABOUT D-TV ?</h3>\n");
      out.write("            <div class=\"yelloText2\">User Manual Guide.</div>\n");
      out.write("          </div>\n");
      out.write("            <div style=\"float:left\"> <a href=\"images/report.docx\"> <img src=\"images/pdf.jpg\" alt=\"\" border=\"0\" /> </a></div>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"logo\"> </div>\n");
      out.write("    <div class=\"bannerText2\">\n");
      out.write("      <h2>PLACE AN ORDER TODAY!</h2>\n");
      out.write("      <span class=\"yelloText\">Why you are waiting for?</span> Just place an order Today <br />\n");
      out.write("      and start watching 125+ HD channels in Home from Tomorrow.\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"button\"> <a><img src=\"images/button.png\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("        <div class=\"play\"><a href=\"basepack.jsp\"><img src=\"images/icons/package.jpg\" height=\"50\" width=\"300\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"workZone\">\n");
      out.write("    <div class=\"subscribezone\">\n");
      out.write("      <div class=\"subscribetop\">\n");
      out.write("        <div class=\"subscribebottom\">\n");
      out.write("          <div style=\"padding:20px 15px 20px 15px;\">\n");
      out.write("            <h1 class=\"inner\">Contact</h1>\n");
      out.write("            <div> <strong> <br />\n");
      out.write("              We’re happy to answer any questions you have or provide you with an estimate. Just send us a message in the form below. </strong><br />\n");
      out.write("            </div>  \n");
      out.write("            <div> <br />\n");
      out.write("              <h6 class=\"inner\">Contact Form:</h6>\n");
      out.write("              <br />\n");
      out.write("              <form method=\"post\">\n");
      out.write("                <table width=\"80%\">\n");
      out.write("                  <tr>\n");
      out.write("                    <td width=\"145\" align=\"left\" valign=\"top\" class=\"body\" id=\"Company\"><strong>Company:</strong></td>\n");
      out.write("                    <td width=\"280\" align=\"left\" valign=\"top\"><input name=\"Company\" type=\"text\" size=\"40\" /></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td align=\"left\" valign=\"top\" class=\"body\" id=\"Contact\"><strong>Full Name:</strong></td>\n");
      out.write("                    <td align=\"left\" valign=\"top\"><input name=\"Name\" type=\"text\" size=\"40\" /></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td align=\"left\" valign=\"top\" class=\"body\" id=\"Address\"><strong>Address: </strong></td>\n");
      out.write("                    <td align=\"left\" valign=\"top\"><input name=\"Address\" type=\"text\" size=\"40\" /></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td align=\"left\" valign=\"top\" class=\"body\" id=\"Phone\"><strong> Phone: </strong></td>\n");
      out.write("                    <td align=\"left\" valign=\"top\"><input name=\"Phone\" type=\"text\" size=\"40\" /></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td align=\"left\" valign=\"top\" class=\"body\" id=\"Email\"><strong> Email: </strong></td>\n");
      out.write("                    <td align=\"left\" valign=\"top\"><input name=\"Email\" type=\"text\" size=\"40\" /></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td align=\"left\" valign=\"top\" class=\"body\" id=\"Comments\"><strong> Questions / Comments: </strong></td>\n");
      out.write("                    <td align=\"left\" valign=\"top\"><textarea name=\"comments\" cols=\"32\" rows=\"6\"></textarea></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"submit\" class=\"button\" value=\"Send Now\" /></td>\n");
      out.write("                  </tr>\n");
      out.write("                </table>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("            <div> <br />\n");
      out.write("              <h6 class=\"inner\">Contact Information: </h6>\n");
      out.write("              <img src=\"images/photo-contact.jpg\" alt=\"\" width=\"152\" height=\"100\" class=\"project-img\" /><br />\n");
      out.write("              <br />\n");
      out.write("              <br />\n");
      out.write("              100 Lorem Ipsum Dolor Sit<br />\n");
      out.write("              88-99 Sit Amet, Lorem<br />\n");
      out.write("              USA<br />\n");
      out.write("              <br />\n");
      out.write("              <p> <span><img src=\"images/ico-phone.png\" alt=\"\" width=\"20\" height=\"16\" hspace=\"2\" /> Phone:</span> (888) 123 456 789<br />\n");
      out.write("                <span><img src=\"images/ico-fax.png\" alt=\"\" width=\"20\" height=\"16\" hspace=\"2\" /> Fax:</span> (888) 987 654 321<br />\n");
      out.write("                <span><img src=\"images/ico-website.png\" alt=\"\" width=\"20\" height=\"16\" hspace=\"2\" /> Website:</span> <a>www.mycompany.com</a><br />\n");
      out.write("                <span><img src=\"images/ico-email.png\" alt=\"\" width=\"20\" height=\"16\" hspace=\"2\" /> Email:</span> <a>info@mycompany.com</a><br />\n");
      out.write("                <span><img src=\"images/ico-twitter.png\" alt=\"\" width=\"20\" height=\"16\" hspace=\"3\" /> <a>Follow</a> on Twitter</span><br />\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"bottomcontainer\">\n");
      out.write("    <div class=\"bottomMenu\">\n");
      out.write("      <ul>\n");
      out.write("        Copyright (c) Sitename.com. All rights reserved. Design by Stylish Website Templates.\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
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
