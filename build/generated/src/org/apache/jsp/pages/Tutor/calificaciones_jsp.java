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
      out.write("    <head>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/head.jsp", out, false);
      out.write("\r\n");
      out.write("            <title>Calificaciones</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <main>\r\n");
      out.write("            <header>\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/sideBarTutor.jsp", out, false);
      out.write("\r\n");
      out.write("            </header>\r\n");
      out.write("            <section>\r\n");
      out.write("                <div class=\"contenido abrir\">\r\n");
      out.write("                    <img src=\"../../img/menu.png\" class=\"menu-bar\">\r\n");
      out.write("                    <div class=\"contenedor animated zoomIn\">\r\n");
      out.write("                        <section>\r\n");
      out.write("                            <div class=\"row center-xs\">\r\n");
      out.write("                                <div class=\"col-xs-10 col-sm-6 col-md-4 mb-5\">\r\n");
      out.write("                                    <a href=\"notes.jsp\" ><div class=\"target p-2\">\r\n");
      out.write("                                        <img src=\"../../img/avatar.png\" alt=\"Foto de Perfil\">\r\n");
      out.write("                                        <h4>Daniel Quevedo</h4>\r\n");
      out.write("                                        <p>1023037660</p>\r\n");
      out.write("                                        <p>Curso 10-01 J.M.</p>\r\n");
      out.write("                                    </div></a>\r\n");
      out.write("                                </div> \r\n");
      out.write("                                <div class=\"col-xs-10 col-sm-6 col-md-4 mb-5\">\r\n");
      out.write("                                    <div class=\"target p-2\">\r\n");
      out.write("                                        <img src=\"../../img/avatar.png\" alt=\"Foto de Perfil\">\r\n");
      out.write("                                        <h4>Eduardo Ruiz</h4>\r\n");
      out.write("                                        <p>1023037660</p>\r\n");
      out.write("                                        <p>Curso 10-01 J.M.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div> \r\n");
      out.write("                                <div class=\"col-xs-10 col-sm-6 col-md-4 mb-5\">\r\n");
      out.write("                                    <div class=\"target p-2\">\r\n");
      out.write("                                        <img src=\"../../img/avatar.png\" alt=\"Foto de Perfil\">\r\n");
      out.write("                                        <h4>David Quevedo</h4>\r\n");
      out.write("                                        <p>1023037660</p>\r\n");
      out.write("                                        <p>Curso 10-01 J.M.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div> \r\n");
      out.write("                                <div class=\"col-xs-10 col-sm-6 col-md-4 mb-5\">\r\n");
      out.write("                                    <div class=\"target p-2\">\r\n");
      out.write("                                        <img src=\"../../img/avatar.png\" alt=\"Foto de Perfil\">\r\n");
      out.write("                                        <h4>Leonardo Ruiz</h4>\r\n");
      out.write("                                        <p>1023037660</p>\r\n");
      out.write("                                        <p>Curso 10-01 J.M.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div> \r\n");
      out.write("                                <div class=\"col-xs-10 col-sm-6 col-md-4 mb-5\">\r\n");
      out.write("                                    <div class=\"target p-2\">\r\n");
      out.write("                                        <img src=\"../../img/avatar.png\" alt=\"Foto de Perfil\">\r\n");
      out.write("                                        <h4>Mauricio Gonzalez</h4>\r\n");
      out.write("                                        <p>1023037660</p>\r\n");
      out.write("                                        <p>Curso 10-01 J.M.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/scripts.jsp", out, false);
      out.write("\r\n");
      out.write("    <script src=\"../../js/student/showNotes.js\"></script>    \r\n");
      out.write("    </body>\r\n");
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
