<%-- 
    Document   : assocSubjectTutor
    Created on : 17/08/2020, 03:38:52 PM
    Author     : Leonardo
--%>

<%@page import="DAOAdmin.AssocSubjectDAO"%>
<%@page import="VOAdmin.AssocSubjectVO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DAOAdmin.AssocCourseDAO"%>
<%@page import="VOAdmin.AssocCourseVO"%>
<%

    //traer los datos de los docentes*********
    AssocSubjectVO asSubjectVO = new AssocSubjectVO(0, 0, 0, "");
    AssocSubjectDAO asSubjectDAO = new AssocSubjectDAO(asSubjectVO);

    ResultSet listSubjects = asSubjectDAO.listSubjects();

    ResultSet listTutor = asSubjectDAO.listTutor();


%>


<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA ADMINISTRADOR************************-->

<%@include file="../../includes/Admin/ValidateSession.jsp"%> 

<!--*****************************************************************************************-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../../layout/head.jsp"></jsp:include>
            <title>Asignar asignatura</title>
        </head>
        <body>
            <main>
                <header>
                <jsp:include page="../../layout/sideBarAdm.jsp"></jsp:include>
                </header>
                <section>

                    <div class="contenido">
                        <div class="line-top sticky-top">
                            <img src="../../img/menu.png" alt="" class="menu-bar">
                        </div>
                        <div class="contenedor">
                            <h5 class="mb-3 text-center">Asignar asignaturas a un docente</h5>
                            <br>
                            <form action="../../AssocSubjectSERVLET" method="POST">
                                <input type="hidden" name="opt" value="A">  
                                <input type="hidden" name="option" value="1">
                                <input type="hidden" name="idCourse" value="0">
                                <div class="row text-center justify-content-center">
                                    <div class="col-md-4 col-8">
                                        <label> Seleccion un docente </label>
                                        <select class="form-control" id="idTeacher" name="idTeacher" required>
                                            <option value="#" selected>--SELECCIONE--</option>
                                        <%                                                while (listTutor.next()) {
                                                out.println("<option value='" + listTutor.getInt(1) + "'>" + listTutor.getString(3) + "</option>");
                                            }
                                        %>
                                    </select> 
                                </div>
                            </div>
                            <br>

                            <div class="row mb-3">
                                <div class="t-fixed col-lg-5 col-sm-6 col-xs-12">

                                    <table class=" table table-borderless table-responsive-sm backg" id="dataSubject">
                                        <thead class="text-center">
                                            <tr>
                                                <th><i data-feather="check"></i></th>
                                                <th>Nombre</th>
                                                <th>Salon</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                while (listSubjects.next()) {
                                                    out.println("<tr>");
                                                    out.println("<td>\n"
                                                            + "<input type='checkbox' name='subject' value='" + listSubjects.getInt(1) + "'>\n"
                                                            + "</td>");
                                                    out.println("<td> " + listSubjects.getString(2) + " </td>");
                                                    out.println("<td> " + listSubjects.getString(3) + " </td>");
                                                    out.println("</tr>");
                                                }

                                                asSubjectDAO.closeConnection();
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

            <!--Validar cambio de estado del select-->
            <script src="../../js/Admin/ShowSubjectAssoc.js"></script>

            <!-- Validar si se asociaron correctemente los asignaturas-->
        <jsp:include page="../../includes/Admin/ValidateAssocSubject.jsp"></jsp:include> 


        <!--implementar select2********-->
        <script>

            $(document).ready(function () {
                $('#idTeacher').select2();
            });

        </script>

    </body>
</html>

