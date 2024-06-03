public class Gerentes extends Empleados{
    private long id;

    private int bono;
    private  int salarioBase;

    public Gerentes(long id, String nombre, String email, int bono, int salarioBase) {
        super(id, nombre,email);
        this.bono = bono;
        this.salarioBase = salarioBase;

    }
    public int calcularSalario(){
        int salario =  salarioBase + bono ;
        return salario;

    }
}
