/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerTutor;

import DAOTutor.ShowEstutorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david.quevedo
 */
@WebServlet(name = "ShowEstutorSERVLET", urlPatterns = {"/ShowEstutorSERVLET"})
public class ShowEstutorSERVLET extends HttpServlet {

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
//            out.println("<title>Servlet ShowEstutorSERVLET</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ShowEstutorSERVLET at " + request.getContextPath() + "</h1>");
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
            
            try{
                
                ShowEstutorDAO shwetDAO = new ShowEstutorDAO();
                ResultSet result = shwetDAO.listUser(54);

                while(result.next()){
                    out.println("<jsp:include page=\"../../layout/head.jsp\"></jsp:include>");
                    out.println("<div class=\"col-xs-10 col-sm-6 col-md-4 mb-5\">\n" +
                                    "<a href=\"notes.jsp\" >"+
                                    "<div class=\"target p-2\">\n" +
                                        "<img src=\"../../img/avatar.png\" alt=\"Foto de Perfil\">\n"+
                                        "<h4>"+result.getString(3)+"</h4>\n"+
                                        "<p>"+result.getInt(2)+"</p>\n"+
                                    "</div>\n"+ 
                                    "</a>\n" +
                                "</div> "
                    );
                }
                
            }catch(SQLException ex){
                
            }
            
            
            
            
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>que se dice</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ShowEstutorSERVLET ats</h1>");
//            out.println("</body>");
//            out.println("</html>");
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
