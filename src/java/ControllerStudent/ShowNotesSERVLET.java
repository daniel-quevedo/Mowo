/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerStudent;

import DAOStudents.ShowNotesDAO;
import VOStudents.ShowNotesVO;
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
@WebServlet(name = "ShowNotesSERVLET", urlPatterns = {"/ShowNotesSERVLET"})
public class ShowNotesSERVLET extends HttpServlet {

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
//            out.println("<title>Servlet ShowNotesSERVLET</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ShowNotesSERVLET at " + request.getContextPath() + "</h1>");
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
            /* TODO output your page here. You may use following sample code. */
            int codUser, period, cont;
            String approve;
            boolean resApprove;
            
            cont = 1;
            
            codUser = Integer.parseInt(request.getParameter("cod"));
            period = Integer.parseInt(request.getParameter("period"));
            
            ShowNotesVO shVO = new ShowNotesVO(codUser, period); 
            ShowNotesDAO shDAO = new ShowNotesDAO(shVO);
            
            ResultSet result = shDAO.notesStudents();
            
            shDAO.closeConnection();
            
            out.println("<table class='table table-borderless table-success table-responsive-sm' id='tableNotesStu'> \n" +
                            "<thead class='thead-dark'> \n" +
                                "<tr> \n" +
                                    "<th colspan='8' scope='col'>Primer Periodo</th> \n" +
                                "</tr> \n" +
                            "</thead> \n" +
                            "<tbody> \n" +
                                "<tr> \n" +
                                    "<th> N° </th> \n" +
                                    "<th>Materia</th> \n" +
                                    "<th>Nota 1</th> \n" +
                                    "<th>Nota 2</th> \n" +
                                    "<th>Nota 3</th> \n" +
                                    "<th>Nota 4</th> \n" +
                                    "<th>Promedio</th> \n" +
                                    "<th>Resultado</th> \n" +
                                "</tr>");
                    while(result.next()){
                        resApprove = result.getBoolean(7);
                        
                        if (resApprove) {
                            approve="<td class='text-success'>Aprobo</td>";
                        }else{
                            approve="<td class='text-danger '>Reprobo</td>";
                        }
                        
                        
                    out.println("<tr> \n"+
                                    "<td> "+(cont++)+"</td> \n"+
                                    "<td> "+result.getString(1)+" </td> \n"+
                                    "<td> "+result.getDouble(2)+" </td> \n"+
                                    "<td> "+result.getDouble(3)+" </td> \n"+
                                    "<td> "+result.getDouble(4)+" </td> \n"+
                                    "<td> "+result.getDouble(5)+" </td> \n"+
                                    "<td> "+result.getDouble(6)+" </td> \n"+
                                    approve+
                                "</tr>");
                    out.println("</tbody> \n"+
                        "</table>");
                    }
        } catch (SQLException ex) {
            Logger.getLogger(ShowNotesSERVLET.class.getName()).log(Level.SEVERE, null, ex);
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
