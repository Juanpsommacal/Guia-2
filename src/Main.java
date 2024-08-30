import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    private static ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do
        {
            System.out.println("\n---Menu de gestion de empleados---");
            System.out.println("1. Añadir nuevo empleado");
            System.out.println("2. Calcular pago de empleados");
            System.out.println("3. Salir");
            System.out.println("Elija una opcion... ");
            opcion = entrada.nextInt();
            entrada.nextLine();


            switch (opcion)
            {
                case 1:
                    do
                    {
                        System.out.println("1. Añadir empleado de tiempo completo");
                        System.out.println("2. Añadir empleado por hora");
                        System.out.println("3. Añadir empleado contratista");
                        System.out.println("4. Volver al menu anterior");
                        opcion = entrada.nextInt();
                        entrada.nextLine();

                        switch (opcion)
                        {
                            case 1:
                                listaEmpleados.add(crearEmpleadoTiempoCompleto(entrada));
                                break;

                            case 2:
                                listaEmpleados.add(crearEmpleadoPorHora(entrada));
                                break;

                            case 3:
                                listaEmpleados.add(crearEmpleadoContratista(entrada));
                                break;

                            case 4:
                                break;
                        }
                    }while(opcion != 4);
                case 2:
                {
                    System.out.println("\n--Listado de Empleados--");
                    for(Empleado listaEmpleados : listaEmpleados)
                    {
                        System.out.println("Empleado: " + listaEmpleados.getNombre() + " Salario: " + listaEmpleados.calcularPago());
                    }
                }
                case 3:
                    break;
            }
        }while (opcion != 4);



    }
    private static Empleado crearEmpleadoTiempoCompleto(Scanner entrada)
    {
        System.out.println("Ingrese el nombre del nuevo empleado: ");
        String nombre = entrada.next();
        System.out.println("Ingrese el Salario del empleado: ");
        double salario = entrada.nextDouble();

        Empleado empleado = new EmpleadoTiempoCompleto(nombre, salario);
        System.out.println("Empleado añadido con exito!");

        return empleado;
    }

    private static Empleado crearEmpleadoPorHora(Scanner entrada)
    {
        System.out.println("Ingrese el nombre del nuevo empleado: ");
        String nombre = entrada.next();
        System.out.println("Ingrese la tarifa por hora del empleado: ");
        double tarifaPorHora = entrada.nextDouble();
        double salario = 0;

        Empleado empleado = new EmpleadoPorHora(nombre, salario, tarifaPorHora);
        System.out.println("Empleado añadido con exito!");
        return empleado;
    }

    private static Empleado crearEmpleadoContratista(Scanner entrada)
    {
        System.out.println("Ingrese el nombre del nuevo empleado: ");
        String nombre = entrada.next();
        System.out.println("Ingrese la tarifa por hora del empleado: ");
        double tarifaPorHora = entrada.nextDouble();
        System.out.println("Ingrese la tarifa por proyecto del empleado: ");
        double tarifaPorProyecto = entrada.nextDouble();
        double salario = 0;

        Empleado empleado = new EmpleadoContratista(nombre, salario, tarifaPorHora, tarifaPorProyecto);
        System.out.println("Empleado añadido con exito!");

        return empleado;
    }
}

