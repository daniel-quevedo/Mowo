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

/**
 *
 * @author Leonardo
 */
@WebServlet(name = "CrudCourseSERVLET", urlPatterns = {"/CrudCourseSERVLET"})
public class CrudCourseSERVLET extends HttpServlet {

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
//            out.println("<title>Servlet CrudCourseSERVLET</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CrudCourseSERVLET at " + request.getContextPath() + "</h1>");
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

            switch (option) {
                case 1:

                    try {

                        //INSERTAR CURSO ******************************
                        String name_course = request.getParameter("name");
                        int code = Integer.parseInt(request.getParameter("code"));

                        AssocCourseDAO insCourse = new AssocCourseDAO();

                        int resu = insCourse.insertCourse(name_course, code);
                        insCourse.closeConnection();

                        response.sendRedirect("pages/Admin/insertCourse.jsp?src=" + resu + "");

                    } catch (Exception ex) {
                        System.out.println("ocurrion un error al momento de insertar un curso " + ex);
                    }
                    break;

                case 2:

                    // MODAL¨***********
                    int id_course = Integer.parseInt(request.getParameter("cod"));

                    AssocCourseVO aVO = new AssocCourseVO(0, id_course, "0");
                    AssocCourseDAO aDAO = new AssocCourseDAO(aVO);

                    ResultSet result = aDAO.listCourse(0);

                    out.println("<table class='ml-5 table table-light table-borderless col-4 table-responsive-sm mt-2'>");

                    if (result.next()) {

                        out.println("<input type='hidden' value='" + result.getInt(1) + "' name='id_course'>");

                        out.println("<thead>");
                        out.println("<tr>");
                        out.println("<th><label>Nombre:</label></th>\n"
                                + "<td><input type='text' class='form-control' name='name' id='name' value='" + result.getString(2) + "' minlength='6' maxlength='10' autofocus pattern='[9-0]+ [A-Z]{3,25}' required></td>");
                        out.println("<tr>");
                        out.println("</thead>\n"
                                + "<tbody>");
                        out.println("<tr>");
                        out.println("<th><label>Codigo:</label></th>\n"
                                + "<td><input type='number' class='form-control' name='code' id='code' value='" + result.getInt(3) + "' minlength='3' maxlength='3' pattern='[9-0]{3}' required></td>");
                        out.println("</tr>");
                        out.println("<tr>");

                        out.println("<td><button class=\"btn btn-danger\" data-dismiss=\"modal\">Cerrar</button></td>\n"
                                + "<td><button class=\"btn btn-success\">Guardar</button></td>");

                        out.println("</tr>");
                        out.println("</tbody>");
                    }
                    out.println("</table>");

                    aDAO.closeConnection();

                    break;

                case 3:

                    //ACTUALIZAR CURSOS**************
                    int resu = 0;
                    
                    id_course = Integer.parseInt(request.getParameter("id_course"));
                    
                    String nameCourse = request.getParameter("name");
                    int code = Integer.parseInt(request.getParameter("code"));
                    AssocCourseDAO uDAO = new AssocCourseDAO();
                    resu = uDAO.modifyCourse(nameCourse, code, id_course);
                    
                    response.sendRedirect("pages/Admin/modifyCourse.jsp?res="+resu+"");
                    
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
