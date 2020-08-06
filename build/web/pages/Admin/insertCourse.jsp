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
            <title>Insertar Usuarios</title>
        </head>
        <body>
            <main>
                <header>
                <jsp:include page="../../layout/sideBarAdm.jsp"></jsp:include>
                </header>
                <section>
                    <div class="contenido abrir">
                        <img src="../../img/menu.png" alt="" class="menu-bar">
                        <div class="contenedor ">
                            <h5 class="mb-4 ml-5">Insertar Cursos</h5>
                            <form action="../../CrudUserSERVLET" method="POST">
                                <input type="hidden" name="option" value="2">
                                <table class="ml-5 table table-light table-borderless col-6 table-responsive-sm mt-2">                                
                                    <thead>
                                        <tr>
                                            <th><label>Nombre:</label></th>
                                            <th><label>Codigo</label></th>                                 
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td><input type="text" class="form-control" name="name" id="name" value="" minlength="3" maxlength="25" autofocus pattern="[A-Za-z ]{3,25}" required></td>
                                            <td><input type="number" class="form-control" name="code" id="code" value="" minlength="3" maxlength="25" autofocus pattern="[A-Za-z ]{3,25}" required></td>
                                        </tr>                                                                
                                    <td colspan="2">
                                        <button type="submit" name="save" class="btn btn-success">Guardar</button>
                                        <button class="btn btn-danger" type="reset">Cancelar</button>
                                    </td>
                                    </tbody>

                                </table>
                            </form>
                        </div>
                    </div>
                </section>
            </main>

        <jsp:include page="../../layout/scripts.jsp"></jsp:include>


            <!-- Validar si el usuario fue ingresado correctamente y mostrar el mensaje correspondiente-->
        <jsp:include page="../../includes/Admin/ValidateInsertUsu.jsp"></jsp:include>   
    </body>
</html>

</head>
<body>
    <h1>Hello World!</h1>
</body>
</html>
