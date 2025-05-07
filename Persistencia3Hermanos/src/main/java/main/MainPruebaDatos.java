/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.CategoriaProducto;
import entidades.Producto;
import java.util.List;
import java.util.Scanner;
import persistencia.CategoriaProductoDAO;
import persistencia.ProductoDAO;

/**
 *
 * @author Berry
 */
public class MainPruebaDatos {

    public static void main(String[] args) {
        CategoriaProductoDAO categoriaDAO = new CategoriaProductoDAO();
        ProductoDAO productoDAO = new ProductoDAO();
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Crear categoría
            CategoriaProducto categoria = new CategoriaProducto();
            categoria.setNombre("Electrodomésticos");
            categoria.setDescripcion("Productos para el hogar");
            categoriaDAO.guardar(categoria);
            System.out.println("Categoría guardada: " + categoria.getNombre());

            // 2. Buscar categoría por nombre
            CategoriaProducto encontrada = categoriaDAO.EncontrarPorNombre("Electrodomésticos");
            System.out.println("Categoría encontrada: " + encontrada.getNombre() + ", " + encontrada.getDescripcion());

            // 3. Crear producto asociado a la categoría
            Producto producto = new Producto();
            producto.setNombre("Refrigerador");
            producto.setMarca("LG");
            producto.setCantidad(10);
            producto.setPrecioVenta(14999.99);
            producto.setCategoria(encontrada);
            productoDAO.guardar(producto);
            System.out.println("Producto guardado: " + producto.getNombre() + " - " + producto.getMarca());

            // 4. Consultar producto por ID
            Producto p = productoDAO.encontrarPorId(producto.getId());
            System.out.println("Producto encontrado por ID: " + p.getNombre() + " | Cantidad: " + p.getCantidad());

            // 5. Editar producto
            p.setCantidad(20);
            productoDAO.editar(p);
            System.out.println("Producto actualizado. Nueva cantidad: " + p.getCantidad());

            // 6. Buscar productos por categoría
            List<Producto> productos = productoDAO.encontrarPorCategoria(encontrada.getId());
            System.out.println("Productos en la categoría '" + encontrada.getNombre() + "':");
            for (Producto prod : productos) {
                System.out.println("- " + prod.getNombre() + " (" + prod.getMarca() + ") - $" + prod.getPrecioVenta());
            }
            
            // Espera a que el usuario presione Enter
            System.out.println("\nPresiona ENTER para eliminar el producto y categoria...");
            scanner.nextLine();
            
            // 7. Eliminar producto y categoría
            productoDAO.eliminar(p);
            System.out.println("Producto eliminado.");

            categoriaDAO.eliminarLogico(encontrada.getId());
            System.out.println("Categoría eliminada.");

            // Espera a que el usuario presione Enter
            System.out.println("\nPresiona ENTER para reactivar la categoria...");
            scanner.nextLine();
            
            // 8. Reactivar categoria
            categoriaDAO.reactivar(encontrada.getId());
            System.out.println("Categoría reactivada.");

        } catch (Exception e) {
            System.err.println("Error durante prueba: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
