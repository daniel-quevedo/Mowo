package org.apache.jsp.pages.Tutor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calificaciones_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/head.jsp", out, false);
      out.write("\r\n");
      out.write("\t<title>Calificaciones</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <main>\r\n");
      out.write("    <header>\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/sideBarTutor.jsp", out, false);
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("    <section>\r\n");
      out.write("    <div class=\"contenido abrir\">\r\n");
      out.write("        <img src=\"../../img/menu.png\" alt=\"\" class=\"menu-bar\">\r\n");
      out.write("        <div class=\"contenedor animated zoomIn\">\r\n");
      out.write("            <section>\r\n");
      out.write("                <nav>\r\n");
      out.write("                  <ul class=\"nav nav-pills\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      <a class=\"nav-link active\" href=\"#\" id=\"period1\" onClick=\"notes(1)\">Primer Periodo</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" id=\"period2\" onClick=\"notes(2)\">Segundo Periodo</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      <a class=\"nav-link\" href=\"#\" id=\"period3\" onClick=\"notes(3)\">Tercer Periodo</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      <a class=\"nav-link\" href=\"#\" id=\"period4\" onClick=\"notes(4)\">Cuarto Periodo</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </section>\r\n");
      out.write("            <section>\r\n");
      out.write("                <h5>Calificaciones</h5><br>\r\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(session.getAttribute("codUser"));
      out.write("\" id=\"codUser\">\r\n");
      out.write("                <table class=\"table table-borderless table-success table-responsive-sm\" id=\"tableNotesStu\">\r\n");
      out.write("                    <thead class=\"thead-dark\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <th colspan=\"8\" scope=\"col\">Primer Periodo</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>N°</th>\r\n");
      out.write("                            <th>Materia</th>\r\n");
      out.write("                            <th>Nota 1</th>\r\n");
      out.write("                            <th>Nota 2</th>\r\n");
      out.write("                            <th>Nota 3</th>\r\n");
      out.write("                            <th>Nota 4</th>\r\n");
      out.write("                            <th>Promedio</th>\r\n");
      out.write("                            <th>Aprobo</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </section>\r\n");
      out.write("  </main>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/scripts.jsp", out, false);
      out.write("\r\n");
      out.write("    <script src=\"../../js/student/showNotes.js\"></script>    \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
