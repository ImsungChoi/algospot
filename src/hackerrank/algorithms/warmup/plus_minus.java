package hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by skplanet on 2015-09-07.
 */
public class plus_minus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        while (c-- > 0) {
            int input = sc.nextInt();

            if (input > 0) {
                positives++;
            } else if (input < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }

        int total = positives + negatives + zeros;

        System.out.format("%.3f%n", (float) positives / total);
        System.out.format("%.3f%n", (float) negatives / total);
        System.out.format("%.3f%n", (float) zeros / total);
    }
}
