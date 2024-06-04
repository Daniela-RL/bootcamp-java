public class Administrativo extends Empleado {
    long idAdmin;
    int horas;
    int precioHoras;

    public Administrativo(long idEmpleado, String nombre, String email, long idAdmin, int horas, int precioHoras ){
        super(idEmpleado, nombre, email);
        this.idAdmin = idAdmin;
        this.horas = horas;
        this.precioHoras = precioHoras;
    }


}
