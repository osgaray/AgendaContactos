import java.util.ArrayList;

public class App {
    // 2- arreglo bidimensional de contactos
    public static String[][] contactos;
    
    // 3- metodos
    // agregar contacto
    public static void agregarContacto(String nombre,String telefono){
        int filas = contactos.length;
        contactos[filas][0] = nombre;
        contactos[filas][1] = telefono;
        System.out.println("Contacto agregado exitosamente");
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

    // 5- eliminar contacto
    public static void eliminarContacto(String nombre, String string){
        for (int i = 0; i < contactos.length; i++) {
            // si el nombre esta en alguna posición del arreglo
            if (contactos[i][0].equalsIgnoreCase(nombre)) {
                // crear un arreglo temporal para almacenar los contactos a excepción del contacto a eliminar
                String[][] contactosTemp = new String[contactos.length-1][];
                // alamcenar los contactos, excepto el que se va a eliminar
                for (int j = 0; j<(contactos.length-1);i++) {
                    // si el contacto NO es el que vamos a eliminar entonces si lo agregamos al arreglo temporal
                    if (!contactos[j][0].equalsIgnoreCase(nombre)){
                        // agregar contactos al arreglo temporal
                        contactosTemp[j][0]=contactos[j][0];
                        contactosTemp[j][1]=contactos[j][1];
                    }
                }
            }
            System.out.println("Contacto no encontrado");
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Agenda de contactos");
        // 1- Menú
        int opcion;
        System.out.println("Que opción deseas realizar?");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Mostrar contactos");
        System.out.println("5. Comparar contacto");


        
    }
}
