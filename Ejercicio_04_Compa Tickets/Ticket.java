import java.text.SimpleDateFormat;
import java.util.Date;

class Ticket 
{
    private String numeroTicket;
    private Date fechaCompra;
    private Localidad localidad;
    
    public Ticket(int codigo, Date fechaCompra, Localidad localidad){
        this.numeroTicket = generarNumeroTicket(fechaCompra, codigo);
        this.fechaCompra = fechaCompra;
        this.localidad = localidad;
    }
    public String generarNumeroTicket(Date fecha, int codigo){
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
        String fechaFormateada = formatter.format(fecha);
        return fechaFormateada + codigo; 
    }
    public void setnumeroTicket(String numeroTicket){
        this.numeroTicket = numeroTicket;
    }
    public String getnumeroTicket(){
        return this.numeroTicket;
    }
    public Date getfechaCompra(){
        return fechaCompra;
    }
    public Localidad getlocalidad(){
        return localidad;
    }
}
