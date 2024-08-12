import java.util.Date;
import java.util.Scanner;

class Main 
{
    private static Localidad localidad1;
    private static Localidad localidad5;
    private static Localidad localidad10;
    private static int codigo;
    private static double totalGanado;
    public static void main(String[] args) 
    {
        nuevaCompra();

        Scanner sc = new Scanner(System.in);

        while (true) 
        { 
            System.out.println("Bienvenido a TodoTicket del mundial femenino!");
            System.out.println("1. Comprar Tickets");
            System.out.println("2. Ver disponibilidad de asientos total");
            System.out.println("3. Ver disponibilidad de asientos por localidad");
            System.out.println("4. Generar reporte de ventas");
            System.out.println("5. Salir");
            System.out.println("Por favor, elija una opcion");
            int opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                    comprarTickets(sc);
                    break;
                case 2:
                    disponibilidadTotal();
                    break;
                case 3:
                    disponibilidadLocalidad(sc);
                    break;
                case 4:
                    generarReporteVentas();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestro servicio! esperamos que vuelva pronto!");
                    return;
                default:
                    System.out.println("Opcion invalida, intentelo de nuevo.");
            }
        }
    }

    private static void nuevaCompra()
    {
        localidad1 = new Localidad("Localidad 1", 250, 3000);
        localidad5 = new Localidad("Localidad 5",575,3000);
        localidad10 = new Localidad("Localidad 10",1720,3000);
        codigo = 1;
        totalGanado = 0;
    }

        private static void comprarTickets(Scanner sc)
        {
            System.out.print("Ingrese su nombre: ");
            String nombre = sc.next();
            System.out.print("Ingrese su numero de telefono: ");
            String telefono = sc.next();
            System.out.print("Ingrese su budget maximo: ");
            int budgetMaximo = sc.nextInt();
            System.out.print("Ingrese la cantidad de boletos que desea comprar: ");
            int cantidadTickets = sc.nextInt();
            System.out.print("Seleccione la localidad(1, 5 ó 10): ");
            int localidadSeleccionada = sc.nextInt();

            Localidad localidad = null;
            switch (localidadSeleccionada)
            {
                case 1:
                    localidad = localidad1;
                    break;
                case 5:
                    localidad = localidad5;
                    break;
                case 10:
                    localidad = localidad10;
                    break;
                default:
                    System.out.println("Localidad invalida.");
                    return;
            }

        Cliente cliente = new Cliente(nombre, telefono, cantidadTickets, budgetMaximo);
        if (!localidad.disponibilidad(cantidadTickets)){
            System.out.println("No hay boletos disponibles en la localidad deseada.");
        }
        double costoTotal = cantidadTickets * localidad.getPrecio();
        if (costoTotal > budgetMaximo){
            System.out.println("Su budget no es suficiente para realizar esta compra.");
            return;
        }
        localidad.venderTickets(cantidadTickets);
        for (int i = 0; i < cantidadTickets; i++){
            Ticket ticket = new Ticket(codigo++,new Date(),localidad);
            totalGanado += localidad.getPrecio();
            System.out.println("Su compra se realizo con exito! Numero de boleto: " + ticket.getnumeroTicket());
        }
    }
    private static void disponibilidadTotal()
    {
        System.out.println(localidad1.getNombre() + ": " + localidad1.getticketsDisponibles() + "boletos disponibles.");
        System.out.println(localidad5.getNombre() + ": " + localidad5.getticketsDisponibles() + "boletos disponibles.");
        System.out.println(localidad10.getNombre() + ": " + localidad10.getticketsDisponibles() + "boletos disponibles.");
    }
    private static void disponibilidadLocalidad(Scanner sc)
    {
        System.out.println("Seleccione la localidad(1, 5, 10): ");
        int localidadSeleccionada = sc.nextInt();

        Localidad localidad = null; 
        switch (localidadSeleccionada)
            {
                case 1:
                    localidad = localidad1;
                    break;
                case 5:
                    localidad = localidad5;
                    break;
                case 10:
                    localidad = localidad10;
                    break;
                default:
                    System.out.println("Localidad invalida.");
                    return;
            }
        System.out.println(localidad.getNombre() + ": " + localidad.getticketsDisponibles() + "Tickets disponibles.");
    }
    private static void generarReporteVentas()
    {
        System.out.println("Total ganado: " + totalGanado);
    }
}