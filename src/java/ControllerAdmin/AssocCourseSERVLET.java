/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAdmin;

import DAOAdmin.AssocCourseDAO;
import VOAdmin.AssocCourseVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.ir.WhileNode;

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
            //VARIABLES PARA VALIDAR ACTIVO/INACTIVO
            String state;
            String button;
            int res = 0;

            switch (option) {

                case 1:
                    int user = Integer.parseInt(request.getParameter("user"));

                    AssocCourseDAO DocEst = new AssocCourseDAO();

                    ResultSet result = DocEst.listDocEst(user);

                    out.println("<script src='../../js/jquery.dataTables.min.js' charset='utf-8'></script>\n"
                            + "<script src='../../js/dataTable.js' charset='utf-8'></script>");

                    out.println("<table class=\"table-hover table-borderless table-responsive mt-5 mydataTable\">");
                    out.println("<thead class=\"text-center\">");
                    out.println("<tr>");
                    out.println("<th>Estado</th>");
                    out.println("<th>Nombre</th>");
                    out.println("<th>Apellido</th>");
                    out.println("<th>N° Documento</th>");
                    out.println("<th>Teléfono</th>");
                    out.println("<th>Correo</th>");
                    out.println("<th>Cursos</th>");
                    out.println("<th>Acciones</th>");
                    out.println("</tr>");
                    out.println("</thead>");
                    out.println("<tbody>");
                    while (result.next()) {
                        ResultSet resCourse = DocEst.listCourse();

                        if (result.getInt(1) == 1) {
                            state = "Activo";
                        } else {
                            state = "Inactivo";
                        }
                        out.println("<tr>");
                        out.println("<td>" + state + "</td>");
                        out.println("<td>" + result.getString(2) + "</td>");
                        out.println("<td>" + result.getString(3) + "</td>");
                        out.println("<td>" + result.getInt(4) + "</td>");
                        out.println("<td>" + result.getInt(5) + "</td>");
                        out.println("<td>" + result.getString(6) + "</td>");
                        out.println("<td><select class=\"form-control\" name=\"courses\">");
                        out.println("<option value=\"\">Seleccione...</option>");
                        while (resCourse.next()) {
                            out.println("<option value=" + resCourse.getInt(1) + ">" + resCourse.getString(2) + "</option>");
                        }
                        out.println("</td></select>");
                        out.println("<td><button id=\"submit\" type=\"submit\" class=\"btn btn-primary\">Agregar</button></td>");
                    }
                    out.println("</tbody>");
                    out.println("</table>");
                    break;

                case 2:

                    try {
                        
                        int id_course = Integer.parseInt(request.getParameter("idCourse"));

                        String[] users = request.getParameterValues("user");
                        
                        String opt = request.getParameter("opt");
                        
                        for(int i =0;i<users.length;i++){
                            
                            int id_user = Integer.parseInt(users[i]);
                         
                            AssocCourseVO acVO = new AssocCourseVO(id_user, id_course, opt);

                            AssocCourseDAO acDAO = new AssocCourseDAO(acVO);

                            int temp = acDAO.assoc();
                            
                            if(temp == -1){
                                res --;
                            }else if(temp == 1){
                                res ++;
                            }

                            acDAO.closeConnection();
                            
                        }
                        
                        if (res < 0)
                            response.sendRedirect("pages/Admin/asigCoursePro.jsp?="+res+"");
                        else if(res > 0)
                            response.sendRedirect("pages/Admin/asigCourseEst.jsp?="+res+"");
                            
                        
                    } catch (Exception ex) {

                        out.println("Ocurio un error al momento de asociar el usuario " + ex);

                    }

                    break;

                case 3:
                    //INSERTAR CURSO ******************************
                    String name_course = request.getParameter("name");
                    int code = Integer.parseInt(request.getParameter("code"));

                    AssocCourseDAO insCourse = new AssocCourseDAO();

                    int resu = insCourse.insertCourse(name_course, code);
                    insCourse.closeConnection();
                    
                    response.sendRedirect("pages/Admin/insertCourse.jsp?src="+resu+"");
                    
                    
                    break;
                case 4:
                    //LISTAR CURSOS *******************************                    

                    AssocCourseDAO cDAO = new AssocCourseDAO();

                    ResultSet resulCourse = cDAO.listCourse();


                    out.println("<table class=\"table table-hover table-borderless table-responsive mt-5 \">");
                    out.println("<thead class=\"text-center\">");
                    out.println("<tr>");                    
                    out.println("<th>Nombre</th>");
                    out.println("<th>Apellido</th>");                                        
                    out.println("<th>Acciones</th>");                    
                    out.println("</tr>");
                    out.println("</thead>");
                    out.println("<tbody>");
                    while (resulCourse.next()) {                                                
                        out.println("<tr>");                        
                        out.println("<td>" + resulCourse.getString(2) + "</td>");                        
                        out.println("<td>" + resulCourse.getInt(1) + "</td>");                        
                        out.println("<td><button id=\"submit\" type=\"submit\" class=\"btn btn-primary\">Agregar</button></td>");                        
                        out.println("</tr>");
                    }
                    out.println("</tbody>");
                    out.println("</table>");
                    break;
            }
        } catch (Exception ex) {
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
