<%-- 
    Document   : calificaciones
    Created on : 23-abr-2020, 23:37:28
    Author     : Daniel
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <input type="hidden" id="codUser" value="<%=session.getAttribute("codUser")%>">
                    <img src="../../img/menu.png" class="menu-bar">
                    <div class="contenedor animated zoomIn">
                        <section>
                            <div class="row center-xs">
                                <div id="dataUser"></div>
                            </div>
                        </section>
                    </div>
                </div>
            </section>
        </main>

    <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    <script src="../../js/Tutor/showEstudents.js"></script>    
    </body>
</html>

