public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected String email;

    public Empleado(String id, String nombre, String email){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public void descripcion(){
        System.out.println("El empleado " +  nombre + "tiene id " + id + " y el email " + email);

    }

    public abstract double calcularSalario();


}
