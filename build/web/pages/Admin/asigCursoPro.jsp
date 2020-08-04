<%-- 
    Document   : insertUser
    Created on : 30-abr-2020, 22:49:36
    Author     : Daniel
--%>

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
                    <div class="contenedor  animated zoomIn">
                        <h5 class="mb-4">Asignar Cursos a Profesores</h5>
                        <div class="table table-secondary p-3">
                        <form action="" method="POST">
                            <input type="hidden" name="user" value="2" id="user">
                            
                            <div id="listUser"></div>
                        </form>
                    </div>
                </div>
            </section>
            <!--Ventana Modal -->
            <jsp:include page="../../layout/modalUser.jsp"></jsp:include>
        </main>
            
        <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    
    <script src="../../js/Admin/ShowDocEst.js" charset="utf-8"></script>
    </body>
</html>
