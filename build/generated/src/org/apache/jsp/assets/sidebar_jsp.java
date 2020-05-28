package org.apache.jsp.assets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<section class=\"full-box cover dashboard-sideBar\">\n");
      out.write("  <div class=\"full-box dashboard-sideBar-bg btn-menu-dashboard\"></div>\n");
      out.write("  <div class=\"full-box dashboard-sideBar-ct\">\n");
      out.write("    <!--SideBar Title -->\n");
      out.write("    <div class=\"full-box text-uppercase text-center text-titles dashboard-sideBar-title\">\n");
      out.write("      Mowo_o <i class=\"zmdi zmdi-close btn-menu-dashboard visible-xs\"></i>\n");
      out.write("    </div>\n");
      out.write("    <!-- SideBar User info -->\n");
      out.write("    <div class=\"full-box dashboard-sideBar-UserInfo\">\n");
      out.write("      <figure class=\"full-box\">\n");
      out.write("        <img src=\"../assets/img/avatar.jpg\" alt=\"UserIcon\">\n");
      out.write("        <figcaption class=\"text-center text-titles\">User Name</figcaption>\n");
      out.write("      </figure>\n");
      out.write("      <ul class=\"full-box list-unstyled text-center\">\n");
      out.write("        <li>\n");
      out.write("          <a href=\"#!\" class=\"btn-exit-system\">\n");
      out.write("            <i class=\"zmdi zmdi-power\"></i>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <!-- SideBar Menu -->\n");
      out.write("    <ul class=\"list-unstyled full-box dashboard-sideBar-Menu\">\n");
      out.write("      <li>\n");
      out.write("        <a href=\"./home.jsp\">\n");
      out.write("          <i class=\"zmdi zmdi-view-dashboard zmdi-hc-fw\"></i> home\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"#!\" class=\"btn-sideBar-SubMenu\">\n");
      out.write("          <i class=\"zmdi zmdi-case zmdi-hc-fw\"></i> Administracion\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"#!\" class=\"btn-sideBar-SubMenu\">\n");
      out.write("          <i class=\"zmdi zmdi-card zmdi-hc-fw\"></i> Docente\n");
      out.write("        </a>\n");
      out.write("          <ul>\n");
      out.write("              <li>\n");
      out.write("                  <a href=\"./notas.jsp\" class=\"btn-sideBar-SubMenu\">Notas</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                  <a href=\"#!\" class=\"btn-sideBar-SubMenu\">Observaciones</a>\n");
      out.write("              </li>\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("      </li>\n");
      out.write("       <li>\n");
      out.write("        <a href=\"#!\" class=\"btn-sideBar-SubMenu\">\n");
      out.write("          <i class=\"zmdi zmdi-card zmdi-hc-fw\"></i> Estudiante\n");
      out.write("        </a>\n");
      out.write("           <ul>\n");
      out.write("              <li>\n");
      out.write("                  <a href=\"./notas.jsp\" class=\"btn-sideBar-SubMenu\">Calificaciones</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                  <a href=\"#!\" class=\"btn-sideBar-SubMenu\">Asistencia</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                  <a href=\"#!\" class=\"btn-sideBar-SubMenu\">Asignatura</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                  <a href=\"#!\" class=\"btn-sideBar-SubMenu\">Observaciones</a>\n");
      out.write("              </li><li>\n");
      out.write("                  <a href=\"#!\" class=\"btn-sideBar-SubMenu\">Servicio Social</a>\n");
      out.write("              </li>\n");
      out.write("          </ul>\n");
      out.write("      </li>\n");
      out.write("       <li>\n");
      out.write("        <a href=\"#!\" class=\"btn-sideBar-SubMenu\">\n");
      out.write("          <i class=\"zmdi zmdi-card zmdi-hc-fw\"></i> Acudiente\n");
      out.write("        </a>\n");
      out.write("           <ul>\n");
      out.write("               <li>Consultar Notas</li>\n");
      out.write("               <li>Anotaciones</li>\n");
      out.write("               <li>citaciones</li>\n");
      out.write("\n");
      out.write("           </ul>\n");
      out.write("\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("\n");
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
