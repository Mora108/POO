import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombreJugador = sc.next();

        Jugador jugador = new Jugador (nombreJugador, 0, 0);
        Bingo bingo = new Bingo(jugador);

        boolean salir = false;

        while(!salir){
            System.out.println("Bienvenido a SuperBingo! Por favor elija una opción.");
            System.out.println("1. Menú principal");
            System.out.println("2. Salir");
            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    boolean menuPrincipal = true;
                    while (menuPrincipal){
                        System.out.println("Elija una opción.");
                        System.out.println("1. Depositar saldo.");
                        System.out.println("2. Jugar bingo.");
                        System.out.println("3. Ver saldo.");
                        System.out.println("4. Retirar Ganancias.");
                        System.out.println("5. Regresar al menú principal.");
                        int opcionMenuPrincipal = sc.nextInt();
                        switch (opcionMenuPrincipal){
                            case 1:
                                System.out.println("¿Cuando desea depositar? Ingrese un numero");
                                float deposito = sc.nextFloat();
                                jugador.setSaldo(jugador.getSaldo() + deposito);
                                System.out.println("Perfecto! Su saldo ahora es de: " + jugador.getSaldo());
                                break;
                            case 2:
                                bingo.jugar();
                                break;
                            case 3:
                                double saldoDolares = jugador.getSaldo() / 7.95;
                                System.out.printf("Saldo actual en quetzales: %.2f quetzales%n ", jugador.getSaldo());
                                System.out.printf("Saldo actual en dolares: %.2f dolares%n ", saldoDolares);
                                break;
                            case 4:
                                if (jugador.esMoroso()){
                                    System.out.println("Aun tienes una deuda con el bingo. No puedes retirar tus ganancias hasta cubrir esta deuda. Por favor haz un deposito para poder cubir esta deuda.");
                                    System.out.printf("Su deuda actual es: %.2f quetzales%n ", jugador.getDeuda());
                                } else {
                                    System.out.println("Muchas gracias por haber jugado con nosotros! Sus ganancias son de: " + jugador.getSaldo());
                                    System.out.println("¿Desea salir de SuperBingo? (sí/no)");
                                    String respuesta = sc.next();
                                    if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí")){
                                        menuPrincipal=false;
                                        salir=true;
                                    }
                                }
                                break;
                            case 5:
                                menuPrincipal = false;
                                break;
                            default:
                                System.out.println("Opción no valida. Intente de  nuevo.");
                                break;
                        }
                    }
                    break;
                case 2:
                    salir = true;
                    System.out.println("Gracias por haber jugado a SuperBingo! Esperamos que vuelva pronto!");
                    break;
                default:
                    System.out.println("Opción no valida. Intente de  nuevo.");
                    break;
            }
        }
        
        sc.close();
    }
}
