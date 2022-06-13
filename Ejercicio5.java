package EjercicioNN.java;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner msj = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = msj.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " si es divisible ");
        } else {
            System.out.println("El numero " + num + " No es divisible ");

        }

    }

}
