package math_magic;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Dhaval on 2/14/2016.
 * This method calculated the sum of all multiples of
 * 3 and 5 till number n using the formula of AP
 */
public class Sum35 {

    public static void calcSum35(long no) {
        no -= 1;
        long sum1 = ((no / 3) * (3 + ((no / 3) * 3)))/ 2;
        long sum2 = ((no / 5) * (5 + ((no / 5) * 5)))/ 2;
        long sum3 = ((no / 15) * (15 + ((no / 15) * 15))) / 2;
        System.out.println((sum1 + sum2) - sum3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            calcSum35(sc.nextInt());
        }
        sc.close();
    }
}


