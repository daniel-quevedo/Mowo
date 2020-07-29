/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAdmin;

import DAOAdmin.AssocCourseDAO;
import DAOAdmin.CrudUserDAO;
import VOAdmin.AssocCourseVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leonardo
 */
@WebServlet(name = "AssocCourseSERVLET", urlPatterns = {"/AssocCourseSERVLET"})
public class AssocCourseSERVLET extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet AssocCourseSERVLET</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AssocCourseSERVLET at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        try (PrintWriter out = response.getWriter()) {
            
            
            int option = Integer.parseInt(request.getParameter("option"));
            
            int res;
            
            switch(option){
                
                case 1:
                    
                    String state, typeUs;
                    
                    //MOSTRAR LOS DATOS EN LA TABLA PARA ASIGNAR CURSOS *************************
                    CrudUserDAO uDAO = new CrudUserDAO(); 

                    ResultSet result = uDAO.dataUsers();
                    
                    out.println("<script src='../../js/jquery.dataTables.min.js' charset='utf-8'></script>\n" +
                                "<script src='../../js/dataTable.js' charset='utf-8'></script>");

                    out.println("<table class=\"table-hover table-borderless  table-responsive mt-5 mydataTable\" id=\"dataUser\">");
                        out.println("<thead>");
                        
                            out.println("<tr>" +
                                            "<th>Estado</th> \n" +
                                            "<th>Nombre</th>\n" +
                                            "<th>Apellido</th>\n" +
                                            "<th>N° Documento</th>\n" +
                                            "<th>Tipo de Usuario</th>\n" +
                                            "<th>Correo</th>\n" +
                                            "<th>cursos</th>\n" +
                                            "<th></th>\n"+
                                            "<th>Acciones</th>\n" +
                                            "<th></th>\n" +
                                        "</tr>");
                        
                        out.println("</thead>");
                        
                        while(result.next()){

                            //VALIDAR QUE EL USUARIO ESTA ACTIVO 

                            if (result.getInt(1) == 1){ 
                                state = "Activo";
                            }else{
                                state = "Inactivo";
                            }

                            //VALIDAR EL TIPO DE USUARIO ********************
                            int typeOpt = result.getInt(6);

                            switch(typeOpt){
                                case 1:
                                    typeUs = "Administrador";
                                    break;
                                case 2:
                                    typeUs = "Profesor";
                                    break;
                                case 3:
                                    typeUs = "Estudiante";
                                    break;
                                case 4:
                                    typeUs = "Acudiante";
                                    break;
                            }
                        }
                        out.println("<tbody>");
                            
                            out.println("<tr>\n" +
                                            "<td>Activo</td>\n" +
                                            "<td>Daniel Eduardo</td>\n" +
                                            "<td>Quevedo Ruiz</td>\n" +
                                            "<td>123456789</td>\n" +
                                            "<td>Docente</td>\n" +
                                            "<td>dequevedo@misena.edu.co</td>\n" +
                                            "<td colspan=\"2\">\n"+
                                            "<select id=\"courses\" class=\"form-control\" name=\"typeUser\" required>\n" +
                                                "<option value=\"\">Seleccione...</option>\n" +
                                                "<option value=\"1\">10-01</option>\n" +
                                                "<option value=\"2\">10-02</option>\n" +
                                                "<option value=\"3\">11-01</option>\n" +
                                                "<option value=\"4\">11-02</option>\n" +
                                            "</select>\n" +
                                            "<div id=\"list-courses\"></div></td>\n" +
                                            "<td><button id=\"add\" type=\"submit\" class=\"btn btn-success\">+</button></a></td>\n" +
                                            "<td><button id=\"submit\" type=\"submit\" class=\"btn btn-primary\">Agregar</button></td>\n" +
                                            "<td></td>\n" +
                                        "</tr>");
                        
                        out.println("</tbody>");
                    
                    break;
                
                case 2:
                    
                    try{
                
                        int id_user = Integer.parseInt(request.getParameter("idUser"));
                        int id_course = Integer.parseInt(request.getParameter("idCourse"));
                        String opt = request.getParameter("opt");

                        AssocCourseVO acVO = new AssocCourseVO(id_course, id_user, opt);

                        AssocCourseDAO acDAO = new AssocCourseDAO(acVO);

                        res = acDAO.assoc();

                        switch (res) {
                            case 1:
                                out.println("El estudiante se asocio correctamente");
                                break;
                            case -1:
                                out.println("El profesor se asocio correctamente");
                                break;
                            default:
                                out.println("Ocurio un error al momento de asociar el usuario");
                                break;
                        }


                    }catch(Exception ex){

                        out.println("Ocurio un error al momento de asociar el usuario "+ ex);

                    }
                    
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssocCourseSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
