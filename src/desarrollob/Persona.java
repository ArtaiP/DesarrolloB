package desarrollob;

/**
 *
 * @author Artai
 */
public class Persona {
    
    private String nombre;
    private Double capacidadVejiga;
    private Double estadoVejiga;
    private Integer energiaActual;

    public Persona() {
        this.nombre = nombre;
        this.capacidadVejiga = 100.0;
    }
    

    public Persona(String nombre, Double capacidadVejiga, Double estadoVejiga, Integer energiaActual) {
        this.nombre = nombre;
        this.capacidadVejiga = capacidadVejiga;
        this.estadoVejiga = estadoVejiga;
        this.energiaActual = energiaActual;
    }
    
    
    public void addTarea(){
        
    }
    
    public Integer hacerTarea(){
        
        return 0;
        
    }
    
    public void vaciarVejiga(double vaciarVejiga){
        vaciarVejiga = 0.0;
    }
    
    public Double beber(){
        
        return null;
        
    }
    
    
}
