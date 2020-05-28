<%-- 
    Document   : asigHorario
    Created on : 02-may-2020, 16:31:06
    Author     : Daniel
--%>

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

        <script src="../../js/jquery.min.js"></script>
        <script src="../../js/bootstrap.min.js"></script>
        <script src="../../js/abrir.js" charset="utf-8"></script>
        <script src="../../js/desplegable.js" charset="utf-8"></script>
    </body>
</html>
