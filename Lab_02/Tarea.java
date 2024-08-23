/**
 * Clase que representa una tarea en un proyecto.
 */
public class Tarea {

    /**
     * Nombre de la tarea.
     */
    private String nombre;

    /**
     * Tipo de la tarea (Desarrollo, Prueba o Documentación).
     */
    private String tipo;

    /**
     * Estado actual de la tarea (No iniciado, en progreso, completada).
     */
    private String estado;

    /**
     * Cantidad de horas estimadas para completar la tarea.
     */
    private int horasEstimadas;

    /**
     * Cantidad de horas reales empleadas en la tarea.
     */
    private int horasReales;

    /**
     * Desarrollador asignado a la tarea.
     */
    private Desarrollador desarrolladorAsignado;

    /**
     * Constructor que inicializa una tarea con su nombre, tipo, horas estimadas y desarrollador asignado.
     * @param nombre El nombre de la tarea.
     * @param tipo El tipo de la tarea (Desarrollo, Prueba o Documentación).
     * @param horasEstimadas La cantidad de horas estimadas para completar la tarea.
     * @param desarrolladorAsignado El desarrollador asignado a la tarea.
     */
    public Tarea(String nombre, String tipo, int horasEstimadas, Desarrollador desarrolladorAsignado){
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = "no iniciada";
        this.horasEstimadas = horasEstimadas;
        this.horasReales = 0;
        this.desarrolladorAsignado = desarrolladorAsignado; 
    }

    /**
     * Establece el nombre de la tarea.
     * @param nombre El nuevo nombre de la tarea.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de la tarea.
     * @return El nombre de la tarea.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene el tipo de la tarea.
     * @return El tipo de la tarea.
     */
    public String getTipo(){
        return this.tipo;
    }

    /**
     * Obtiene el estado actual de la tarea.
     * @return El estado de la tarea.
     */
    public String getEstado(){
        return this.estado;
    }

    /**
     * Obtiene la cantidad de horas estimadas para completar la tarea.
     * @return La cantidad de horas estimadas.
     */
    public int getHorasEstimadas(){
        return this.horasEstimadas;
    }

    /**
     * Obtiene la cantidad de horas reales empleadas en la tarea.
     * @return La cantidad de horas reales.
     */
    public int getHorasReales(){
        return this.horasReales;
    }

    /**
     * Obtiene el desarrollador asignado a la tarea.
     * @return El desarrollador asignado.
     */
    public Desarrollador getDesarrolladorAsignado(){
        return desarrolladorAsignado;
    }

    /**
     * Actualiza el estado de la tarea.
     * @param nuevoEstado El nuevo estado de la tarea (No iniciado, En progreso, Completada).
     */
    public void actualizarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
    }

    /**
     * Registra las horas reales trabajadas en la tarea.
     * @param horas La cantidad de horas reales trabajadas.
     */
    public void registrarHoras(int horas){
        this.horasReales = horas;
    }

    /**
     * Representación en cadena de una tarea, incluyendo su nombre, tipo, estado, horas estimadas, horas reales y desarrollador asignado.
     * @return Una cadena con la información de la tarea.
     */
    @Override
    public String toString (){
        return "Tarea: " + nombre + ", tipo: " + tipo + ", estado: " + estado + ", horas estimadas: " + horasEstimadas + ", horas reales: " + horasReales + ", desarrollador a cargo: " + desarrolladorAsignado.getNombre();
    }
}
