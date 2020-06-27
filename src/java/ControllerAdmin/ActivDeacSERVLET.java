/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAdmin;

import DAOAdmin.ActivDeacDAO;
import VOAdmin.ActivDeacVO;
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
@WebServlet(name = "ActivDeacSERVLET", urlPatterns = {"/ActivDeacSERVLET"})
public class ActivDeacSERVLET extends HttpServlet {

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
//            out.println("<title>Servlet ActivDeacSERVLET</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ActivDeacSERVLET at " + request.getContextPath() + "</h1>");
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
            
  //          out.println("<h1> Hello </h1>");
            
            int opt = Integer.parseInt(request.getParameter("opt"));
            int idUser = Integer.parseInt(request.getParameter("cod"));
            
            
            int result = 0;
            
            if (opt == 1) {
                
                ActivDeacVO adVO = new ActivDeacVO(idUser,"A"); 
                
                ActivDeacDAO adDAO = new ActivDeacDAO(adVO);
                
                result = adDAO.activDeac();
                
            }else if(opt == 2){
                
                ActivDeacVO adVO = new ActivDeacVO(idUser,"B"); 
                
                ActivDeacDAO adDAO = new ActivDeacDAO(adVO);
                
                result = adDAO.activDeac();
                
            }
            
            response.sendRedirect("pages/Admin/modifyUser.jsp?result="+result+"");
            
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
