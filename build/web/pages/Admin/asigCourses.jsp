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
                        <h5 class="mb-4">Asignar Cursos</h5>
                        <div class="table table-secondary  p-3">
                        <form action="" method="POST">
                            <table class="table-hover table-borderless table-responsive mt-5 mydataTable">
                                <thead class="text-center">
                                <tr>
                                  <th>Estado</th>
                                  <th>Nombre</th>
                                  <th>Apellido</th>
                                  <th>N° Documento</th>
                                  <th>Tipo de Usuario</th>
                                  <th>Correo</th>
                                  <th>Cursos</th>
                                  <th></th>
                                  <th>Acciones</th>
                                  <th></th>
                                </tr>
                              </thead>
                              <tbody>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td colspan="2"><select id="courses" class="form-control" name="typeUser" required>
                                            <option value="">Seleccione...</option>
                                            <option value="1">10-01</option>
                                            <option value="2">10-02</option>
                                            <option value="3">11-01</option>
                                            <option value="4">11-02</option>
                                    </select>
                                        <div id="list-courses"></div></td>
                                    <td><button id="add" type="submit" class="btn btn-success">+</button></a></td>
                                    <td><button id="submit" type="submit" class="btn btn-primary">Agregar</button></td>
                                    <td></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td colspan="2"><select id="courses" class="form-control" name="typeUser" required>
                                            <option value="">Seleccione...</option>
                                            <option value="1">10-01</option>
                                            <option value="2">10-02</option>
                                            <option value="3">11-01</option>
                                            <option value="4">11-02</option>
                                    </select>
                                        <div id="list-courses"></div></td>
                                    <td><button id="add" type="submit" class="btn btn-success">+</button></a></td>
                                    <td><button id="submit" type="submit" class="btn btn-primary">Agregar</button></td>
                                    <td></td>
                                  </tr>
                                  <tr>
                                    <td>Activo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td colspan="2"><select id="courses" class="form-control" name="typeUser" required>
                                            <option value="">Seleccione...</option>
                                            <option value="1">10-01</option>
                                            <option value="2">10-02</option>
                                            <option value="3">11-01</option>
                                            <option value="4">11-02</option>
                                    </select>
                                        <div id="list-courses"></div></td>
                                    <td><button id="add" type="submit" class="btn btn-success">+</button></a></td>
                                    <td><button id="submit" type="submit" class="btn btn-primary">Agregar</button></td>
                                    <td></td>
                                  </tr>
                                  <tr>
                                    <td>Inactivo</td>
                                    <td>Daniel Eduardo</td>
                                    <td>Quevedo Ruiz</td>
                                    <td>123456789</td>
                                    <td>Docente</td>
                                    <td>dequevedo@misena.edu.co</td>
                                    <td colspan="2"><select id="courses" class="form-control" name="typeUser" required>
                                            <option value="">Seleccione...</option>
                                            <option value="1">10-01</option>
                                            <option value="2">10-02</option>
                                            <option value="3">11-01</option>
                                            <option value="4">11-02</option>
                                    </select>
                                        <div id="list-courses"></div></td>
                                    <td><button id="add" type="submit" class="btn btn-success">+</button></a></td>
                                    <td><button id="submit" type="submit" class="btn btn-primary">Agregar</button></td>
                                    <td></td>
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
