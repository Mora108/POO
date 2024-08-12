import java.util.Random;

public class Bingo {
    private int numero1;
    private int numero2;
    private int numero3;
    private final float precioNumero = 4.0f;
    private final Jugador jugador;
    private final Random rand;
    private final float prestamoInicial = 4 * 3 * precioNumero;

    public Bingo(Jugador jugador){
        this.jugador = jugador;
        this.jugador.setSaldo(prestamoInicial);
        this.rand = new Random();

        System.out.println("Saldo inicial del jugador: " + this.jugador.getSaldo());
        System.out.println("Deuda inicial del jugador: " + this.jugador.getDeuda());
    }
    public int nuevoNumero(){
        return rand.nextInt(1001 - 100) + 100;
    }
    public void jugar(){
        if (!puedeJugar()){
            System.out.println("No hay saldo suficiente para jugar o tienes una deuda con el bingo. Su deuda es de: " + jugador.getDeuda());
            return;
        }

        numero1 = nuevoNumero();
        numero2 = nuevoNumero();
        numero3 = nuevoNumero();
        System.out.println("Sus números que entran en juego son: " + numero1 + ", " + numero2 + ", " + numero3 + ".");
        
        jugador.setSaldo(jugador.getSaldo() - (3 * precioNumero));

        float ganancia = determinarGanancia();

        acreditarGanancia(ganancia);

        if (ganancia > 0){
            System.out.println("Has ganado! Sus ganancias son de: " + ganancia + " quetzales.");
        } else{
            System.out.println("Has perdido! Suerte a la proxima!");
        }
    }
    public boolean puedeJugar(){
        return jugador.getSaldo() >= (3 * precioNumero) && !jugador.esMoroso();
    }
    public float determinarGanancia(){
        int pares = 0;
        int par1 = 0;
        int par2 = 0;

        if (numero1 % 2 == 0){
            pares++;
            if (pares == 1) par1 = numero1;
        }
        if (numero2 % 2 ==0){
            pares++;
            if (pares == 1) par1 = numero2;
            if (pares == 2) par2 = numero2;
        }
        if (numero3 % 2 ==0){
            pares++;
            if (pares == 1) par1 = numero3;
            if (pares == 2) par2 = numero3;
        }
        if (pares < 2){
            return 0;
        }
        if (par1 > 700 && par2 > 700){
            return (par1 + par2) * 0.10f;
        } else if ((par1 >= 500 && par1 <= 700) && (par2 >= 500 && par2 <= 700)){
            return (par1 + par2) * 0.20f;
        } else if ((par1 > 500) || (par2 > 500)){
            return (par1 + par2) * 0.15f;
        } else if (par1 < 500 && par2 < 500){
            return (par1 + par2) * 0.25f;
        }

        return 0;
    }
    public void acreditarGanancia(float ganancia){
        if (jugador.getDeuda() > 0){
            if (ganancia > jugador.getDeuda()){
                ganancia -= jugador.getDeuda();
                jugador.setDeuda(0);
            } else{
                jugador.setDeuda(jugador.getDeuda() - ganancia);
                ganancia = 0;
            }
        }
        jugador.setSaldo(jugador.getSaldo() + ganancia);
    }
    public float getPrestamoInicial(){
        return prestamoInicial;
    }
}
