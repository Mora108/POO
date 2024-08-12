import java.util.Random;  // Importa la clase Random para generar números aleatorios.

public class Deck {
    private Random rand;  // Variable para la instancia de Random, utilizada para generar números aleatorios.

    public Deck() {
        rand = new Random();  // Inicializa la instancia de Random.
    }

    public int repartirCarta() {
        return rand.nextInt(9) + 1;  // Genera un número aleatorio entre 1 y 9 (inclusive) y lo devuelve.
    }
}