import java.util.Scanner;

class Main 
{
    public static void main(String[]args)
    {
        int numero = 6;

        if (numero < 10)
            System.out.println("El numero es menor a 10");
        System.out.println("El numero es muy pequeño"); //Esto siempre se ejecuta por que no es parte del if

        if (numero < 10) {
            System.out.println("El numero es menor a 10");
            System.out.println("El numero es muy pequeño");
        }

        if (numero < 10) System.out.println("El numero es menor a 10");

        int num1 = 10;
        int num2 = 20;

        if (num1 < num2 && num2 < 30){ // && Significa AND
            System.out.println("Cumple: )");
        } else {
            System.out.println("No cumple: (");
        }
        if (num1 < num2 || num2 < 30){ // || Significa OR
            System.out.println("Cumple: )");
        } else {
            System.out.println("No cumple: (");
        }
        int num3 = 30;
        int num4 = 1;

        int larger = (num3>num4) ? num3 : num4; //Condicion ?= terceario seguido de la condicion1 : condicion2

        larger = 0;
        if (num3 > num4){
            larger = num3; //Esto es lo mismo a lo de arriba
        } else {
            larger = num4;
        }

        System.out.println(larger);

        char letra1 = 'a';
        char letra2 = 'A';

        if (letra1 < letra2) {
            System.err.println("a es menor que A");
        }else {
            System.err.println("a es Mayor que A");
        }

        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        if (nombre.equals("Erick")){ //Este .equals no es lo mismo que un ==
            System.out.println("Hola profe");
        } else {
            System.out.println("Hola " + nombre);
        }

        String cadena = "Hola";
        String alias = cadena;

        if (cadena == alias){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
    }    
}
