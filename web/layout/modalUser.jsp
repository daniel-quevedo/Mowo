<%-- 
    Document   : modalUser
    Created on : 01-may-2020, 1:13:59
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="modal fade" id="ventana1">
    <div class="modal-dialog">
        <div class="modal-content">

            <div class="modal-header">
                <h4 class="modal-title">Modifique los Campos del Usuario</h4> 
            </div>

            <div class="modal-body">
                <form action="action">
                    <table class="table table-responsive-sm table-light">
                        <tr>
                            <th><label>Nombre:</label></th>
                            <td><input type="text" class="form-control" name="" value=""></td>
                        </tr>
                        <tr>
                            <th><label>Apellido:</label></th>
                            <td><input type="text" class="form-control" name="" value=""></td>
                        </tr>
                        <tr>
                            <th><label>Tipo de Usuario</label></th>
                            <td><select class="form-control" name="">
                                    <option value="">Seleccione...</option>
                                    <option value="">Docente</option>
                                    <option value="">Estudiante</option>
                                    <option value="">Acudiente</option>
                                </select></td>
                        </tr>
                        <tr>
                            <th><label>Telefono:</label></th>
                            <td><input type="number" class="form-control" name="" value=""></td>
                        </tr>
                        <tr>
                            <th><label>Direccion:</label></th>
                            <td><input type="text" class="form-control" name="" value=""></td>
                        </tr>
                        <tr>
                            <th><label>Fecha de Nacimiento:</label></th>
                            <td><input type="date" class="form-control" name="" value=""></td>
                        </tr>
                        <tr>
                            <th><label>Correo:</label></th>
                            <td><input type="email" class="form-control" name="" value=""></td>
                        </tr>
                        <tr>
                        <th><label>Estado:</label></th>
                        <td><select class="form-control">
                                <option value="">Activo</option>
                                <option value="">Inactivo</option>
                            </select></td>
                        </tr>
                        <tr>
                            <td><button class="btn btn-danger" data-dismiss="modal">Cerrar</button></td>
                            <td><button class="btn btn-success" data-dismiss="modal">Guardar</button></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </div>
</div>