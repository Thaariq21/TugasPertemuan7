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
import java.util.Scanner;
public class Login {
    private String userName;
    private String password;
    
    Admin admin = new Admin();
    
    boolean isLoggedIn;
    Scanner input = new Scanner(System.in);
    public String getUserName(){ return userName; }
    public String getPassword(){ return password; }
    
    public void setUserName(String un){ this.userName = un; }
    public void setPassword(String pw){ this.password = pw; }
    
    
    public void login(){
        System.out.println("===== LOGIN =====");
        System.out.print("Username  :");
        userName = input.nextLine();
        System.out.print("Password  :");
        password = input.nextLine();
        
    }
    public boolean cekLogin(){
      
        if((admin.getUserName().equals(userName))&&(admin.getPassword().equals(password))){
          isLoggedIn = true;
      }else{
          System.out.println("Usename or password wrong");
          isLoggedIn = false;
          
      }
        return isLoggedIn;
    }
    
    
}
