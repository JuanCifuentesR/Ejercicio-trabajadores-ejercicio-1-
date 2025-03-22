import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean play = true;

        List<Empleados> empleadosList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("""
                               ¡Bienvenido!
                    ¿Qué deseas hacer el día de hoy?
                    
                    (Ingrese el número según la opción)
                    
                    1. Agregar empleado de planta
                    2. Agregar empleado por horas
                    3. Buscar empleado
                    4. Mostrar todos los empleados
                    5. Calcular sueldo empleado
                    6. Salir
                    
                    """);

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {


                    Empleadosplanta empleadoPlanta = new Empleadosplanta();

                    System.out.println("Ingrese el nombre del trabajador:");
                    empleadoPlanta.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la edad del trabajador:");
                    empleadoPlanta.setEdad(scanner.nextInt());
                    System.out.println("Ingrese el salario fijo:");
                    empleadoPlanta.setSalarioFijo(scanner.nextInt());

                    empleadosList.add(empleadoPlanta);
                    System.out.println("Empleado agregado con éxito.");
                }
                case 2 -> {
                    EmpleadosHoras empleadoHoras = new EmpleadosHoras();

                    System.out.println("Ingrese el nombre del trabajador:");
                    empleadoHoras.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la edad del trabajador:");
                    empleadoHoras.setEdad(scanner.nextInt());
                    System.out.println("Ingrese el pago por hora:");
                    empleadoHoras.setPagoHoras(scanner.nextInt());
                    System.out.println("Ingrese las horas trabajadas:");
                    empleadoHoras.setHorasTrabajadas(scanner.nextInt());

                    empleadosList.add(empleadoHoras);
                    System.out.println("Empleado agregado con éxito.");
                }
                case 3 -> {
                    System.out.println("Ingrese el nombre del trabajador a buscar:");
                    String nombre = scanner.nextLine();
                    boolean encontrado = false;

                    for (Empleados empleado : empleadosList) {
                        if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println(empleado);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Empleado no encontrado.");
                    }
                }
                case 4 -> {
                    if (empleadosList.isEmpty()) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        for (Empleados empleado : empleadosList) {
                            System.out.println(empleado);
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Ingrese el nombre del trabajador:");
                    String nombre = scanner.nextLine();
                    boolean encontrado = false;

                    for (Empleados empleado : empleadosList) {
                        if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                            encontrado = true;

                            if (empleado.getSalarioFijo() > 0) {
                                int salariofijo=empleado.getSalarioFijo();
                                System.out.println("el salario fijo es de: "+ salariofijo + "$" );
                                System.out.println();
                                System.out.println("Ingrese el número de meses trabajados:");
                                int meses = scanner.nextInt();

                                int sueldo = salariofijo * meses;
                                System.out.println("El sueldo total es de: " + sueldo + "$");
                            }
                            else if (empleado.getPagoHoras() > 0) {
                                int pagohoras = empleado.getPagoHoras();
                                int horastrabajadas = empleado.getHorasTrabajadas();
                                System.out.println("el pago de hora es de: " + pagohoras + "$");
                                System.out.println("las horas trabajadas son: " + horastrabajadas + "horas");
                                System.out.println();
                                int sueldo = empleado.getPagoHoras() * empleado.getHorasTrabajadas();
                                System.out.println("El pago final será de " + sueldo + "$");
                            }


                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Empleado no encontrado.");
                    }
                }
                case 6 -> {
                    play = false;
                    System.out.println("Saliendo del programa...");
                }
                default -> System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (play);
    }
}