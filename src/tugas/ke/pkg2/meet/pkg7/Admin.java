/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.ke.pkg2.meet.pkg7;

/**
 *
 * @author ahmad nur hidaya
 */
public class Admin{
    private String userName = "admin";
    private String password = "admin";
    
    public String getUserName(){ return userName; }
    public String getPassword(){ return password; }
    
    public void setUserName(String un){ this.userName = un; }
    public void setPassword(String pw){ this.password = pw; }
    
}
