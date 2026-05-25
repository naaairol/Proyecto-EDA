package proyecto;

import java.util.ArrayList;
import static proyecto.leerCSV.obtenerUsuarios;


public class main {
    
    
    public static void main(String[] args){
        
        String rutaCSV = "genz_dataset.csv";
        usuario[] usuarios = obtenerUsuarios(rutaCSV);
        // Convertir arreglo a ArrayList
        ArrayList<usuario> listaUsuarios = new ArrayList<>();

        for(usuario u : usuarios){
            if(u != null){
                listaUsuarios.add(u);
            }
        }
        for(int i=0; i<=10; i++){
            System.out.println(usuarios[i].toString());
        }   
        
        // Llamar al merge sort
        MergeSort.mergeSort(listaUsuarios, 0, listaUsuarios.size() - 1);

        // Mostrar despues de ordenar
        System.out.println("\nDESPUES DEL MERGE SORT:");

        for(int i = 0; i < 100; i++){
            System.out.println(listaUsuarios.get(i));
        }
        
        
        // Llamar al QuickSort para ordenar por promedioSesion
        quickSort.ordenar(listaUsuarios, 0, listaUsuarios.size() - 1);

        // Mostrar despues de ordenar
        System.out.println("\nDESPUES DEL QUICKSORT (Ordenado por Promedio de SesiOn):");
        for(int i = 0; i < 100; i++){
         System.out.println(listaUsuarios.get(i));
        }
        
    }
}
