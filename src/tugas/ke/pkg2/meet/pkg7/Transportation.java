 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.ke.pkg2.meet.pkg7;

import java.util.Scanner;

/**
 *
 * @author ahmad nur hidaya
 */
public class Transportation {
    private String transportationType;
    private String idTrasportation;
    private String vehicleName;
    
    Scanner input = new Scanner(System.in);
    
    int cCar1R = 1; int cCar2 = 1;
    int Motorbike1R = 1; int Motorbike2R = 1; //Ready
    int Car1R = 1; int Car2R = 1;
    
    int cCar1NR = 0; int cCar2NR = 1;
    int Motorbike1NR = 0; int Motorbike2NR = 0; //Not Ready
    int Car1NR = 0; int Car2NR = 0;
    
    
    public String getTransportationType(){ return transportationType; }
    public String getIdTransportation(){ return idTrasportation; }
    public String getVehicleName(){ return vehicleName; }
    
    public void setTransportationType(String transportationType){ this.transportationType = transportationType; }
    public void setIdTransportation(String idTransportation){ this.idTrasportation = idTransportation; }
    public void setVehicleName(String vehicleName){ this.vehicleName = vehicleName; }
    
    
}
