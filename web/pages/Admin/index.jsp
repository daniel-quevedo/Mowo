<%-- 
    Document   : menu
    Created on : 21-abr-2020, 8:17:04
    Author     : Daniel
--%>

<%!
    String idProfile; 
    int id_profile;
%>


<%
   if (session.getAttribute("nameUser") == null) {
            
       response.sendRedirect("../../index.jsp");
        
    }else{
       
       idProfile = (String) session.getAttribute("idProfile");
       id_profile = Integer.parseInt(idProfile);
       
       if(id_profile != 1){
           
        response.sendRedirect("../../index.jsp");
        
       }
       
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <jsp:include page="../../layout/head.jsp"></jsp:include>
        <title>Menu</title>
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
                        
                       <h2>Bienvenido:</h2>

                    </div>
                </div>
            </section>
        </main>
        
        <script src="../../js/jquery.min.js"></script>
        <script src="../../js/bootstrap.min.js"></script>
        <script src="../../js/abrir.js" charset="utf-8"></script>
        <script src="../../js/desplegable.js" charset="utf-8"></script>
    </body>
</html>

