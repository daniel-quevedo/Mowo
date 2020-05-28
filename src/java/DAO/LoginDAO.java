/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.LoginVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ClassConnection;

/**
 *
 * @author Leonardo
 */
public class LoginDAO extends ClassConnection{
    
    //VARIABLES DE CONEXION DB
    
    private Connection conn = null;
    private PreparedStatement pstm = null;
    private Statement st = null;
    private ResultSet res = null;
    
    //VARIABLE RETORNO****************
    
    private boolean ready = false;
    
    //VARIABLES LOGIN****
    
    private String user;
    private String passUsu;
    
    //VARIBLES USUARIO***********
    private String[] valuesUsu = new String[3];
    private int idUser;
    
    public LoginDAO(){
    }
    public LoginDAO(LoginVO loVO){
        
        try{
            
            this.conn = this.getConnection();
            
            this.user = loVO.getUser();
            this.passUsu = loVO.getPass();
            
        }catch(Exception ex){
            
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    public boolean verifyUser(){
        
        String sqlVerify = "SELECT usuario, passusu, fkcred_usu FROM mowo.credenciales WHERE  usuario = ? AND passusu = ?";
        
        try{
            
            this.pstm = this.conn.prepareStatement(sqlVerify);
            this.pstm.setString(1, this.user);
            this.pstm.setString(2, this.passUsu);
            
            this.res = this.pstm.executeQuery();
            
            if (this.res.next()) {
                
                this.idUser = this.res.getInt(3); 
                this.ready = true;
                
            }
            
            //this.closeConnection();
            
        }catch(SQLException ex){
            
            System.out.println("Ocurrio un error inesperado al verificar el usuario " + ex);
            
        }
        
        return this.ready;
        
    }
    
    public String[] nomUser(){
        
        String sqlUser = "SELECT id_usuario ,nombre, fk_perfil FROM mowo.usuario WHERE id_usuario = ?";
        
        try{
            
            this.pstm = this.conn.prepareStatement(sqlUser);
            this.pstm.setInt(1, this.idUser);
            
            this.res = this.pstm.executeQuery();
            
            if (this.res.next()) {
                
                this.valuesUsu[0] = this.res.getString(1); 
                this.valuesUsu[1] = this.res.getString(2); 
                this.valuesUsu[2] = this.res.getString(3); 

            }
            
            this.closeConnection();
        
        }catch(SQLException ex){
            
            System.out.println("Ocurrio un error inesperado al verificar el usuario " + ex);
            
        }
        
        return this.valuesUsu;
        
    }

    
    
}


