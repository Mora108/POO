class Cliente 
{
    private String nombre;
    private String telefono;
    private int cantidadTicketsDeseados;
    private double budgetMaximo;

    public Cliente (String nombre, String telefono, int cantidadTicketsDeseados, double budgetMaximo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.cantidadTicketsDeseados = cantidadTicketsDeseados;
        this.budgetMaximo = budgetMaximo;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return this.nombre;
    }
    public void settelefono(String telefono){
        this.telefono = telefono;
    }
    public String gettelefono(){
        return this.telefono;
    }
    public void setcantidadTicketsDeseados(int cantidadTicketsDeseados){
        this.cantidadTicketsDeseados = cantidadTicketsDeseados;
    }
    public int getcantidadTicketsDeseados(int cantidadTicketsDeseados){
        return this.cantidadTicketsDeseados;
    }
    public void setbudgetMaximo(double budgetMaximo){
        this.budgetMaximo = budgetMaximo;
    }
    public double budgetMaximo(){
        return this.budgetMaximo;
    }
}
