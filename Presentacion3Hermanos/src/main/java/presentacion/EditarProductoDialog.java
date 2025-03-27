package presentacion;

import dtos.ProductoDTO;
import javax.swing.*;
import java.awt.*;

public class EditarProductoDialog extends JDialog {

    private ProductoDTO producto;
    private int cantidad;
    private JVenta parent;

    private JLabel lblNombre, lblMarca, lblCantidad;
    private JTextField txtCantidad;
    private JButton btnAumentar, btnDisminuir, btnEliminar, btnGuardar, btnCancelar;

    public EditarProductoDialog(JVenta parent, ProductoDTO producto) {
        super(parent, "Editar Producto", true);
        this.parent = parent;
        this.producto = producto;
        this.cantidad = (producto.getCantidadCompra() != null) ? producto.getCantidadCompra() : 0;

        setLayout(new GridLayout(5, 2, 5, 5));

        lblNombre = new JLabel("Nombre: " + producto.getNombre());
        lblMarca = new JLabel("Marca: " + producto.getMarca());
        lblCantidad = new JLabel("Cantidad:");

        txtCantidad = new JTextField(String.valueOf(cantidad));
        txtCantidad.setEditable(false);

        btnAumentar = new JButton("+");
        btnDisminuir = new JButton("-");
        btnEliminar = new JButton("Eliminar");
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");

        btnAumentar.addActionListener(e -> cambiarCantidad(1));
        btnDisminuir.addActionListener(e -> cambiarCantidad(-1));
        btnEliminar.addActionListener(e -> eliminarProducto());
        btnGuardar.addActionListener(e -> guardarCambios());
        btnCancelar.addActionListener(e -> dispose());

        add(lblNombre);
        add(new JLabel());
        add(lblMarca);
        add(new JLabel());
        add(lblCantidad);
        add(txtCantidad);
        add(btnAumentar);
        add(btnDisminuir);
        add(btnEliminar);
        add(btnGuardar);

        pack();
        setLocationRelativeTo(parent);
    }

    private void cambiarCantidad(int cambio) {
        cantidad += cambio;
        if (cantidad < 0) {
            cantidad = 0;
        }
        txtCantidad.setText(String.valueOf(cantidad));
    }

    private void eliminarProducto() {
    int confirm = JOptionPane.showConfirmDialog(this, "¿Desea eliminar este producto?", "Confirmación", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        JVenta venta = (JVenta) getParent();
        venta.listaProd.removeIf(prod -> prod.getNombre().equals(producto.getNombre())); 
        
        parent.actualizarTablaDespuesDeEliminar(producto.getNombre());
        dispose(); 
    }
}

    private void guardarCambios() {
        producto.setCantidadCompra(cantidad);
        if (parent != null) {
            parent.actualizarTablaDespuesDeEditar();
        }
        dispose();
    }
}
