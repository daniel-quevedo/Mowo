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
                    <div class="contenedor animated zoomIn">
                        <h5 class="mb-4">Insertar Usuarios</h5>
                        <form action="../../InsertUserSERVLET" method="POST">
                            <input type="hidden" name="option" value="2">
                            <table class="table table-hover table-warning table-borderless table-responsive-sm mt-2">
                                <tr><td colspam="2"></td><td></td></tr>
                                <tr>
                                  <th><label>Nombre:</label></th>
                                  <td><input type="text" class="form-control" name="name" id="name" value="" minlength="3" maxlength="25" pattern="[A-Za-z ]{3,25}" required></td>
                                </tr>
                                <tr>
                                  <th><label>Apellido:</label></th>
                                  <td><input type="text" class="form-control" name="lname" id="lname" value="" minlength="3" maxlength="25" pattern="[A-Za-z ]{3,25}" required></td>
                                </tr>
                                <tr>
                                  <th><label>Tipo de Documento:</label></th>
                                  <td><select class="form-control" name="typeDoc" id="typeDoc" required>
                                    <option value="#">Seleccione...</option>
                                    <option value="CC">CC.</option>
                                    <option value="TI">TI.</option>
                                    <option value="CE">CE.</option>
                                  </select></td>
                                </tr>
                                <tr>
                                  <th><label>N° Documento:</label></th>
                                  <td><input type="text" class="form-control" name="nDocument" id="nDocument" value="" minlength="7" maxlength="10" pattern="[0-9]{3,11}" required></td>
                                </tr>
                                <tr>
                                  <th><label>Tipo de Usuario</label></th>
                                  <td><select class="form-control" name="typeUser" id="typeUser" required>
                                    <option value="#">Seleccione...</option>
                                    <option value="1">Administrador</option>
                                    <option value="2">Docente</option>
                                    <option value="3">Estudiante</option>
                                    <option value="4">Acudiente</option>
                                  </select></td>
                                </tr>
                                <tr>
                                  <th><label>Telefono:</label></th>
                                  <td><input type="text" class="form-control" name="phone" id="phone" value="" minlength="7" maxlength="15" pattern="[0-9]{3,15}"  required></td>
                                </tr>
                                <tr>
                                  <th><label>Direccion:</label></th>
                                  <td><input type="text" class="form-control" name="dir" id="dir" value="" minlength="10" maxlength="100" required></td>
                                </tr>
                                <tr>
                                  <th><label>Fecha de Nacimiento:</label></th>
                                  <td><input type="date" class="form-control" name="date" id="date" value="" min="1960-01-01" max="dd-mm-yyyy" required></td>
                                </tr>
                                <tr>
                                  <th><label>Correo:</label></th>
                                  <td><input type="email" class="form-control" name="mail" id="mail" value="" pattern="[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required></td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <button type="submit" name="save" class="btn btn-success">Guardar</button>
                                        <button class="btn btn-danger" type="reset">Cancelar</button>
                                    </td>
                                </tr>
                                <tr><td colspam="2"></td><td></td></tr>
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
        <script src="../../js/sweetalert2.min.js" charset="utf-8"></script>
        
        
        <!-- Validar si el usuario fue ingresado correctamente y mostrar el mensaje correspondiente-->
        <jsp:include page="../../includes/Admin/ValidateURL.jsp"></jsp:include>   
    </body>
</html>
