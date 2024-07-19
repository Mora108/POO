class Vino 
{
    private String nombre;
    private String cosecha;
    private String tipo;
    private int dispoMax;
    private int dispoMin;
    private int dispoReal;

    public Vino(String nombre, String cosecha, String tipo, int dispoMax, int dispoMin, int dispoReal)
    {
        this.nombre = nombre;
        this.cosecha = cosecha;
        this.tipo = tipo;
        this.dispoMax = dispoMax;
        this.dispoMin = dispoMin;
        this.dispoReal = dispoReal;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getCosecha()
    {
        return this.cosecha;
    }
    public String getTipo()
    {
        return this.tipo;
    }
    public void setdispoMax(int dispoMax)
    {
        this.dispoMax = dispoMax;
    }
    public int getdispoMax()
    {
        return this.dispoMax;
    }
    public void getdispoMin(int dispoMin)
    {
        this.dispoMin = dispoMin;
    }
    public int getdispoMin()
    {
        return this.dispoMin;
    }
    public void getDispoReal(int dispoReal)
    {
        this.dispoReal = dispoReal;
    }
    public int getDispoReal()
    {
        return this.dispoReal;
    }
    public String toString()
    {
        return "Nombre: " + this.nombre + " Cosecha: " + this.cosecha + " Tipo de Vino: " + this.tipo + " Disponibilidad Maxima: " + this.dispoMax +
            " Disponibilidad Minima: " + this.dispoMin + " Disponibilidad Real: " + this.dispoReal;
    }
}
