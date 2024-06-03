public class Administrativos extends Empleados{
    long id;
    int horas;
    int precioHoras;

    public Administrativos(long id, String nombre, String email, int horas, int precioHoras) {
        super(id, nombre, email);
        this.horas = horas;
        this.precioHoras = precioHoras;
    }
}
