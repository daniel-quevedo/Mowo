<%-- 
    Document   : insertUser
    Created on : 30-abr-2020, 22:49:36
    Author     : Daniel
--%>

<%@page import="VOAdmin.AssocCourseVO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DAOAdmin.AssocCourseDAO"%>

<%

    //traer los datos de los profesores y los cursos***
    AssocCourseVO DcoStuV = new AssocCourseVO(0, 0, "");

    AssocCourseDAO TuStu = new AssocCourseDAO(DcoStuV);

    ResultSet resUser = TuStu.listTutor();

    ResultSet resCourse = TuStu.listCourse(1);


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

                    <div class="contenido ">
                        <div class="line-top sticky-top">
                            <img src="../../img/menu.png" alt="" class="menu-bar">
                        </div>
                        <div class="contenedor">
                            <h5 class="mb-4 text-center">Asignar Cursos a Profesores</h5>
                            <br>
                            <form action="../../AssocCourseSERVLET" method="POST">
                                <input type="hidden" name="opt" value="B">  
                                <input type="hidden" name="option" value="1">
                                <div class="row text-center justify-content-center">
                                    <div class="col-8">

                                        <label> Seleccion un curso </label>
                                        <select class="form-control" id="idCourse" name="idCourse" autofocus required>

                                            <option value="#" selected>--SELECCIONE--</option> 
                                        <%      
                                            while (resCourse.next()) {
                                                out.println("<option value='" + resCourse.getInt(1) + "'>" + resCourse.getString(2) + "</option>");
                                            }
                                        %>
                                    </select> 

                                </div>
                            </div>

                            <br>

                            <div class="row">

                                <div class="t-fixed col-lg-8 col-sm-10 col-12">

                                    <table class="table table-borderless backg" id="dataUser">
                                        <thead class="text-center">
                                            <tr>
                                                <th><i data-feather="check"></i></th>
                                                <th>Nombre</th>
                                                <th>Apellido</th>
                                                <th>No. Documento</th>
                                                <th>Teléfono</th>
                                                <th>Correo</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                while (resUser.next()) {
                                                    out.println("<tr>");
                                                    out.println("<td>\n"
                                                            + "<input type='checkbox' name='user' value='" + resUser.getInt(1) + "'>\n"
                                                            + "</td>");
                                                    out.println("<td> " + resUser.getString(2) + " </td>");
                                                    out.println("<td> " + resUser.getString(3) + " </td>");
                                                    out.println("<td> " + resUser.getLong(4) + " </td>");
                                                    out.println("<td> " + resUser.getLong(5) + " </td>");
                                                    out.println("<td> " + resUser.getString(6) + " </td>");

                                                    out.println("</tr>");
                                                }
                                                TuStu.closeConnection();
                                            %>
                                        </tbody>

                                    </table>
                                </div>
                            </div>
                            <div class="row mb-3 justify-content-center">
                                <button type="submit" name="send" id="send" class="btn btn-success"> Aceptar </button>
                            </div>
                        </form>
                    </div>
                </div>
            </section>
            <!--Ventana Modal -->
            <jsp:include page="../../layout/modalUser.jsp"></jsp:include>
            </main>

        <jsp:include page="../../layout/scripts.jsp"></jsp:include>

            <!-- Validar si se asociaron correctemente los Profesores-->
        <jsp:include page="../../includes/Admin/ValidateAssocUser.jsp"></jsp:include>   

        <!--Validar cambio de estado del select-->
        <script src="../../js/Admin/ShowTeacherAssoc.js"></script>

        <!--implementar select2********-->
        <script>

            $(document).ready(function () {
                $('#idCourse').select2();
            });

        </script>

    </body>
</html>
