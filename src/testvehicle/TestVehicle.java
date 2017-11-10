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
public class TestVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Minivan theOd = new Minivan(10,20,"lilac",4,"orange slices, kool aid, goldfish crackers and melon");
        System.out.println(theOd);
        Truck sickTruck = new Truck(100,20000,"navy",4,true);
        System.out.println(sickTruck);
        Car newC = new Car(100,30000, "white", false,false);
        System.out.println(newC);
        sickTruck.setHayBails(12);
        System.out.println("Truck now has 12 bales and they weigh "+ sickTruck.getBailsWeight()+" lbs.");
    }
    
}
