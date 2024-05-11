import java.util.Scanner;

public class App {
    // 2- arreglo bidimensional de contactos
    public static String[][] contactos = new String[100][2];
    
    // 3- metodos
    // agregar contacto
    public static int filas = 0; // Variable para llevar el control de las filas ocupadas

    public static void agregarContacto(String nombre, String telefono){
        if (filas < contactos.length) { // Verificar si hay espacio disponible en el arreglo
            contactos[filas][0] = nombre;
            contactos[filas][1] = telefono;
            System.out.println("Contacto agregado exitosamente");
            filas++; // Incrementar el índice de la siguiente fila
        } else {
            System.out.println("No se puede agregar más contactos. El arreglo está lleno.");
        }
    }

    // 4- buscar contacto
    public static void buscarContacto(String nombre){
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i][0].equalsIgnoreCase(nombre)){
                System.out.println("Nombre: " + contactos[i][0]);
                System.out.println("Telefono: " + contactos[i][1]);
            }
        }
        System.out.println("Contacto no encontrado");
    }
  

    // 5- mostrar contactos
    public static void mostrarContactos(String[][] contactos) {
        System.out.println("Lista de contactos:");
        for (int i = 0; i < filas; i++) { // Recorrer solo las filas ocupadas
            if (contactos[i][0] != null && contactos[i][1] != null) { // Verificar que ambos campos tengan datos
                System.out.println("Nombre: " + contactos[i][0] + "\tTeléfono: " + contactos[i][1]);
            }
        }
    }

    // 6- comparar contactos
    public static void compararContactos(String nombreA, String nombreB){
        boolean sonIguales=false;
        for (int i = 0; i < contactos.length; i++) {
            if ((contactos[i][0].equalsIgnoreCase(nombreA) && contactos[i][0].equalsIgnoreCase(nombreB))) {
                System.out.println("Los contactos "+nombreA+ " y "+nombreB+" son iguales.");
                sonIguales=true;
            }
        }
        if(!sonIguales){
            System.out.println("Los contactos "+nombreA+ " y "+nombreB+" NO son iguales.");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Agenda de contactos");
        // 1- Menú
        int opcion;

        boolean salir;
        do {
            try {
                System.out.println("Que opción deseas realizar?");
                System.out.println("1. Agregar contacto");
                System.out.println("2. Buscar contacto");
                System.out.println("3. Mostrar contactos");
                System.out.println("4. Comparar contacto");
                System.out.println("5. Salir");

                opcion = input.nextInt();
                input.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingresa el nombre del contacto");
                        String nombre = input.nextLine();
                        System.out.println("Ingrese el numero del contacto");
                        String numero = input.nextLine();
                        agregarContacto(nombre, numero);
                        break;
                    case 2:
                        System.out.println("Escribe el nombre del contacto que quieres buscar");
                        String nombreabuscar = input.nextLine();
                        buscarContacto(nombreabuscar);
                        break;
                    case 3:
                        mostrarContactos(contactos);
                        break;
                    case 4:
                        System.out.println("Ingresa el primer nombre a comparar");
                        String nombreA = input.nextLine();
                        System.out.println("Escribe el segundo nombre a comparar");
                        String nombreB = input.nextLine();
                        compararContactos(nombreA, nombreB);
                        break;
                
                    default:
                        System.out.println("La opcion es incorrecta");
                        break;
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Quieres continuar? (si/no)");
            char continuar = input.nextLine().charAt(0);
            salir = (continuar == 's')? false:true;
        } while (!salir);

        input.close();
    }
}
