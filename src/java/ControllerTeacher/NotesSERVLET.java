/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerTeacher;

import DAOTeacher.NotesDAO;
import VOTeacher.NotesVO;
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
@WebServlet(name = "NotesSERVLET", urlPatterns = {"/NotesSERVLET"})
public class NotesSERVLET extends HttpServlet {

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
//            out.println("<title>Servlet NotesSERVLET</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet NotesSERVLET at " + request.getContextPath() + "</h1>");
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
                
                double note1, note2, note3, note4;
                int id_user, id_subj, result;
                
                note1 = Double.parseDouble(request.getParameter("n1"));
                note2 = Double.parseDouble(request.getParameter("n2"));
                note3 = Double.parseDouble(request.getParameter("n3"));
                note4 = Double.parseDouble(request.getParameter("n4"));
                id_user = Integer.parseInt(request.getParameter("id_user"));
                id_subj = Integer.parseInt(request.getParameter("id_subj"));
                
//                out.println("<h1> here </h1>");
//                out.println("<h1> "+ note1 +" </h1>");
//                out.println("<h1> "+ note2 +" </h1>");
//                out.println("<h1> "+ note3 +" </h1>");
//                out.println("<h1> "+ note4 +" </h1>");
//                out.println("<h1> "+ id_user +" </h1>");
//                out.println("<h1> "+ id_subj +" </h1>");

                
                NotesVO nVO = new NotesVO(note1, note2, note3, note4, id_user, id_subj); 
                
                NotesDAO nDAO = new NotesDAO(nVO);
                
                result = nDAO.notes();

                if (result == 4)                    
                    out.println("Las notas se ingresaron correctamente");
                    
                else
                    out.println("Ocurrio un error al insertar las notas");
                
            }catch(Exception ex){
                
                out.println("Ocurrio un error al insertar las notas "+ ex);
                
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
