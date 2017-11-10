/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testvehicle;

/**
 *
 * @author lumat8093
 */
public class Car extends Vehicle {
    private boolean convertible;
    private boolean sports;
         
    /**
    * constructor
    * pre: none
    * post: When car is created, the car is set as convertible or not and as sports or not.
    */
    public Car(int g,int d, String c, boolean con, boolean sp){
        super(g,d,c);
        convertible = con;
        sports = sp;
    }
    /** 
	 * Returns if car is a convertible.
	 * pre: none
	 * post: String
	 */    
    public String getConv(){
        String x = "";
        if(convertible){
             x = "The car is a convertable. ";
        }else{
            x = "The car is not a convertable. ";
        }
        return x;  
    }
    /** 
	 * Returns if car sports.
	 * pre: none
	 * post: String
	 */
    public String getSports(){
        String x = "";
        if(sports){
             x = "The car is a sports car. ";
        }else{
            x = "The car is not a sports car. ";
        }
        return x;  
    }
        /** 
	 * Returns String
	 * pre: none
	 * post: String with car info
	 */
    public String toString(){
        return ("The " + getColour()+" car has travelled "+getDistance()+"km and has "+getGas()+"L of gas left. "+ getConv()+getSports());
    }
    
}
