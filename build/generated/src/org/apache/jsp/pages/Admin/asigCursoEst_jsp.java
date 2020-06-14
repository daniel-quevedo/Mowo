package org.apache.jsp.pages.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class asigCursoEst_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
    
    private String idProfile;
    private int id_profile; 


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/pages/Admin/../../includes/Admin/ValidateSession.jsp");
  }

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
      out.write("<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA ADMINISTRADOR************************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA ADMINISTRADOR************************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    
    if (session.getAttribute("nameUser") == null) {
            
       response.sendRedirect("../../index.jsp");
        
    }else{
       
       idProfile = (String) session.getAttribute("idProfile");
       id_profile = Integer.parseInt(idProfile);
       
       if(id_profile != 1){
           
        response.sendRedirect("../../index.jsp");
        
       }
       
    }


      out.write('\r');
      out.write('\n');
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!--*****************************************************************************************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/head.jsp", out, false);
      out.write("\r\n");
      out.write("            <title>Asignar Cursos</title>\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <main>\r\n");
      out.write("                <header>\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/sideBarAdm.jsp", out, false);
      out.write("\r\n");
      out.write("            </header>\r\n");
      out.write("            <section>\r\n");
      out.write("                <div class=\"contenido abrir\">\r\n");
      out.write("                    <img src=\"../../img/menu.png\" alt=\"\" class=\"menu-bar\">\r\n");
      out.write("                    <div class=\"contenedor\">\r\n");
      out.write("                        <form action=\"\" method=\"POST\">\r\n");
      out.write("                            <table class=\"table table-hover table-success table-borderless table-responsive-sm mt-5\">\r\n");
      out.write("                                <thead class=\"thead-dark\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th colspan=\"3\">Estudiantes</th>\r\n");
      out.write("                                        <th>Cursos</th>\r\n");
      out.write("                                        <th><input type=\"search\" class=\"form-control\" name=\"\" value=\"\" placeholder=\"Buscar\"></th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>Daniel Eduardo</td>\r\n");
      out.write("                                        <td>Quevedo ruiz</td>\r\n");
      out.write("                                        <td>dequevedo@misena.edu.co</td>\r\n");
      out.write("                                        <td><select class=\"form-control\">\r\n");
      out.write("                                                <option value=\"\">--Seleccione--</option>\r\n");
      out.write("                                                <option value=\"\">Curso 1</option>\r\n");
      out.write("                                                <option value=\"\">Curso 2</option>\r\n");
      out.write("                                                <option value=\"\">Curso 3</option>\r\n");
      out.write("                                                <option value=\"\">Curso 4</option>\r\n");
      out.write("                                            </select></td>\r\n");
      out.write("                                        <td><a href=\"#ventana1\" data-toggle=\"modal\"><button type=\"button\" class=\"btn btn-success\">Asignar</button></a></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>Daniel Eduardo</td>\r\n");
      out.write("                                        <td>Quevedo ruiz</td>\r\n");
      out.write("                                        <td>dequevedo@misena.edu.co</td>\r\n");
      out.write("                                        <td><select class=\"form-control\">\r\n");
      out.write("                                                <option value=\"\">--Seleccione--</option>\r\n");
      out.write("                                                <option value=\"\">Curso 1</option>\r\n");
      out.write("                                                <option value=\"\">Curso 2</option>\r\n");
      out.write("                                                <option value=\"\">Curso 3</option>\r\n");
      out.write("                                                <option value=\"\">Curso 4</option>\r\n");
      out.write("                                            </select></td>\r\n");
      out.write("                                        <td><a href=\"#ventana1\" data-toggle=\"modal\"><button type=\"button\" class=\"btn btn-success\">Asignar</button></a></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>Daniel Eduardo</td>\r\n");
      out.write("                                        <td>Quevedo ruiz</td>\r\n");
      out.write("                                        <td>dequevedo@misena.edu.co</td>\r\n");
      out.write("                                        <td><select class=\"form-control\">\r\n");
      out.write("                                                <option value=\"\">--Seleccione--</option>\r\n");
      out.write("                                                <option value=\"\">Curso 1</option>\r\n");
      out.write("                                                <option value=\"\">Curso 2</option>\r\n");
      out.write("                                                <option value=\"\">Curso 3</option>\r\n");
      out.write("                                                <option value=\"\">Curso 4</option>\r\n");
      out.write("                                            </select></td>\r\n");
      out.write("                                        <td><a href=\"#ventana1\" data-toggle=\"modal\"><button type=\"button\" class=\"btn btn-success\">Asignar</button></a></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/scripts.jsp", out, false);
      out.write("\r\n");
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
