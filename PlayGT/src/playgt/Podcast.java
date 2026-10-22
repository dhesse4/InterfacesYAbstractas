/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playgt;

/**
 *
 * @author Daniel Hesse
 */
public class Podcast extends Contenido implements Reproducible, Descargable
{
    private int duracionSegundos;
    private int episodio;
    
    public Podcast(String titulo, String autor, int duracionSegundos, int episodio) 
    {
        super(titulo, autor);
        this.duracionSegundos = duracionSegundos;
        this.episodio = episodio;
    }
    
    public int getDuracion()
    {
        return this.duracionSegundos;
    }
    public void setDuracion(int segundos)
    {
        this.duracionSegundos = segundos;
    }
    
    public int getEpisodio()
    {
        return this.episodio;
    }
    public void setEpisodio(int episodio)
    {
        this.episodio = episodio;
    }
    
    @Override
    public String tipo() 
    {
        return "Podcast:\t";
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
        double minutos = (double)(this.duracionSegundos/60.0);
        return minutos;
    }
    
    @Override
    public String toString()
    {
        return this.tipo() + super.getTitulo() + " - " + super.getAutor();
    }
    
}
