<%-- 
    Document   : ValidateSession
    Created on : 1/06/2020, 10:50:50 PM
    Author     : Leonardo
--%>

<!--VALIDAR QUE EL USUARIO TENGA LA SESION ACTIVA Y SEA ADMINISTRADOR************************-->

<%! 
    
    private String idProfile;
    private int id_profile; 

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
