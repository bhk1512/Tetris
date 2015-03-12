package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class support_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>D-TV - Support</title>\n");
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
      out.write("      <li><a class=\"current\" href=\"support.jsp\">Support</a></li>\n");
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
      out.write("            <h3>WHY D-TV ?</h3>\n");
      out.write("            <div class=\"yelloText2\">User Manual Guide.</div>\n");
      out.write("          </div>\n");
      out.write("          <div style=\"float:left\"> <img src=\"images/pdf.png\" alt=\"\" border=\"0\" /> </div>\n");
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
      out.write("    <div class=\"button\"> <a href=\"http://www.free-css.com/\"><img src=\"images/button.png\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("        <div class=\"play\"><a href=\"basepack.jsp\"><img src=\"images/icons/package.jpg\" height=\"50\" width=\"300\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"workZone\">\n");
      out.write("    <div class=\"subscribezone\">\n");
      out.write("      <div class=\"subscribetop\">\n");
      out.write("        <div class=\"subscribebottom\">\n");
      out.write("          <div style=\"padding:20px 15px 20px 15px;\">\n");
      out.write("            <h1 class=\"inner\">Support &amp; FAQ</h1>\n");
      out.write("            <div>\n");
      out.write("              <div class=\"ourprojectrow\"> <img src=\"images/ico-support.png\" width=\"144\" height=\"117\" align=\"right\" alt=\"\" />\n");
      out.write("                <div class=\"blog-posted-row\"> Posted on 04. Dec, 2015 by <a href=\"http://www.free-css.com/\">admin</a></div>\n");
      out.write("                <div>\n");
      out.write("                  <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis. Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis. Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis.</p>\n");
      out.write("                  <p>Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis. Proin sed odio et ante adipiscing lobortis. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"insidereadmore\"><a href=\"http://www.free-css.com/\">Read Commnets</a></div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"ourprojectrow\">\n");
      out.write("                <h6 class=\"inner\">Question One</h6>\n");
      out.write("                <div class=\"blog-posted-row\">&nbsp;&nbsp;Posted on 04. Dec, 2015 by <a href=\"http://www.free-css.com/\">admin</a></div>\n");
      out.write("                <div>\n");
      out.write("                  <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis. Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis. Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis.</p>\n");
      out.write("                  <p>Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis. Proin sed odio et ante adipiscing lobortis. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"insidereadmore\"><a href=\"http://www.free-css.com/\">Read Commnets</a></div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"ourprojectrow\">\n");
      out.write("                <h6 class=\"inner\">Question Two</h6>\n");
      out.write("                <div class=\"blog-posted-row\">&nbsp;&nbsp;Posted on 04. Dec, 2015 by <a href=\"http://www.free-css.com/\">admin</a></div>\n");
      out.write("                <div>\n");
      out.write("                  <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis. Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis. Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis.</p>\n");
      out.write("                  <p>Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis. Proin sed odio et ante adipiscing lobortis. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"insidereadmore\"><a href=\"http://www.free-css.com/\">Read Commnets</a></div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"ourprojectrow\">\n");
      out.write("                <h6 class=\"inner\">Question Three</h6>\n");
      out.write("                <div class=\"blog-posted-row\">&nbsp;&nbsp;Posted on 04. Dec, 2015 by <a href=\"http://www.free-css.com/\">admin</a></div>\n");
      out.write("                <div>\n");
      out.write("                  <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis. Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis. Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis.</p>\n");
      out.write("                  <p>Quisque eleifend, arcu a dictum varius, risus neque venenatis arcu, a semper massa mi eget ipsum. Proin sed odio et ante adipiscing lobortis. Proin sed odio et ante adipiscing lobortis. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin sed odio et ante adipiscing lobortis.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"insidereadmore\"><a href=\"http://www.free-css.com/\">Read Commnet</a></div>\n");
      out.write("              </div>\n");
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
      out.write("        Copyright (c) Sitename.com. All rights reserved. Design by Stylish <a href=\"http://www.stylishtemplate.com\">Website Templates</a>.\n");
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
