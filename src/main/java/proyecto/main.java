package proyecto;

import java.util.ArrayList;
import static proyecto.leerCSV.obtenerUsuarios;
import static proyecto.tablaHash.insertarUsuario;


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
        MergeSort.mergeSort(listaUsuarios, 0, listaUsuarios.size()-1);

        // Mostrar despues de ordenar
        System.out.println("\nDESPUES DEL MERGE SORT:");

        for(int i = 0; i < 100; i++){
            System.out.println(listaUsuarios.get(i));
        }
        
        System.out.println("\n--- ESTADISTICA USO NOCHE ---");
        //Segunda estadistica top 10 usuarios con alto uso nocturno
        Estadisticas.topPromedioUsoNoche(listaUsuarios);
        
        // Llamar al QuickSort para ordenar por promedioSesion
        quickSort.ordenar(listaUsuarios, 0, listaUsuarios.size() - 1);

        // Mostrar despues de ordenar
        System.out.println("\nDESPUES DEL QUICKSORT (Ordenado por Promedio de SesiOn):");
        for(int i = 0; i < 100; i++){
         System.out.println(listaUsuarios.get(i));
        }
          System.out.println("\n--- ESTADISTICA PROMEDIO SESION ---");
        //Segunda estadistica top 10 usuarios 
        Estadisticas.topPromedioSesion(listaUsuarios);
        
        System.out.println("----");
        //Hash
        usuario[] tablaHash = new usuario[10357];
        for(usuario u: usuarios){
            insertarUsuario(u, tablaHash);
        }
        
        for(int i=0; i<100; i++){
            System.out.println(tablaHash[i].getPromedioSesion()+" "+ tablaHash[i].getGenero());
        }
    }
}
