package factoryEjercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import logica.Ejercicio;

/**
 *
 * @author Laura Santana
 */
public class SCrearEjercicio {
    
    private EjerciciosPush ejerciciosPush;
    private EjerciciosCardio ejerciciosCardio;
    private EjerciciosPull ejerciciosPull;
    
    public SCrearEjercicio(){
        ejerciciosPush = new EjerciciosPush();
        ejerciciosCardio = new EjerciciosCardio();
        ejerciciosPull = new EjerciciosPull();
    }
    
    /**
     * Este método nos genera una lista de ejercicios teniendo en cuenta el nombre de la rutina 
     * @param tipo tipo requerido para comparar el string con lo que ingresa el usuario
     * @return retorna una lista de ejercicios de cada tipo
    **/
    public List<Ejercicio>  crearRutinaxtipo(String tipo){
        List<Ejercicio> nueva = new ArrayList<>();
        if(tipo.equals("Adelgazar")){
            for (int i = 0; i < 2; i++) {
                nueva.add(getEjercicioRandom(ejerciciosCardio.ejerciciosCardio()));
                nueva.add(getEjercicioRandom(ejerciciosPush.ejerciciosPush()));
            }
        }
        else if(tipo.equals("Tonificar")){
            for (int i=0; i<2; i++){
                nueva.add(getEjercicioRandom(ejerciciosCardio.ejerciciosCardio()));
                nueva.add(getEjercicioRandom(ejerciciosPull.ejerciciosPull()));
                nueva.add(getEjercicioRandom(ejerciciosPush.ejerciciosPush()));
            }
        }
        return nueva;
    }
    
    public List<List<Ejercicio>> crearEntrenamientoSemana(int dias_entrenamiento, String tipo) {
        List<List<Ejercicio>> semana = new ArrayList<>();
        Random random = new Random();
        
        // Agregar rutina de 3 días con un día para cada tipo de ejercicio
        for (int i = 0; i < 3; i++) {
            semana.add(crearRutinaxtipo(tipo));
        }
        
        // Si el usuario especifica más de 3 días, repetir los ejercicios de los primeros 3 días
        if (dias_entrenamiento > 3) {
            for (int i = 3; i < dias_entrenamiento; i++) {
                semana.add(semana.get(random.nextInt(3))); // Repetir rutina de 3 días
            }
        }
        
        return semana;
    }

    
    public Ejercicio getEjercicioRandom(List<Ejercicio> pEjercicios){
        Random random = new Random();
        Ejercicio aux;
        aux =  pEjercicios.get(random.nextInt(pEjercicios.size()));
        return aux;
    }
    
}
