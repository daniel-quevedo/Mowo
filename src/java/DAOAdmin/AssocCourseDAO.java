/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOAdmin;

import DAO.LoginDAO;
import VOAdmin.AssocCourseVO;
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
public class AssocCourseDAO extends ClassConnection{
    
    //variables de conexion 
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet res;
    
    
    //variables para asociar el curso al usuario
    private int id_course;
    private int id_user;
    private String opt;

    public AssocCourseDAO() {
        try {
            this.conn = this.getConnection();
            
        } catch (Exception e) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
    public AssocCourseDAO(AssocCourseVO acVO){
        
        try
        {
            this.conn = this.getConnection();
        
            this.id_course = acVO.getId_course();
            this.id_user = acVO.getId_user();
            this.opt = acVO.getOpt();
            
        }catch(Exception ex){
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public int assoc(){
        
        int result =0;
        
        String sqlAssoc = "SELECT mowo.f_asociar_curso(?,?,?);";
        
        //String sqlAssoc = "SELECT mowo.f_asociar_curso("+this.id_user+","+this.id_course+",'"+this.opt+"');";
        try{
            
            this.pstm = this.conn.prepareStatement(sqlAssoc);
            this.pstm.setInt(1, this.id_user);
            this.pstm.setInt(2, this.id_course);
            this.pstm.setString(3, this.opt);
            
            //System.out.println(this.pstm);
            
            this.res = this.pstm.executeQuery();
            
            if (this.res.next() ) {
                
                result = this.res.getInt(1);
                
            }
            
        }catch(SQLException ex){
            
            System.out.println("ocurrio un error al asociar el usuario" + ex);
            
        }
        
        return result;
        
    }
    
    public ResultSet listDocEst(int data){
        
        try {
            
        String sqlList = "SELECT activo, nombre, apellido, identificacion,telefono,email FROM mowo.usuario WHERE fk_perfil = ?";
            
        this.pstm = this.conn.prepareStatement(sqlList);
        this.pstm.setInt(1,data);
        
        this.res = this.pstm.executeQuery();
        
        } catch (SQLException e) {
            System.out.println("Ocurrio un error al mostrar los usuarios " + e);
        }
        
        return this.res;
    }
    
    public ResultSet listCourse(){
        try {
            
        String sqlListC = "SELECT id_curso, nombre_curso FROM mowo.curso";
        
        this.pstm = this.conn.prepareStatement(sqlListC);        
        
        this.res = this.pstm.executeQuery();
        } catch (SQLException e) {
            System.out.println("Ocurrio un error al mostrar los usuarios " + e);
        }
        return this.res;
    }
    
    
    
    
    public static void main(String[] args) {
        
        try{
           //primera opcion:id_usu segunda opcion:id_curso tercera opcion: (A)estudiante (B)profesor
            //AssocCourseVO acVO = new AssocCourseVO(67,4,"A");

            AssocCourseDAO objP = new AssocCourseDAO();
            
            System.out.println(objP.listDocEst(1));

       }catch(Exception ex){
           
           
       }
        
    }

}
