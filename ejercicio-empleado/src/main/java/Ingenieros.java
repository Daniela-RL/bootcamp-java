public class Ingenieros extends Empleados{
    private long id;
    private int horas;
    private int precioHoras;

    public Ingenieros(long id, String nombre, String email, int horas, int precioHoras) {
        super(id, nombre, email);
        this.horas = horas;
        this.precioHoras = precioHoras;
    }

    public int calcularSalario(int horas, int precioHoras){
        int salario =  horas * precioHoras;
       return salario;
    }
}
