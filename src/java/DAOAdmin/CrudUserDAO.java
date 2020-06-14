/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOAdmin;

import DAO.LoginDAO;
import VOAdmin.CrudUserVO;
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
public class CrudUserDAO extends ClassConnection {

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
    private String opt;
    private boolean resMail = false;

    public CrudUserDAO() {

    }

    public CrudUserDAO(CrudUserVO uVO) {

        try {

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
            this.opt =uVO.getOpt();

        } catch (Exception ex) {

            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public int insertUser() {

        int result = 0;
        String sqlUser = "SELECT mowo.f_insert_usu(?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
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

        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al insertar el usuario " + ex);
        }

        return result;

    }

    public int modifyUser() {
        int result = 0;
        String sqlUser = "SELECT mowo.f_modificar_usuario(?,?,?,?,?,?,?,?) ";
        try {
            this.pstm = this.con.prepareStatement(sqlUser);
            
            this.pstm.setString(1, this.name);
            this.pstm.setString(2, lname);
            this.pstm.setInt(3, phone);
            this.pstm.setString(2, dir);
            this.pstm.setString(5, date);
            this.pstm.setString(6, mail);
            this.pstm.setInt(7, active);
            this.pstm.setString(8, opt);
            
            this.res = this.pstm.executeQuery();

            System.out.println(this.pstm);

            if (this.res.next()) {
                result = res.getInt(1);
            }
            
        } catch (SQLException ex) {
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
//            CrudUserVO uVO = new CrudUserVO("CC", 778888, "Blaaa", "Blaaaa", 2, 151551, "cra 14 a este", "2020-01-01", "juanRRamirez159753@gmail.com",1);
//
//            CrudUserDAO objP = new CrudUserDAO(uVO);
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
