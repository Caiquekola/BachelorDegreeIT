package aeds.faseZero;

import java.util.Scanner;

public class qestaoD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da entrada
        int E = scanner.nextInt();
        int V = scanner.nextInt();

        // Calcular o tempo total em horas e minutos
        int totalMinutos = (E * 60) / V;  // Conversão de horas para minutos

        // Hora e minuto inicial
        int horaInicial = 19;
        int minutoInicial = 0;

        // Calcular a nova hora e minuto
        int horasExtras = totalMinutos / 60;
        int minutosExtras = totalMinutos % 60;

        int novaHora = (horaInicial + horasExtras) % 24;
        int novoMinuto = minutoInicial + minutosExtras;

        if (novoMinuto >= 60) {
            novoMinuto -= 60;
            novaHora = (novaHora + 1) % 24;
        }

        // Imprimir o resultado com formato HH:MM
        System.out.printf("%02d:%02d\n", novaHora, novoMinuto);

        scanner.close();
    }
}
