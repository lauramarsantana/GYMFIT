package logica;

/**
 *
 * @author Laura Santana
 */
public class Cardio extends Ejercicio{
    
    private String duracion;
    
    public Cardio(String nombreEjercicio,String duracion, String foto) {
        super(nombreEjercicio, foto);    
        this.duracion = duracion;
    }
    
    public String getDuracion(){
        return duracion;
    }
    
}
