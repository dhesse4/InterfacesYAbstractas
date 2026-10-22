/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playgt;

/**
 *
 * @author Daniel Hesse
 */
public abstract class Contenido 
{
    private String titulo;
    private String autor;
    
    public Contenido(String titulo, String autor)
    {
        this.titulo = titulo;
        this.autor = autor; 
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public String getAutor()
    {
        return this.autor;
    }
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
    public abstract String tipo();
}
