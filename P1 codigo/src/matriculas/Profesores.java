package matriculas;

public class Profesores {
    
    private String nombre;

    public Profesores(String nombre){
        this.nombre=nombre;
    }

    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre; 
    }

    public void agregarMatricula(Matriculas matriculas)
    {
        this.matriculas=matriculas;
    }

    public Matriculas mostrarMatricula()
    {
        return this.matriculas;
    }
}
