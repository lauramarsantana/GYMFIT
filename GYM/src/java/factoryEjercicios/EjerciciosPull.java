package factoryEjercicios;

import java.util.ArrayList;
import java.util.List;
import logica.Ejercicio;
import logica.Pull;

/**
 *
 * @author Laura Santana
 */
public class EjerciciosPull {
    
    public List<Ejercicio> ejerciciosPull(){
        List<Ejercicio> ejercicioPull = new ArrayList<>();
        
        Pull pull1 = new Pull("Remo al pecho en maquina", 3, 7, "remo-pecho-maquina.png");
        Pull pull2 = new Pull("Dominadas estrictas", 3, 11, "dominadas.png");
        Pull pull3 = new Pull("Remo con mancuerna en banco", 3, 10, "remo-mancuerna-banco.png");
        Pull pull4 = new Pull("Face pulls", 2, 12, "face-pulls.jpeg");
        Pull pull5 = new Pull("Curl de bíceps alterno con mancuernas", 3, 20, "curl-bicep-mancuerna.jpeg");
        Pull pull6 = new Pull("Curl de bíceps en banco Scott con barra z", 3, 8, "curl-bicep-barraz.png");
        
        ejercicioPull.add(pull1);
        ejercicioPull.add(pull2);
        ejercicioPull.add(pull3);
        ejercicioPull.add(pull4);
        ejercicioPull.add(pull5);
        ejercicioPull.add(pull6);
        
        return ejercicioPull;
    }
}
