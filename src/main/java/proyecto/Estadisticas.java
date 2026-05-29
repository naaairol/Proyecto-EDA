package proyecto;

import java.util.ArrayList;

public class Estadisticas {
    
    public static void topPromedioUsoNoche(ArrayList<usuario> listaUsuarios) {
        System.out.println("\nTop 10: En uso de noche");
        
        for (int i = listaUsuarios.size() - 1; i >= listaUsuarios.size()-10; i--) {
            usuario u = listaUsuarios.get(i);
            System.out.println("Uso nocturno: " + u.getUsoNoche() +" | Pais: " + u.getCountry() + " | Genero: " + u.getGenero()
        );
        }
    }
    public static void topPromedioSesion(ArrayList<usuario> listaUsuarios){
    System.out.println("\nTop 10 usuarios ");
    for(int i = listaUsuarios.size() - 1; i >= listaUsuarios.size() - 10; i--){
        usuario u = listaUsuarios.get(i);
        System.out.println("Promedio: " + u.getPromedioSesion() +" | Pais: " + u.getCountry() + " | Genero: " + u.getGenero()
        );
        }
    }
 
}