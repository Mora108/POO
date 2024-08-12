class Perro
{
    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public Perro(String nombre, String raza)
    {
        this.nombre = nombre;
        this.raza = raza;
    }

    public void ladrar()
    {
        System.out.println("Woof Woof");
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getRaza()
    {
        return this.raza;
    }
    public String toString()
    {
        return "Mombre: " + this.nombre + "Raza: " + this.raza + "Edad: " + this.edad + "Color: " + this.color;
    }
}