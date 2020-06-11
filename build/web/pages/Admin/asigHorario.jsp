<%-- 
    Document   : asigHorario
    Created on : 02-may-2020, 16:31:06
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
            <title>Asignar Horarios</title>
        </head>
        <body>
            <main>
                <header>
                <jsp:include page="../../layout/sideBarAdm.jsp"></jsp:include>
            </header>
            <section>
                <div class="contenido abrir">
                    <img src="../../img/menu.png" alt="" class="menu-bar">
                    <div class="contenedor animated zoomIn">
                        <h5 class="mb-4">Asignar Horarios</h5>
                        <form action="">

                            <table class="table table-primary table-borderless table-responsive-sm table-hover mt-2">
                                <thead class="thead-dark">
                                    <tr>
                                        <th>Docente</th>
                                        <th>Asignatura</th>
                                        <th><input type="seach" class="form-control"></th> 
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td><a href="#ventana1"  data-toggle="modal" title="Editar notas">Daniel Quevedo</a></td>
                                        <td>Matematicas</td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td><a href="#ventana1"  data-toggle="modal" title="Editar notas">Daniel Quevedo</a></td>
                                        <td>Fisica</td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td><a href="#ventana1"  data-toggle="modal" title="Editar notas">Daniel Quevedo</a></td>
                                        <td>Quimica</td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td><a href="#ventana1"  data-toggle="modal" title="Editar notas">Daniel Quevedo</a></td>
                                        <td>Eduacion Fisica</td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td><a href="#ventana1"  data-toggle="modal" title="Editar notas">Daniel Quevedo</a></td>
                                        <td>Sociales</td>
                                        <td></td>
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
