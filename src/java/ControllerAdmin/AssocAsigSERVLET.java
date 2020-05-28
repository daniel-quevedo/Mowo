/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAdmin;

import DAOAdmin.AssocSubjectDAO;
import VOAdmin.AssocSubjectVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leonardo
 */
@WebServlet(name = "AssocAsigSERVLET", urlPatterns = {"/AssocAsigSERVLET"})
public class AssocAsigSERVLET extends HttpServlet {

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
//            out.println("<title>Servlet AssocAsigSERVLET</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AssocAsigSERVLET at " + request.getContextPath() + "</h1>");
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

            int result;
            
            try{
                
                int id_prof = Integer.parseInt(request.getParameter("id_prof"));
                int id_asig = Integer.parseInt(request.getParameter("id_asig"));
                int id_course = Integer.parseInt(request.getParameter("id_course"));
                String opt = request.getParameter("opt");

                AssocSubjectVO asVO = new AssocSubjectVO(id_prof, id_asig, id_course, opt);

                AssocSubjectDAO asDAO = new AssocSubjectDAO(asVO);

                result =  asDAO.assoc();
                
                asDAO.closeConnection();

                switch(result){
                    case 1:
                            out.println("<script> alert('Se asigno la asignatura al profesor correctamente'); </script>");
                            break;
                        case -1:
                            out.println("<script> alert('Se asigno la asignatura al curso correctamente'); </script>");
                            break;
                        default:
                            out.println("<script> alert('Ocurio un error al momento de asociar la asignatura'); </script>");
                            break;
                }

            }catch(Exception ex){

                out.println("<script> alert('Ocurio un error al momento de asociar la asignatura"+ ex +"'); </script>");

            }
            
            
            
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
