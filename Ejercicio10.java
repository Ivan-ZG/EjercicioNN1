package EjercicioNN.java;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7 para saber los dias laborales : ");
        int day = lectura.nextInt();

        switch (day) {
            case 1:
                System.out.print("Lunes es un dia laboral");
                break;
            case 2:
                System.out.print("Martes es un dia laboral");
                break;
            case 3:
                System.out.print("Miercoles es dia un laboral");
                break;
            case 4:
                System.out.print("Jueves es un dia laboral");
                break;
            case 5:
                System.out.print("Viernes es un dia laboral");
                break;
            case 6:
                System.out.print("Sabado 'No' es un dia laboral");
                break;
            case 7:
                System.out.print("Domingo 'No' es un dia laboral");
                break;

        }
    }

}
