import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Libro
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 500);
        libro.mostrarDetalles();

        // Crear un objeto CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("123456", 1000.0, "Corriente");
        cuenta.mostrarDetalles();

        // Crear un objeto Estudiante
        Estudiante estudiante = new Estudiante("Juan Pérez", 20, "Ingeniería");
        estudiante.mostrarDetalles();

        // Ingresar datos por consola para inicializar un nuevo objeto Libro
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el número de páginas:");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Libro libroConsola = new Libro(titulo, autor, numeroPaginas);
        libroConsola.mostrarDetalles();

        // Ingresar datos por consola para inicializar un nuevo objeto CuentaBancaria
        System.out.println("Ingrese el número de cuenta:");
        String numeroCuenta = scanner.nextLine();
        System.out.println("Ingrese el saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese el tipo de cuenta:");
        String tipoCuenta = scanner.nextLine();

        CuentaBancaria cuentaConsola = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        cuentaConsola.mostrarDetalles();

        // Ingresar datos por consola para inicializar un nuevo objeto Estudiante
        System.out.println("Ingrese el nombre del estudiante:");
        String nombreEstudiante = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese la carrera del estudiante:");
        String carreraEstudiante = scanner.nextLine();

        Estudiante estudianteConsola = new Estudiante(nombreEstudiante, edadEstudiante, carreraEstudiante);
        estudianteConsola.mostrarDetalles();

        scanner.close();
    }
}