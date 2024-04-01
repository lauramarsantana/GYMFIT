package logica;

/**
 *
 * @author Laura Santana
 */
public class Push extends Ejercicio{
    
    private int serie;
    private int repeticion;
    
    public Push(String nombreEjercicio, int serie, int repeticion, String foto) {
        super(nombreEjercicio, foto);
        this.serie = serie;
        this.repeticion = repeticion;
    }
    
    public int getSerie(){
        return this.serie;
    }
    public int getRepeticion(){
        return this.repeticion;
    }
}
