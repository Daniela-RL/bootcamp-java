public class Ingeniero extends Empleado {

    private double sueldoHoras;
    private int horasTrabajadas;

    public Ingeniero(String id, String nombre, String email, double sueldoHoras, int horasTrabajadas){
        super(id, nombre, email);
        this.sueldoHoras = sueldoHoras;
        this.horasTrabajadas = horasTrabajadas;

    }
    @Override
    public double calcularSalario() {
        return  sueldoHoras * horasTrabajadas;
    }
    @Override
    public void descripcion(){
        System.out.println("El ingeniero " + nombre + "tiene id " + id + " y el email " + email);
    }
}
