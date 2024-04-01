package factoryEjercicios;

import java.util.ArrayList;
import java.util.List;
import logica.Ejercicio;
import logica.Push;

/**
 *
 * @author Laura Santana
 */
public class EjerciciosPush {
    
    
    
    public List<Ejercicio> ejerciciosPush(){
            List<Ejercicio> listEjercicios = new ArrayList<>();
            
            Push ejerc1 = new Push ("Press de banca con barra",6,3,"press_banca_barra.png");
            Push ejerc2 = new Push ("press de hombro con mancuernas",6,3,"press-de-hombros-con-mancuernas.png");
            Push ejerc3 = new Push ("press de banca inclinado con mancuernas",7,3,"press-bancainclinada-macuernas.jpg");
            Push ejerc4 = new Push("Elevaciones laterales con mancuernas", 10, 3, "elevaciones-laterales-mancuernas.png");
            Push ejerc5 = new Push("Press francés para trícepes", 10, 2, "press-frances.png");
            Push ejerc6 = new Push("Elevaciones frontales con mancuernas", 2, 10, "elevaciones-frontales.png");
                   
            listEjercicios.add(ejerc1);
            listEjercicios.add(ejerc2);
            listEjercicios.add(ejerc3);
            listEjercicios.add(ejerc4);
            listEjercicios.add(ejerc5);
            listEjercicios.add(ejerc6);
                        
            return listEjercicios;
    }
}
