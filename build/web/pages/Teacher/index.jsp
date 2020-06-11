<%-- 
    Document   : menu
    Created on : 21-abr-2020, 8:17:04
    Author     : Daniel
--%>

<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA PROFESOR************************-->

<%@include file="../../includes/Teacher/ValidateSession.jsp"%> 

<!--*****************************************************************************************-->



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <jsp:include page="../../layout/head.jsp"></jsp:include>
        <title>Menu</title>
    </head>
    <body>
        <main>
            <header>
            </header>
            <section>
                <jsp:include page="../../layout/sideBarPro.jsp"></jsp:include>
            </section>
            <section>
                <div class="contenido abrir">
                    <img src="../../img/menu.png" alt="" class="menu-bar">
                    <div class="contenedor">
                        
                       <h2>Bienvenido: <%=session.getAttribute("nameUser")%></h2>

                    </div>
                </div>
            </section>
        </main>
        
       <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    </body>
</html>



