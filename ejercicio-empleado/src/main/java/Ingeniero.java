public class Ingeniero extends Empleado {
    private long id;
    private int horas;
    private int precioHoras;

    public Ingeniero(long idEmpleado, String nombre, String email, long id, int horas, int precioHoras){
        super(idEmpleado, nombre, email);
        this.id = id;
        this.horas = horas;
        this.precioHoras = precioHoras;

    }

    public int calcularSalario(int horas, int precioHoras){
        int salario =  horas * precioHoras;
       return salario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getPrecioHoras() {
        return precioHoras;
    }

    public void setPrecioHoras(int precioHoras) {
        this.precioHoras = precioHoras;
    }
}
