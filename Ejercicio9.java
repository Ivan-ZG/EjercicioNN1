
package EjercicioNN.java;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner msj = new Scanner(System.in);
        int password = 0, n = 0;

        while (password != 2022) {
            System.out.println("Ingrese la clave");
            password = msj.nextInt();
            n++;
            if (password != 2022) {
                System.out.println("Clave Incorrecta");
            }

            if (n == 3) {
                System.out.println("Fallaste Jajaj!!");
                break;

            } else if (password == 2022) {
                System.out.println("Correcto !!");
            }

        }

    }
}
