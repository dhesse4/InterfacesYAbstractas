/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playgt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Hesse
 */
public class PlayGT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Cancion c1 = new Cancion("Cielo de Xela", "Banda Quetzal", 210);
        Cancion c2 = new Cancion("Marimba al Atardecer","Los Tecomates", 180);
        Podcast p1 = new Podcast("Codigo y Cafe", "Ana Ruiz", 1800, 12);
        LibroDigital l1 = new LibroDigital("Estructuras de Datos", "Marco Perez", 320);
        
        List<Contenido> catalogo = new ArrayList<>();
        catalogo.add(c1);
        catalogo.add(c2);
        catalogo.add(p1);
        catalogo.add(l1);
        
        List<Reproducible> paraEscuchar = List.of(c1, c2, p1);
        List<Descargable> paraDescargar = List.of(c1, c2, p1, l1);
        
        for (Contenido c : catalogo) 
        {
            System.out.println(c.toString());
        }
        System.out.println("--- Reproduciendo ---");
        for (Reproducible r : paraEscuchar) 
        {
            r.reproducir();
        }
        
        int seg = tiempoTotalSeg(paraEscuchar);
        System.out.println("Tiempo total: " + seg / 60 + " min " + seg % 60 + " s");
        System.out.println("--- Descargas ---");
        double mb = espacioTotalMB(paraDescargar);
        System.out.println("Espacio necesario: " + mb + " MB");
        
    }
    
    public static int tiempoTotalSeg(List<Reproducible> paraEscuchar)
    {
        int suma = 0;
        
        for(Reproducible r : paraEscuchar)
        {
            suma += r.getDuracionSegundos();
        }  
          
        return suma;
    }
    
    public static double espacioTotalMB(List<Descargable> paraDescargar)
    {
        double suma = 0.0;
        
        for(Descargable r : paraDescargar)
        {
            suma += r.calcularTamanioMB();
        }  
          
        return suma;
    }
    
}
