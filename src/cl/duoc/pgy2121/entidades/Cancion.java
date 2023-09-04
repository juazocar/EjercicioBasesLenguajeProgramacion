package cl.duoc.pgy2121.entidades;

/**
 *
 * @author jazocar
 */
public class Cancion {
    
    private String  titulo;
    private String  artista;
    private int     duracion;
    private int     reproduccionActual;
    private boolean favorita;
    private boolean descargada;

    public Cancion() {
    }

    public Cancion(String titulo, String artista, int duracion, int reproduccionActual, boolean favorita, boolean descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.reproduccionActual = reproduccionActual;
        this.favorita = favorita;
        this.descargada = descargada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getReproduccionActual() {
        return reproduccionActual;
    }

    public void setReproduccionActual(int reproduccionActual) {
        this.reproduccionActual = reproduccionActual;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public boolean isDescargada() {
        return descargada;
    }

    public void setDescargada(boolean descargada) {
        this.descargada = descargada;
    }
    
    /**
     * Este método permite adelantar o retrasar la reproducción de una canción,
     * a un tiempo determinado.
     * @param segundos 
     */
    public void adelantarCancion(int segundos){
        if(segundos>0 && segundos <= this.duracion){
            this.reproduccionActual = segundos;
            System.out.println(String.format("La canción se está reproduciendo en el tiempo: %s", formatoDuracion(segundos)));
        } else {
            System.out.println("No puede ser menor a cero ni mayor a la duración de la canción");  
        }
    }
    
    /**
     * Este método permite imprimir la información de la canción
     */
    public void imprimirInformacion(){
        System.out.println("************************************************************");
        System.out.println(String.format("El título de la canción es  : %s", this.titulo));
        System.out.println(String.format("El artista de la canción es : %s", this.artista));
        System.out.println(String.format("El tiempo de duración es    : %s", formatoDuracion(this.duracion))); 
        System.out.println("************************************************************");
       
    }
    
    public String evaluarCancion(){
        if(this.duracion > 300){
            return "La canción es larga";
        } else {
            return "La canción es corta";
        }
    }
    
    
    /**
     * Este método nos permite dar formato a la duración total de la canción.
     * @return 
     */
    public String formatoDuracion(int tiempoEnSegundos){
        int horas    = 0;
        int minutos  = 0;
        int segundos = 0;
        horas    = tiempoEnSegundos/3600;
        minutos  = (tiempoEnSegundos -(3600*horas))/60;
        segundos = tiempoEnSegundos -((horas*3600)+(minutos*60));
        return String.format("%s:%s", minutos, segundos);
    }
}
