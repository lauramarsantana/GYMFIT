package logica;

/**
 *
 * @author Laura Santana
 */
public class Usuario {
    private String nombre;
    private Irutina rutina;
    private int dia_entrenamiento;
    
    
    public Usuario(){}
    public Usuario(String nombre){
        this.nombre = nombre;
    }
    public Usuario(String nombre, int dia_entrenamiento,Irutina rutina){
        this.nombre = nombre;
        this.dia_entrenamiento = dia_entrenamiento;
        this.rutina = rutina;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", rutina=" + rutina + ", dia_entrenamiento=" + dia_entrenamiento + '}';
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRutina(Irutina rutina){
        this.rutina = rutina;
    }
    
    public String getNombre(){
        return nombre;
    }
    public Irutina getRutina(){
        return rutina;
    }
    public int getDia() {
        return dia_entrenamiento;
    }
}
