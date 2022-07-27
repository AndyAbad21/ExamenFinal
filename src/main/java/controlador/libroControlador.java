/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;

import java.util.ArrayList;
import modelo.Categoria;
import modelo.Libro;
import servicio.LibroServicio;

/**
 * 
 * @author Andy Abad
 */
public class libroControlador 
{
    LibroServicio libroServicio;
    public libroControlador()
    {
        libroServicio=new LibroServicio();
    }
    public Libro crearLibro(String[] args)
    {
        Libro libro=new Libro(args[0],Integer.valueOf(args[1]),
                Integer.valueOf(args[2]),
                libroServicio.listarCategoria().get(this.buscarCategoriaPorCodigo(Integer.valueOf(args[3]))));
        return libro;
    }
    public ArrayList<Libro> listarLibro()
    {
        return libroServicio.listarLibro();
    }
    public Categoria crearCategoria(String[] args)
    {
        Categoria categoria=new Categoria(Integer.valueOf(args[0]),args[1]);
        return categoria;
    }
    public ArrayList<Categoria> listarCategoria()
    {
        return libroServicio.listarCategoria();
    }
    public int buscarCategoriaPorCodigo(int codigo)
    {
        int posicion=-1;
        for(int i=0;i<libroServicio.listarCategoria().size();i++)
        {
            int codigoL=libroServicio.listarCategoria().get(i).getCodigo();
            if(codigoL==codigo)
            {
                posicion=codigoL;
            }
        }
        return posicion;
    }

}
