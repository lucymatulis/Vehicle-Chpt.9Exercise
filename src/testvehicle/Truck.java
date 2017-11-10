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

public class Truck extends Vehicle{
    private int hayBails;
    private int hWeight = 54;
    private boolean covered;
    /**
    * constructor
    * pre: none
    * post: When truck is created, hay bales are set and cover is open or closed.
    */
    public Truck(int g, int d,String c,int hB, boolean cOO ){
        super(g,d,c);
        hayBails = hB;
        covered = cOO;  
    }
     /** 
	 * pre: none
	 * post: returns number of hay bales.
	 */
    public int getBails(){
        return hayBails;
    }
    /** 
	 * pre: int (num of hay bales)
	 * post:none.
	 */
    public void setHayBails(int h){
        hayBails = h;
    }
    /** 
	 * pre: none
	 * post: returns weight of hay bales.
	 */
    public int getBailsWeight(){
        return (hayBails*hWeight);
    }
        /** 
	 * pre: none
	 * post: boolean
	 */
    public String coverOrOpen(){
        String x;
        if(covered){
          x = "The truck is covered";  
        }else{
            x = "The truck is not covered";
        }
        return x;
    }
    /** 
	
	 * pre: none
	 * post: String with truck info
	 */
    public String toString(){
        return ("The "+getColour()+" truck has "+ hayBails+ " hay bales that weigh "+getBailsWeight()+" lbs. "+coverOrOpen()+". The truck has "+getGas()
                +"L left and has travelled "+getDistance()+"km.");
    }
}
