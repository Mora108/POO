class Main
{
    public static void main(String[] args)
    {
        //Perro zeus = new Perro("zeus");
        //zeus.setNombre("zeus");
        //zeus.ladrar();
        //System.out.println(zeus.getNombre());

        Perro suri = new Perro("suri","Labrador");
        System.out.println(suri.getNombre());
        System.out.println(suri.getRaza());
        
        Perro zeus = new Perro("zeus","Frenchie");
        System.out.println(zeus.getNombre());
        System.out.println(zeus.getRaza());

        System.out.println(zeus);
        System.out.println(suri);
    }
}
