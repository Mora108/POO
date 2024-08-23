/**
 * Clase que representa un proyecto en una empresa de software.
 */
public class Proyecto {

    /**
     * Nombre del proyecto.
     */
    private String nombre;

    /**
     * Desarrollador Junior asignado al proyecto.
     */
    private Desarrollador Junior;

    /**
     * Desarrollador Senior asignado al proyecto.
     */
    private Desarrollador Senior;

    /**
     * Fecha límite del proyecto.
     */
    private String fechaLimite;

    /**
     * Arreglo que almacena las tareas del proyecto.
     */
    private Tarea[] tareas;

    /**
     * Cantidad de tareas actualmente asignadas al proyecto.
     */
    private int cantidadTareas;

    /**
     * Constructor que inicializa un proyecto con su nombre, desarrolladores y fecha límite.
     * @param nombre El nombre del proyecto.
     * @param junior El desarrollador Junior asignado al proyecto.
     * @param senior El desarrollador Senior asignado al proyecto.
     * @param fechaLimite La fecha límite para la finalización del proyecto.
     */
    public Proyecto(String nombre, Desarrollador junior, Desarrollador senior, String fechaLimite){
        this.nombre = nombre;
        this.Junior = junior;
        this.Senior = senior;
        this.fechaLimite = fechaLimite;
        this.tareas = new Tarea[10]; // Máximo 10 tareas asignadas al proyecto.
        this.cantidadTareas = 0;
    }

    /**
     * Obtiene el nombre del proyecto.
     * @return El nombre del proyecto.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene la fecha límite del proyecto.
     * @return La fecha límite del proyecto.
     */
    public String getFechaLimite(){
        return this.fechaLimite;
    }

    /**
     * Obtiene el desarrollador Junior asignado al proyecto.
     * @return El desarrollador Junior.
     */
    public Desarrollador getJunior(){
        return this.Junior;
    }

    /**
     * Obtiene el desarrollador Senior asignado al proyecto.
     * @return El desarrollador Senior.
     */
    public Desarrollador getSenior(){
        return this.Senior;
    }

    /**
     * Agrega una tarea al proyecto si hay espacio disponible y si puede ser asignada a un desarrollador.
     * @param tarea La tarea a agregar.
     * @return true si la tarea fue agregada exitosamente, false si no se pudo agregar (debido a que el desarrollador tiene demasiadas tareas o el proyecto ha alcanzado su límite de tareas).
     */
    public boolean agregarTarea(Tarea tarea){
        if (cantidadTareas < tareas.length){
            boolean asignada = tarea.getDesarrolladorAsignado().agregarTarea(tarea);
            if (asignada){
                tareas[cantidadTareas++] = tarea;
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene el arreglo de tareas del proyecto.
     * @return Un arreglo de objetos de tipo Tarea.
     */
    public Tarea[] getTareas(){
        return tareas;
    }

    /**
     * Obtiene la cantidad de tareas asignadas al proyecto.
     * @return La cantidad de tareas asignadas al proyecto.
     */
    public int getCantidadTareas(){
        return cantidadTareas;
    }
}
