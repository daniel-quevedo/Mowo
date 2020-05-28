<%-- 
    Document   : menu
    Created on : 28/04/2020, 12:32:48 AM
    Author     : Leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="sidebar">
    <h2><a href="index.jsp" title="inicio">Administrador</a></h2>
    <a href="perfil.jsp" title="Ver Perfil"><img src="../../img/avatar.png" ></a>
    <div class="logo">
        <a href="../../index.jsp" title="Salir"><img src="../../img/salir.png" alt="Salir" ></a>
    </div>
    <ul class="submenu">
        <li><a href="#">Usuarios</a>
            <ul> 
                <li><a href="insertUsu.jsp">Insertar Usuarios</a></li>
                <li><a href="modifiUsu.jsp">Modificar Usuarios</a></li>
            </ul>
        </li>
        <li><a href="#">Docente</a>
            <ul>
                <li><a href="asigCursoPro.jsp">Asignar Horario</a></li>
                <li><a href="#"> 2</a></li>
                <li><a href="#"> 3</a></li>
            </ul>
        </li>
        <li><a href="#">Estudiantes</a>
            <ul>
                <li><a href="asigCursoEst.jsp">Asignar Curso</a></li>
                <li><a href="#"> 2</a></li>
                <li><a href="#"> 3</a></li>
            </ul>
        </li>
        <li><a href="#">Acudientes</a>
            <ul>
                <li><a href="#"> 1</a></li>
                <li><a href="#"> 2</a></li>
                <li><a href="#"> 3</a></li>
            </ul>
        </li>
    </ul>
</div>
