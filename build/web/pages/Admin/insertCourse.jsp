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
                        <div class="line-top sticky-top">
                            <img src="../../img/menu.png" alt="" class="menu-bar">
                        </div>
                        <div class="contenedor mt-4">
                            <h5 class="mb-4 ml-5">Insertar Cursos</h5>
                            <form action="../../CrudCourseSERVLET" method="POST">
                                <input type="hidden" name="option" value="1">
                                <table class="ml-5 table table-light table-borderless col-6 table-responsive-sm mt-2">                                
                                    <thead>
                                        <tr>
                                            <th><label>Nombre:</label></th>
                                            <th><label>Codigo:</label></th>                                 
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td><input type="text" class="form-control" name="name" id="name" value="" minlength="6" maxlength="10" autofocus pattern="[9-0]+ [A-Z]{3,10}" placeholder="ej. 902 JM" required></td>
                                            <td><input type="number" class="form-control" name="code" id="code" value="" minlength="3" maxlength="3"  pattern="[9-0]{3}" placeholder="ej. 902" required></td>
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


            <!-- Validar si el curso fue ingresado correctamente y mostrar el mensaje correspondiente-->
        <jsp:include page="../../includes/Admin/ValidateInsertCourse.jsp"></jsp:include>   
    </body>
</html>

</head>
<body>
    <h1>Hello World!</h1>
</body>
</html>
