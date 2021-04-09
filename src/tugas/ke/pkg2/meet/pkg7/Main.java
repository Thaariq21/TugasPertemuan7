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
        
        CommercialCar cc = new CommercialCar();
        Motorcycle mtr = new Motorcycle();
        Car c = new Car();
        
        int selection = 99;
        int menuSelection = 99;
        //int selection3 = 99;
        int ANMSelection = 99;
        int BorrowSelection = 99;
        
         
    while(selection != 0){
        System.out.println("===== MENU =====");
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
                   while(menuSelection != 0){
                       System.out.println("===== REGIST =====");
                        System.out.println("1.Add New Member");
                        System.out.println("2.Show Member Profiles");
                        System.out.println("3.Borrow a vehicle");
                        
                        System.out.println("0.Back");
                        menuSelection = input.nextInt();
                        
                        switch(menuSelection){
                            case 1:
                                //Mengisi Data member
                                System.out.println("===== ADD NEW MEMBER =====");
                                System.out.println("Input data:");
                                System.out.print("Name      :");
                                String nama = input.next();
                                System.out.print("ID Member :");
                                String idm = input.next();
                                System.out.print("Address    :");
                                String alamat = input.next();
                                System.out.print("No Hp     :");
                                int nohp = input.nextInt();
        
                                m.setNama(nama);m.setIdMember(idm);m.setAlamat(alamat);m.setNoHp(nohp);
                                
                                while(ANMSelection != 0){
                                    System.out.println("1.Borrow a vehicle");
                                    System.out.println("2.Repay the vechicle");
                                    System.out.println("0.Back");
            
                                    ANMSelection = input.nextInt();
                                    switch(ANMSelection){
                                        case 1:
                                            while(BorrowSelection != 0){
                                                System.out.println("===== BORROW A VEHICLE =====");
                                                System.out.println("What a vechile do you want to borrow?");
                                                System.out.println("1.Commercial Car");
                                                System.out.println("2.Motorcycle");
                                                System.out.println("3.Car");
                                                System.out.println("0.Back");
                                                
                                                BorrowSelection = input.nextInt();
                                                    switch(BorrowSelection){
                                                        case 1: //Pilihannya Mobil Niaga
                                                            int comcarSelect = 99;
                                                            while(comcarSelect != 0){
                                                                System.out.println("===== COMMERCIAL CAR =====");
                                                                System.out.println("Wich Commercial Car do you want to borrow?\n");
                                                                System.out.println("1.GranMax Pro");
                                                                System.out.println("2.SuzuQi APV Van");
                                                                System.out.println("3.Show Commercial Car Is ready or not");
                                                                System.out.println("0.Back");
                                                                comcarSelect = input.nextInt();
                                                                switch(comcarSelect){
                                                                    case 1:
                                                                        cc.CommercialCar1();
                                                                        break;
                                                                    case 2:
                                                                        cc.CommercialCar2();
                                                                        break;
                                                                    case 3:
                                                                        cc.ShowComCarReady();
                                                                        break;                                                                   
                                                                }
                                                                break;
                                                            }
                                                        case 2: //Pilihannya Motor
                                                            int motorSelect = 99;
                                                            while(motorSelect != 0){
                                                                System.out.println("===== MOTORCYCLE =====");
                                                                System.out.println("Wich motorbike do you want to borrow?\n");
                                                                System.out.println("1.Honda BBQ");
                                                                System.out.println("2.Nmax Pro");
                                                                System.out.println("3.Show Motorcycle Is ready or not");
                                                                System.out.println("0.Back");
                                                                
                                                                motorSelect = input.nextInt();
                                                                switch(motorSelect){
                                                                    case 1:
                                                                        mtr.Motorcycle1();
                                                                        break;
                                                                    case 2:
                                                                        mtr.Motorcycle2();
                                                                        break;
                                                                    case 3:
                                                                        mtr.ShowMotorReady();
                                                                }
                                                            }
                                                            break;
                                                        case 3: //Pilohannya Mobil
                                                            int carSelect = 99;
                                                            while(carSelect != 0){
                                                                System.out.println("===== CAR =====");
                                                                System.out.println("Wich Car do you want to borrow?\n");
                                                                System.out.println("1.TeZla mX TBC");
                                                                System.out.println("2.AvanSa Qek");
                                                                System.out.println("3.Show Car Is ready or not");
                                                                System.out.println("0.Back");
                                                                carSelect = input.nextInt();
                                                                switch(carSelect){
                                                                    case 1:
                                                                        c.Car1();
                                                                        break;
                                                                    case 2:
                                                                        c.Car2();
                                                                        break;
                                                                    case 3:
                                                                        c.ShowCarReady();
                                                                        break;
                                                                }
                                                            }
                                                        break;
                                                    }
                                            } 
                                        break;    
                                    }
                                }//add new member selection
                            case 2:
                                break;
                            case 3:
                                break;
                        }//menu selection        
                    }
                }else{ //if else
                    System.out.println("You're not logged in");
                }
        } // switch Selection
           
                
               
    }//while selection
        
    }    
      
        
}
