import java.util.Scanner;  // Importa la clase Scanner para recibir entradas del usuario.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Crea un objeto Scanner para leer la entrada del usuario.

        System.out.println("Ingrese su nombre: ");
        String nombreJugador = sc.next();  // Lee el nombre del jugador desde la entrada del usuario.

        Jugador jugador = new Jugador(nombreJugador);  // Crea un nuevo objeto Jugador con el nombre proporcionado.
        Dealer dealer = new Dealer();  // Crea un nuevo objeto Dealer.
        Deck deck = new Deck();  // Crea un nuevo objeto Deck.

        boolean salir = true;  // Inicializa la variable 'salir' a true para controlar el bucle del menú principal.

        while (salir) {  // Bucle que muestra el menú principal hasta que el usuario elija salir.
            System.out.println("Bienvenido a 21! Por favor elija una opción");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            int opcion = sc.nextInt();  // Lee la opción seleccionada por el usuario.

            switch (opcion) {
                case 1:
                    nuevoJuego(jugador, dealer, deck);  // Inicia un nuevo juego.
                    break;
                case 2:
                    System.out.println("Gracias por jugar con nosotros! esperamos que vuelva pronto!");
                    salir = false;  // Cambia 'salir' a false para salir del bucle y terminar el programa.
                    break;
                default:
                    System.out.println("Opcion invalida, intentelo de nuevo.");  // Mensaje de opción inválida.
            }
        }
    }

    public static void nuevoJuego(Jugador jugador, Dealer dealer, Deck deck) {
        // Resetea las cuentas totales del jugador y del dealer al inicio de un nuevo juego.
        jugador.setcuentaTotal(0);
        dealer.setcuentaTotal(0);

        Scanner sc = new Scanner(System.in);  // Crea un nuevo objeto Scanner para leer la entrada del usuario.

        int valorCarta;  // Variable para almacenar el valor de la carta repartida.
        // Reparte dos cartas al jugador y dos cartas al dealer al inicio del juego.
        valorCarta = jugador.pedirCarta(deck);
        System.out.println(jugador.getNombre() + " recibe un " + valorCarta + " y ahora tiene " + jugador.getcuentaTotal());
        valorCarta = jugador.pedirCarta(deck);
        System.out.println(jugador.getNombre() + " recibe un " + valorCarta + " y ahora tiene " + jugador.getcuentaTotal());
        valorCarta = dealer.pedirCarta(deck);
        System.out.println("Dealer recibe un " + valorCarta + " y ahora tiene " + dealer.getcuentaTotal());
        valorCarta = dealer.pedirCarta(deck);
        System.out.println("Dealer recibe un " + valorCarta + " y ahora tiene " + dealer.getcuentaTotal());

        boolean otraMas = true;  // Inicializa la variable para controlar si el jugador quiere otra carta.
        while (otraMas) {  // Bucle para permitir al jugador seguir pidiendo cartas.
            System.out.println("¿Deseas otra carta más? Presiona 1 para otra carta y 2 para no recibir otra carta");
            int opcion = sc.nextInt();  // Lee la opción seleccionada por el jugador.
            if (opcion == 1) {
                // El jugador pide una carta y se muestra el valor recibido y la cuenta total.
                valorCarta = jugador.pedirCarta(deck);
                System.out.println(jugador.getNombre() + " recibe un " + valorCarta + " y ahora tiene " + jugador.getcuentaTotal());
                // El dealer también recibe una carta.
                valorCarta = dealer.pedirCarta(deck);
                System.out.println(" y ahora tiene " + "Dealer recibe un " + valorCarta + dealer.getcuentaTotal());
                // Verifica si el jugador se pasó de 21.
                if (!jugador.noPerdio()) {
                    System.out.println("Te pasaste de 21, has perdido.");
                    return;  // Termina el juego si el jugador pierde.
                } 
                // Verifica si el dealer se pasó de 21.
                if (!dealer.noPerdio()) {
                    System.out.println("El dealer se paso de 21, has ganado.");
                    return;  // Termina el juego si el dealer pierde.
                }
            } else {
                otraMas = false;  // Si el jugador elige no recibir más cartas, se sale del bucle.
            }
        }
        
        // Calcula y muestra los valores finales de las manos del jugador y del dealer.
        int valorJugador = jugador.getcuentaTotal();
        int valorDealer = dealer.getcuentaTotal();
        if (valorJugador > 21) {
            System.out.println("Has perdido.");
        } else if (valorDealer > 21 || valorJugador > valorDealer) {
            System.out.println("Has ganado.");
        } else if (valorJugador < valorDealer) {
            System.out.println("El dealer ha ganado.");
        } else {
            System.out.println("Empate.");
        }
    }
}
