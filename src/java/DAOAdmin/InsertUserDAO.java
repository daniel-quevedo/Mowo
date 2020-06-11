/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOAdmin;

import DAO.LoginDAO;
import VOAdmin.InsertUserVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mail.Mail;
import util.ClassConnection;

/**
 *
 * @author Leonardo
 */
public class InsertUserDAO extends ClassConnection{
    
    //variables de conexion *************
    
    private Connection con; 
    private PreparedStatement pstm;
    private ResultSet res;
    
    //variables con datos de usuario********
    
    private String typeDoc;
    private int nDocument;
    private String name;
    private String lname;
    private int typeUser;
    private int phone;
    private String dir;
    private String date;
    private String mail;
    private int active;
    private boolean resMail = false;
    
    
    
    public InsertUserDAO(){
        
    }
    
    public InsertUserDAO(InsertUserVO uVO){
        
        try{

            this.con = this.getConnection();
            
            this.typeDoc = uVO.getTypeDoc();
            this.nDocument = uVO.getnDocument();
            this.name = uVO.getName();
            this.lname = uVO.getLname();
            this.typeUser = uVO.getTypeUser();
            this.phone = uVO.getPhone();
            this.dir = uVO.getDir();
            this.date = uVO.getDate();
            this.mail = uVO.getMail();
            this.active = uVO.getActive();
            
        }catch(Exception ex){
            
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        
    }
    
    public int insertUser(){
        
        int result = 0;
        String sqlUser = "SELECT mowo.f_insert_usu(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        try{
            this.pstm = this.con.prepareStatement(sqlUser);
            
            this.pstm.setString(1, this.typeDoc);
            this.pstm.setInt(2, this.nDocument);
            this.pstm.setString(3, this.name);
            this.pstm.setString(4, this.lname);
            this.pstm.setInt(5, this.typeUser);
            this.pstm.setInt(6, this.phone);
            this.pstm.setString(7, this.dir);
            this.pstm.setString(8, this.date);
            this.pstm.setString(9, this.mail);
            this.pstm.setInt(10, this.active);
            
            this.res = this.pstm.executeQuery();
            
            System.out.println(this.pstm);
            
            if (this.res.next()) {
                result = res.getInt(1);
            }
            
            
        }catch(SQLException ex){
            System.out.println("Ocurrio un error al insertar el usuario " + ex);
        }
        
        return result;
        
    }
    
//    public static void main(String[] args) {
//        
//       
//        
//       try{
//           
//            InsertUserVO uVO = new InsertUserVO("CC", 778888, "Blaaa", "Blaaaa", 2, 151551, "cra 14 a este", "2020-01-01", "juanRRamirez159753@gmail.com",1);
//
//            InsertUserDAO objP = new InsertUserDAO(uVO);
//            
//            System.out.println(objP.insertUser());
//
//       }catch(Exception ex){
//           
//           
//       }
//       
//       
//    }
    
}
