class Suministrador 
{
    private String nombre;
    private String pais;
    private int tiempo_de_entrega;

    public Suministrador(String nombre, String pais, int tiempo_de_entrega)
    {
        this.nombre = nombre;
        this.pais = pais;
        this.tiempo_de_entrega = tiempo_de_entrega;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getPais()
    {
        return this.pais;
    }
    public int gettiempo_de_entrega()
    {
        return this.tiempo_de_entrega;
    }
    public String toString()
    {
        return "Nombre: " + this.nombre + " Pais: " + this.pais + " Tiempo de entrega en dias: " + this.tiempo_de_entrega;
    }
}
