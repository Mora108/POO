import java.util.Scanner;

/**
 * Clase principal que maneja el sistema de gestión de proyectos.
 */
public class Main {

    /**
     * Arreglo que almacena los proyectos.
     */
    public static Proyecto[] proyectos = new Proyecto[3]; 

    /**
     * Método principal que inicia el programa.
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        iniciarProyecto(); // Inicializa los proyectos.
        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        // Bucle principal del programa.
        while(!salir){
            System.out.println("Bienvenido al manejador de proyectos");
            System.out.println("Por favor elija un proyecto");
            for(int i = 0; i < proyectos.length; i++){
                System.out.println((i+1) + ". " + proyectos[i].getNombre());
            }
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción: ");
            int opcion = sc.nextInt();

            if(opcion == 4){
                salir = true;
                System.out.println("Gracias por utilizar el manejador de proyectos.");
            } else if (opcion > 0 && opcion <= proyectos.length){
                Proyecto proyectoSeleccionado = proyectos[opcion-1];
                boolean regresar = false;
                
                while (!regresar){
                    System.out.println("Gestión del proyecto: " + proyectoSeleccionado.getNombre());
                    System.out.println("1. Crear tarea.");
                    System.out.println("2. Actualizar estado de tarea.");
                    System.out.println("3. Actualizar horas trabajadas en una tarea.");
                    System.out.println("4. Generar reporte del proyecto.");
                    System.out.println("5. Ver tareas de un desarrollador.");
                    System.out.println("6. Regresar al menú de proyectos.");
                    int opcion2 = sc.nextInt();

                    switch(opcion2){

                        // Caso para crear una nueva tarea y asignarla a un desarrollador.
                        case 1:
                            System.out.println("Nombre de la tarea: ");
                            sc.nextLine();
                            String nombreTarea = sc.nextLine();
                            System.out.println("Tipo de tarea (Desarrollo, pruebas o documentación): ");
                            String tipoTarea = sc.nextLine();
                            System.out.println("Horas estimadas: ");
                            int horasEstimadas = sc.nextInt();
                            System.out.println("Asignar tarea a(1 o 2): ");
                            System.out.println("1. " + proyectoSeleccionado.getJunior().getNombre());
                            System.out.println("2. " + proyectoSeleccionado.getSenior().getNombre());
                            int opcionDesarrollador = sc.nextInt();

                            Desarrollador asignado = (opcionDesarrollador == 1) ? proyectoSeleccionado.getJunior() : proyectoSeleccionado.getSenior();

                            Tarea tarea = new Tarea(nombreTarea, tipoTarea, horasEstimadas, asignado);
                            if (proyectoSeleccionado.agregarTarea(tarea)){
                                System.out.println("Tarea creada y asignada con exito!");
                            } else {
                                System.out.println("La tarea no pudo ser asignada, verifique la cantidad de tareas que el desarrollador tiene asignadas");
                            }
                            break;

                        // Caso para actualizar el estado de una tarea existente.
                        case 2:
                            System.out.println("Nombre de la tarea: ");
                            System.out.println("Tareas disponibles en el proyecto:");
                            Tarea[] tareas = proyectoSeleccionado.getTareas();
                            for (int i = 0; i < proyectoSeleccionado.getCantidadTareas(); i++) {
                                System.out.println((i + 1) + ". " + tareas[i].getNombre() + " - Estado: " + tareas[i].getEstado());
                            }

                            System.out.println("Seleccione el número de la tarea que desea actualizar:");
                            int numeroTarea = sc.nextInt();
                            if (numeroTarea > 0 && numeroTarea <= proyectoSeleccionado.getCantidadTareas()) {
                                Tarea tareaSeleccionada = tareas[numeroTarea - 1];

                                System.out.println("Ingrese el nuevo estado de la tarea (No iniciada, En progreso, Completada):");
                                sc.nextLine(); // Consumir la nueva línea
                                String nuevoEstado = sc.nextLine();

                                tareaSeleccionada.actualizarEstado(nuevoEstado);
                                System.out.println("Estado de la tarea '" + tareaSeleccionada.getNombre() + "' actualizado con éxito a '" + nuevoEstado + "'.");
                            } else {
                                System.out.println("Número de tarea inválido.");
                            }
                            break;
                        
                        // Caso para actualizar las horas reales trabajadas en una tarea.
                        case 3:
                            System.out.println("Tareas disponibles en el proyecto:");
                            Tarea[] tareasParaActualizarHoras = proyectoSeleccionado.getTareas();
                            for (int i = 0; i < proyectoSeleccionado.getCantidadTareas(); i++) {
                                System.out.println((i + 1) + ". " + tareasParaActualizarHoras[i].getNombre() + " - Horas Estimadas: " + tareasParaActualizarHoras[i].getHorasEstimadas() + ", Horas Reales: " + tareasParaActualizarHoras[i].getHorasReales());
                            }

                            System.out.println("Seleccione el número de la tarea para actualizar horas reales:");
                            int numeroTareaHoras = sc.nextInt();
                            if (numeroTareaHoras > 0 && numeroTareaHoras <= proyectoSeleccionado.getCantidadTareas()) {
                                Tarea tareaSeleccionadaHoras = tareasParaActualizarHoras[numeroTareaHoras - 1];

                                System.out.println("Ingrese las horas reales trabajadas en la tarea:");
                                int horasReales = sc.nextInt();

                                tareaSeleccionadaHoras.registrarHoras(horasReales);
                                System.out.println("Horas reales de la tarea '" + tareaSeleccionadaHoras.getNombre() + "' actualizadas con éxito a " + horasReales + " horas.");
                            } else {
                                System.out.println("Número de tarea inválido.");
                            }
                            break;

                        // Caso para generar un reporte del proyecto, mostrando todas las tareas.
                        case 4:
                            System.out.println("Reporte del proyecto: " + proyectoSeleccionado.getNombre());
                            Tarea[] tareasReporte = proyectoSeleccionado.getTareas();
                            for(int i = 0; i < proyectoSeleccionado.getCantidadTareas(); i++){
                                System.out.println(tareasReporte[i]);
                            }
                            break;
                        
                        // Caso para ver las tareas asignadas a un desarrollador específico.
                        case 5:
                            System.out.println("Seleccione un desarrollador: ");
                            System.out.println("1. " + proyectoSeleccionado.getJunior().getNombre());
                            System.out.println("2. " + proyectoSeleccionado.getSenior().getNombre());
                            int opcionVerTareas = sc.nextInt();

                            Desarrollador desarrollador = (opcionVerTareas == 1) ? proyectoSeleccionado.getJunior() : proyectoSeleccionado.getSenior();
                            System.out.println("Tareas de: " + desarrollador.getNombre());
                            for (int i = 0; i < desarrollador.getCantidadTareas(); i++) {
                                System.out.println(desarrollador.getTareas()[i]);
                            }
                            break;

                        // Caso para regresar al menú de selección de proyectos.
                        case 6:
                            regresar = true;
                            break;
                        
                        // Caso por defecto para manejar opciones inválidas.
                        default:
                            System.out.println("Opción invalida. Intentelo de nuevo.");
                            break;
                    }
                }
            } else {
                System.out.println("Opción invalida. Intentelo de nuevo.");
            }
        }
        sc.close();
    }

    /**
     * Método que inicializa los proyectos con datos predeterminados.
     */
    private static void iniciarProyecto(){
        Desarrollador junior1 = new Desarrollador("Sebastián", "Junior");
        Desarrollador Senior1 = new Desarrollador("Alfredo", "Senior");

        Desarrollador junior2 = new Desarrollador("Guillermo", "Junior");
        Desarrollador Senior2 = new Desarrollador("Daniela", "Senior");

        Desarrollador junior3 = new Desarrollador("Daniel", "Junior");
        Desarrollador Senior3 = new Desarrollador("Luis", "Senior");

        proyectos[0] = new Proyecto("Proyecto 1", junior1, Senior1, "31 de Agosto");
        proyectos[1] = new Proyecto("Proyecto 2", junior2, Senior2, "15 de Septiembre");
        proyectos[2] = new Proyecto("Proyecto 3", junior3, Senior3, "24 de Diciembre");
    }
}