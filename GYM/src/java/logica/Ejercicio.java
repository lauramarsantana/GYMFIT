package logica;

/**
 *
 * @author Laura Santana
 */
public class Ejercicio {
    private String nombreEjercicio;
    private String foto;
    
    public Ejercicio(String nombreEjercicio, String foto){
        this.nombreEjercicio = nombreEjercicio;
        this.foto = foto;
    }
    
    
    public String getNombreEjercicio(){
        return nombreEjercicio;
    }

    public String getFoto(){
        return foto;
    }
        
    public void setNombreEjercicio(String pNombreEjercicio){
        nombreEjercicio = pNombreEjercicio;
    }
    public void setFoto(String foto){
        this.foto = foto;
    }
}
