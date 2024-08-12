import java.util.Scanner;

public class Main 
{
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese Su edad: ");
        int edad = sc.nextInt();

        //System.out.println() <- imprime una linea en blanco o se puede usar \n al inicio del string
        System.out.println("\nHola " + nombre + " de " + edad + " años.");

        sc.close();
    }
}
