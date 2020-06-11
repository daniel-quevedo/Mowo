<%-- 
    Document   : menu
    Created on : 21-abr-2020, 8:17:04
    Author     : Daniel
--%>

<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA ADMINISTRADOR************************-->

<%@include file="../../includes/Admin/ValidateSession.jsp"%> 

<!--*****************************************************************************************-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
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
                    <div class="contenedor">
                        <form action="" method="POST">
                            <table class="table table-hover table-success table-borderless table-responsive-sm mt-5">
                                <thead class="thead-dark">
                                    <tr>
                                        <th colspan="3">Estudiantes</th>
                                        <th>Cursos</th>
                                        <th><input type="search" class="form-control" name="" value="" placeholder="Buscar"></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Daniel Eduardo</td>
                                        <td>Quevedo ruiz</td>
                                        <td>dequevedo@misena.edu.co</td>
                                        <td><select class="form-control">
                                                <option value="">--Seleccione--</option>
                                                <option value="">Curso 1</option>
                                                <option value="">Curso 2</option>
                                                <option value="">Curso 3</option>
                                                <option value="">Curso 4</option>
                                            </select></td>
                                        <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-success">Asignar</button></a></td>
                                    </tr>
                                    <tr>
                                        <td>Daniel Eduardo</td>
                                        <td>Quevedo ruiz</td>
                                        <td>dequevedo@misena.edu.co</td>
                                        <td><select class="form-control">
                                                <option value="">--Seleccione--</option>
                                                <option value="">Curso 1</option>
                                                <option value="">Curso 2</option>
                                                <option value="">Curso 3</option>
                                                <option value="">Curso 4</option>
                                            </select></td>
                                        <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-success">Asignar</button></a></td>
                                    </tr>
                                    <tr>
                                        <td>Daniel Eduardo</td>
                                        <td>Quevedo ruiz</td>
                                        <td>dequevedo@misena.edu.co</td>
                                        <td><select class="form-control">
                                                <option value="">--Seleccione--</option>
                                                <option value="">Curso 1</option>
                                                <option value="">Curso 2</option>
                                                <option value="">Curso 3</option>
                                                <option value="">Curso 4</option>
                                            </select></td>
                                        <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-success">Asignar</button></a></td>
                                    </tr>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>
            </section>
        </main>

        <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    </body>
</html>

