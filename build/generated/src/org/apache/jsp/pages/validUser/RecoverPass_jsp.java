package org.apache.jsp.pages.validUser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import EncodeDecode.EncodeDecode;

public final class RecoverPass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
    //private String mailEncode; 
    //private String mailDecode;
    //private int result;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/styleIndex.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <title>Recuperar Contraseña</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\" mt-5 animated zoomIn\">\n");
      out.write("            <div class=\"contenedor \">\n");
      out.write("                <div class=\"box-content rpass \">\n");
      out.write("                    <div class=\"col-12 login text-center\">\n");
      out.write("                        <img src=\"../../img/login.png\" width=\"200\" height=\"200\" alt=\"login\">\n");
      out.write("                        <h5>Recupera tu Contraseña</h5>\n");
      out.write("                    </div>\n");
      out.write("                    <form class=\"col-12\" method=\"post\" action=\"\" autocomplete=\"off\" id=\"\">                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <img src=\"../../img/mail.png\">\n");
      out.write("                            <label>Ingresa aqui tu Email</label><br>                           \n");
      out.write("                            <input type=\"email\" id=\"pass\" name=\"pass\" value=\"\" class=\"form-control\" autofocus placeholder=\"Ejemplo@gmail.com\" required pattern=\"[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\" tittle=\"Correo Electronico\">\n");
      out.write("                            <p class=\"text-center mt-3\">Enviaremos un correo a tu Email para que puedas cambiar tu contraseña</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-center mb-2\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success botones\" >Confirmar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../layout/scripts.jsp", out, false);
      out.write("\n");
      out.write("        <script src=\"../../js/validatePass.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

        //VALIDAR RETORNO DEL SERVLET ******************************+

            /*  if(request.getParameter("res") != null) {

                result = Integer.parseInt(request.getParameter("res"));
 
             if(result == 1){

                    
      out.write("\n");
      out.write("\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("                            Swal.fire({\n");
      out.write("\n");
      out.write("                                title: \"Registro Credenciales\",\n");
      out.write("                                text: \"Las credenciales se registraron correctamente\",\n");
      out.write("                                icon: \"success\",\n");
      out.write("                                timer: 5000\n");
      out.write("\n");
      out.write("                            }).then((value)=>{\n");
      out.write("\n");
      out.write("                                window.location.href = window.location.href.split(\"?\")[0];\n");
      out.write("\n");
      out.write("                                window.location.href = \"../../index.jsp\";\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                        </script>  \n");
      out.write("\n");
      out.write("                    ");


              //  }else{
                    
      out.write("\n");
      out.write("\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("                            Swal.fire({\n");
      out.write("\n");
      out.write("                                title: \"Error\",\n");
      out.write("                                text: \"Ocurrio un error al momento de ingresar las credenciales\",\n");
      out.write("                                icon: \"error\",\n");
      out.write("                                timer: 5000\n");
      out.write("\n");
      out.write("                            }).then((value)=>{\n");
      out.write("\n");
      out.write("                                window.location.href = window.location.href.split(\"?\")[0];\n");
      out.write("                                window.location.href = \"../../index.jsp\";\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                        </script>  \n");
      out.write("\n");
      out.write("                    ");

                }

            //}else{

                //VALIDAR EL MAIL ****************************

            /*    if(request.getParameter("m41r") != null) {

                    mailEncode = request.getParameter("m41r");

                    //decodificar el email****************

                    EncodeDecode encoDe = new EncodeDecode();

                    mailDecode =  encoDe.decode(mailEncode);

                }else{

                 response.sendRedirect("../../index.jsp");

                }

            }*/

        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
