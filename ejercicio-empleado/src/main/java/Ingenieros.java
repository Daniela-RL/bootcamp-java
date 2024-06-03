public class Ingenieros extends Empleados{
    private long id;
    private int horas;

    public Ingenieros(long id, String nombre, String email) {
        super(id, nombre, email);
    }

    public void calcularSalario(int horas){
        double precioHora = 18;
        double salario =  horas * precioHora;
        System.out.println(" salario es: "+ salario);

    }
}
