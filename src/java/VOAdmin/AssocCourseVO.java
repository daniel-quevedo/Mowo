/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VOAdmin;

/**
 *
 * @author Leonardo
 */
public class AssocCourseVO {
    
    private int id_course;
    private int id_user;
    private String opt;
    
    public AssocCourseVO(int id_user, int id_course, String opt){
        
        this.id_course = id_course;
        this.id_user = id_user;
        this.opt = opt;
        
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getOpt() {
        return opt;
    }

    public void setOpt(String opt) {
        this.opt = opt;
    }
    
    
    
    
}
