/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import modelo.Categoria;
import modelo.Libro;

/**
 *
 * @author Andy Abad
 */
public interface ILibroSerivico 
{
    public Libro crearLibro(Libro libro);
    public ArrayList<Libro> listarLibro();
    public Categoria crearCateforia(Categoria categoria);
    public ArrayList<Categoria> listarCategoria();
    
}
