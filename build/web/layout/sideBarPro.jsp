<%-- 
    Document   : menu
    Created on : 28/04/2020, 12:32:48 AM
    Author     : Leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="sidebar">
    <h2>Profesor</h2>
    <a href="perfil.jsp" title="Ver Perfil"><img src="../../img/avatar.png" ></a>
    <div class="logo">
        <a href="../../LoginSERVLET?logout=1" title="Salir"><img src="../../img/salir.png" alt="Salir" ></a>
    </div>
    <ul>
        <li><a href="index.jsp">Inicio</a></li>
        <li><a href="asistencia.jsp">Asistencia</a></li>
        <li><a href="notas.jsp"> Notas</a></li>
        <li><a href="observaciones.jsp">Observaciones</a></li>
        <li><a href="horario.jsp">Horario</a></li>
    </ul>
</div>
