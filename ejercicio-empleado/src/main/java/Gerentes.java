public class Gerentes extends Empleados{
    private long id;

    private double bono;
    private  double precio;

    public Gerentes(long id, String nombre, String email) {
        super(id, nombre, email);
    }
    public void calcularSalario(double salarioBase){
        double bono = 2200;
        double salario =  salarioBase + bono / 12;
        System.out.println(" salario es: "+ salario);

    }
}
