import java.util.ArrayList;
import java.util.Iterator;

public class MainEliminarCadenas {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("sol");
        lista.add("casa");
        lista.add("mar");
        lista.add("pato");

        System.out.println("Lista original:");
        System.out.println(lista);

        Iterator<String> iterator = lista.iterator();

        while (iterator.hasNext()) {
            String palabra = iterator.next();

            if (palabra.length() < 4) {
                iterator.remove();
            }
        }

        System.out.println("Lista después de eliminar palabras con menos de 4 caracteres: ");
        System.out.println(lista);
    }
}
