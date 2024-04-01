package logica;

import factoryEjercicios.SCrearEjercicio;
import java.util.List;

/**
 *
 * @author Laura Santana
 */
public class Tonificar implements Irutina{

    private List<List<Ejercicio>> ejercicios;
    private SCrearEjercicio factory;
    
    public Tonificar(int dias_entrenamiento){
        factory = new SCrearEjercicio();
        ejercicios = factory.crearEntrenamientoSemana(dias_entrenamiento, this.getClass().getSimpleName());
    }
    
    @Override
    public List<List<Ejercicio>> getEjercicios() {
        return ejercicios;
    }
    
    
    
}
