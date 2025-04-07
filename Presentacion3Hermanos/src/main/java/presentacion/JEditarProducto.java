package presentacion;

import dtos.ProductoDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class JEditarProducto extends javax.swing.JDialog {

    private static JEditarProducto instance;

    private ProductoDTO productoDto;
    private int cantidad;
    private JVenta parent;

    private JEditarProducto(JVenta parent, ProductoDTO productoDto) {
        super(parent, true);
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        actualizarDatos(parent, productoDto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        btnAumentar = new javax.swing.JButton();
        btnDisminuir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(175, 203, 255));

        nombre.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        nombre.setText("Nombre: ");

        jLabel2.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel2.setText("Marca:");

        jLabel15.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel15.setText("Cantidad:");

        lblNombre.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        lblNombre.setText("NombreEjemplo");

        lblMarca.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        lblMarca.setText("MarcaEjemplo");

        btnAumentar.setBackground(new java.awt.Color(174, 228, 68));
        btnAumentar.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        btnAumentar.setText("+");
        btnAumentar.setBorderPainted(false);
        btnAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarActionPerformed(evt);
            }
        });

        btnDisminuir.setBackground(new java.awt.Color(247, 94, 94));
        btnDisminuir.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        btnDisminuir.setText("-");
        btnDisminuir.setBorderPainted(false);
        btnDisminuir.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnDisminuir.setName(""); // NOI18N
        btnDisminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisminuirActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(57, 114, 196));
        btnGuardar.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(57, 114, 196));
        btnCancelar.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(57, 114, 196));
        btnEliminar.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        txtCantidad.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(nombre)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblMarca)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtCantidad)
                        .addGap(41, 41, 41)
                        .addComponent(btnDisminuir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAumentar)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(lblNombre))
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(btnDisminuir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAumentar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad))
                .addGap(21, 21, 21)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarProducto();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnDisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisminuirActionPerformed
        cambiarCantidad(-1);
    }//GEN-LAST:event_btnDisminuirActionPerformed

    private void btnAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarActionPerformed
        cambiarCantidad(1);
    }//GEN-LAST:event_btnAumentarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarCambios();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cambiarCantidad(int cambio) {
        cantidad += cambio;
        if (cantidad <= 0) {
            cantidad = 1;
        }
        txtCantidad.setText(String.valueOf(cantidad));
    }

    private void eliminarProducto() {
        int confirm = JOptionPane.showConfirmDialog(this, "¿Desea eliminar este producto?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (parent != null) {
                parent.listaProd.removeIf(prod -> prod.getNombre().equals(productoDto.getNombre()));
                parent.actualizarTablaDespuesDeEliminar(productoDto.getNombre());
            } else {
                JOptionPane.showMessageDialog(this, "Error: No se eliminar el producto.");
            }
            dispose();
        }
    }

    private void guardarCambios() {
        productoDto.setCantidadCompra(cantidad);
        if (parent != null) {
            parent.actualizarTablaDespuesDeEditar();
        }
        dispose();
    }

    private void actualizarDatos(JVenta parent, ProductoDTO productoDto) {
        this.parent = parent;
        this.productoDto = productoDto;
        this.cantidad = (productoDto.getCantidadCompra() != null) ? productoDto.getCantidadCompra() : 0;
        lblNombre.setText(productoDto.getNombre());
        lblMarca.setText(productoDto.getMarca());
        txtCantidad.setText(String.valueOf(cantidad));
    }

    public static JEditarProducto getInstance(JVenta parent, ProductoDTO producto) {
        if (instance == null || !instance.isDisplayable()) {
            instance = new JEditarProducto(parent, producto);
        } else {
            instance.actualizarDatos(parent, producto);
        }
        return instance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDisminuir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel txtCantidad;
    // End of variables declaration//GEN-END:variables
}
