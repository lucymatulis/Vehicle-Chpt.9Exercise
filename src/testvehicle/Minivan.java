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
public class Minivan extends Vehicle{
    private int numKids;
    private String snacks;
    private int numBoosterSeats;
    /**
    * constructor
    * pre: none
    * post: When mini van is created, the car is filled with kids/booster seats and snacks.
    */
    public Minivan(int g, int d,String c,int nK, String s){
        super(g,d,c);
        numKids = nK;
        snacks = s;
        
    }
    /** 
	 * pre: none
	 * post: returns snacks
	 */
    public String getSnacks(){
        return snacks;
    }
    /** 
	 * pre: none
	 * post: returns number of booster seats.
	 */
    public int getNumBoosterSeats(){
        return numKids;
    }
    /** 
	 * pre: none
	 * post: returns number kids.
	 */
    public int getKids(){
        return numKids;
    }
    /** 
	 * pre: none
	 * post: returns mini van information.
	 */
    public String toString(){
        return ("The "+getColour()+" van has "+getKids()+" kids and booster seats. The snack for soccer practice is "+getSnacks()+". The van has "+getGas()
                +"L left and has travelled "+getDistance()+"km.");
    }
}
