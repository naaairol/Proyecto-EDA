package proyecto;

import java.util.ArrayList;

public class quickSort {

    public static void ordenar(ArrayList<usuario> lista, int inicio, int fin) {
        if (inicio < fin) {
            // Encuentra el índice de partición
            int indicePivote = particion(lista, inicio, fin);

            // Ordena recursivamente los elementos antes y después de la partición
            ordenar(lista, inicio, indicePivote - 1);
            ordenar(lista, indicePivote + 1, fin);
        }
    }

    // Método para encontrar la partición tomando el último elemento como pivote
    private static int particion(ArrayList<usuario> lista, int inicio, int fin) {
        float pivote = lista.get(fin).getPromedioSesion();
        int i = (inicio - 1); // Índice del elemento más pequeño

        for (int j = inicio; j < fin; j++) {

            if (lista.get(j).getPromedioSesion() <= pivote) {
                i++;
                intercambiar(lista, i, j);
            }
        }

        intercambiar(lista, i + 1, fin);

        return i + 1;
    }

    private static void intercambiar(ArrayList<usuario> lista, int i, int j) {
        usuario temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }
}