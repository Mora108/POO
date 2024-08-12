public class Jugador {
    private final String nombre;  // Variable para almacenar el nombre del jugador.
    private int cuentaTotal;  // Variable para almacenar la suma total de las cartas del jugador.

    public Jugador(String nombre) {
        this.nombre = nombre;  // Inicializa el nombre del jugador con el valor proporcionado.
        this.cuentaTotal = 0;  // Inicializa la cuenta total del jugador a 0.
    }

    public String getNombre() {
        return this.nombre;  // Devuelve el nombre del jugador.
    }

    public void setcuentaTotal(int cuentaTotal) {
        this.cuentaTotal = cuentaTotal;  // Establece el valor de la cuenta total del jugador.
    }

    public int getcuentaTotal() {
        return cuentaTotal;  // Devuelve el valor actual de la cuenta total del jugador.
    }

    public int pedirCarta(Deck deck) {
        int valorCarta = deck.repartirCarta();  // Llama al método repartirCarta() de la clase Deck para obtener el valor de una nueva carta.
        cuentaTotal += valorCarta;  // Añade el valor de la nueva carta a la cuenta total del jugador.
        return valorCarta;  // Devuelve el valor de la carta repartida.
    }

    public boolean noPerdio() {
        return cuentaTotal <= 21;  // Devuelve true si la cuenta total del jugador es menor o igual a 21, indicando que el jugador no ha perdido.
    }
}
