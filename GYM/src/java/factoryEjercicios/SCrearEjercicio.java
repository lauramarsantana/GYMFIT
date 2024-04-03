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
    
    public List<List<Ejercicio>> crearEntrenamientoSemana(int dia_entrenamiento,String tipo){
        List<List<Ejercicio>> semana = new ArrayList<>();
        
        for (int i = 0; i < dia_entrenamiento; i++) {
            semana.add(crearRutinaxtipo(tipo));
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
