package desarrollob;

/**
 *
 * @author Artai
 */
public class PartidoFutbol {
 
    private Integer categoria;
    private Boolean prorroga;
    private Boolean penaltis;
    private Integer energiaNecesaria;

    public PartidoFutbol(Integer categoria, Integer energiaNecesaria) {
        this.categoria = categoria;
        this.energiaNecesaria = energiaNecesaria;
    }
    

    public PartidoFutbol(Integer categoria, Boolean prorroga, Boolean penaltis, Integer energiaNecesaria) {
        this.categoria = categoria;
        this.prorroga = prorroga;
        this.penaltis = penaltis;
        this.energiaNecesaria = energiaNecesaria;
    }
    
    
    public PartidoFutbol(int categoria) {
        if (categoria >= 1 && categoria <= 7) {
            this.categoria = categoria;
        } else {
            this.categoria = 1;
        }
        this.prorroga = false;
        this.penaltis = false;
    }
    
    
    switch (this.categoria * 40){
        case 1:
            this.energiaNecesaria * 0.15;
        case 2:  
            this.energiaNecesaria * 0.15 + 0.05;
        break:          
        
    }
    
            
    public void hacer(){
            
        String mensaje = "Jugando partido de categoria " + this.categoria;
        if (this.prorroga) {
            mensaje += " con prorroga";
        }
        if (this.penaltis) {
            mensaje += " y penaltis";
        }
        System.out.println(mensaje);
    }
    

    public Integer getCategoria() {
        return categoria;
    }

    public Boolean getProrroga() {
        return prorroga;
    }

    public void setProrroga(Boolean prorroga) {
        this.prorroga = prorroga;
    }
    

    public Boolean getPenaltis() {
        return penaltis;
    }

    public void setPenaltis(Boolean penaltis) {
        this.penaltis = penaltis;
    }
    

    public Integer getEnergiaNecesaria() {
        return energiaNecesaria;
    }


    
    
    
}
