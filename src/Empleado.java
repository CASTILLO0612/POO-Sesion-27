abstract public class Empleado {

    private String nombre;
    private String numIdentificacion;

public Empleado(String nombre, String numIdentificacion){
    this.nombre=nombre;
    this.numIdentificacion=numIdentificacion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getnumIdentificacion(){
        return numIdentificacion;
    }
    public abstract double calcularSalario();
}