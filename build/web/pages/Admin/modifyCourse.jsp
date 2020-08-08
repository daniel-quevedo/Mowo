<%-- 
    Document   : insertUser
    Created on : 30-abr-2020, 22:49:36
    Author     : Daniel
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="DAOAdmin.AssocCourseDAO"%>
<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA ADMINISTRADOR************************-->

<%@include file="../../includes/Admin/ValidateSession.jsp"%> 

<!--*****************************************************************************************-->

<%
    AssocCourseDAO cDAO = new AssocCourseDAO();

    ResultSet resulCourse = cDAO.listCourse();
%>

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
                    <div class="contenedor  animated zoomIn">
                        <h5 class="mb-4">Asignar Cursos a Profesores</h5>
                        <div class="table table-secondary p-3">
                        <form action="" method="POST">
                            <table class="table table-hover table-borderless table-responsive mt-5 mydataTable">
                                <thead class="text-center">
                                    <tr>
                                        <th>Nombre</th>
                                        <th>Apellido</th>
                                        <th>Acciones</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        while (resulCourse.next()) {                                                
                                            out.println("<tr>");                        
                                            out.println("<td>" + resulCourse.getString(2) + "</td>");                        
                                            out.println("<td>" + resulCourse.getInt(3) + "</td>");                        
                                            out.println("<td><a href='#ventana1' data-toggle='modal' onclick='modalCourse("+resulCourse.getInt(1)+")'><button type='button' class='btn btn-primary'>Editar</button></a></td></td>");                        
                                            out.println("</tr>");
                                        }
                                    %>
                                </tbody>
                            </table>
                            
                            
                            
                        </form>
                    </div>
                </div>
            </section>
            <!--Ventana Modal -->
            <jsp:include page="../../layout/modalCourse.jsp"></jsp:include>
        </main>
            
        
        <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    
        <script src="../../js/Admin/ShowCourse.js" charset="utf-8"></script>
    </body>
</html>
