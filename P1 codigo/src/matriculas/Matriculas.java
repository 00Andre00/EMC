package matriculas;

public class Matriculas{

    private String nombre;
    private String curso1;
    private String curso2;
    private String curso3;
     
    public Matriculas(String nombre,String curso1,String curso2,String curso3){
        this.nombre=nombre;
        this.curso1=curso1;
        this.curso2=curso2;
        this.curso3=curso3;
    }

    public String getnombre(){
        return nombre;
    }
    public String getcurso1(){
        return curso1;
    }
    public String getcurso2(){
        return curso2;
    }
    public String getcurso3(){
        return curso3;
    }
    public void setnombre(String nombre){
        this.nombre=nombre; 
    }
    public void setcurso1(String curso1){
        this.curso1=curso1; 
    }
    public void setcurso2(String curso2){
        this.curso2=curso2; 
    }
    public void setcurso3(String curso3){
        this.curso3=curso3; 
    }

}


