<%-- 
    Document   : insertUser
    Created on : 30-abr-2020, 22:49:36
    Author     : Daniel
--%>

<%@page import="java.util.Calendar"%>
<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA ADMINISTRADOR************************-->

<%@include file="../../includes/Admin/ValidateSession.jsp"%> 

<!--*****************************************************************************************-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
Calendar calendario = Calendar.getInstance();
int an = calendario.get(Calendar.YEAR);
int minyear = an - 6;
int maxyear = an - 58;
%>
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
                    <div class="contenido">
                        <jsp:include page="../../layout/line-top.jsp"></jsp:include>
                        <div class="contenedor">
                            <h5 class="mb-4 ml-5">Insertar Usuarios</h5>
                            <form action="../../CrudUserSERVLET" method="POST" autocomplete="off">
                                <input type="hidden" name="option" value="2">
                                <table class="table backg table-borderless table-responsive-sm col-lg-11 mt-2">
                                    <tr><td colspam="2"></td><td></td></tr>
                                    <tr>
                                        <th>Nombre:
                                            <input type="text" class="form-control" name="name" id="name" value="" minlength="3" maxlength="25" pattern="[A-Za-zñ ]{3,25}" autofocus required></th>
                                    
                                        <th>Apellido:
                                        <input type="text" class="form-control" name="lname" id="lname" value="" minlength="3" maxlength="25" pattern="[A-Za-zñ ]{3,25}" required></th>
                                    </tr>
                                    <tr>
                                        <th>Tipo de Documento:
                                        <select class="form-control" name="typeDoc" id="typeDoc" required>
                                                <option value="#">Seleccione...</option>
                                                <option value="CC">CC.</option>
                                                <option value="TI">TI.</option>
                                                <option value="CE">CE.</option>
                                            </select></th>
                                    
                                        <th>N° Documento:
                                        <input type="text" class="form-control" name="nDocument" id="nDocument" value="" minlength="7" maxlength="10" pattern="[0-9]{3,11}" required></th>
                                    </tr>
                                    <tr>
                                        <th>Tipo de Usuario:
                                        <select class="form-control" name="typeUser" id="typeUser" required>
                                                <option value="#">Seleccione...</option>
                                                <option value="1">Administrador</option>
                                                <option value="2">Docente</option>
                                                <option value="3">Estudiante</option>
                                                <option value="4">Acudiente</option>
                                            </select></th>
                                    
                                        <th>Teléfono:
                                        <input type="text" class="form-control" name="phone" id="phone" value="" minlength="7" maxlength="10" pattern="[0-9]{3,10}"  required></th>
                                    </tr>
                                    <tr>
                                        <th>Dirección:
                                        <input type="text" class="form-control" name="dir" id="dir" value="" minlength="10" maxlength="100" required></th>
                                    
                                        <th>Fecha de Nacimiento:
                                        <input type="date" class="form-control" name="date" id="date" value="" min="<%=maxyear%>-01-01" max="<%=minyear%>-12-31" required></th>
                                    </tr>
                                    <tr>
                                        <th colspan="2">Correo:
                                            <input type="email" class="form-control" name="mail" id="mail" value="" pattern="[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required></th>
                                    </tr>
                                    <tr>
                                        <th colspan="2">
                                            <button type="submit" name="save" class="btn btn-info">Guardar</button>
                                            <button class="btn btn-secondary" type="reset">Cancelar</button>                                            
                                        </th>
                                    </tr>
                                    <tr><td colspam="2"></td><td></td></tr>
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
