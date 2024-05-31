public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, String numIdentificacion, double salarioAnual) {
        super(nombre, numIdentificacion);
        this. salarioAnual = salarioAnual;
    }

    @Override
    public double calcularSalario(){
        return salarioAnual/12;
    }
}