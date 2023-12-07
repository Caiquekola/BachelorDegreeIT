/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosInterface;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 0056837
 */
public class Main {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle();
        House build1 = new House();
        School build2 = new School();
        Car c1 = new Car();
        Car c2 = new Car();
        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();
        carbonFootprints.add(b1);
        carbonFootprints.add(b2);
        carbonFootprints.add(build1);
        carbonFootprints.add(build2);
        carbonFootprints.add(c1);
        carbonFootprints.add(c2);
        for (CarbonFootprint carbon: carbonFootprints) {
            System.out.println(carbon.getCarbonFootprint()+" ");
        }
        
    }
    
}
