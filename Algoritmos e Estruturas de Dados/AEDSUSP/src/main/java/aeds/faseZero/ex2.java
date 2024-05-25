package aeds.faseZero;

import java.util.Scanner;

/**
 *
 * @author Caio Rievers
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cri = scan.nextInt();
        String room[] = new String[cri];
        for (int i = 0; i < cri; i++) {
            room[i] = scan.next();
        }

        String young[] = new String[cri];
        for (int i = 0; i < cri; i++) {
            young[i] = scan.next();
        }

        int r = 0;
        int y = 0;
        while(r < cri){
            if(r == cri-1)
                System.out.println(young[y]);
            else
                System.out.print(young[y] + " ");
            if(room[r].equals(young[y]))
                y++;
            r++;
        }
    }
}
