package org.apache.jsp.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("    <title>Restablecer contraseña</title>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body style=\"-webkit-text-size-adjust: none; box-sizing: border-box; color: #74787E; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; height: 100%; line-height: 1.4; margin: 0; width: 100% !important;\" bgcolor=\"#F2F4F6\"><style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("width: 100% !important; height: 100%; margin: 0; line-height: 1.4; background-color: #F2F4F6; color: #74787E; -webkit-text-size-adjust: none;\n");
      out.write("}\n");
      out.write("@media only screen and (max-width: 600px) {\n");
      out.write("  .email-body_inner {\n");
      out.write("    width: 100% !important;\n");
      out.write("  }\n");
      out.write("  .email-footer {\n");
      out.write("    width: 100% !important;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("@media only screen and (max-width: 500px) {\n");
      out.write("  .button {\n");
      out.write("    width: 100% !important;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    <span class=\"preheader\" style=\"box-sizing: border-box; display: none !important; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size: 1px; line-height: 1px; max-height: 0; max-width: 0; mso-hide: all; opacity: 0; overflow: hidden; visibility: hidden;\">Use este enlace para restablecer su contraseña. El enlace solo es válido por 24 horas.</span>\n");
      out.write("    <table class=\"email-wrapper\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; margin: 0; padding: 0; width: 100%;\" bgcolor=\"#F2F4F6\">\n");
      out.write("      <tr>\n");
      out.write("        <td align=\"center\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; word-break: break-word;\">\n");
      out.write("          <table class=\"email-content\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; margin: 0; padding: 0; width: 100%;\">\n");
      out.write("            <tr>\n");
      out.write("              <td class=\"email-masthead\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; padding: 25px 0; word-break: break-word;\" align=\"center\">\n");
      out.write("                <a href=\"<?php echo URL; ?>\" class=\"email-masthead_name\" style=\"box-sizing: border-box; color: #bbbfc3; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size: 16px; font-weight: bold; text-decoration: none; text-shadow: 0 1px 0 white;\">\n");
      out.write("        Mowo_o\n");
      out.write("      </a>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("              <td class=\"email-body\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"-premailer-cellpadding: 0; -premailer-cellspacing: 0; border-bottom-color: #EDEFF2; border-bottom-style: solid; border-bottom-width: 1px; border-top-color: #EDEFF2; border-top-style: solid; border-top-width: 1px; box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; margin: 0; padding: 0; width: 100%; word-break: break-word;\" bgcolor=\"#FFFFFF\">\n");
      out.write("                <table class=\"email-body_inner\" align=\"center\" width=\"570\" cellpadding=\"0\" cellspacing=\"0\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; margin: 0 auto; padding: 0; width: 570px;\" bgcolor=\"#FFFFFF\">\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                    <td class=\"content-cell\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; padding: 35px; word-break: break-word;\">\n");
      out.write("                      <h1 style=\"box-sizing: border-box; color: #2F3133; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size: 19px; font-weight: bold; margin-top: 0;\" align=\"left\">Hola {{name}},</h1>\n");
      out.write("                      <p style=\"box-sizing: border-box; color: #74787E; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size: 16px; line-height: 1.5em; margin-top: 0;\" align=\"left\">Recientemente solicitó restablecer su contraseña para su cuenta en Mowo_o. Use el botón de abajo para reiniciarlo. <strong style = \"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif;\"> Este restablecimiento de contraseña solo es válido durante las próximas 24 horas.</strong></p>\n");
      out.write("                      \n");
      out.write("                      <table class=\"body-action\" align=\"center\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; margin: 30px auto; padding: 0; text-align: center; width: 100%;\">\n");
      out.write("                        <tr>\n");
      out.write("                          <td align=\"center\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; word-break: break-word;\">\n");
      out.write("                            \n");
      out.write("                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif;\">\n");
      out.write("                              <tr>\n");
      out.write("                                <td align=\"center\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; word-break: break-word;\">\n");
      out.write("                                  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif;\">\n");
      out.write("                                    <tr>\n");
      out.write("                                      <td style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; word-break: break-word;\">\n");
      out.write("                                        <a href=\"{{action_url_1}}\" class=\"button button--green\" target=\"_blank\" style=\"-webkit-text-size-adjust: none; background: #22BC66; border-color: #22bc66; border-radius: 3px; border-style: solid; border-width: 10px 18px; box-shadow: 0 2px 3px rgba(0, 0, 0, 0.16); box-sizing: border-box; color: #FFF; display: inline-block; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; text-decoration: none;\">Restablecer contraseña</a>\n");
      out.write("                                      </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                  </table>\n");
      out.write("                                </td>\n");
      out.write("                              </tr>\n");
      out.write("                            </table>\n");
      out.write("                          </td>\n");
      out.write("                        </tr>\n");
      out.write("                      </table>\n");
      out.write("                      <p style=\"box-sizing: border-box; color: #74787E; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size: 16px; line-height: 1.5em; margin-top: 0;\" align=\"left\"> Por razones de seguridad, esta solicitud se recibió de un dispositivo {{operating_system}} usando {{browser_name}}. Si no solicitó restablecer la contraseña, ignore este correo electrónico o póngase en contacto con el servicio de asistencia si tiene alguna pregunta. </p>\n");
      out.write("                      <p style=\"box-sizing: border-box; color: #74787E; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size: 16px; line-height: 1.5em; margin-top: 0;\" align=\"left\">Gracias,\n");
      out.write("                        <br />Equipo de Mowo_o</p>\n");
      out.write("                      \n");
      out.write("                      <table class=\"body-sub\" style=\"border-top-color: #EDEFF2; border-top-style: solid; border-top-width: 1px; box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; margin-top: 25px; padding-top: 25px;\">\n");
      out.write("                        <tr>\n");
      out.write("                          <td style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; word-break: break-word;\">\n");
      out.write("                            <p class=\"sub\" style=\"box-sizing: border-box; color: #74787E; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size: 12px; line-height: 1.5em; margin-top: 0;\" align=\"left\">Si tiene problemas con el botón de arriba, copie y pegue la siguiente URL en su navegador web.</p>\n");
      out.write("                            <p class=\"sub\" style=\"box-sizing: border-box; color: #74787E; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size: 12px; line-height: 1.5em; margin-top: 0;\" align=\"left\">{{action_url_2}}</p>\n");
      out.write("                          </td>\n");
      out.write("                        </tr>\n");
      out.write("                      </table>\n");
      out.write("                    </td>\n");
      out.write("                  </tr>\n");
      out.write("                </table>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; word-break: break-word;\">\n");
      out.write("                <table class=\"email-footer\" align=\"center\" width=\"570\" cellpadding=\"0\" cellspacing=\"0\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; margin: 0 auto; padding: 0; text-align: center; width: 570px;\">\n");
      out.write("                  <tr>\n");
      out.write("                    <td class=\"content-cell\" align=\"center\" style=\"box-sizing: border-box; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; padding: 35px; word-break: break-word;\">\n");
      out.write("                      <p class=\"sub align-center\" style=\"box-sizing: border-box; color: #AEAEAE; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size: 12px; line-height: 1.5em; margin-top: 0;\" align=\"center\">© {{year}} Mowo_o. Todos los derechos reservados.</p>\n");
      out.write("                      <p class=\"sub align-center\" style=\"box-sizing: border-box; color: #AEAEAE; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size: 12px; line-height: 1.5em; margin-top: 0;\" align=\"center\">\n");
      out.write("                        <br />Cra. 86 A No. 77 BB - 45 Robledo Bello Horizonte\n");
      out.write("                        <br />300 565 9290\n");
      out.write("                      </p>\n");
      out.write("                    </td>\n");
      out.write("                  </tr>\n");
      out.write("                </table>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("          </table>\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
