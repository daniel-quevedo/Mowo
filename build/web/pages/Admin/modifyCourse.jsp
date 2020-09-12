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

<%    AssocCourseDAO cDAO = new AssocCourseDAO();

    ResultSet resulCourse = cDAO.listCourse(0);
    String state;
    String button;
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

                    <div class="contenido">
                        <jsp:include page="../../layout/line-top.jsp"></jsp:include>
                        <div class="contenedor ">
                            <h5 class="mb-4 text-center">Lista de Cursos</h5>
                            <form action="../../ActivDeacSERVLET" id="addCourse" method="POST">                                
                                <input type="hidden" value="" name="opt" id="opt">
                                <input type="hidden" value="" name="cod" id="cod">
                                <div class="t-fixed col-lg-11 col-12">
                                    <table class="table backg table-borderless col-12 mt-2">
                                        <thead class="text-center">
                                            <tr>
                                                <th>Estado</th>
                                                <th>Jornada</th>
                                                <th>Código</th>
                                                <th colspan="2" class="text-center">Acciones</th>
                                            </tr>
                                        </thead>
                                        <tbody>

                                        <%
                                            while (resulCourse.next()) {

                                                if (resulCourse.getInt(5) == 1) {
                                                    state = "Activo";

                                                    button = "<button type='submit' name='adButton' id='adButton' class='btn btn-outline-danger' onclick='addCourse(4," + resulCourse.getInt(1) + ")'>Inactivar</button>";

                                                } else {
                                                    state = "Inactivo";

                                                    button = "<button type='submit' name='adButton' id='adButton' class='btn btn-outline-success' onclick='addCourse(3," + resulCourse.getInt(1) + ")'>Activar</button>";
                                                }
                                                out.println("<tr>");
                                                out.println("<td>" + state + "</td>");
                                                out.println("<td>" + resulCourse.getString(3) + "</td>");
                                                out.println("<td>" + resulCourse.getInt(4) + "</td>");
                                                out.println("<td><a href='#ventana1' data-toggle='modal' onclick='modalCourse(" + resulCourse.getInt(1) + ")'><button type='button' class='btn btn-info'>Editar</button></a></td>");
                                                out.println("<td>" + button + "</td>");
                                                out.println("</tr>");
                                            }
                                        %>
                                    </tbody>
                                </table>
                            </div>
                        </form>
                    </div>
            </section>
            <!--Ventana Modal -->
            <jsp:include page="../../layout/modalCourse.jsp"></jsp:include>
            </main>


        <jsp:include page="../../layout/scripts.jsp"></jsp:include>            
        <script src="../../js/Admin/ShowCourse.js" charset="utf-8"></script>
    </body>
</html>
