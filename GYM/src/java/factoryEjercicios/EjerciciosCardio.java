package factoryEjercicios;

import java.util.ArrayList;
import java.util.List;
import logica.Cardio;
import logica.Ejercicio;

/**
 *
 * @author Laura Santana
 */
public class EjerciciosCardio {
    
    public List<Ejercicio> ejerciciosCardio(){
        List<Ejercicio> ejercicios = new ArrayList<>();
        Cardio cardio1 = new Cardio("Jumping jacks","5 min","jumping-jacks.jpeg");
        Cardio cardio2 = new Cardio("Sentadillas", "5 min", "sentadillas.png");
        Cardio cardio3 = new Cardio("Fondos", "2 min", "fondos.png");
        Cardio cardio4 = new Cardio("Saltar la cuerda", "3 min", "saltar-cuerda.png");
        Cardio cardio5 = new Cardio("Plancha", "40 s", "plancha.png");
        
        ejercicios.add(cardio1);
        ejercicios.add(cardio2);
        ejercicios.add(cardio3);
        ejercicios.add(cardio4);
        ejercicios.add(cardio5);
        
        return ejercicios;    
    }
}
