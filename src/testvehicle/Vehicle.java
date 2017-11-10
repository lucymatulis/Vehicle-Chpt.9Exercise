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
public abstract class Vehicle {
   private int gasInTank;
   private int distanceTravelled;
   private String colour;
   
   /**
    * constructor
    * pre: none
    * post: When vehicle is created, the color, gas and distance traveled is set.
    */
   public Vehicle(int g,int d, String c){
       gasInTank = g;
       distanceTravelled = d;
       colour = c;
   }
   /** 
	 * pre: none
	 * post: returns color.
	 */
   public String getColour(){
       return colour;
   }
   /** 
	 * pre: none
	 * post: returns gas left.
	 */
   public int getGas(){
       return gasInTank;
   }
   /** 
	 * pre: none
	 * post: returns km traveled.
	 */
   public int getDistance(){
       return distanceTravelled;
   }   
   public abstract String toString();
       
   
}