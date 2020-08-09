<%-- 
    Document   : asigStudent
    Created on : 9/08/2020, 04:39:44 PM
    Author     : Leonardo
--%>
<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA ADMINISTRADOR************************-->

<%@include file="../../includes/Admin/ValidateSession.jsp"%> 



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../../layout/head.jsp"></jsp:include>
        <title>Asignar Estudiantes</title>
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
                        <h3 class="mb-4">Asignar Estudiantes</h3>
                        
                        <hr>
                        
                        <form>
                            
                            <div class="row">
                                <div class="col-md-3">
                                    
                                    <h5>Seleccione el acudiente</h5>
                                    
                                    <select class="form-control">
                                        <option value="#">--SELECCIONE--</option>
                                        <%
                                        
                                               

                                        %>
                                    </select>
                                </div>
                            </div>
                            
                        </form>
                        
                    </div>
                </div>
            </section>
        </main>
        <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    </body>
</html>
