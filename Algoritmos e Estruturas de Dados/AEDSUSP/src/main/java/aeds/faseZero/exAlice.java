package aeds.faseZero;

import java.util.Scanner;

public class exAlice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        if((x+y+z)==3){
            System.out.println(3);
        }else if((x+y+z)==5){
            System.out.println(1);
        }else{
            System.out.println(2);
        }

    }
}
