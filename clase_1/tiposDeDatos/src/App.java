import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        
       int edad;
       double salaraio;
       float promedio;
       char sexo;
       boolean estado;
       String nombre;

        /*
         
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite el nombbre del empleado");
       nombre = sc.nextLine(); 
       System.out.println("Digite la edad:" );
       edad = sc.nextInt();
       System.out.println("Digite el salario");
       salaraio= sc.nextDouble();
       System.out.println("Digite el sexo");
       sexo = sc.next().charAt(0);
       System.out.println("Digite el estado del empleado");
       estado = sc.nextBoolean();

       System.out.println("");
        */

       nombre = JOptionPane.showInputDialog("Digite el nombre del estudiante");
       edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));

       JOptionPane.showMessageDialog(null, "nombre "+ nombre);
    }
}
