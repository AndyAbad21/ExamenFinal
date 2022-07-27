/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

import java.util.ArrayList;
import modelo.Categoria;
import modelo.Libro;

/**
 * 
 * @author Andy Abad
 */
public class LibroServicio implements ILibroSerivico
{
    private static ArrayList<Libro> libroList=new ArrayList<>();
    private static ArrayList<Categoria> categoriaList=new ArrayList<>();

    @Override
    public Libro crearLibro(Libro libro)
    {
        libroList.add(libro);
        return libro;
    }

    @Override
    public ArrayList<Libro> listarLibro()
    {
        return libroList;
    }

    @Override
    public Categoria crearCateforia(Categoria categoria)
    {
        categoriaList.add(categoria);
        return categoria;
    }

    @Override
    public ArrayList<Categoria> listarCategoria() 
    {
        return categoriaList;
    }
    

}
