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
            <title>Modificar Usuarios</title>
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
                            <h5 class="mb-4">Modificar Usuarios</h5>
                            <div class="table table-secondary p-3 col-lg-11">
                                <form action="../../ActivDeacSERVLET" method="POST" id="adUser">
                                    <input type="hidden" value="" name="opt" id="opt">
                                    <input type="hidden" value="" name="cod" id="cod">
                                    <div id="dataUser"></div>
                                </form>
                            </div>
                        </div>
                </section>
                <!--Ventana Modal -->
            <jsp:include page="../../layout/modalUser.jsp"></jsp:include>
            </main>



        <jsp:include page="../../layout/scripts.jsp"></jsp:include>

            <script src="../../js/Admin/ShowUsers.js"></script>


            <!-- Validar si el usuario fue activado, desactivado o modificado***********-->
        <jsp:include page="../../includes/Admin/ValidateActDeac.jsp"></jsp:include> 

    </body>
</html>
