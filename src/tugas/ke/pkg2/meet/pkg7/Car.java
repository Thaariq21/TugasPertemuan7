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
public class Car extends Transportation{
    private int car1;
    private int car2;
    
    public Car(){
        this.car1 = 1;
        this.car2 = 1;
    }
    
    //Meminjam Mobil
    public void Car1(){
       // Car car1 = new Car();
       if(car1 == Car1R){
           this.car1 -= 1;
           //Car1 sekarang = 0
       }else if(car1 == Car1NR){
           //Mobil telah dipipnjam orang lain
       }        
    }
    public void Car2(){
       // Car car2 = new Car();
       if(car2 == Car2R){
           this.car2 -= 1;
           //Car2 sekarang = 0
       }else if(car2 == Car2NR){
           //Mobil telah dipipnjam orang lain
       }else{
           
       }        
    }
    
    //Mengembalikan Mobil
    public void rePayCar1(){
        if(car1 == Car1NR){
            this.car1 += 1;
            //Mobil sekarang = 1
        }else if(car1 == Car1R){
            //Mobil masih Ready
        }else{
            
        }
    }
    public void rePayCar2(){
        if(car2 == Car2NR){
            this.car2 += 1;
            //Mobil sekarang = 1
        }else if(car2 == Car2R){
            //mobil masih ready
        }
    }
    public void ShowCarReady(){
        System.out.println("Car 1 :"+this.car1+"| Car 2 :"+this.car2);
    }
    
}

