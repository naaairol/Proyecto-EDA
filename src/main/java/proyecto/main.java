package proyecto;

import java.util.ArrayList;
import static proyecto.leerCSV.obtenerUsuarios;
import static proyecto.tablaHash.insertarUsuario;


public class main {
    
    
    public static void main(String[] args){
        //Ruta para cargar los usuarios,
        String rutaCSV = "genz_dataset.csv";
        //Ingreso de usuarios en arreglo como objetos
        usuario[] usuarios = obtenerUsuarios(rutaCSV);
        //Conversión de array a ArrayList
        ArrayList<usuario> listaUsuarios = new ArrayList<>();
        for(usuario u : usuarios){
            if(u != null){
                listaUsuarios.add(u);
            }
        }
        
        System.out.println("--- ORDENAMIENTOS ---");
        
        //Llamada a merge sort
        System.out.println("\n--- INICIO DE ORDENAMIENTO POR MERGE SORT ---");
        MergeSort.mergeSort(listaUsuarios, 0, listaUsuarios.size()-1);
        System.out.println("ORDENAMIENTO POR MERGE SORT EXITOSO!");
        // Mostrar despues de ordenar
        System.out.println("--- RESULTADOS DE MERGE SORT ---");
        System.out.println("Los datos fueron ordenados ascendentemente"
                + " utilizando el valor, en horas, del uso en la noche de"
                + " redes sociales por parte de los usuarios");
        for(int i = 0; i < 100; i++){
            System.out.println(listaUsuarios.get(i));
        }
        
        //Estadistica
         System.out.println("\n--- ESTADISTICA DEL TIEMPO DE USO EN LA NOCHE ---");
        //Primera estadistica top 10 usuarios con alto uso nocturno
        System.out.println("El siguiente top corresponde a los 10 usuarios que"
                + " mas han utilizado redes sociales en la noche, medido en minutos");
        Estadisticas.topTiempoAntesdeIrAdormir(listaUsuarios);
        
        //Llamada a quick sort
        System.out.println("\n--- INICIO DE ORDENAMIENTO POR QUICK SORT ---");
        quickSort.ordenar(listaUsuarios, 0, listaUsuarios.size() - 1);
        System.out.println("ORDENAMIENTO POR QUICK SORT EXITOSO!");
        //Mostrar despues de ordenar
        System.out.println("--- RESULTADOS DE QUICK SORT ---");
        System.out.println("Los datos fueron ordenados ascendentemente"
                + " utilizando el valor, en minutos, del promedio de duracion"
                + " de sesion en redes sociales por parte de los usuarios");
        for(int i = 0; i < 100; i++){
         System.out.println(listaUsuarios.get(i));
        }
        
        //Estadistica
          System.out.println("\n--- ESTADISTICAS ---");
        System.out.println("--- ESTADISTICA PROMEDIO SESION ---");
        //Segunda estadistica top 10 usuarios con el mayor promedio de uso por sesión
        System.out.println("El siguiente top corresponde a los 10 usuarios que"
                + " mas han utilizado redes sociales por sesion, medido en minutos");
        Estadisticas.topPromedioSesion(listaUsuarios);
        //Tercera estadística proporcion que usa redes sociales para fines informativos
        System.out.println("\n--- PROPORCION DE USUARIOS, CASO ESPECIFICO ---");
        Estadisticas.usuariosSegunProposito(usuarios);
        
        //Inicio del proceso Hashing
        System.out.println("\n--- INICIO DEL HASHING ---");
        System.out.println("PROCESO DE HASHING EXITOSO!");
        System.out.println("--- RESULTADOS TABLA HASH ---");
        usuario[] tablaHash = new usuario[10357];
        for(usuario u: usuarios){
            insertarUsuario(u, tablaHash);
        }
        //Mostrar despues de insertar
        for(int i=0; i<100; i++){
            System.out.println(tablaHash[i].getPromedioSesion()+" "+ tablaHash[i].getGenero()+
            " " + tablaHash[i].getCountry());
        }
    }
}
