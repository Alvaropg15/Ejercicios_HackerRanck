package Bucles;

import java.io.*;

public class Bucles {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            for (int i = 1; i <= 10; i++) {
                int resultado = N * i;
                System.out.println(N + " x " + i + " = " + resultado);
            }bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Error, introduzca un número entero");
            main(args);
        }
    }
}


