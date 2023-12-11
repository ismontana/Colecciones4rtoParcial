import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Colecciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pila = new Stack<>();
        Queue<String> cola = new LinkedList<>();

        int opcion;

        do {
            System.out.println("----------- Menú -----------");
            System.out.println("Pila:");
            System.out.println("1. Agregar a la pila");
            System.out.println("2. Eliminar de la pila");
            System.out.println("3. Mostrar el tamaño de la pila");
            System.out.println("4. Mostrar el primer elemento de la pila");
            System.out.println("5. Mostrar si la pila está vacía");
            System.out.println("6. Mostrar la pila completa");
            System.out.println("----------------------------");
            System.out.println("Cola:");
            System.out.println("7. Agregar a la cola");
            System.out.println("8. Eliminar de la cola");
            System.out.println("9. Mostrar el tamaño de la cola");
            System.out.println("10. Mostrar el primer elemento de la cola");
            System.out.println("11. Mostrar si la cola está vacía");
            System.out.println("12. Mostrar la cola completa");
            System.out.println("----------------------------");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar a la pila: ");
                    String elementoPila = scanner.nextLine();
                    pila.push(elementoPila); // Pilas con push
                    break;
                case 2:
                    if (!pila.isEmpty()) {
                        System.out.println("Elemento eliminado de la pila: " + pila.pop());
                    } else {
                        System.out.println("******************************");
                        System.out.println("La pila está vacía, no se puede eliminar.");
                        System.out.println("******************************");
                    }
                    break;
                case 3:
                    System.out.println("******************************");
                    System.out.println("Tamaño de la pila: " + pila.size());
                    System.out.println("******************************");
                    break;
                case 4:
                    if (!pila.isEmpty()) {
                        System.out.println("******************************");
                        System.out.println("Primer elemento de la pila: " + pila.peek());
                        System.out.println("******************************");
                    } else {
                        System.out.println("******************************");
                        System.out.println("La pila está vacía.");
                        System.out.println("******************************");
                    }
                    break;
                case 5:
                    System.out.println("******************************");
                    System.out.println("¿La pila está vacía? " + pila.isEmpty());
                    System.out.println("******************************");
                    break;
                case 6:
                    System.out.println("******************************");
                    System.out.println("Pila completa: " + pila);
                    System.out.println("******************************");
                    break;
                case 7:
                    System.out.print("Ingrese el elemento a agregar a la cola: ");
                    String elementoCola = scanner.nextLine();
                    cola.offer(elementoCola); // Cola con offer
                    break;
                case 8:
                    if (!cola.isEmpty()) {
                        System.out.println("Elemento eliminado de la cola: " + cola.poll());
                    } else {
                        System.out.println("******************************");
                        System.out.println("La cola está vacía, no se puede eliminar.");
                        System.out.println("******************************");
                    }
                    break;
                case 9:
                    System.out.println("******************************");
                    System.out.println("Tamaño de la cola: " + cola.size());
                    System.out.println("******************************");
                    break;
                case 10:
                    if (!cola.isEmpty()) {
                        System.out.println("******************************");
                        System.out.println("Primer elemento de la cola: " + cola.peek());
                        System.out.println("******************************");
                    } else {
                        System.out.println("******************************");
                        System.out.println("La cola está vacía.");
                        System.out.println("******************************");
                    }
                    break;
                case 11:
                    System.out.println("******************************");
                    System.out.println("¿La cola está vacía? " + cola.isEmpty());
                    System.out.println("******************************");
                    break;
                case 12:
                    System.out.println("******************************");
                    System.out.println("Cola completa: " + cola);
                    System.out.println("******************************");
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("******************************");
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    System.out.println("******************************");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
