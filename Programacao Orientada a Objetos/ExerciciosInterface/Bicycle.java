/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosInterface;

/**
 *
 * @author 0056837
 */
public class Bicycle implements CarbonFootprint{
    @Override
    public double getCarbonFootprint(){
        return 1;
    }
    private String marca;
    private float aro;
}
