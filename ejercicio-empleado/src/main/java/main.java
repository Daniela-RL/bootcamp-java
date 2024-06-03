import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Empleados empleados;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca tipo de empleado: ");
        String empleado = scanner.nextLine();

        switch (empleado){

            case "administrativo":
                System.out.println("Introduzca horas trabajadas del empleado administrador: ");
                int horas = scanner.nextInt();
                System.out.println("Introduzca el precio por hora de trabajo del empleado administrativo: ");
                int precioHoras = scanner.nextInt();
              //  empleados = new Administrativos(horas,precioHoras);
              //  System.out.println("El sueldo total es: " + empleados.calcularSalario(horas, precioHoras));
            break;
            case "gerente":
                System.out.println("Introduzca sueldo base del empleado gerente: ");
                int base = scanner.nextInt();
                System.out.println("Introduzca el bono que recibe el empleado gerente: ");
                int bono = scanner.nextInt();
                //System.out.println("El sueldo total es: " + empleados.calcularSalario(base, bono));
            break;
            case "ingeniero":
                System.out.println("Introduzca horas trabajadas del empleado ingeniero: ");
                 horas = scanner.nextInt();
                System.out.println("Introduzca el precio por hora de trabajo del empleado ingeniero: ");
                 precioHoras = scanner.nextInt();
                //System.out.println("El sueldo total es: " + empleados);
                break;
            default:
                System.out.println("Introduzca los datos correctamente.");
        }


    }

}
