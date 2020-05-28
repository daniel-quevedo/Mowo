package org.apache.jsp.pages.Students;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class asignaturas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/head.jsp", out, false);
      out.write("\n");
      out.write("\t<title>Asignaturas</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <main>\n");
      out.write("    <header>\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/sideBarEst.jsp", out, false);
      out.write("\n");
      out.write("    </header>\n");
      out.write("    <section>\n");
      out.write("      <div class=\"contenido abrir\">\n");
      out.write("        <img src=\"../../img/menu.png\" alt=\"\" class=\"menu-bar\">\n");
      out.write("        <div class=\"contenedor animated zoomIn\">\n");
      out.write("          <section>\n");
      out.write("            <nav>\n");
      out.write("              <ul class=\"nav nav-pills\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link active\" href=\"#\">Primer Periodo</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Segundo Periodo</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Tercer Periodo</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Cuarto Periodo</a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </nav>\n");
      out.write("          </section>\n");
      out.write("          <section>\n");
      out.write("            <h5>Asignaturas</h5><br\n");
      out.write("            <form action=\"\">\n");
      out.write("              <div class=\"table-responsive-sm\">\n");
      out.write("              <table class=\"table table-dark\">\n");
      out.write("                <thead>\n");
      out.write("                  <tr>\n");
      out.write("                    <th scope=\"col\">N°</th>\n");
      out.write("                    <th scope=\"col\">Asignaturas</th>\n");
      out.write("                    <th scope=\"col\">Profesor</th>\n");
      out.write("                    <th scope=\"col\">Salon</th>\n");
      out.write("                  </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>1</th>\n");
      out.write("                    <td>Matematicas</td>\n");
      out.write("                    <td>Antonio</td>\n");
      out.write("                    <td>403</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>2</th>\n");
      out.write("                    <td>Ciencias</td>\n");
      out.write("                    <td>Miguel</td>\n");
      out.write("                    <td>205</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>3</th>\n");
      out.write("                    <td>Historia</td>\n");
      out.write("                    <td>Camilo</td>\n");
      out.write("                    <td>306</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>4</th>\n");
      out.write("                    <td>Educacion Fisica</td>\n");
      out.write("                    <td>Julian</td>\n");
      out.write("                    <td>402</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>5</th>\n");
      out.write("                    <td>Sociales</td>\n");
      out.write("                    <td>Fredy</td>\n");
      out.write("                    <td>408</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>6</th>\n");
      out.write("                    <td>Quimica</td>\n");
      out.write("                    <td>Carlos</td>\n");
      out.write("                    <td>207</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th>7</th>\n");
      out.write("                    <td>Fisica</td>\n");
      out.write("                    <td>Andrea</td>\n");
      out.write("                    <td>303</td>\n");
      out.write("                  </tr>\n");
      out.write("                </tbody>\n");
      out.write("              </table>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </section>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("  </main>\n");
      out.write("\n");
      out.write("\t<script src=\"../../js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"../../js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"../../js/abrir.js\" charset=\"utf-8\"></script>\n");
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
