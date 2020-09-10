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
import mail.Mail;
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
    
    
    public FileUsersDAO() {

        this.conn = this.getConnection();

    }

    public ResultSet insertUsers(String pathFile, int option) {

        returnRes = false;

        String sql = "SELECT mowo.f_usuarios_masivos(?,?)";

        try {

            this.pstm = this.conn.prepareStatement(sql);

            this.pstm.setString(1, pathFile);
            this.pstm.setInt(2, option);

            System.out.println(this.pstm);

            this.res = this.pstm.executeQuery();
            

        } catch (SQLException e) {

            System.out.println("Ocurrio un error al insertar usuarios masivos " + e.getMessage());

        }

        return this.res;

    }

}

