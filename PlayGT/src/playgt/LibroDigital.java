/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playgt;

/**
 *
 * @author Daniel Hesse
 */
public class LibroDigital extends Contenido implements Descargable
{
    private int paginas;
    
    public LibroDigital(String titulo, String autor, int paginas) 
    {
        super(titulo, autor);
        this.paginas = paginas;
    }
    
    public int getPaginas()
    {
        return this.paginas;
    }
    public void setPaginas(int paginas)
    {
        this.paginas = paginas;
    }

    @Override
    public String tipo() 
    {
        return "Libro:\t";
    }

    @Override
    public double calcularTamanioMB() 
    {
        return this.paginas * 0.2;
    }
    
    @Override
    public String toString()
    {
        return this.tipo() + super.getTitulo() + " - " + super.getAutor();
    }
    
}
