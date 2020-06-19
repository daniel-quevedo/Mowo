<%-- 
    Document   : calificaciones
    Created on : 23-abr-2020, 23:37:28
    Author     : Daniel
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <jsp:include page="../../layout/head.jsp"></jsp:include>
            <title>Calificaciones</title>
    </head>
    <body>
        <main>
            <header>
            <jsp:include page="../../layout/sideBarTutor.jsp"></jsp:include>
            </header>
            <section>
                <div class="contenido abrir">
                    <img src="../../img/menu.png" class="menu-bar">
                    <div class="contenedor animated zoomIn">
                        <section>
                            <div class="row center-xs">
                                <div class="col-xs-10 col-sm-6 col-md-4 mb-5">
                                    <a href="notes.jsp" ><div class="target p-2">
                                        <img src="../../img/avatar.png" alt="Foto de Perfil">
                                        <h4>Daniel Quevedo</h4>
                                        <p>1023037660</p>
                                        <p>Curso 10-01 J.M.</p>
                                    </div></a>
                                </div> 
                                <div class="col-xs-10 col-sm-6 col-md-4 mb-5">
                                    <div class="target p-2">
                                        <img src="../../img/avatar.png" alt="Foto de Perfil">
                                        <h4>Eduardo Ruiz</h4>
                                        <p>1023037660</p>
                                        <p>Curso 10-01 J.M.</p>
                                    </div>
                                </div> 
                                <div class="col-xs-10 col-sm-6 col-md-4 mb-5">
                                    <div class="target p-2">
                                        <img src="../../img/avatar.png" alt="Foto de Perfil">
                                        <h4>David Quevedo</h4>
                                        <p>1023037660</p>
                                        <p>Curso 10-01 J.M.</p>
                                    </div>
                                </div> 
                                <div class="col-xs-10 col-sm-6 col-md-4 mb-5">
                                    <div class="target p-2">
                                        <img src="../../img/avatar.png" alt="Foto de Perfil">
                                        <h4>Leonardo Ruiz</h4>
                                        <p>1023037660</p>
                                        <p>Curso 10-01 J.M.</p>
                                    </div>
                                </div> 
                                <div class="col-xs-10 col-sm-6 col-md-4 mb-5">
                                    <div class="target p-2">
                                        <img src="../../img/avatar.png" alt="Foto de Perfil">
                                        <h4>Mauricio Gonzalez</h4>
                                        <p>1023037660</p>
                                        <p>Curso 10-01 J.M.</p>
                                    </div>
                                </div> 
                            </div>
                        </section>
                    </div>
                </div>
            </section>
        </main>

    <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    <script src="../../js/student/showNotes.js"></script>    
    </body>
</html>

