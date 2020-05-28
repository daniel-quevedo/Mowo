<%--
    Document   : notas
    Created on : 21-abr-2020, 8:21:38
    Author     : Daniel
--%>

<%! private int id_profile; %>

<%
    
    if (session.getAttribute("nameUser") == null) {
            
       response.sendRedirect("../../index.jsp");
        
    }
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">
    <head>
       
        <jsp:include page="../../layout/head.jsp"></jsp:include>
    <title>Notas</title>
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
                <div class="contenedor animated zoomIn">                      
                        <h3 class="mb-4">Notas</h3><br>
                        <form onsubmit="" method="post">
                            <input type="hidden" value="<%=session.getAttribute("codUser")%>" name="cod" id="cod">
                            <input type="hidden" value="<%=session.getAttribute("idProfile")%>" name="idProfile" id="idProfile">
                            <div class="row">
                                <div class="col-md-4">
                                    
                                    <div id='Course'>
                                        <select class='form-control'>
                                            <option value=''>..Cursos..</option>
                                        </select>
                                        <!-- Lista en la que se muestran los cursos -->                                        
                                    </div>
                                    
                                </div>

                                <div class="col-md-4">
                                    <select  class="form-control" name="subjects" id="subjects" disabled onchange='students()'>
                                        <!-- Lista en la que se muestran las asignaturas -->
                                        <option>...Asignaturas...</option>
                                    </select>
                                </div>
                            </div>
                        </form>
                        <br>

                        <div class="table-responsive-sm" id='notes'>
                            <!-- Tabla en la que se muestran las notas -->
                        </div>
                        
                    </div>
                </div> 
            
                <div id="sup"></div>
            </section>

		 <!-- Ventana Modal -->
           	 <jsp:include page="../../layout/modalNotas.jsp"></jsp:include>
           	
         
            
        </main>

        <script src="../../js/jquery.min.js"></script>
        <script src="../../js/bootstrap.min.js"></script>
        <script src="../../js/abrir.js" charset="utf-8"></script>
        <script src="../../js/teacher/insertNotes.js" charset="utf-8"></script>
        
    </body>
</html>
