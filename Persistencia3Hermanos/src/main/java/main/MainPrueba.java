package main;

import entidades.Administrador;
import entidades.Caja;
import entidades.CategoriaProducto;
import entidades.Compra;
import entidades.Empleado;
import entidades.Producto;
import entidades.ProductoTransaccion;
import entidades.Proveedor;
import entidades.Sesion;
import entidades.Usuario;
import entidades.Venta;
import excepciones.PersistenciaException;
import interfaces.IAdministradorDAO;
import interfaces.ICajaDAO;
import interfaces.ICategoriaProductoDAO;
import interfaces.ICompraDAO;
import interfaces.IEmpleadoDAO;
import interfaces.IProductoDAO;
import interfaces.IProductoTransaccionDAO;
import interfaces.IProveedorDAO;
import interfaces.ISesionDAO;
import interfaces.ITransaccionDAO;
import interfaces.IUsuarioDAO;
import interfaces.IVentasDAO;
import java.time.LocalDateTime;
import java.util.List;
import persistencia.AdministradorDAO;
import persistencia.CajaDAO;
import persistencia.CategoriaProductoDAO;
import persistencia.CompraDAO;
import persistencia.EmpleadoDAO;
import persistencia.ProductoDAO;
import persistencia.ProductoTransaccionDAO;
import persistencia.ProveedorDAO;
import persistencia.SesionDAO;
import persistencia.TransaccionDAO;
import persistencia.UsuarioDAO;
import persistencia.VentaDAO;


public class MainPrueba {

    public static void main(String[] args) {
//        Creamos las Daos son un monton aslñdkjasñldk
        IUsuarioDAO usuarioDAO = new UsuarioDAO();
        IEmpleadoDAO empleadoDAO = new EmpleadoDAO();
        IAdministradorDAO administradorDAO = new AdministradorDAO();
        ICajaDAO cajaDAO = new CajaDAO();
        ICategoriaProductoDAO categoriaProductoDAO = new CategoriaProductoDAO();
        IProductoDAO productoDAO = new ProductoDAO();
        IProveedorDAO proveedorDAO = new ProveedorDAO();
        ICompraDAO compraDAO = new CompraDAO();
        IVentasDAO ventaDAO = new VentaDAO();
        ITransaccionDAO transaccionDAO = new TransaccionDAO();
        IProductoTransaccionDAO productoTransaccionDAO = new ProductoTransaccionDAO();
        ISesionDAO sesionDAO = new SesionDAO();

        try {
            Administrador admin = new Administrador();
            admin.setNombre("Carlos");
            admin.setApellidoPaterno("López");
            admin.setContrasenia("admin123");
            administradorDAO.guardar(admin);
            System.out.println("Administrador guardado: " + admin.getNombre());

            Empleado empleado = new Empleado();
            empleado.setNombre("Juan");
            empleado.setApellidoPaterno("Martínez");
            empleado.setContrasenia("empleado456");
            empleadoDAO.guardar(empleado);
            System.out.println("Empleado guardado: " + empleado.getNombre());

            Caja caja = new Caja();
            caja.setDineroActual(5000.00);
            caja.setEstado("Abierta");
            cajaDAO.guardar(caja);
            System.out.println("Caja creada con dinero actual: " + caja.getDineroActual());

            Sesion sesion = new Sesion();
            sesion.setCaja(caja);
            sesion.setEmpleado(empleado);
            sesion.setFechaApertura(LocalDateTime.now());
            sesionDAO.guardar(sesion);
            System.out.println("Sesión iniciada con el empleado: " + empleado.getNombre());

            Proveedor proveedor = new Proveedor();
            proveedor.setNombre("Distribuidora ABC");
            proveedor.setTelefono("555-1234");
            proveedorDAO.guardar(proveedor);
            System.out.println("Proveedor guardado: " + proveedor.getNombre());

            CategoriaProducto categoria = new CategoriaProducto();
            categoria.setNombre("Abarrotes");
            categoria.setDescripcion("Productos de primera necesidad");
            categoriaProductoDAO.guardar(categoria);
            System.out.println("Categoría guardada: " + categoria.getNombre());

            Producto producto = new Producto();
            producto.setNombre("Arroz");
            producto.setPrecioVenta(20.5);
            producto.setCantidad(100);
            producto.setMarca("La Abundancia");
            producto.setCategoria(categoria);
            productoDAO.guardar(producto);
            System.out.println("Producto guardado: " + producto.getNombre());

            Producto producto1 = new Producto();
            producto1.setNombre("Frijoles");
            producto1.setPrecioVenta(20.0);
            producto1.setCantidad(50);
            producto1.setMarca("La Reminicencia");
            producto1.setCategoria(categoria);
            productoDAO.guardar(producto1);
            System.out.println("Producto guardado: " + producto1.getNombre());

            Compra compra = new Compra();
            compra.setProveedor(proveedor);
            compra.setTotal(5000.0);
            compraDAO.guardar(compra);
            System.out.println("Compra registrada con proveedor: " + proveedor.getNombre());

            ProductoTransaccion productoCompra = new ProductoTransaccion();
            productoCompra.setProducto(producto);
            productoCompra.setTransaccion(compra);
            productoCompra.setPrecio(20.5);
            productoCompra.setCantidad(10);
            productoCompra.setFechaHora(LocalDateTime.now());
            productoTransaccionDAO.guardar(productoCompra);
            System.out.println("Producto agregado a la compra: " + producto.getNombre());

            Venta venta = new Venta();
            venta.setTotal(205.0);
            venta.setSesion(sesion);
            ventaDAO.guardar(venta);
            System.out.println("Venta registrada con total: " + venta.getTotal());

            ProductoTransaccion productoVenta = new ProductoTransaccion();
            productoVenta.setProducto(producto);
            productoVenta.setTransaccion(venta);
            productoVenta.setPrecio(20.5);
            productoVenta.setCantidad(10);
            productoVenta.setFechaHora(LocalDateTime.now());
            productoTransaccionDAO.guardar(productoVenta);
            System.out.println("Producto agregado a la venta: " + producto.getNombre());

            System.out.println("\n LISTA DE ENTIDADES GUARDADAS");

            List<Usuario> usuarios = usuarioDAO.encontrarTodos();
            System.out.println("Usuarios registrados:");
            for (Usuario u : usuarios) {
                System.out.println(u.getNombre());
            }

            List<Producto> productos = productoDAO.encontrarTodos();
            System.out.println("\nProductos disponibles:");
            for (Producto p : productos) {
                System.out.println(p.getNombre() + " - " + p.getMarca());
            }

            List<Proveedor> proveedores = proveedorDAO.encontrarTodos();
            System.out.println("\nProveedores registrados:");
            for (Proveedor p : proveedores) {
                System.out.println(p.getNombre());
            }

            List<CategoriaProducto> categorias = categoriaProductoDAO.encontrarTodos();
            System.out.println("\nCategorías registradas:");
            for (CategoriaProducto c : categorias) {
                System.out.println(c.getNombre());
            }

            List<Venta> ventas = ventaDAO.encontrarTodos();
            System.out.println("\nVentas registradas:");
            for (Venta v : ventas) {
                System.out.println("Total: " + v.getTotal());
            }

            List<Compra> compras = compraDAO.encontrarTodos();
            System.out.println("\nCompras registradas:");
            for (Compra c : compras) {
                System.out.println("Total: " + c.getTotal());
            }
        } catch (PersistenciaException e) {
            System.out.println("ERROR EN LA PRUEBA: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
