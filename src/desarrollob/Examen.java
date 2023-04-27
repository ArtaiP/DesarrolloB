package desarrollob;

/**
 *
 * @author Artai
 */
public abstract class Examen  {

    protected String asignatura;
    protected Integer minutos;
    protected Integer energiaNecesaria;


    public Examen(String asignatura) {
        this.asignatura = asignatura;
    }
    
    
 
    public Examen(String asignatura,  int minutos) {
        this.asignatura = asignatura;
        this.minutos = minutos;
    }


    public Examen(String asignatura, Integer energiaNecesaria) {
        this.asignatura = asignatura;
        this.energiaNecesaria = energiaNecesaria;
    }
    
    
    
    public abstract void  Hacer();
    
    
    public int getEnergia() {
        return this.energiaNecesaria;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public int getMinutos() {
        return minutos;
    }

    public Integer getEnergiaNecesaria() {
        return energiaNecesaria;
    }
      
    
}
