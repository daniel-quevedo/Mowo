<%-- 
    Document   : calificaciones
    Created on : 23-abr-2020, 23:37:28
    Author     : Daniel
--%>



<%@page import="java.sql.ResultSet"%>
<%@page import="DAOTutor.ShowEstutorDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    private String id_tutor_rec;
    private int id_tutor;
%>
<%

    id_tutor_rec = (String) session.getAttribute("codUser");

    id_tutor = Integer.parseInt(id_tutor_rec);

%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <jsp:include page="../../layout/head.jsp"></jsp:include>
            <title>Calificaciones</title>
        </head>
        <body>
            <main>
                <header>
                <jsp:include page="../../layout/sideBarTutor.jsp"></jsp:include>
                </header>
                <section>
                    <div class="contenido abrir">
                        <div class="line-top sticky-top">
                            <img src="../../img/menu.png" alt="" class="menu-bar">
                        </div>
                        <div class="contenedor mt-4 animated zoomIn">
                            <section>
                                <div class="row center-xs">
                                <%                        ShowEstutorDAO shwetDAO = new ShowEstutorDAO();
                                    ResultSet result = shwetDAO.listUser(id_tutor);

                                    shwetDAO.closeConnection();

                                    while (result.next()) {

                                        out.println("<div class='col-xs-12 col-md-6 col-lg-5'>\n"
                                                + "<a href='notes.jsp?src=" + result.getInt(1) + "'>\n"
                                                + "<div class='target'>\n"
                                                + "<img src='../../img/avatar.png' alt='Foto de Perfil'>\n"
                                                + "<h4>" + result.getString(3) + "</h4>\n"
                                                + "<p>CC:" + result.getInt(2) + "</p>\n"
                                                + "</div>\n"
                                                + "</a>\n"
                                                + "</div> "
                                        );

                                    }

                                %>
                            </div>
                        </section>
                    </div>
                </div>
            </section>
        </main>
        <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    </body>
</html>

