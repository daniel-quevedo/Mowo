/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOAdmin;

import DAO.LoginDAO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.ClassConnection;

/**
 *
 * @author Leonardo
 */
public class FileUsersDAO extends ClassConnection {
    
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet res;
    
    private boolean returnRes = false;
    
    public FileUsersDAO(){
        
        this.conn = this.getConnection();
        
    }
    
    public boolean insertUsers(String pathFile){
        
        returnRes = false;
        
        String sql =    "COPY \n"
                            +"mowo.usuario(\n"
                                +"tipo_iden\n"
                                +",identificacion\n"
                                +",nombre\n"
                                +",apellido\n"
                                +",telefono\n"
                                +",direccion\n"
                                +",fecha_nacimiento\n"
                                +",email\n"
                                +",fk_perfil\n"
                                +",activo"
                            +") \n"
                        +"FROM '"+pathFile+"' DELIMITER ';' CSV HEADER; ";
        
        try {
            
            this.pstm = this.conn.prepareStatement(sql);
            
            this.res = this.pstm.executeQuery();
            
            if (this.res.next())
                this.returnRes = true;
            
        } catch (SQLException e) {
            
            System.out.println("Ocurrio un error al insertar usuarios masivos " + e.getMessage());
        
        }
        
        return returnRes;
        
    }
    
}
