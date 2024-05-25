package aeds.faseZero;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double V = scan.nextDouble();
        double D = scan.nextDouble();
        V = V / D;   // Calcula a razão V/D
        V += 19.0;   // Adiciona 19.0 horas
        V = V % 24.0; // Obtém a hora do dia em um formato de 24 horas
        int hh = (int) V; // Parte inteira é a hora
        int mm = (int) ((V - hh) * 60.0); // Parte decimal convertida em minutos
        System.out.printf("%02d:%02d\n", hh, mm); // Formata e imprime a hora e os minutos
    }
}
