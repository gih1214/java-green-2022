package ex06;

import java.util.Scanner;

public class GugudanPrac {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println();

        for (int g = 1; g <= 9; g++) {
            System.out.println(n1 + "*" + g + "=" + (n1 * g));
        }

        System.out.println();

        for (int g = 1; g <= 9; g++) {
            System.out.println((n2 - 1) + "*" + g + "=" + ((n2 - 1) * g));
        }

        System.out.println();

        for (int g = 1; g <= 9; g++) {
            System.out.println(n2 + "*" + g + "=" + (n2 * g));
        }
    }
}
