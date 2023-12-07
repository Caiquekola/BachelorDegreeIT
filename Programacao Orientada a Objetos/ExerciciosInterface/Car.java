/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosInterface;

/**
 *
 * @author 0056837
 */
public class Car implements CarbonFootprint{
    private String combustivel;
    private float cilindriada;

    @Override
    public double getCarbonFootprint() {
        return 2;
    }
    
}
