<%-- 
    Document   : insertUser
    Created on : 30-abr-2020, 22:49:36
    Author     : Daniel
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="DAOAdmin.AssocCourseDAO"%>
<%!
    private int id_user;
%>
<% 
    
    //traer los datos de los profesores y los cursos*** 
    
    id_user = 2; 

    AssocCourseDAO DocEst = new AssocCourseDAO();

    ResultSet resUser = DocEst.listDocEst(id_user);
    
    ResultSet resCourse = DocEst.listCourse(1);
    

%>


<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA ADMINISTRADOR************************-->

<%@include file="../../includes/Admin/ValidateSession.jsp"%> 

<!--*****************************************************************************************-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../../layout/head.jsp"></jsp:include>
            <title>Asignar Cursos</title>
        </head>
        <body>
            <main>
            <header>
                <jsp:include page="../../layout/sideBarAdm.jsp"></jsp:include>
            </header>
            <section>
                
                <div class="contenido abrir">
                    <img src="../../img/menu.png" alt="" class="menu-bar">
                    <div class="contenedor">
                        <h5 class="mb-4">Asignar Cursos a Profesores</h5>
                        <br>
                        <form action="../../AssocCourseSERVLET" method="POST">
                            <input type="hidden" name="opt" value="B">  
                            <input type="hidden" name="option" value="1">
                            <div class="row">
                                <div class="col-md-3">
                                    <label> Seleccion un curso </label>
                                    <select class="form-control" name="idCourse" autofocus required>
                                        <option value="1">--SELECCIONE--</option> 
                                        <%
                                            while(resCourse.next()){
                                                out.println("<option value='"+resCourse.getInt(1)+"'>"+resCourse.getString(2)+"</option>");
                                            }
                                        %>
                                    </select> 

                                </div>
                            </div>
                            
                            <br>
                                    
                            <div class="row">
                                
                                <div class="t-fixed col-lg-8 col-sm-10 col-xs-12">
                                    
                                    <table class="table table-borderless table-responsive table-dark">
                                        <thead class="text-center">
                                            <tr>
                                                <th></th>
                                                <th>Nombre</th>
                                                <th>Apellido</th>
                                                <th>No Documento</th>
                                                <th>Telefono</th>
                                                <th>Correo</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                                <%                                                   
                                                    while(resUser.next()){
                                                        out.println("<tr>");
                                                            out.println("<td>\n"+
                                                                            "<input type='checkbox' name='user' value='"+resUser.getInt(1)+"'>\n"+
                                                                        "</td>");
                                                            out.println("<td> "+resUser.getString(2)+" </td>");
                                                            out.println("<td> "+resUser.getString(3)+" </td>");
                                                            out.println("<td> "+resUser.getInt(4)+" </td>");
                                                            out.println("<td> "+resUser.getInt(5)+" </td>");
                                                            out.println("<td> "+resUser.getString(6)+" </td>");
                                                        
                                                        out.println("</tr>");
                                                    }
                                                
                                                %>
                                        </tbody>
                                        
                                    </table>
                                   
                                    <button type="submit" name="send" id="send" class="btn btn-primary"> Aceptar </button>
                                    
                                </div>
                                
                            </div>
                                        
                        </form>
                </div>
            </section>
            <!--Ventana Modal -->
            <jsp:include page="../../layout/modalUser.jsp"></jsp:include>
        </main>
            
        <jsp:include page="../../layout/scripts.jsp"></jsp:include>
        
        <!-- Validar si se asociaron correctemente los Profesores-->
        <jsp:include page="../../includes/Admin/ValidateAssocUser.jsp"></jsp:include>   
    
    </body>
</html>
