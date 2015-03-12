package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <div style=\"float:left\"><a href=\"images/report.docx\"> <img src=\"images/pdf.jpg\" alt=\"\" border=\"0\" /></a> </div>\n");
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
      out.write("    <div class=\"button\"> <a href=\"register.jsp\"><img src=\"images/button.png\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("        <div class=\"play\"><a href=\"basepack.jsp\"><img src=\"images/icons/package.jpg\" height=\"50\" width=\"300\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"workZone\">\n");
      out.write("    <div class=\"imageMaincontainer\">\n");
      out.write("      <div class=\"imageContainer\"><img src=\"images/pic1.png\" alt=\"\" /> </div>\n");
      out.write("      <div class=\"plus\">+</div>\n");
      out.write("      <div class=\"imageContainer2\"><img src=\"images/pic2.png\" alt=\"\" /> </div>\n");
      out.write("      <div class=\"plus\">+</div>\n");
      out.write("      <div class=\"imageContainer3\"><img src=\"images/pic3.png\" alt=\"\" /></div>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("    <div class=\"subscribezone\">\n");
      out.write("      <div class=\"subscribetop\">\n");
      out.write("        <div class=\"subscribebottom\">\n");
      out.write("          <div class=\"box1\"> <img src=\"images/plus.png\" alt=\"\" />\n");
      out.write("            <h4>HOW TO SUBSCRIBE</h4>\n");
      out.write("            <div class=\"box1Text\"> You can subscribe by registering yourself at this site or by directly contacting us. To register click LOGIN at the top of this page and then register as a NEW USER. You must provide the necessary details asked in the form.<br />\n");
      out.write("              <br />\n");
      out.write("              You can also contact us directly to get a connection. Call us and our customer executives will guide and help you along the whole process.\n");
      out.write("              <div class=\"yelloText3\"><a href=\"contact_us.jsp\">Contact Us</a></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"box2\"> <img src=\"images/faq.png\" alt=\"\" />\n");
      out.write("            <h4>FAQ&rsquo;s</h4>\n");
      out.write("            <div class=\"box2Text\">\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"faq.jsp\">Why D-TV DTH?</a></li>\n");
      out.write("                <li><a href=\"faq.jsp\">What is the warranty on the set top box?</a></li>\n");
      out.write("                <li><a href=\"faq.jsp\">If I relocate, what happens to my connection?</a></li>\n");
      out.write("                <li><a href=\"faq.jsp\">Is D-TV available all over India?</a></li>\n");
      out.write("                <li><a href=\"faq.jsp\">Will I get all my favourite channels on D-TV?</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"box3\"></div>\n");
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
      out.write("        Copyright (c) Sitename.com. All rights reserved. Design by Stylish <a>Website Templates</a>.\n");
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
