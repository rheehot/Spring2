/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.13
 * Generated at: 2018-05-15 06:29:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/CYSN/Desktop/spring2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/eStore/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1505800412374L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t<li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("\t</ol>\n");
      out.write("\t<div class=\"carousel-inner\">\n");
      out.write("\t\t<div class=\"carousel-item active\">\n");
      out.write("\t\t\t<img class=\"first-slide\"\n");
      out.write("\t\t\t\tsrc=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\"\n");
      out.write("\t\t\t\talt=\"First slide\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"carousel-caption text-left\">\n");
      out.write("\t\t\t\t\t<h1>Example headline.</h1>\n");
      out.write("\t\t\t\t\t<p>Cras justo odio, dapibus ac facilisis in, egestas eget quam.\n");
      out.write("\t\t\t\t\t\tDonec id elit non mi porta gravida at eget metus. Nullam id dolor\n");
      out.write("\t\t\t\t\t\tid nibh ultricies vehicula ut id elit.</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">Sign\n");
      out.write("\t\t\t\t\t\t\tup today</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t<img class=\"second-slide\"\n");
      out.write("\t\t\t\tsrc=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\"\n");
      out.write("\t\t\t\talt=\"Second slide\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t<h1>Another example headline.</h1>\n");
      out.write("\t\t\t\t\t<p>Cras justo odio, dapibus ac facilisis in, egestas eget quam.\n");
      out.write("\t\t\t\t\t\tDonec id elit non mi porta gravida at eget metus. Nullam id dolor\n");
      out.write("\t\t\t\t\t\tid nibh ultricies vehicula ut id elit.</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">Learn\n");
      out.write("\t\t\t\t\t\t\tmore</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t<img class=\"third-slide\"\n");
      out.write("\t\t\t\tsrc=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\"\n");
      out.write("\t\t\t\talt=\"Third slide\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"carousel-caption text-right\">\n");
      out.write("\t\t\t\t\t<h1>One more for good measure.</h1>\n");
      out.write("\t\t\t\t\t<p>Cras justo odio, dapibus ac facilisis in, egestas eget quam.\n");
      out.write("\t\t\t\t\t\tDonec id elit non mi porta gravida at eget metus. Nullam id dolor\n");
      out.write("\t\t\t\t\t\tid nibh ultricies vehicula ut id elit.</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">Browse\n");
      out.write("\t\t\t\t\t\t\tgallery</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<a class=\"carousel-control-prev\" href=\"#myCarousel\" role=\"button\"\n");
      out.write("\t\tdata-slide=\"prev\"> <span class=\"carousel-control-prev-icon\"\n");
      out.write("\t\taria-hidden=\"true\"></span> <span class=\"sr-only\">Previous</span>\n");
      out.write("\t</a> <a class=\"carousel-control-next\" href=\"#myCarousel\" role=\"button\"\n");
      out.write("\t\tdata-slide=\"next\"> <span class=\"carousel-control-next-icon\"\n");
      out.write("\t\taria-hidden=\"true\"></span> <span class=\"sr-only\">Next</span>\n");
      out.write("\t</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Marketing messaging and featurettes\n");
      out.write("      ================================================== -->\n");
      out.write("<!-- Wrap the rest of the page in another container to center all the content. -->\n");
      out.write("\n");
      out.write("<div class=\"container marketing\">\n");
      out.write("\n");
      out.write("\t<!-- Three columns of text below the carousel -->\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-lg-4\">\n");
      out.write("\t\t\t<img class=\"rounded-circle\"\n");
      out.write("\t\t\t\tsrc=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\"\n");
      out.write("\t\t\t\talt=\"Generic placeholder image\" width=\"140\" height=\"140\">\n");
      out.write("\t\t\t<h2>Heading</h2>\n");
      out.write("\t\t\t<p>Donec sed odio dui. Etiam porta sem malesuada magna mollis\n");
      out.write("\t\t\t\teuismod. Nullam id dolor id nibh ultricies vehicula ut id elit.\n");
      out.write("\t\t\t\tMorbi leo risus, porta ac consectetur ac, vestibulum at eros.\n");
      out.write("\t\t\t\tPraesent commodo cursus magna.</p>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t<a class=\"btn btn-secondary\" href=\"#\" role=\"button\">View details\n");
      out.write("\t\t\t\t\t&raquo;</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.col-lg-4 -->\n");
      out.write("\t\t<div class=\"col-lg-4\">\n");
      out.write("\t\t\t<img class=\"rounded-circle\"\n");
      out.write("\t\t\t\tsrc=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\"\n");
      out.write("\t\t\t\talt=\"Generic placeholder image\" width=\"140\" height=\"140\">\n");
      out.write("\t\t\t<h2>Heading</h2>\n");
      out.write("\t\t\t<p>Duis mollis, est non commodo luctus, nisi erat porttitor\n");
      out.write("\t\t\t\tligula, eget lacinia odio sem nec elit. Cras mattis consectetur\n");
      out.write("\t\t\t\tpurus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo,\n");
      out.write("\t\t\t\ttortor mauris condimentum nibh.</p>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t<a class=\"btn btn-secondary\" href=\"#\" role=\"button\">View details\n");
      out.write("\t\t\t\t\t&raquo;</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.col-lg-4 -->\n");
      out.write("\t\t<div class=\"col-lg-4\">\n");
      out.write("\t\t\t<img class=\"rounded-circle\"\n");
      out.write("\t\t\t\tsrc=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\"\n");
      out.write("\t\t\t\talt=\"Generic placeholder image\" width=\"140\" height=\"140\">\n");
      out.write("\t\t\t<h2>Heading</h2>\n");
      out.write("\t\t\t<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in,\n");
      out.write("\t\t\t\tegestas eget quam. Vestibulum id ligula porta felis euismod semper.\n");
      out.write("\t\t\t\tFusce dapibus, tellus ac cursus commodo, tortor mauris condimentum\n");
      out.write("\t\t\t\tnibh, ut fermentum massa justo sit amet risus.</p>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t<a class=\"btn btn-secondary\" href=\"#\" role=\"button\">View details\n");
      out.write("\t\t\t\t\t&raquo;</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.col-lg-4 -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /.row -->\n");
      out.write("</div>\n");
      out.write("<!-- /.container -->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
