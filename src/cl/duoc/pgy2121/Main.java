package cl.duoc.pgy2121;

import cl.duoc.pgy2121.entidades.Cancion;

/**
 *
 * @author jazocar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion cancionUno = new Cancion("Oblivion", "The Winery Dogs", 250, 0, true, true);
        cancionUno.imprimirInformacion();
        System.out.println(cancionUno.evaluarCancion());
        cancionUno.adelantarCancion(190);
        System.out.println("");
        
        Cancion cancionDos = new Cancion("Rime of the Ancient Mariner", "Iron Maiden", 818, 0, true, true);
        cancionDos.imprimirInformacion();
        System.out.println(cancionDos.evaluarCancion());
        cancionDos.adelantarCancion(723);
        System.out.println("");
        
        Cancion cancionTres = new Cancion();
        cancionTres.setTitulo("Enjoy the Silence");
        cancionTres.setArtista("Depeche Mode");
        cancionTres.setDuracion(257);
        cancionTres.setFavorita(false);
        cancionTres.setDescargada(true);
        
        cancionTres.imprimirInformacion();
        System.out.println(cancionTres.evaluarCancion());
        cancionTres.adelantarCancion(156);
        System.out.println("");
        
    }
    
}
