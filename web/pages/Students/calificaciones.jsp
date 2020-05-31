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
      <jsp:include page="../../layout/sideBarEst.jsp"></jsp:include>
    </header>
    <section>
    <div class="contenido abrir">
        <img src="../../img/menu.png" alt="" class="menu-bar">
        <div class="contenedor animated zoomIn">
            <section>
                <nav>
                  <ul class="nav nav-pills">
                    <li class="nav-item">
                      <a class="nav-link active" href="#" id="period1" onClick="notes(1)">Primer Periodo</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" id="period2" onClick="notes(2)">Segundo Periodo</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#" id="period3" onClick="notes(3)">Tercer Periodo</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#" id="period4" onClick="notes(4)">Cuarto Periodo</a>
                    </li>
                  </ul>
                </nav>
            </section>
            <section>
                <h5>Calificaciones</h5><br>
                <input type="hidden" value="<%=session.getAttribute("codUser")%>" id="codUser">
                <table class="table table-borderless table-success table-responsive-sm" id="tableNotesStu">
                    <thead class="thead-dark">
                        <tr>
                          <th colspan="8" scope="col">Primer Periodo</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th>N°</th>
                            <th>Materia</th>
                            <th>Nota 1</th>
                            <th>Nota 2</th>
                            <th>Nota 3</th>
                            <th>Nota 4</th>
                            <th>Promedio</th>
                            <th>Aprobo</th>
                        </tr>
                    </tbody>
                </table>
            </section>
        </div>
    </div>
    </section>
  </main>

    <jsp:include page="../../layout/scripts.jsp"></jsp:include>
    <script src="../../js/student/showNotes.js"></script>    
</body>
</html>

