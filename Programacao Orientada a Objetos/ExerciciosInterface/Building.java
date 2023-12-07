/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosInterface;

/**
 *
 * @author 0056837
 */
public abstract class Building implements CarbonFootprint{
    private int numPessoas;
    private boolean usoEnergiaRenovavel;
    private boolean arCondicionado;
    @Override
    public double getCarbonFootprint() {
        return 3;
    }
}
