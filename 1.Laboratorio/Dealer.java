public class Dealer {
    private int cuentaTotal;  // Variable para almacenar la suma total de las cartas del dealer.

    public Dealer() {
        this.cuentaTotal = 0;  // Inicializa la cuenta total del dealer a 0.
    }

    public void setcuentaTotal(int cuentaTotal) {
        this.cuentaTotal = cuentaTotal;  // Establece el valor de la cuenta total del dealer.
    }

    public int getcuentaTotal() {
        return this.cuentaTotal;  // Devuelve el valor actual de la cuenta total del dealer.
    }

    public int pedirCarta(Deck deck) {
        int valorCarta = deck.repartirCarta();  // Llama al método repartirCarta() de la clase Deck para obtener el valor de una nueva carta.
        cuentaTotal += valorCarta;  // Añade el valor de la nueva carta a la cuenta total del dealer.
        return valorCarta;  // Devuelve el valor de la carta repartida.
    }

    public boolean noPerdio() {
        return cuentaTotal <= 21;  // Devuelve true si la cuenta total del dealer es menor o igual a 21, indicando que el dealer no ha perdido.
    }
}
