public class Gerente extends Empleado {
    private static final double salarioBase = 30000;
    private  double bono;

    public Gerente(String id, String nombre, String email, double bono){
        super(id, nombre, email);
        this.bono = bono;
    }

    @Override
    public double calcularSalario(){
        return salarioBase + bono;
    }

    @Override
    public void descripcion() {
        System.out.println("Gerente: ");
        super.descripcion();
    }






}