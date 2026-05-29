package proyecto;


public class tablaHash {
    
    public static int obtenerHash1(usuario u, int n){
        String llave = String.valueOf(u.getPromedioSesion());
        int hash = 2;
        int primo = 5; //uso de num primo
        
        for(int i=0; i<llave.length(); i++){
            hash = (primo*hash)+llave.charAt(i); 
        }
        return Math.abs(hash)%n; //abs por si se llega a desboradar
    }
    
    public static int obtenerHash2(usuario u, int n){
        String llave = String.valueOf(u.getPromedioSesion());
        int hash = 2; 
        int primo = 7; //uso de num primo
        
        for(int i=0; i<llave.length(); i++){
            hash = (primo*hash)+llave.charAt(i);
        }
        return n - Math.abs(hash)%n; //abs por si se llega a desboradar
    }
    
    public static int resolverColision(int h1, int h2, int i, int n){
        return (h1 + (i*h2))%n;
    }
    
    public static usuario[] insertarUsuario(usuario u, usuario[] usuarios){
        int n = usuarios.length;
        int h1 = obtenerHash1(u, n);
        
        //Primer Caso, siendo que la posición esté vacía
        if(usuarios[h1]==null){
            usuarios[h1] = u;
        } else {
            //Segundo caso, que la posición no esté vacía
            int h2 = obtenerHash2(u, n);
            int intento = 1; //para limitar los intentos
            int indice = resolverColision(h1, h2, intento, n);
            while(intento<=5){
                if(usuarios[indice]==null){
                    usuarios[indice]=u; //se insertó con el nuevo indice
                    break; //salir del while
                } else { //caso contrario se prueba 4 veces más
                    intento++; //hasta cumplir con los intentos
                }
            }
        }
        return usuarios;
    }
}
