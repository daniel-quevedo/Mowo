<%-- 
    Document   : insertUser
    Created on : 30-abr-2020, 22:49:36
    Author     : Daniel
--%>

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
                    <img src="../../img/menu.png" alt="" class="menu-bar">
                    <div class="contenedor  animated zoomIn">
                        <h5 class="mb-4">Modificar Usuarios</h5>
                        <div class="table table-secondary p-3">
                        <form action="" method="POST">
                            <table class="table-hover table-borderless  table-responsive mt-5 mydataTable">
                                <thead>
                                <tr>
                                  <th>Estado</th>
                                  <th>Nombre</th>
                                  <th>Apellido</th>
                                  <th>Tipo de Documento</th>
                                  <th>N° Documento</th>
                                  <th>Tipo de Usuario</th>
                                  <th>Telefono</th>
                                  <th>Direccion</th>
                                  <th>Fecha de Nac.</th>
                                  <th>Correo</th>
                                  <th>Acciones</th>
                                  <th></th>
                                </tr>
                              </thead>
                              <tbody>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>CC.</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>3118520285</td>
                                    <td>Cra 9a este #108-04 Sur</td>
                                    <td>08/11/1999</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-primary">Editar</button></a></td>
                                    <td><button class="btn btn-outline-danger">Inactivar</button></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>  
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>CC.</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>3118520285</td>
                                    <td>Cra 9a este...</td>
                                    <td>08/11/1999</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-primary">Editar</button></a></td>
                                    <td><button class="btn btn-outline-danger">Inactivar</button></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>CC.</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>3118520285</td>
                                    <td>Cra 9a este...</td>
                                    <td>08/11/1999</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-primary">Editar</button></a></td>
                                    <td><button class="btn btn-outline-danger">Inactivar</button></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>CC.</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>3118520285</td>
                                    <td>Cra 9a este...</td>
                                    <td>08/11/1999</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-primary">Editar</button></a></td>
                                    <td><button class="btn btn-outline-danger">Inactivar</button></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>CC.</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>3118520285</td>
                                    <td>Cra 9a este...</td>
                                    <td>08/11/1999</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-primary">Editar</button></a></td>
                                    <td><button class="btn btn-outline-danger">Inactivar</button></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>CC.</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>3118520285</td>
                                    <td>Cra 9a este...</td>
                                    <td>08/11/1999</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-primary">Editar</button></a></td>
                                    <td><button class="btn btn-outline-danger">Inactivar</button></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>CC.</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>3118520285</td>
                                    <td>Cra 9a este...</td>
                                    <td>08/11/1999</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-primary">Editar</button></a></td>
                                    <td><button class="btn btn-outline-danger">Inactivar</button></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>CC.</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>3118520285</td>
                                    <td>Cra 9a este...</td>
                                    <td>08/11/1999</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-primary">Editar</button></a></td>
                                    <td><button class="btn btn-outline-danger">Inactivar</button></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>
                                    <td>David Leonardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>CC.</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>3118520285</td>
                                    <td>Cra 9a este...</td>
                                    <td>08/11/1999</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-primary">Editar</button></a></td>
                                    <td><button class="btn btn-outline-danger">Inactivar</button></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>CC.</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>3118520285</td>
                                    <td>Cra 9a este...</td>
                                    <td>08/11/1999</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-primary">Editar</button></a></td>
                                    <td><button class="btn btn-outline-danger">Inactivar</button></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>CC.</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>3118520285</td>
                                    <td>Cra 9a este...</td>
                                    <td>08/11/1999</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td><a href="#ventana1" data-toggle="modal"><button type="button" class="btn btn-primary">Editar</button></a></td>
                                  <td><button class="btn btn-outline-danger">Inactivar</button></td>
                                  </tr>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>
            </section>
            <!--Ventana Modal -->
            <jsp:include page="../../layout/modalUser.jsp"></jsp:include>
        </main>
            
        <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    </body>
</html>
