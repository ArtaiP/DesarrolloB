package desarrollob;

/**
 *
 * @author Artai
 */
public abstract class ExamenTest extends Examen {
    
    private Integer numPreguntas;
    private Boolean resta;

    
    public ExamenTest(Integer numPreguntas, Boolean resta, String asignatura) {
        super(asignatura);
        this.numPreguntas = numPreguntas;
        this.resta = resta;
    }
 
    
    public void Hacer(){
        System.out.println("Haciendo pregunta x del examen de la asignatua <nombre>");
    }

    public Integer getNumPreguntas() {
        return numPreguntas;
    }

    public Boolean getResta() {
        return resta;
    }
    
}
