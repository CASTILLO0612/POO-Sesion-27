public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a su salario Ingeniero");

        Empleado [] empleados = new Empleado[2];
        empleados[0]= new EmpleadoTiempoCompleto("Angel", "234-212U", 48000.00);
        empleados[1]= new EmpleadoMedioTiempo("Gustavo", "236-890U", 15.0, 20);

        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre()+ ", salario mensual: $"+empleado.calcularSalario());
        }
    }
}