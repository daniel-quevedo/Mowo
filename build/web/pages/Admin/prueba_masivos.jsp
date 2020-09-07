<%-- 
    Document   : prueba_masivos
    Created on : 20/08/2020, 12:02:10 AM
    Author     : Leonardo
--%>

<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA ADMINISTRADOR************************-->

<%@include file="../../includes/Admin/ValidateSession.jsp"%>

<!--*****************************************************************************************-->


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
                <div class="contenido">
                    <div class="line-top sticky-top">
                        <img src="../../img/menu.png" alt="" class="menu-bar">
                    </div>
                    <div class="contenedor">
                        <h4>Insertar Usuarios Masivos</h4><br>
                        <form class="" enctype="multipart/form-data" action="../../FileUsersSERVLET" method="POST" autocomplete="off">
                            
                            <label>Seleccione un archivo csv</label><br>
                            <input type="file" name="file" id="file">
                            <input type="hidden" name="nameFile" id="nameFile" value=""><br><br>
                            <button type="submit" class="btn btn-info"> Enviar </button>

                        </form>
                    </div>
                </div>
            </section>
        </main>
        <jsp:include page="../../layout/scripts.jsp"></jsp:include>  
        
        <!--Obtener el nombre del archivo para enviarlo al SERVLET-->
        
        <script>
            
            $("#file").change(function(){
               
               var file = (this).files[0];
               $("#nameFile").val(file.name);
                
        
            });
            
        </script>
        
    </body>
</html>
