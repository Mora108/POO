class Localidad 
{
    private String nombre;
    private int precio;
    private int capacidad;
    private int ticketsVendidos;

    public Localidad(String nombre, int precio, int capacidad)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidad = capacidad;
        this.ticketsVendidos = 0;
    }
    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setPrecio(int precio)
    {
        this.precio = precio;
    }
    public int getPrecio()
    {
        return this.precio;
    }
    public void setCapacidad(int capacidad)
    {
        this.capacidad = capacidad;
    }
    public int getCapacidad()
    {
        return this.capacidad;
    }
    public void setticketsVendidos(int ticketsVendidos)
    {
        this.ticketsVendidos = ticketsVendidos;
    }
    public int getticketsVendidos()
    {
        return this.ticketsVendidos;
    }
    public boolean disponibilidad(int cantidad)
    {
        return (capacidad - ticketsVendidos) >= cantidad;
    }
    public void venderTickets(int cantidad)
    {
        if(disponibilidad(cantidad)){
            ticketsVendidos += cantidad;
        }
    }
    public int getticketsDisponibles(){
        return capacidad - ticketsVendidos;
    }
}
