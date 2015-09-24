package hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by skplanet on 2015-09-07.
 */
public class staircase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int t = c;
        while (c-- > 0) {
            for (int i = 0; i < c; i++)
                System.out.print(" ");
            for (int i = 0; i < t - c; i++)
                System.out.print("#");
            System.out.println();
        }
    }
}
