/**
 * Clase que representa a un desarrollador en un proyecto.
 */
public class Desarrollador {

    /**
     * Nombre del desarrollador.
     */
    private String nombre;

    /**
     * Rol del desarrollador ("Junior" o "Senior").
     */
    private String rol;

    /**
     * Cantidad de tareas asignadas al desarrollador.
     */
    private int cantidadTareas;

    /**
     * Arreglo de tareas asignadas al desarrollador.
     */
    private Tarea[] tareas;

    /**
     * Constructor que inicializa un desarrollador con su nombre y rol.
     * @param nombre El nombre del desarrollador.
     * @param rol El rol del desarrollador (debe ser "Junior" o "Senior").
     */
    public Desarrollador(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
        this.tareas = new Tarea[4]; // Máximo 4 tareas asignadas.
        this.cantidadTareas = 0;
    }

    /**
     * Obtiene el nombre del desarrollador.
     * @return El nombre del desarrollador.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene el rol del desarrollador.
     * @return El rol del desarrollador.
     */
    public String getRol(){
        return this.rol;
    }

    /**
     * Agrega una tarea al desarrollador si no ha alcanzado el límite de tareas.
     * @param tarea La tarea a agregar.
     * @return true si la tarea fue agregada exitosamente, false si el desarrollador ya tiene el máximo de tareas asignadas.
     */
    public boolean agregarTarea(Tarea tarea){
        if(cantidadTareas < tareas.length){
            tareas[cantidadTareas++] = tarea;
            return true;
        } else{
            return false;
        }
    }

    /**
     * Obtiene el arreglo de tareas asignadas al desarrollador.
     * @return Un arreglo de objetos de tipo Tarea.
     */
    public Tarea[] getTareas(){
        return tareas;
    }

    /**
     * Obtiene la cantidad de tareas asignadas al desarrollador.
     * @return La cantidad de tareas asignadas.
     */
    public int getCantidadTareas(){
        return cantidadTareas;
    }

    /**
     * Representación en cadena de un desarrollador, incluyendo su nombre, rol y cantidad de tareas asignadas.
     * @return Una cadena con la información del desarrollador.
     */
    @Override
    public String toString(){
        return "Desarrollador: " + nombre + ", rol: " + rol + ", tareas asignadas: " + cantidadTareas + "/" + tareas.length;
    }
}
