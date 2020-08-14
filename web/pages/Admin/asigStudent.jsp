<%-- 
    Document   : asigStudent
    Created on : 9/08/2020, 04:39:44 PM
    Author     : Leonardo
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DAOAdmin.AssocStudentTutorDAO"%>

<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA ADMINISTRADOR************************-->

<%@include file="../../includes/Admin/ValidateSession.jsp"%> 

<!--*****************************************************************************************-->
<%! 
    private ResultSet resultParents, resultStudents;
%>
<%

    AssocStudentTutorDAO astDAO = new AssocStudentTutorDAO();
    
    resultParents = astDAO.listParents();
    
    resultStudents = astDAO.listStudents();

%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../../layout/head.jsp"></jsp:include>
        <title>Asignar Estudiantes</title>
    </head>
    <body>
        <main>
            
            <header>
                <jsp:include page="../../layout/sideBarAdm.jsp"></jsp:include>
            </header>
            <section>
                <div class="contenido abrir">
                    <div class="line-top sticky-top">
                            <img src="../../img/menu.png" alt="" class="menu-bar">
                        </div>
                    <div class="contenedor mt-4">
                        <h3 class="mb-4">Asignar Estudiantes</h3>                                                                        
                        <form action="../../AssocStudentTutorSERVLET" method="POST">
                            
                            <div class="row mb-4">
                                <div class="col-md-3">
                                    
                                    <h5>Seleccione el acudiente</h5>
                                    
                                    <select class="form-control" name="id_tutor">
                                        <option value="#">--SELECCIONE--</option>
                                        <%
                                              while(resultParents.next()){
                                                  out.println("<option value='"+resultParents.getInt(2)+"'>"+resultParents.getString(1)+"</option>");
                                              }
                                        %>
                                    </select>
                                </div>
                            </div>
                                                                
                            
                            <div class="row">
                                <div class="t-fixed col-lg-8 col-sm-10 col-xs-12">
                                    <table class="table table-borderless table-responsive table-dark">
                                        <thead>
                                            <tr>
                                                <th scope="col">#</th>
                                                <th scope="col">Identificacion</th>
                                                <th scope="col">Nombre</th>
                                                <th scope="col">Telefono</th>
                                                <th scope="col">email</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%

                                                while(resultStudents.next()){
                                                    out.println("<tr>");
                                                        out.println("<td>\n"+
                                                                        "<input type='checkbox' name='students' value='"+resultStudents.getInt(1)+"'>\n"+
                                                                    "</td>");
                                                        out.println("<td>"+resultStudents.getInt(2)+"</td>");
                                                        out.println("<td>"+resultStudents.getString(3)+"</td>");
                                                        out.println("<td>"+resultStudents.getInt(4)+"</td>");
                                                        out.println("<td>"+resultStudents.getString(5)+"</td>");
                                                    out.println("</tr>");
                                                }

                                            %>
                                        </tbody>
                                    </table>
                                        <button type="submit" name="assoc" class="btn btn-success">Enviar</button>
                                </div>
                            </div>
                                        
                            
                        </form>
                        
                    </div>
                </div>
            </section>
        </main>
        <jsp:include page="../../layout/scripts.jsp"></jsp:include>
        
        <!-- Validar si se asociaron correctemente los estudiantes-->
        <jsp:include page="../../includes/Admin/ValidateAssocUser.jsp"></jsp:include>   
    </body>
</html>
