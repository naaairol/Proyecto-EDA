package proyecto;

public class usuario {

    private int edad;
    private String genero;
    private String country;
    private float usoDiario; //se encuentra en horas
    private String plataformaPrimaria;
    private int numeroPlataformasUsadas;
    private String proposito;
    private float promedioSesion; //se encuentra en minutos
    private boolean usoNoche; //boolean
    private int puntajeSaludMental;
    private String nivelAdiccion;
    private float tiempoPantallaAntesDormir; //se encuentra en minutos

    public usuario(int edad, String genero, String country, float usoDiario, String plataformaPrimaria, int numeroPlataformasUsadas, String proposito, float promedioSesion, String usoNoche, String puntajeSaludMental, String nivelAdiccion, float tiempoPantallaAntesDormir) {
        this.edad = edad;
        this.genero = genero;
        this.country = country;
        this.usoDiario = usoDiario;
        this.plataformaPrimaria = plataformaPrimaria;
        this.numeroPlataformasUsadas = numeroPlataformasUsadas;
        this.proposito = proposito;
        this.promedioSesion = promedioSesion;
        if(usoNoche.equals("1")){
            this.usoNoche=true;
        } else {
            this.usoNoche=false;
        }
        this.nivelAdiccion = nivelAdiccion;
        this.tiempoPantallaAntesDormir = tiempoPantallaAntesDormir;
        //Para asignar el puntaje directamente desde el constructor
        switch(puntajeSaludMental){
            case "Low" -> this.puntajeSaludMental = 1;
            case "Medium" -> this.puntajeSaludMental = 3;
            case "High" -> this.puntajeSaludMental = 5;
        }
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getCountry() {
        return country;
    }

    public float getUsoDiario() {
        return usoDiario;
    }

    public String getPlataformaPrimaria() {
        return plataformaPrimaria;
    }

    public int getNumeroPlataformasUsadas() {
        return numeroPlataformasUsadas;
    }

    public String getProposito() {
        return proposito;
    }

    public float getPromedioSesion() {
        return promedioSesion;
    }

    public boolean getUsoNoche() {
        return usoNoche;
    }

    public int getPuntajeSaludMental() {
        return puntajeSaludMental;
    }

    public String getNivelAdiccion() {
        return nivelAdiccion;
    }

    public float getTiempoPantallaAntesDormir() {
        return tiempoPantallaAntesDormir;
    }

    @Override
    public String toString() {
        return "usuario{" + "edad=" + edad + ", genero=" + genero + ", country=" + country + ", usoDiario=" + usoDiario + ", plataformaPrimaria=" + plataformaPrimaria + ", numeroPlataformasUsadas=" + numeroPlataformasUsadas + ", proposito=" + proposito + ", promedioSesion=" + promedioSesion + ", usoNoche=" + usoNoche + ", puntajeSaludMental=" + puntajeSaludMental + ", nivelAdiccion=" + nivelAdiccion + ", tiempoPantallaAntesDormir=" + tiempoPantallaAntesDormir + '}';
    }
}
