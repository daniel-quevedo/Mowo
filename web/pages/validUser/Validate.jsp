<%-- 
    Document   : menu
    Created on : 21-abr-2020, 8:17:04
    Author     : Daniel
--%>

<%@page import="EncodeDecode.EncodeDecode"%>
<%! 
    private String mailEncode; 
    private String mailDecode;
%>
<%
    
    mailEncode = request.getParameter("m41r");
    
    //decodificar el email****************
    
    EncodeDecode encoDe = new EncodeDecode();
    
    mailDecode =  encoDe.decode(mailEncode);

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <link rel="stylesheet" href="../../css/styleIndex.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <title>Crear Contraseña</title>
    </head>
    <body>
        <main class="model mt-5 animated zoomIn">
            <div class="col-md-9 col-sm-10 contenedor">
                <div class="box-content">
                    <div class="col-12 login text-center">
                        <img src="../../img/login.png" width="200" height="200" alt="login">
                        <h5>Crear Contraseña</h5>
                    </div>
                    <form class="col-12" method="post" action="../../credentialsSERVLET" autocomplete ="off">
                        <div class="form-group">
                            <img src="../../img/user.png">
                            <label>Tu Usuario:</label><br>
                            <input type="text" class="form-control" placeholder="" value="<%=mailDecode%>" disabled >
                        </div>
                        <div class="form-group">
                            <img src="../../img/lock.png">
                            <label>Ingresa una Contraseña:</label><br>
                            <input type="password" class="form-control" autofocus placeholder="Contraseña" required pattern="(?=.*\d)(?=.*[A-Z]).{8,}" title="
                                   Debe contener al menos un número, una letra mayúscula y al menos 8 o más caracteres">
                        </div>
                        <div class="form-group">
                            <img src="../../img/lock.png">
                            <label>Confirma tu Contraseña:</label><br>
                            <input type="password" class="form-control" placeholder="Confirmar Contraseña" required pattern="(?=.*\d)(?=.*[A-Z]).{8,}" title="
                                   Debe contener al menos un número, una letra mayúscula y al menos 8 o más caracteres">
                        </div>
                        <div class="text-center mb-2">
                            <button type="submit" class="btn btn-success botones" >Confirmar</button>
                        </div>
                    </form>
                </div> 
            </div>
        </main>

        <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    </body>
</html>

