import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException{
        // Ejemplo de ArrayList
        ArrayList<String> arreglo1 = new ArrayList<>();
        //String[] arreglo1 = new Sring[10];
        arreglo1.add("Anacleto"); // arreglo[0] = "Anacleto"
        arreglo1.add("Higinio");
        arreglo1.add("Filomeno");
        arreglo1.add("Sinforosa");
        arreglo1.add("Tránsito");
        arreglo1.add("Filomeno");
        arreglo1.add("Teófilo");
        arreglo1.add("Filomeno");
        arreglo1.add("Filomeno");
        arreglo1.add("Filomeno");
        arreglo1.add("Filomeno");
        System.out.println(arreglo1);
        System.out.println("¿En qué posición está Filomeno?: " + arreglo1.indexOf("Filomeno"));
        System.out.println("¿Quien está en la casilla 2?: " + arreglo1.get(2));
        System.out.println("Última aparición donde está Filomeno: " + arreglo1.lastIndexOf("Filomeno"));
        arreglo1.remove("Filomeno");
        System.out.println("Arreglo: " + arreglo1);
        arreglo1.remove(8);
        System.out.println("Arreglo: " + arreglo1);
        System.out.println("Tamaño del arreglo: " + arreglo1.size());
        arreglo1.set(6, "Rogaciano");
        System.out.println(arreglo1);
        System.out.println("Tamaño del arreglo: " + arreglo1.size());
    }
}