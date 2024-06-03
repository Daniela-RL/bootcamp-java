public class Empleados {
    private long id;
    private String nombre;
    private String email;

    public Empleados() {

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

    public Empleados(long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public void descricion(){
        System.out.println("Descripcion empleados:");

    }

    public void calcularSalario(double horas){
        double precioHora = 15;
        double salario =  horas * precioHora;
        System.out.println(" salario es: "+ salario);

    }
}
