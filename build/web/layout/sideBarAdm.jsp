<%-- 
    Document   : menu
    Created on : 28/04/2020, 12:32:48 AM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="sidebar">    
    <h2><a href="index.jsp" title="inicio">Administrador</a></h2>
    <a href="perfil.jsp" title="Ver Perfil"><img src="../../img/avatar.png" ></a>
    <div class="logo">
        <a href="../../LoginSERVLET?logout=1" title="Salir"><img src="../../img/salir.png" alt="Salir" ></a>
    </div>
    <ul class="submenu">
        <li><a href="#">Usuarios</a>
            <ul> 
                <li><a href="insertUser.jsp">Insertar Usuarios</a></li>
                <li><a href="modifyUser.jsp">Modificar Usuarios</a></li>
            </ul>
        </li>
        <li><a href="#">Cursos</a>
            <ul>
                
                <li><a href="insertCourse.jsp">Insertar Cursos</a></li>
                <li><a href="modifyCourse.jsp">Modificar Cursos</a></li>
                
            </ul>
        </li>
        <li><a href="#">Docente</a>
            <ul>
                <li><a href="asigCoursePro.jsp">Asignar Curso</a></li>
            </ul>
        </li>
        <li><a href="#">Estudiantes</a>
            <ul>
                <li><a href="asigCourseEst.jsp">Asignar Curso</a></li>
            </ul>
        </li>
        <li><a href="#">Acudientes</a>
            <ul>
                <li><a href="asigStudent.jsp">Asignar Estudiantes</a></li>
            </ul>
        </li>
    </ul>
</div>
