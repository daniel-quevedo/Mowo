/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAdmin;

import DAOAdmin.InsertUserDAO;
import EncodeDecode.EncodeDecode;
import VOAdmin.InsertUserVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mail.Mail;

/**
 *
 * @author Leonardo
 */
@WebServlet(name = "InsertUserSERVLET", urlPatterns = {"/InsertUserSERVLET"})
public class InsertUserSERVLET extends HttpServlet {

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
//            out.println("<title>Servlet InsertUserSERVLET</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet InsertUserSERVLET at " + request.getContextPath() + "</h1>");
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
            
            
            try{
                
                if (option == 1) {
                    
                    String mailEncode = request.getParameter("mail");
                    
                    //decodificar el mail****************
                    
                    EncodeDecode coDe = new EncodeDecode();
                    
                    String mailDecode = coDe.decode(mailEncode);
                    
                    //Enviar correo al mail ingresado**********
                    
                    Mail objMail = new Mail(mailDecode);

                    objMail.sendMail();
                    
                }else{
                    
                    String mail = request.getParameter("mail");
                    String name = request.getParameter("name");
                    String lname = request.getParameter("lname");
                    String typeDoc = request.getParameter("typeDoc");
                    int nDocument = Integer.parseInt(request.getParameter("nDocument"));
                    int typeUser = Integer.parseInt(request.getParameter("typeUser"));
                    int phone = Integer.parseInt(request.getParameter("phone"));
                    String dir = request.getParameter("dir");
                    String date = request.getParameter("date");

                    InsertUserVO uVO = new InsertUserVO(typeDoc, nDocument, name, lname, typeUser, phone, dir, date, mail, 1);

                    InsertUserDAO uDAO = new InsertUserDAO(uVO);

                    int res = uDAO.insertUser();

                    uDAO.closeConnection();
                    
                    //codificar el mail
                    
                    EncodeDecode coDe = new EncodeDecode(mail);
                    
                    String mailEncode = coDe.encode();

                    response.sendRedirect("pages/Admin/insertUsu.jsp?result="+res+"&resm="+mailEncode+""); 
                    
                }

            }catch(SQLException ex){
                
                out.println("<script>");
                    
                        out.println("alert('Ocurrio un error al ingresar el usuario "+ ex +" ');");
                    
                out.println("</script>");
                
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
