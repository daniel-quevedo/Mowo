package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.LoginDAO;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
    LoginDAO DUser = new LoginDAO();
    DUser.closeConnection(); 

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/styleIndex.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\r\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("        <title>Mowo o</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         \r\n");
      out.write("        <div class=\"model \">\r\n");
      out.write("            <div class=\"col-md-8 col-sm-10 contenedor\">\r\n");
      out.write("                <div class=\"box-content animated zoomIn\">\r\n");
      out.write("                    <div class=\"col-12 login text-center\">\r\n");
      out.write("                        <img src=\"./img/login.png\" width=\"200\" height=\"200\" alt=\"login\">\r\n");
      out.write("                        <h5>Iniciar Sesión</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form class=\"col-12\" action=\"LoginSERVLET\" method=\"post\" autocomplete =\"off\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <img src=\"./img/user.png\">\r\n");
      out.write("                            <label>Nombre:</label><br>\r\n");
      out.write("                            <input type=\"text\" name=\"user\" class=\"form-control\" autofocus placeholder=\"Nombre de usuario\" required pattern=\"[A-Za-0-9z.@]{2,30}\" >\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <img src=\"./img/lock.png\">\r\n");
      out.write("                            <label>Contraseña:</label><br>\r\n");
      out.write("                            <input type=\"password\" name=\"passUsu\" class=\"form-control\" placeholder=\"Contraseña\" required pattern=\"(?=.*\\d)(?=.*[A-Z]).{8,}\" title=\"\r\n");
      out.write("                                   Debe contener al menos un número, una letra mayúscula y al menos 8 o más caracteres\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"text-center\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-outline-primary botones\" ><img src=\"./img/sign.png\"> Ingresar</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div class=\"col-12 text-right\">\r\n");
      out.write("                            <a href=\"#\">Recordar Contraseña</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div>\r\n");
      out.write("                ");
request.getAttribute("error");
      out.write(" \r\n");
      out.write("                    \r\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("                    \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
