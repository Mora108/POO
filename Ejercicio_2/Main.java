import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int total_tiros_de_esquina = 0;
        int total_goles = 0;
        int total_amarillas = 0;
        int total_rojas= 0; 

        Equipo equipo1 = ingresarEquipo(sc, 1);
        total_tiros_de_esquina += equipo1.getcantidad_tiros_de_esquina();
        total_goles += equipo1.getcantidad_de_goles();
        total_amarillas += equipo1.getcantidad_de_amarillas();
        total_rojas += equipo1.getcantidad_de_rojas();

        Equipo equipo2 = ingresarEquipo(sc, 2);
        total_tiros_de_esquina += equipo2.getcantidad_tiros_de_esquina();
        total_goles += equipo2.getcantidad_de_goles();
        total_amarillas += equipo2.getcantidad_de_amarillas();
        total_rojas += equipo2.getcantidad_de_rojas();

        Equipo equipo3 = ingresarEquipo(sc, 3);
        total_tiros_de_esquina += equipo3.getcantidad_tiros_de_esquina();
        total_goles += equipo3.getcantidad_de_goles();
        total_amarillas += equipo3.getcantidad_de_amarillas();
        total_rojas += equipo3.getcantidad_de_rojas();

        Equipo equipo4 = ingresarEquipo(sc, 4);
        total_tiros_de_esquina += equipo4.getcantidad_tiros_de_esquina();
        total_goles += equipo4.getcantidad_de_goles();
        total_amarillas += equipo4.getcantidad_de_amarillas();
        total_rojas += equipo4.getcantidad_de_rojas();

        Equipo equipo5 = ingresarEquipo(sc, 5);
        total_tiros_de_esquina += equipo5.getcantidad_tiros_de_esquina();
        total_goles += equipo5.getcantidad_de_goles();
        total_amarillas += equipo5.getcantidad_de_amarillas();
        total_rojas += equipo5.getcantidad_de_rojas();

        mostrarDatosEquipo(equipo1);
        mostrarDatosEquipo(equipo2);
        mostrarDatosEquipo(equipo3);
        mostrarDatosEquipo(equipo4);
        mostrarDatosEquipo(equipo5);

        System.out.println("\nEstadísticas totales del torneo:");
        System.out.println("Total de tiros de esquina: " + total_tiros_de_esquina);
        System.out.println("Total de goles: " + total_goles);
        System.out.println("Total de tarjetas amarillas: " + total_amarillas);
        System.out.println("Total de tarjetas rojas: " + total_rojas);
    }

    private static Equipo ingresarEquipo(Scanner sc, int numeroEquipo)
    {
        System.out.println("Ingrese los datos para el equipo " + numeroEquipo + ":");

        System.out.print("Ingrese el nombre del equipo: ");
        String team = sc.nextLine();
        sc.nextLine();

        System.out.print("Ingrese el lugar en el torneo del equipo: ");
        int lugar_en_el_torneo = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese la cantidad de tiros de esquina del equipo: ");
        int cantidad_tiros_de_esquina = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese la cantidad de partidos ganados por el equipo: ");
        int cantidad_de_juegos_ganados = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese la cantidad de partidos perdidos por el equipo: ");
        int cantidad_de_juegos_perdidos = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese la cantidad de tiros a gol: ");
        int cantidad_tiros_de_tiros_a_gol = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese la cantidad de goles del equipo: ");
        int cantidad_de_goles = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese la cantidad de amarillas recibidas por el equipo: ");
        int cantidad_de_amarillas = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese la cantidad de rojas recibidas por el equipo: ");
        int cantidad_de_rojas = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese la cantidad de faltas que el equipo realizo: ");
        int cantidad_de_faltas = sc.nextInt();
        sc.nextLine();

        return new Equipo(team,lugar_en_el_torneo,cantidad_tiros_de_esquina,cantidad_de_juegos_ganados,cantidad_de_juegos_perdidos,cantidad_tiros_de_tiros_a_gol,cantidad_de_goles,cantidad_de_amarillas,cantidad_de_rojas,cantidad_de_faltas);
    }
    private static void mostrarDatosEquipo(Equipo equipo)
    {
        System.out.println("Nombre del equipo: " + equipo.getNombre());
        System.out.println("Lugar en el torneo: " + equipo.getlugar_en_el_torneo());
        System.out.println("Cantidad de tiros de esquina: " + equipo.getcantidad_tiros_de_esquina());
        System.out.println("Cantidad de juegos ganados: " + equipo.getcantidad_de_juegos_ganados());
        System.out.println("Cantidad de juegos perdidos: " + equipo.getcantidad_de_juegos_perdidos());
        System.out.println("Cantidad de tiros a gol: " + equipo.getcantidad_tiros_de_tiros_a_gol());
        System.out.println("Cantidad de goles: " + equipo.getcantidad_de_goles());
        System.out.println("Cantidad de tarjetas amarillas: " + equipo.getcantidad_de_amarillas());
        System.out.println("Cantidad de tarjetas rojas: " + equipo.getcantidad_de_rojas());
        System.out.println("Cantidad de faltas: " + equipo.getcantidad_de_faltas());
    }
}
