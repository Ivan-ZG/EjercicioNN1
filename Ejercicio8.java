package EjercicioNN.java;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int num;
        Scanner msj = new Scanner(System.in);

        do {
            System.out.println("Ingrese un valor que sea mayor o igual que cero '0'");
            num = msj.nextInt();
        } while (num <= -1);

        System.out.println(num);
    }
}
