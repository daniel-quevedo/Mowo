/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.CredentialsVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ClassConnection;

/**
 *
 * @author Leonardo
 */
public class CredentialsDAO extends ClassConnection{
    
    //VARIABLES DE CONEXION*********+
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet res;
    
    //CREDENCIALES ******************
    private String user;
    private String pass;
    
    //VARIABLE RETORNO*******
    
    private int returned; 
    
    public CredentialsDAO(){
        
    }
    
    public CredentialsDAO(CredentialsVO cVO){
        
        try{
         
            this.conn = this.getConnection();
        
            this.user = cVO.getUser();
            this.pass = cVO.getPass();
            
        }catch(Exception ex){
            
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    public int insertCred(){
        
        this.returned = 0;
        
        try{
            
            String sqlCred = "SELECT mowo.f_credenciales(?,?,?);";
            
            this.pstm = this.conn.prepareStatement(sqlCred);
            this.pstm.setString(1, this.user);
            this.pstm.setString(2, this.pass);
            this.pstm.setString(3, "B");
            
            this.res = this.pstm.executeQuery();
            
            if (this.res.next()) {
                
                this.returned = this.res.getInt(1);
                
            }
            
        }catch(SQLException ex){
            
            System.out.println("Ocurrio un error al ingresar las credenciales " + ex);
        
        }
        
        return this.returned;
    }
    
}
