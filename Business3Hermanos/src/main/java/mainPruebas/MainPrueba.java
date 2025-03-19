/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainPruebas;

import dtos.ProductoDTO;
import entidades.Sesion;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import ventaBO.VentaBO;

/**
 *
 * @author Berry
 */
public class MainPrueba {

    public static void main(String[] args) {
        try {
            VentaBO ventaBO = new VentaBO();
            
            Sesion sesion = new Sesion();
            sesion.setId(1L);
            
            List<ProductoDTO> productosDisponibles = ventaBO.encontrarTodo();
            
            if (productosDisponibles.isEmpty()) {
                System.out.println("No hay productos disponibles en el inventario.");
                return;
            }

            System.out.println("Productos disponibles:");
            for (ProductoDTO producto : productosDisponibles) {
                System.out.println("ID: " + producto.getId() + " - " + producto.getNombre() + 
                                   " - Precio: $" + producto.getPrecioVenta() + 
                                   " - Stock: " + producto.getCantidad());
            }

            List<ProductoDTO> productosAComprar = new ArrayList<>();
            if (productosDisponibles.size() >= 2) {
                ProductoDTO p1 = productosDisponibles.get(0);
                p1.setCantidadCompra(2);
                
                ProductoDTO p2 = productosDisponibles.get(1);
                p2.setCantidadCompra(1);
                
                productosAComprar.add(p1);
                productosAComprar.add(p2);
            } else {
                System.out.println("No hay suficientes productos para realizar una prueba de compra.");
                return;
            }

            for (ProductoDTO producto : productosAComprar) {
                if (!ventaBO.verificarExistencia(producto)) {
                    System.out.println("El producto " + producto.getNombre() + " no existe en la base de datos.");
                    return;
                }
                if (!ventaBO.verificarCantidad(producto, producto.getCantidadCompra())) {
                    System.out.println("No hay suficiente stock del producto: " + producto.getNombre());
                    return;
                }
            }

            double totalVenta = ventaBO.calcularTotalVenta(productosAComprar);
            System.out.println("\nTotal de la venta: $" + totalVenta);

            double montoCliente = totalVenta + 10; 
            System.out.println("El cliente paga: $" + montoCliente);

            ventaBO.vender(productosAComprar, montoCliente, sesion);
            System.out.println("Venta realizada con éxito.");
            System.out.println("Cambio a entregar al cliente: $" + ventaBO.calcularCambio(totalVenta, montoCliente));

        } catch (PersistenciaException e) {
            System.err.println("Error en la venta: " + e.getMessage());
        }
        
    }
}
