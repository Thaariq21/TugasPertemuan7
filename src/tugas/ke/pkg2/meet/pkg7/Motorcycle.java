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
public class Motorcycle extends Transportation{
     private int motor1;
    private int motor2;
    
    public Motorcycle(){
        this.motor1 = 1;
        this.motor2 = 1;
    }
    
    //Meminjam Motor
    public void Motorcycle1(){
       // Motorcycle motor1 = new Motorcycle();
       if(motor1 == Motorbike1R){
           this.motor1 -= 1;
           //Motor1 sekarang = 0
       }else if(motor1 == Motorbike1NR){
           //Motor telah dipipnjam orang lain
       }        
    }
    public void Motorcycle2(){
       // Motorcycle motor2 = new Motorcycle();
       if(motor2 == Motorbike2R){
           this.motor2 -= 1;
           //Motor2 sekarang = 0
       }else if(motor2 == Motorbike2NR){
           //Motor telah dipipnjam orang lain
       }else{
           
       }        
    }
    
    //Mengembalikan Motor
    public void rePayMotorcycle1(){
        if(motor1 == Motorbike1NR){
            this.motor1 += 1;
            //Motor sekarang = 1
        }else if(motor1 == Motorbike1R){
            //Motor masih Ready
        }else{
            
        }
    }
    public void rePayMotorcycle2(){
        if(motor2 == Motorbike2NR){
            this.motor2 += 1;
            //Motor sekarang = 1
        }else if(motor2 == Motorbike2R){
            //Motor masih ready
        }
    }
    public void ShowMotorReady(){
        System.out.println("Motor 1 :"+this.motor1+"| Motor 2 :"+this.motor2);
    }
    
}
