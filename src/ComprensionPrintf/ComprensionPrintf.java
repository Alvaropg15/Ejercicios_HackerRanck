package ComprensionPrintf;

import java.util.Scanner;

public class ComprensionPrintf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String lenguaje1 = sc.next();
        int num1 = sc.nextInt();
        String lenguaje2 = sc.next();
        int num2 = sc.nextInt();
        String lenguaje3 = sc.next();
        int num3 = sc.nextInt();
        System.out.println("================================");
        System.out.printf("%-14s %03d \n", lenguaje1, num1);
        System.out.printf("%-14s %03d \n", lenguaje2, num2);
        System.out.printf("%-14s %03d \n", lenguaje3, num3);
        System.out.println("================================");
    }
}

