package proyecto;
import java.util.ArrayList;

public class MergeSort {
    public static void mergeSort(ArrayList<usuario> lista, int izquierda, int derecha){
        if(izquierda < derecha){
            int medio = (izquierda + derecha) / 2;
            mergeSort(lista, izquierda, medio);
            mergeSort(lista, medio + 1, derecha);
            merge(lista, izquierda, medio, derecha);
        }   
    }
    
    public static void merge(ArrayList<usuario> lista, int izquierda, int medio, int derecha){

    int tamanoIzquierda = medio - izquierda + 1;
    int tamanoDerecha = derecha - medio;

    ArrayList<usuario> izquierdaLista = new ArrayList<>();
    ArrayList<usuario> derechaLista = new ArrayList<>();

    // Copiar izquierda
    for(int i = 0; i < tamanoIzquierda; i++){
        izquierdaLista.add(lista.get(izquierda + i));
    }

    // Copiar derecha
    for(int j = 0; j < tamanoDerecha; j++){
        derechaLista.add(lista.get(medio + 1 + j));
    }

    int i = 0;
    int j = 0;
    int k = izquierda;

    // Mezclar
    while(i < tamanoIzquierda && j < tamanoDerecha){

        if(izquierdaLista.get(i).getEdad() <= derechaLista.get(j).getEdad()){

            lista.set(k, izquierdaLista.get(i));
            i++;

        }else{

            lista.set(k, derechaLista.get(j));
            j++;
        }

        k++;
    }

    // Copiar sobrantes izquierda
    while(i < tamanoIzquierda){

        lista.set(k, izquierdaLista.get(i));
        i++;
        k++;
    }

    // Copiar sobrantes derecha
    while(j < tamanoDerecha){

        lista.set(k, derechaLista.get(j));
        j++;
        k++;
    }
}
}