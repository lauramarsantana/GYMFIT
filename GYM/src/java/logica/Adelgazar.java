package logica;

import factoryEjercicios.SCrearEjercicio;
import java.util.List;

/**
 *
 * @author Laura Santana
 */
public class Adelgazar implements Irutina {

    private List<List<Ejercicio>> ejercicios;
    private SCrearEjercicio factory;
        
    public Adelgazar(int dias_entrenamiento){
        factory = new SCrearEjercicio();
        ejercicios = factory.crearEntrenamientoSemana(dias_entrenamiento,"Adelgazar");
    }

      
    public void setEjercicios(List<List<Ejercicio>> pejercicios) {
        ejercicios = pejercicios;
    }
    
    
    public List<List<Ejercicio>> getEjercicios(){
        return ejercicios;
    }
    
}
