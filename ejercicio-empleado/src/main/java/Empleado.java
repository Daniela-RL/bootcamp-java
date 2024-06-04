public class Empleado {
    private long id;
    private String nombre;
    private String email;

    public Empleado(long id, String nombre, String email){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public void descricion(){
        System.out.println("Descripcion empleados:");

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}