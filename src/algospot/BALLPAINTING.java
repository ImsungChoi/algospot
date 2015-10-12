package algospot;

import java.util.Scanner;

/**
 * Created by skplanet on 2015-10-06.
 */
public class BALLPAINTING {

    public static final int d = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int c = sc.nextInt();

            if (c < 1 || 1001 < c) {
                break;
            }

            System.out.println(calc(c));
        }

    }

    public static int calc (int n) {
        return 0;
    }
}
