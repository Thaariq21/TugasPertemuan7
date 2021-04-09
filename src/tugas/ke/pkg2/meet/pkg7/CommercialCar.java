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
public class CommercialCar extends Transportation{
    
    private int comCar1;
    private int comCar2;
    
    public CommercialCar(){
        this.comCar1 = 1;
        this.comCar2 = 1;
    }
    
    //Meminjam Mobil niaga
    public void CommercialCar1(){
       
       if(comCar1 == cCar1R){
           this.comCar1 -= 1;
           //Mobil niaga1 sekarang = 0
       }else if(comCar1 == cCar1NR){
           //Mobil niaga1 telah dipipnjam orang lain
       }        
    }
    public void CommercialCar2(){
       
       if(comCar2 == cCar2R){
           this.comCar2 -= 1;
           //Mobil niaga2 sekarang = 0
       }else if(comCar2 == cCar2NR){
           //Mobil niaga2 telah dipipnjam orang lain
       }        
    }
     //Mengembalikan Mobil niaga
    public void rePayComCar1(){
        if(comCar1 == cCar1NR){
            this.comCar1 += 1;
            //Mobil niaga1 sekarang = 1
        }else if(comCar1 == cCar1R){
            //Mobil niaga1 masih Ready
        }else{
            
        }
    }
    public void rePayComCar2(){
        if(comCar2 == cCar2NR){
            this.comCar2 += 1;
            //Mobil niaga2 sekarang = 1
        }else if(comCar2 == cCar2R){
            //Mobil niaga2 masih Ready
        }else{
            
        }
    }
    public void ShowMotorReady(){
        System.out.println("Com Car 1 :"+this.comCar1+"| Com Car 2 :"+this.comCar2);
    }
}
