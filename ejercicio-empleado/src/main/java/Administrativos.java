public class Administrativos extends Empleados{
    long id;
    int horas;
    double precio;
    public Administrativos(long id, String nombre, String email) {
        super(id, nombre, email);
    }
}
