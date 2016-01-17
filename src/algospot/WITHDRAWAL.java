package algospot;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by imsungchoi on 2015. 10. 10..
 */
public class WITHDRAWAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        while(c-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[][] input = new int[n][2];
            int maxR = 0;
            int maxC = 0;

            for(int i = 0; i < n; i++) {
                input[i][0] = sc.nextInt();
                maxR += input[i][0];
                input[i][1] = sc.nextInt();
                maxC += input[i][1];
            }

            System.out.println(new DecimalFormat("#0.0000000").format(calc(maxR, maxC, input, k)));
        }
    }

    public static double calc (int maxR, int maxC, int[][] input, int k) {
        return 0;
    }
}
