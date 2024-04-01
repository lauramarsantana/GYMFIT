package logica;

/**
 *
 * @author Laura Santana
 */
public class Pull extends Ejercicio{
    private int serie;
    private int repeticion;

    public Pull(String nombreEjercicio,int serie, int repeticion, String foto) {
        super(nombreEjercicio, foto);
        this.serie = serie;
        this.repeticion = repeticion;
    }
    
    public int getSerie(){
        return serie;
    }
    public int getRepeticion(){
        return repeticion;
       }
}
