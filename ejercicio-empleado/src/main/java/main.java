import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       List<Empleado>  empleadoList = new ArrayList<>();
       Ingeniero ingeniero= null;


          System.out.println("Introduce Tipo de empleado: ");
          String nombreEmpleado = scanner.nextLine();







       //empleado.setNombre(nombreEmpleado);

       System.out.println("Introduce horas");
       int horas = scanner.nextInt();
       ingeniero.setHoras(horas);


       System.out.println("Introduce precio a pagar por hora: ");
       int precioHoras = scanner.nextInt();
       ingeniero.setPrecioHoras(precioHoras);

        System.out.println("Salario del ingeniero por horas es: " + ingeniero.calcularSalario(horas, precioHoras));

       System.out.println("Introduce importe del bono: ");
       int bono = scanner.nextInt();

        //List<Empleado> empleadoList = null;
        //empleadoList.add(nombreEmpleado,horas, precioHoras, bono);






    }

}
