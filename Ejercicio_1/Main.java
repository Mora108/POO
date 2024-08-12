class Main
{
    public static void main(String[] args)
    {
        Vino elpepe = new Vino("El Pepe","1","Tinto",123,20,65);
        System.out.println(elpepe);
        Suministrador lucas = new Suministrador("Lucas", "España", 15);
        System.out.println(lucas);
        Venta muriel = new Venta(1541231.543f, 3264.65f, 434244.65f);
        System.out.println(muriel);
    }
}