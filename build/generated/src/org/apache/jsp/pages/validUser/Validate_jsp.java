package org.apache.jsp.pages.validUser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import EncodeDecode.EncodeDecode;

public final class Validate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
    private String mailEncode; 
    private String mailDecode;

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
      out.write('\r');
      out.write('\n');

    
    mailEncode = request.getParameter("m41r");
    
    //decodificar el email****************
    
    EncodeDecode encoDe = new EncodeDecode();
    
    mailDecode =  encoDe.decode(mailEncode);


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/styleIndex.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\r\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("        <title>Crear Contraseña</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <main class=\"model mt-5 animated zoomIn\">\r\n");
      out.write("            <div class=\"col-md-9 col-sm-10 contenedor\">\r\n");
      out.write("                <div class=\"box-content\">\r\n");
      out.write("                    <div class=\"col-12 login text-center\">\r\n");
      out.write("                        <img src=\"../../img/login.png\" width=\"200\" height=\"200\" alt=\"login\">\r\n");
      out.write("                        <h5>Crear Contraseña</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form class=\"col-12\" method=\"post\" action=\"../../credentialsSERVLET\" autocomplete =\"off\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <img src=\"../../img/user.png\">\r\n");
      out.write("                            <label>Tu Usuario:</label><br>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"\" value=\"");
      out.print(mailDecode);
      out.write("\" disabled >\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <img src=\"../../img/lock.png\">\r\n");
      out.write("                            <label>Ingresa una Contraseña:</label><br>\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" autofocus placeholder=\"Contraseña\" required pattern=\"(?=.*\\d)(?=.*[A-Z]).{8,}\" title=\"\r\n");
      out.write("                                   Debe contener al menos un número, una letra mayúscula y al menos 8 o más caracteres\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <img src=\"../../img/lock.png\">\r\n");
      out.write("                            <label>Confirma tu Contraseña:</label><br>\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" placeholder=\"Confirmar Contraseña\" required pattern=\"(?=.*\\d)(?=.*[A-Z]).{8,}\" title=\"\r\n");
      out.write("                                   Debe contener al menos un número, una letra mayúscula y al menos 8 o más caracteres\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"text-center mb-2\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success botones\" >Confirmar</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div> \r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"../../js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"../../js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"../../js/abrir.js\" charset=\"utf-8\"></script>\r\n");
      out.write("        <script src=\"../../js/desplegable.js\" charset=\"utf-8\"></script>\r\n");
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
