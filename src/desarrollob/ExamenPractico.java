package desarrollob;

/**
 *
 * @author Artai
 */
public abstract class ExamenPractico extends Examen {

    public ExamenPractico(String asignatura, int minutos) {
        super(asignatura, minutos);
    }

    
    public void hacer(){
            System.out.println("Haciendo el examen practico de la asignatura"+this.asignatura);
        }
    
}
    

