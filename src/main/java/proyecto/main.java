package proyecto;

import static proyecto.leerCSV.obtenerUsuarios;


public class main {
    
    
    public static void main(String[] args){
        
        String rutaCSV = "genz_dataset.csv";
        usuario[] usuarios = obtenerUsuarios(rutaCSV);
        
        for(int i=0; i<=10; i++){
            System.out.println(usuarios[i].toString());
        }   
    }
}
