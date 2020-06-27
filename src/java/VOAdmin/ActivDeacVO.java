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
public class ActivDeacVO {
    
    private int id_user;
    private int value;
    private String opt;
    
    public ActivDeacVO(int id_user, String opt){
        
        this.id_user = id_user;
        this.opt = opt;
        
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
