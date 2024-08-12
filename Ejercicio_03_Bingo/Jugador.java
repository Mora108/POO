public class Jugador {
    private float saldo;
    private final String nombre;
    private float deuda;

    public Jugador (String nombre, float saldo, float deuda){
        this.nombre = nombre;
        this.saldo = saldo;
        this.deuda = deuda;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setDeuda(float deuda){
        this.deuda = deuda;
    }
    public float getDeuda(){
        return this.deuda;
    }
    public boolean esMoroso(){
        return deuda > 0;
    }
}
