public class Gerente extends Empleado {
    private long id;

    private int bono;
    private  int salarioBase;

    public Gerente(long idEmpleado, String nombre, String email, long id, int bono, int salarioBase){
        super(idEmpleado, nombre, email);
        this.id = id;
        this.bono = bono;
        this.salarioBase = salarioBase;
    }

}
