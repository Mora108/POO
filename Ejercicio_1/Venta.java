class Venta 
{
    private float  ValorVentas10Anios;
    private float VentasUltimoAnio;
    private float PromedioVentas3AniosPrecedentes;

    public Venta(float ValorVentas10Anios, float VentasUltimoAnio, float PromedioVentas3AniosPrecedenteso_de_entrega)
    {
        this.ValorVentas10Anios = ValorVentas10Anios;
        this.VentasUltimoAnio = VentasUltimoAnio;
        this.PromedioVentas3AniosPrecedentes = PromedioVentas3AniosPrecedenteso_de_entrega;
    }
    public void setValorVentas10Anios (float ValorVentas10Anios)
    {
        this.ValorVentas10Anios = ValorVentas10Anios;
    }
    public float getValorVentas10Anios()
    {
        return this.ValorVentas10Anios;
    }
    public void setVentasUltimoAnio (float VentasUltimoAnio)
    {
        this.VentasUltimoAnio = VentasUltimoAnio;
    }
    public float getVentasUltimoAnio()
    {
        return this.VentasUltimoAnio;
    }
    public void setPromedioVentas3AniosPrecedentes (float PromedioVentas3AniosPrecedentes)
    {
        this.PromedioVentas3AniosPrecedentes = PromedioVentas3AniosPrecedentes;
    }
    public float getPromedioVentas3AniosPrecedentes()
    {
        return this.PromedioVentas3AniosPrecedentes;
    }
    public String toString()
    {
        return "Valor de Ventas de los Ultimos 10 Años: " + this.ValorVentas10Anios + " Ventas del Ultimo Año: " + this.VentasUltimoAnio + 
            " Promedio de Ventas de los 3 Años Precedentes: " + this.PromedioVentas3AniosPrecedentes;
    }
}