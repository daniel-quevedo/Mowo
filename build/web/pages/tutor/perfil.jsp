<%-- 
    Document   : perfil
    Created on : 23-abr-2020, 18:48:39
    Author     : Daniel
--%>

<%@page import="DAOAdmin.CrudUserDAO"%>
<%@page import="VOAdmin.CrudUserVO"%>
<%@page import="java.sql.ResultSet"%>


<%

    String varSession = (String) session.getAttribute("idProfile");

    int id_user = Integer.parseInt(varSession);

    //traer los datos del tutor***
    CrudUserVO uVO = new CrudUserVO(0);

    CrudUserDAO uDAO = new CrudUserDAO(uVO);

    ResultSet dataUser = uDAO.infProfile(id_user);
    String typeUs = "";

%>
<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA TUTOR************************-->

<%@include file="../../includes/Tutor/ValidateSession.jsp"%> 

<!--*****************************************************************************************-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <jsp:include page="../../layout/head.jsp"></jsp:include>
            <title>Mi Perfil</title>
        </head>
        <body>
            <main>
                <header>
                </header>

                <section>
                <jsp:include page="../../layout/sideBarTutor.jsp"></jsp:include>
                </section>
                <section>
                    <div class="contenido">
                        <jsp:include page="../../layout/line-top.jsp"></jsp:include>
                        <div class="contenedor col-9">
                            <h5>Mi perfil</h5>
                        <%                            if (dataUser.next()) {
                                out.print("<table class='table table-dark col-12'>");
                                out.print("<tr>");
                                out.print("<td><label>Tipo de documento:</label></td>");
                                out.print("<td><input type='text' class='form-control' value='" + dataUser.getString(1) + "' disabled></td>");
                                out.print("<td><label>N° de documento:</label></td>");
                                out.print("<td><input type='text' class='form-control' value='" + dataUser.getLong(2) + "' disabled></td>");
                                out.print("<td rowspan='3'><img src='../../img/avatar.png' type='file'></td>");
                                out.print("</tr>");
                                out.print("<tr>");
                                out.print("<td><label>Correo:</label></td>");
                                out.print("<th colspan='3'><input type='text' class='form-control text-center' value='" + dataUser.getString(9) + "' disabled></th>");
                                out.print("</tr>");
                                out.print("</table>");

                                out.print("<table class='table backg table-borderless table-responsive-sm col-12 mt-2'>");
                                out.print("<tr><td colspam='2'></td><td></td></tr>");

                                //VALIDAR EL TIPO DE USUARIO ********************
                                int typeOpt = dataUser.getInt(6);

                                switch (typeOpt) {
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
                                        break;
                                }
                                out.print("<tr>");
                                out.print("<th>Nombre:<input type='text' class='form-control text-center' value='" + dataUser.getString(3) + "' disabled></th>");
                                out.print("<th>Apellido:<input type='text' class='form-control text-center' value='" + dataUser.getString(4) + "' disabled></th>");
                                out.print("</tr>");
                                out.print("<tr>");
                                out.print("<th>Tipo de usuario:<input type='text' class='form-control text-center' value='" + typeUs + "' disabled></th>");
                                out.print("<th>Teléfono:<input type='text' class='form-control text-center' value='" + dataUser.getLong(5) + "' disabled></th>");

                                out.print("</tr>");
                                out.print("</tr>");
                                out.print("<th>Dirección:<input type='text' class='form-control text-center' value='" + dataUser.getString(7) + "' disabled></th>");
                                out.print("<th>Fecha de Nacimiento:<input type='text' class='form-control text-center' value='" + dataUser.getString(8) + "' disabled></th>");
                                out.print("</tr>");
                            }
                        %>
                        <tr><td colspam="2"></td><td></td></tr>
                        </table>                           
                    </div>
                </div>
            </section>
        </main>

        <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    </body>
</html>

