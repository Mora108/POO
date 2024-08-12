import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

            //Primera forma de importar clases
        //java.util.Scanner sc = new java.Util.Scanner(System.in);

            //Segunda forma de importar clases
        //Scanner sc = new Scanner();

            //Tercera forma (Se importa todo el paquete util)
        //java.util.*;

        Random rand = new Random();
    
        int aleatorio1 = rand.nextInt();
        int aleatorio2 = rand.nextInt(10);
        int aleatorio3 = rand.nextInt(10,20);
        int aleatorio4 = rand.nextInt(-100,-10);

        System.out.println(aleatorio1);
        System.out.println(aleatorio2);
        System.out.println(aleatorio3);
        System.out.println(aleatorio4);


            //DATOS PRIMITIVOS
        //int numero1 = 10;
        //int numero2 = 20;

        // System.out.println("SEPARADOS");
        //System.out.println(numero1);
        //System.out.println(numero2);

        //numero2=numero1;

        //System.out.println("IGUALADOS");
        //System.out.println(numero1);
        //System.out.println(numero2);

        //numero2 = 30;

        //System.out.println("CAMBIADO");
        //System.out.println(numero1);
        //System.out.println(numero2);

        //OBJETOS
        Persona persona1 = new Persona("Alfredo",20);
        Persona persona2 = new Persona("Paco",22);

        System.out.println("SEPARADOS");
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getEdad());

        persona1=persona2;

        System.out.println("IGUALADOS");
        System.out.println(persona1.getEdad());
        System.out.println(persona2.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona2.getNombre());

        persona2.setEdad(50);
        System.out.println("CAMBIADO UN VALOR");
        System.out.println(persona1.getEdad());
        System.out.println(persona2.getEdad());
    }
}