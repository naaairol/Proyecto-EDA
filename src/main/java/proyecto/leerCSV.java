package proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class leerCSV {
    
    public static usuario[] obtenerUsuarios(String rutaArchivo) {
        int totalRegistros = 112432; //definido por el total de líneas en el csv
        usuario[] arregloUsuarios = new usuario[totalRegistros];
        
        int indice = 0; //para iterar en el arreglo
        String linea; //cada fila
        String separador = ","; //los datos estan separados por , en el csv

        //Aqui lee el csv, la ruta que le pasemos
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            while ((linea = br.readLine()) != null && indice < totalRegistros) {
                //Para guardar los datos de cada linea
                String[] datos = linea.split(separador);
                
                // Conversión de tipos de datos columna por columna
                int edad = Integer.parseInt(datos[0].trim());
                String genero = datos[1].trim();
                String country = datos[2].trim();
                float usoDiario = Float.parseFloat(datos[3].trim());
                String plataformaPrimaria = datos[4].trim();
                int numeroPlataformasUsadas = Integer.parseInt(datos[5].trim());
                String proposito = datos[6].trim();
                float promedioSesion = Float.parseFloat(datos[7].trim());
                String usoNoche = (datos[8].trim());
                String puntajeSaludMental = datos[9].trim(); 
                String nivelAdiccion = datos[10].trim();
                float tiempoPantallaAntesDormir = Float.parseFloat(datos[11].trim());

                //Los objetos se van guardando en orden por la var indice
                arregloUsuarios[indice] = new usuario(
                    edad, genero, country, usoDiario, plataformaPrimaria, 
                    numeroPlataformasUsadas, proposito, promedioSesion, usoNoche, 
                    puntajeSaludMental, nivelAdiccion, tiempoPantallaAntesDormir
                );
                indice++;
            }

        } catch (IOException e) {
            System.err.println("Error al abrir o leer el archivo CSV: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error de conversión en la línea " + (indice + 1) + ": " + e.getMessage());
        }

        return arregloUsuarios;
    }
    
}
