package clase_2;

import java.util.Scanner;

public class RepasoClase{

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        String nombre;

        int edad;

        double estatura;



        System.out.println("Ingresa el nombre del estudiante: ");

        nombre = sc.nextLine();

        System.out.println("Ingresa la edad del estudiante: ");

        edad = sc.nextInt();

        System.out.println("Ingresa la estatura del estudiante: ");

        estatura = sc.nextDouble();

        System.out.println("El nombre del estudiante es: " + nombre);

        System.out.println("La edad del estudiante es: " + edad);

        System.out.println("La estatura del estudiante es: " + estatura);



    }

}
