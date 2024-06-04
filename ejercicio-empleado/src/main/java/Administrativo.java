public class Administrativo extends Empleado {

    private int horasTrabajadas;
    private double precioHoras;

    public Administrativo(String id, String nombre, String email, double precioHoras, int horasTrabajadas  ){
        super(id, nombre, email);
        this.horasTrabajadas = horasTrabajadas;
        this.precioHoras = precioHoras;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * precioHoras;
    }


}
