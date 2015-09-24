package hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by skplanet on 2015-09-07.
 */
public class time_conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] list = input.toCharArray();
        int hh = Integer.parseInt(String.valueOf(list[0])) * 10 + Integer.parseInt(String.valueOf(list[1]));
        if (list[list.length - 2] == 'P') {
            hh = hh + 12;
            String HH = null;
            if (hh == 24) {
                HH = "12";
            } else {
                HH = String.valueOf(hh);
            }

            list[0] = HH.charAt(0);
            list[1] = HH.charAt(1);
        } else {
            if (hh == 12) {
                list[0] = '0';
                list[1] = '0';
            }
        }

        for (int i = 0; i < list.length - 2; i++)
            System.out.print(list[i]);
    }
}
