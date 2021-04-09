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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login l = new Login();
        Member m = new Member();
        
        
        int selection = 99;
       
        
         
    while(selection != 0){
          System.out.println("1.Login");
          System.out.println("2.Regist");
          
          System.out.println("0.Exit");
          
          System.out.print("Your select :");
          selection = input.nextInt();
        switch(selection){
            case 1:
                l.login();
                l.cekLogin();
                
               break;
            case 2:
                if(l.cekLogin() == true){
                    int selection2 = 99;
                    
                    while(selection2 != 0){
                        System.out.println("1.Add New Member");
                        System.out.println("2.Show Member Profiles");
                        
                        System.out.println("0.Back");
                        selection2 = input.nextInt();
                        
                        switch(selection2){
                            case 1:
                                //Mengisi Data member
                                System.out.println("\nMasukan data member :");
                                System.out.print("Nama      :");
                                String nama = input.next();
                                System.out.print("ID Member :");
                                String idm = input.next();
                                System.out.print("Alamat    :");
                                String alamat = input.next();
                                System.out.print("No Hp     :");
                                int nohp = input.nextInt();
        
                                m.setNama(nama);
                                m.setIdMember(idm);
                                m.setAlamat(alamat);
                                m.setNoHp(nohp);
               
                                break;
                            case 2:
                                m.showDataMember();
                                break;
                        }
                    }
                }else{
                    System.out.println("Anda belum Login !");
                }
            case 3:
                
               
       }
        
    }    
      
        
    }
    
}
