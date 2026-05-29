package proyecto;

import java.util.ArrayList;

public class Estadisticas {
    
    public static void topTiempoAntesdeIrAdormir(ArrayList<usuario> listaUsuarios){
    System.out.println("\nTOP 10 MAYOR USO NOCTURNO");
    for(int i = listaUsuarios.size() - 1; i >= listaUsuarios.size() - 10; i--){
        usuario u = listaUsuarios.get(i);
        System.out.println("Uso nocturno: " + u.getTiempoPantallaAntesDormir()+" | Pais: " + u.getCountry() +" | Genero: " + u.getGenero()
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
    
    public static void usuariosSegunProposito(usuario[] listaUsuarios){
        int n=listaUsuarios.length;
        int usuariosNoticias=0;
        //Obtiene cuantos usuarios utilizan redes para noticias
        for(usuario u: listaUsuarios){
            String proposito = u.getProposito().trim().toLowerCase();
            if(proposito.equals("news")){
                usuariosNoticias++;
            }
        }
        //Indica la proporción
        int stat = (usuariosNoticias*100/n);
        System.out.println("De un total de: "+n+ " usuarios. Se identifica que"
                + " el "+stat+"% usa redes sociales con fines informativos.");
    }
}