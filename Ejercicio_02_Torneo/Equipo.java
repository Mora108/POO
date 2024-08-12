class Equipo 
{
    private String nombre;
    private int lugar_en_el_torneo;
    private int cantidad_tiros_de_esquina;
    private int cantidad_de_juegos_ganados;
    private int cantidad_de_juegos_perdidos;
    private int cantidad_tiros_de_tiros_a_gol;
    private int cantidad_de_goles;
    private int cantidad_de_amarillas;
    private int cantidad_de_rojas;
    private int cantidad_de_faltas;

    public Equipo(String nombre,int lugar_en_el_torneo, int cantidad_tiros_de_esquina, int cantidad_de_juegos_ganados, int cantidad_de_juegos_perdidos, int cantidad_tiros_de_tiros_a_gol, int cantidad_de_goles, int cantidad_de_amarillas, int cantidad_de_rojas, int cantidad_de_faltas)
    {
        this.nombre = nombre;
        this.lugar_en_el_torneo = lugar_en_el_torneo;
        this.cantidad_tiros_de_esquina = cantidad_tiros_de_esquina;
        this.cantidad_de_juegos_ganados = cantidad_de_juegos_ganados;
        this.cantidad_de_juegos_perdidos = cantidad_de_juegos_perdidos;
        this.cantidad_tiros_de_tiros_a_gol = cantidad_tiros_de_tiros_a_gol;
        this.cantidad_de_goles = cantidad_de_goles;
        this.cantidad_de_amarillas = cantidad_de_amarillas;
        this.cantidad_de_rojas = cantidad_de_rojas;
        this.cantidad_de_faltas = cantidad_de_faltas;
    }
    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setlugar_en_el_torneo (int lugar_en_el_torneo)
    {
        this.lugar_en_el_torneo = lugar_en_el_torneo;
    }
    public int getlugar_en_el_torneo()
    {
        return this.lugar_en_el_torneo;
    }
    public void setcantidad_tiros_de_esquina (int cantidad_tiros_de_esquina)
    {
        this.cantidad_tiros_de_esquina = cantidad_tiros_de_esquina;
    }
    public int getcantidad_tiros_de_esquina()
    {
        return this.cantidad_tiros_de_esquina;
    }
    public void setcantidad_de_juegos_ganados (int cantidad_de_juegos_ganados)
    {
        this.cantidad_de_juegos_ganados = cantidad_de_juegos_ganados;
    }
    public int getcantidad_de_juegos_ganados()
    {
        return this.cantidad_de_juegos_ganados;
    }
    public void setcantidad_de_juegos_perdidos (int cantidad_de_juegos_perdidos)
    {
        this.cantidad_de_juegos_perdidos = cantidad_de_juegos_perdidos;
    }
    public int getcantidad_de_juegos_perdidos()
    {
        return this.cantidad_de_juegos_perdidos;
    }
    public void setcantidad_tiros_de_tiros_a_gol (int cantidad_tiros_de_tiros_a_gol)
    {
        this.cantidad_tiros_de_tiros_a_gol = cantidad_tiros_de_tiros_a_gol;
    }
    public int getcantidad_tiros_de_tiros_a_gol()
    {
        return this.cantidad_tiros_de_tiros_a_gol;
    }
    public void setcantidad_de_goles (int cantidad_de_goles)
    {
        this.cantidad_de_goles = cantidad_de_goles;
    }
    public int getcantidad_de_goles()
    {
        return this.cantidad_de_goles;
    }
    public void setcantidad_de_amarillas (int cantidad_de_amarillas)
    {
        this.cantidad_de_amarillas = cantidad_de_amarillas;
    }
    public int getcantidad_de_amarillas()
    {
        return this.cantidad_de_amarillas;
    }
    public void setcantidad_de_rojas (int cantidad_de_rojas)
    {
        this.cantidad_de_rojas = cantidad_de_rojas;
    }
    public int getcantidad_de_rojas()
    {
        return this.cantidad_de_rojas;
    }
    public void setcantidad_de_faltas (int cantidad_de_faltas)
    {
        this.cantidad_de_faltas = cantidad_de_faltas;
    }
    public int getcantidad_de_faltas()
    {
        return this.cantidad_de_faltas;
    }
}