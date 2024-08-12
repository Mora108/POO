public class Persona 
{
    private final String nombre;
    private int edad;

    public Persona(String name, int age)
    {
        this.nombre = name;
        this.edad = age;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    public int getEdad()
    {
        return this.edad;
    }
}
