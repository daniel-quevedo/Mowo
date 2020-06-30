/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAdmin;

import DAOAdmin.CrudUserDAO;
import EncodeDecode.EncodeDecode;
import VOAdmin.CrudUserVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet(name = "CrudUserSERVLET", urlPatterns = {"/CrudUserSERVLET"})
public class CrudUserSERVLET extends HttpServlet {

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
//            out.println("<title>Servlet CrudUserSERVLET</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CrudUserSERVLET at " + request.getContextPath() + "</h1>");
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
            
            //VARIABLES PARA VALIDAR EL ESTADO Y TIPO DE USUARIO************
            String state;
            String button;
            String typeUs = "";
            //******************************************
            
            
            //VARIABLES DATOS DE USUARIO******************
            String mail;
            String name;
            String lname;
            String typeDoc;
            int nDocument;
            int typeUser;
            int phone;
            String dir;
            String date;
            //*******************************************
            
            try{
                
                switch (option) {
                    case 1:
                    {

                        //ENVIAR EL EMAIL CON EL LINK PARA CAMBIAR EL PASSWOIRD POR DEFECTO**********

                        String mailEncode = request.getParameter("mail");
                        
                        //DECODIFICAR EL EMAIL RECIBIDO****************
                        EncodeDecode coDe = new EncodeDecode();
                        String mailDecode = coDe.decode(mailEncode);
                        
                        //ENVIAR CORREO AL CORREO CORRESPONDIENTE*************
                        Mail objMail = new Mail(mailDecode);
                        objMail.sendMail();
                        break;
                    }
                    case 2:
                    {
                        //INSERTAR USUARIO ******************************
                        mail = request.getParameter("mail");
                        name = request.getParameter("name");
                        lname = request.getParameter("lname");
                        typeDoc = request.getParameter("typeDoc");
                        nDocument = Integer.parseInt(request.getParameter("nDocument"));
                        typeUser = Integer.parseInt(request.getParameter("typeUser"));
                        phone = Integer.parseInt(request.getParameter("phone"));
                        dir = request.getParameter("dir");
                        date = request.getParameter("date");
                        
                        CrudUserVO uVO = new CrudUserVO(typeDoc, nDocument, name, lname, typeUser, phone, dir, date, mail, 1);
                        CrudUserDAO uDAO = new CrudUserDAO(uVO);
                        
                        int res = uDAO.insertUser();
                        uDAO.closeConnection();
                        
                        //CODIFICAR EL EMAIL PARA ENVIARLO POR URL********
                        EncodeDecode coDe = new EncodeDecode(mail);
                        String mailEncode = coDe.encode();
                        response.sendRedirect("pages/Admin/insertUser.jsp?result="+res+"&resm="+mailEncode+"");
                        break;
                    } 
                    case 3:
                    {
                        //MOSTRAR LOS USUARIOS EN LA TABLA PARA MODIFICAR*****************

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
                                            "<th>Tipo de Documento</th>\n" +
                                            "<th>N° Documento</th>\n" +
                                            "<th>Tipo de Usuario</th>\n" +
                                            "<th>Telefono</th>\n" +
                                            "<th>Direccion</th>\n" +
                                            "<th>Fecha de Nac.</th>\n" +
                                            "<th>Correo</th>\n" +
                                            "<th>Acciones</th>\n" +
                                            "<th></th>\n" +
                                        "</tr>");

                            out.println("</thead>");
                            out.println("<tbody>");




                            while(result.next()){

                                //VALIDAR QUE EL USUARIO ESTA ACTIVO Y COLOCAR UN BOTON PARA ACTIVAR O DESACTIVAR
                                //DEPENDIENDO EL CASO

                                if (result.getInt(1) == 1){ 
                                    state = "Activo";

                                    button = "<button type='submit' name='adButton' id='adButton' class='btn btn-outline-danger' onclick='adUser(2,"+result.getInt(11)+")'>Inactivar</button>";

                                }else{
                                    state = "Inactivo";

                                    button = "<button type='submit' name='adButton' id='adButton' class='btn btn-outline-success' onclick='adUser(1,"+result.getInt(11)+")'>Activar</button>";


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
                                }


                                out.println("<tr>");

                                    out.println("<td>"+state+"</td>");
                                    out.println("<td>"+result.getString(2)+"</td>");
                                    out.println("<td>"+result.getString(3)+"</td>");
                                    out.println("<td>"+result.getString(4)+"</td>");
                                    out.println("<td>"+result.getInt(5)+"</td>");
                                    out.println("<td>"+typeUs+"</td>");
                                    out.println("<td>"+result.getString(7)+"</td>");
                                    out.println("<td>"+result.getString(8)+"</td>");
                                    out.println("<td>"+result.getString(9)+"</td>");
                                    out.println("<td>"+result.getString(10)+"</td>");
                                    out.println("<td><a href='#ventana1' data-toggle='modal' onclick='modalUser("+result.getInt(5)+")'><button type='button' class='btn btn-primary'>Editar</button></a></td>");
                                    out.println("<td>"+button+"</td>");
                                out.println("</tr>");
                            }

                            out.println("</tbody>");
                        out.println("</table>");

                        break;    
                    }
                    case 4:
                    {
                        
                        //MOSTRAR LOS DATOS DEL USUARIO EN EL MODAL PARA MODIFICAR***************
                        
                        nDocument = Integer.parseInt(request.getParameter("nDocument"));
                        
                        CrudUserVO uVO = new CrudUserVO(nDocument);
                        CrudUserDAO uDAO = new CrudUserDAO(uVO);
                        ResultSet res = uDAO.dataUsers();
                        
                        if(res.next()){
                            
                            out.println("<div id='tableUsers'>");
                                out.println("<table class='table table-responsive-sm table-light'>");
                                    out.println("<tr>\n" +
                                                    "<th><label>Nombre:</label></th>\n" +
                                                    "<td><input type='text' class='form-control' name='name' value='' minlength='3' maxlength='25' pattern='[A-Za-z ]{3,25}'></td>\n" +
                                                "</tr>");
                                    out.println("<tr>\n" +
                                                    "<th><label>Apellido:</label></th>\n" +
                                                    "<td><input type='text' class='form-control' name='lname' value='' minlength='3' maxlength='25' pattern='[A-Za-z ]{3,25}'></td>\n" +
                                                "</tr>");
                                
                                    out.println("<tr>\n"+
                                                    "<th><label>Tipo de Documento:</label></th>\n" +
                                                        "<td>\n"+
                                                            "<select class='form-control' name='typeDoc'>\n" +
                                                                "<option value=''>Seleccione...</option>\n" +
                                                                "<option value=''>CC</option>\n" +
                                                                "<option value=''>TI</option>\n" +
                                                                "<option value=''>CE</option>\n" +
                                                            "</select>\n"+
                                                        "</td>"+
                                                "</tr>");
                                    out.println("<tr>\n" +
                                                    "<th><label>N° Documento:</label></th>\n" +
                                                    "<td><input type='number' class='form-control' name='' value='' minlength='7' maxlength='10' pattern='[0-9]{3,11}'></td>\n" +
                                                "</tr>");
                                    
                                    out.println("<tr>\n" +
                                                    "<th><label>Tipo de Usuario:</label></th>\n" +
                                                    "<td>\n"+
                                                        "<select class='form-control' name=''>\n" +
                                                            "<option value=''>Seleccione...</option>\n" +
                                                            "<option value=''>Administrador</option>\n" +
                                                            "<option value=''>Docente</option>\n" +
                                                            "<option value=''>Estudiante</option>\n" +
                                                            "<option value=''>Acudiente</option>\n" +
                                                        "</select>\n"+
                                                    "</td>\n" +
                                                    "</tr>");
                                    out.println("<tr>\n" +
                                                    "<th><label>Telefono:</label></th>\n" +
                                                        "<td>\n"+
                                                            "<input type='number' class='form-control' name='' value='' minlength='7' maxlength='15' pattern='[0-9]{3,15}'>\n"+
                                                            "</td>\n" +
                                                "</tr>\n" +
                                                "<tr>\n" +
                                                    "<th><label>Direccion:</label></th>\n" +
                                                    "<td>\n"+
                                                        "<input type='text' class='form-control' name='' value='' minlength='10' maxlength='100'>\n"+
                                                    "</td>\n" +
                                                "</tr>\n" +
                                                "<tr>\n" +
                                                    "<th><label>Fecha de Nacimiento:</label></th>\n" +
                                                    "<td>\n"+
                                                        "<input type='date' class='form-control' name='' value='' min='1960-01-01' max='dd-mm-yyyy'>\n"+
                                                    "</td>\n" +
                                                "</tr>\n" +
                                                "<tr>\n" +
                                                    "<th><label>Correo:</label></th>\n" +
                                                    "<td>\n"+
                                                        "<input type='email' class='form-control' name='' value='' pattern='[a-zA-Z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,}$'>\n"+
                                                    "</td>\n" +
                                                "</tr>");
                                out.println("</table>");
                            out.println("</div>");

                            
                        }
                            
                        
                        
                        break;
                    }
                }

            }catch(SQLException ex){
                
                out.println("<script>");
                    
                        out.println("alert('Ocurrio un error al mostrar los usuarios"+ ex +" ');");
                    
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