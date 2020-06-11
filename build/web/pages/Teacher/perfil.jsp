<%-- 
    Document   : perfil
    Created on : 23-abr-2020, 18:48:39
    Author     : Daniel
--%>

<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA PROFESOR************************-->

<%@include file="../../includes/Teacher/ValidateSession.jsp"%> 

<!--*****************************************************************************************-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <jsp:include page="../../layout/head.jsp"></jsp:include>
        <title>Mi Perfil</title>
    </head>
    <body>
        <main>
            <header>
            </header>

            <section>
                <jsp:include page="../../layout/sideBarPro.jsp"></jsp:include>
            </section>
            <section>
                <div class="contenido abrir">
                    <img src="../../img/menu.png" alt="" class="menu-bar">
                    <div class="contenedor animated zoomIn ">
                        <h5>Mi perfil</h5>
                        <form action="#" method="post">
                            <div class="table-responsive-sm">
                                <table class="table table-dark">
                                    <tr>
                                        <td><label>Tipo de documento:</label></td>
                                        <td><select name="" class="form-control">
                                                <option value="">Seleccione...</option>
                                                <option value="">Targeta de Identidad</option>
                                                <option value="">Cédula de Ciudadania</option>
                                                <option value="">Cédula de Extrangeria</option>
                                            </select></td>
                                        <td><label>N° de documento:</label></td>
                                        <td><input type="number" class="form-control" placeholder="1023037660" disabled></td>
                                        <td rowspan="3"><img src="../../img/avatar.png"></td>
                                    </tr>
                                    <tr>
                                        <td><label>Curso:</label></td>
                                        <td><input type="text" class="form-control" placeholder="11-01" disabled></td>
                                        <td><label>Dir. Curso:</label></td>
                                        <td><input type="text" class="form-control" placeholder="Juan Carlos Lozano" disabled></td>
                                    </tr>
                                    <tr>
                                        <td><label>Jornada:</label></td>
                                        <td><input type="text" class="form-control" placeholder="Mañana" disabled></td>
                                        <td><label>Acudiente:</label></td>
                                        <td><input type="text"class="form-control" placeholder="Maria Ruiz" disabled></td>
                                    </tr>
                                </table>

                                <table class="table table-light">
                                    <tr>
                                        <td><label>Fecha de Nacimiento:</label></td>
                                        <td ><input type="date" class="form-control" value=""></td>
                                        <td ><label>Ciudad de Nacimiento:</label></td>
                                        <td><select name="" class="form-control">
                                                <option value="">Seleccione...</option>
                                                <option value="">Bogotá</option>
                                                <option value="">Medellin</option>
                                                <option value="">Cali</option>
                                            </select></td>
                                            <td></td>
                                    </tr>
                                    <tr>
                                        <td><label>Nombres</label></td>
                                        <td><input type="text" class="form-control" placeholder="Daniel Quevedo"></td>
                                        <td><label>Apellidos</label></td>
                                        <td colspan="2"><input type="text" class="form-control" placeholder="Quevedo Ruiz"></td>

                                    </tr>
                                    <tr>
                                        <td><label>Direccion:</label></td>
                                        <td><input type="text" class="form-control" placeholder="Cra 9a este"></td>
                                        <td><label>E-Mail:</label></td>
                                        <td colspan="2"><input type="email" class="form-control" placeholder="example@correo.com"></td>
                                    </tr>
                                    <tr>
                                        <td><label>Tel. Domicilio</label></td>
                                        <td><input type="number" class="form-control" placeholder="77349637"></td>
                                        <td><label>Telefono:</label></td>
                                        <td colspan="2"><input type="number" class="form-control" placeholder="3118520285"></td>
                                    </tr>
                                    <tr>
                                        <td>Genero:</td>
                                        <td><select name="" class="form-control">
                                                <option value="">Seleccione...</option>
                                                <option value="">Maculino</option>
                                                <option value="">Femenino</option>
                                            </select></td>
                                        <td>Estado Civil:</td>
                                        <td colspan="2"><select name="" class="form-control">
                                                <option value="">Seleccione...</option>
                                                <option value="">Soltero</option>
                                                <option value="">Casado</option>
                                                <option value="">Union Libre</option>
                                            </select></td>
                                    </tr>
                                    <tr>
                                        <td><label>Nombre Acudiente:</label></td>
                                        <td><input type="text" class="form-control" placeholder="Maria Ruiz" disabled></td>
                                        <td><label>Telefono Acudiente:</label></td>
                                        <td colspan="2"><input type="text" class="form-control" placeholder="3204567632" disabled></td>
                                    </tr>
                                    <tr>
                                        <td colspan="4"><button type="submit"class="btn btn-success">Guardar</button>
                                            <button type="submit" class="btn btn-danger" reset>Cancelar</button></td>
                                    </tr>
                                </table>
                            </div>
                        </form>
                    </div>
                </div>
            </section>
        </main>
        
        <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    </body>
</html>

