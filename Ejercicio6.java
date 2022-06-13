package EjercicioNN.java;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        double IVA = 0.10;
        Scanner msj = new Scanner(System.in);

        System.out.println("Ingrese el precio de un producto");

        double precio = msj.nextDouble();
        double precioFinal = precio + (precio * IVA);

        System.out.println(precioFinal);
    }
}
