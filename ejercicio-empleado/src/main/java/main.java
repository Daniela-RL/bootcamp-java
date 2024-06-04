import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       List<Empleado>  empleadoList = new ArrayList<>();
       int numEmpleados = scanner.nextInt();

       for(int i = 0; i < numEmpleados; i++){
          System.out.println("Introduce Tipo de empleado: ");
          System.out.println("    1. Gerente");
          System.out.println("    2. Ingeniero");
          int tipo = scanner.nextInt();
          switch (tipo){
             case 1:
                // leer funciones
                 empleadoList.add(leerGerente(scanner));
                break;
             case 2:
                 // leer funciones
                 empleadoList.add(leerIngeniero(scanner));
             break;

              default:
                break;
          }

       }
       empleadoList.forEach((e) -> {
           e.descripcion();
           System.out.println("     Salario:  " + e.calcularSalario());
       });

      scanner.close();

   }

    static Gerente leerGerente(Scanner scanner){
        System.out.println(" Introduce el `id`, `nombre`, `email`, `bono`");
        String id = scanner.nextLine();
        String nombre = scanner.nextLine();
        String email = scanner.nextLine();
        int bono = scanner.nextInt();

        return new Gerente(id, nombre, email, bono);

    }

    static Ingeniero leerIngeniero(Scanner scanner){
        System.out.println(" Introduce el `id`, `nombre`, `email`, `precio/hora` y `horas trabajadas`" );
        String id = scanner.nextLine();
        String nombre = scanner.nextLine();
        String email = scanner.nextLine();
        double sueldoHoras = scanner.nextDouble();
        int horasTrabajadas = scanner.nextInt();

        return new Ingeniero(id, nombre, email, sueldoHoras, horasTrabajadas);

    }

    static Administrativo leerAdministrativo(Scanner scanner){
        String id = scanner.nextLine();
        String nombre = scanner.nextLine();
        String email = scanner.nextLine();
        double sueldoHoras = scanner.nextDouble();
        int horasTrabajadas = scanner.nextInt();

        return new Administrativo(id, nombre, email, sueldoHoras,horasTrabajadas);

    }

}
