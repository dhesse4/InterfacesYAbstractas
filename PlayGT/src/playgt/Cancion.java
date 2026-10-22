/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playgt;

/**
 *
 * @author Daniel Hesse
 */
public class Cancion extends Contenido implements Reproducible, Descargable
{
    private int duracionSegundos;
            
    public Cancion(String titulo, String autor, int duracionSegundos) 
    {
        super(titulo, autor);
        this.duracionSegundos = duracionSegundos;
    }
    
    public int getDuracion()
    {
        return this.duracionSegundos;
    }
    public void setDuracion(int segundos)
    {
        this.duracionSegundos = segundos;
    }
    
    
    @Override
    public String tipo() 
    {
        return "Cancion:\t";
    }

    @Override
    public void reproducir() 
    {
        int minutos = (int)(this.duracionSegundos/60);
        int segundos = (this.duracionSegundos - (minutos*60));
        
        String minutosFormateados = minutos + ":" + segundos;
        
        System.out.println("Reproduciendo:\t" + this.getTitulo() + "\t-\t" + "(" + minutosFormateados + ")");
    }

    @Override
    public int getDuracionSegundos() 
    {
        return this.duracionSegundos;
    }

    @Override
    public double calcularTamanioMB() 
    {
        double minutosMB = (double)(this.duracionSegundos/60.0);
        return minutosMB * 1.5;
    }
    
    @Override
    public String toString()
    {
        return this.tipo() + super.getTitulo() + " - " + super.getAutor();
    }
    
}
