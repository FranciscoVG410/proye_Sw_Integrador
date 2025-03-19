package presentacion;

/**
 *
 * @author Bell
 */
public class JVenta extends javax.swing.JFrame {

    /**
     * Creates new form JVenta
     */
    public JVenta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxProducto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textInformacionProducto = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        comboBoxCantidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        btnLimpiarProducto = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtVentasHoy = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnMas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        btnLimpiarVenta = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        campoTxtPagar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JLabel();
        btnProveedores = new javax.swing.JButton();
        btnRegEmpleado = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1307, 720));

        fondo.setBackground(new java.awt.Color(240, 248, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(132, 165, 211));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 40)); // NOI18N
        jLabel1.setText("<html><center>Abarrotes 3 Hermanos<center></html>");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(281, 90));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 320, 114));

        jPanel2.setBackground(new java.awt.Color(175, 203, 255));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 40)); // NOI18N
        jLabel2.setText("<html><center>Ventas</center></html>");
        jLabel2.setAlignmentX(30.0F);
        jLabel2.setAlignmentY(144.0F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel3.setText("Producto:");
        jLabel3.setAlignmentX(22.0F);
        jLabel3.setAlignmentY(210.0F);

        comboBoxProducto.setBackground(new java.awt.Color(240, 248, 255));
        comboBoxProducto.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        comboBoxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gamesa", "Sabritas", "Barcel", "Ricolino", "Coca cola" }));
        comboBoxProducto.setBorder(null);
        comboBoxProducto.setLightWeightPopupEnabled(false);
        comboBoxProducto.setOpaque(true);

        textInformacionProducto.setEditable(false);
        textInformacionProducto.setBackground(new java.awt.Color(240, 248, 255));
        textInformacionProducto.setColumns(5);
        textInformacionProducto.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        textInformacionProducto.setRows(5);
        textInformacionProducto.setText("Información del Producto");
        textInformacionProducto.setBorder(null);
        jScrollPane1.setViewportView(textInformacionProducto);

        jLabel4.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel4.setText("Cantidad:");

        comboBoxCantidad.setBackground(new java.awt.Color(240, 248, 255));
        comboBoxCantidad.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        comboBoxCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        comboBoxCantidad.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel5.setText("Precio:");

        txtPrecio.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        txtPrecio.setText("$40.00");

        btnLimpiarProducto.setBackground(new java.awt.Color(247, 94, 94));
        btnLimpiarProducto.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        btnLimpiarProducto.setText("Limpiar");
        btnLimpiarProducto.setBorderPainted(false);
        btnLimpiarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnLimpiarProducto.setName(""); // NOI18N
        btnLimpiarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProductoActionPerformed(evt);
            }
        });

        btnAgregarProducto.setBackground(new java.awt.Color(174, 228, 68));
        btnAgregarProducto.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        btnAgregarProducto.setText("Agregar");
        btnAgregarProducto.setBorderPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(comboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(comboBoxCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(txtPrecio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnLimpiarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarProducto)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtPrecio)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 320, 587));

        jPanel3.setBackground(new java.awt.Color(207, 232, 255));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel6.setText("Usuario:");

        txtUsuario.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        txtUsuario.setText("Default");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        fondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 11, 592, 38));

        jPanel4.setBackground(new java.awt.Color(175, 203, 255));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel7.setText("Fecha:");

        jLabel9.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel9.setText("Hora:");

        txtFecha.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        txtFecha.setText("18 de Febrero de 2025");

        txtHora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtHora.setText("10:43");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHora)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha)
                    .addComponent(txtHora))
                .addContainerGap())
        );

        fondo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 49, 592, 38));

        jPanel5.setBackground(new java.awt.Color(207, 232, 255));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel8.setText("Ventas de hoy:");

        txtVentasHoy.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtVentasHoy.setText("10");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVentasHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVentasHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        fondo.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 87, 592, 38));

        jPanel6.setBackground(new java.awt.Color(255, 249, 237));

        jLabel13.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel13.setText("Cantidad");

        jLabel14.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel14.setText("Producto");

        jLabel15.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel15.setText("Precio:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel16.setText("2x");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel17.setText("Sabritas \"Cheetos Torciditos\"");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel18.setText("$40.00");

        btnMas.setBackground(new java.awt.Color(174, 228, 68));
        btnMas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMas.setText("+");
        btnMas.setBorderPainted(false);
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(247, 94, 94));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("-");
        jButton2.setBorderPainted(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(127, 127, 127))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel16)
                .addGap(156, 156, 156)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(24, 24, 24)
                .addComponent(btnMas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(btnMas)
                    .addComponent(jButton2))
                .addContainerGap(375, Short.MAX_VALUE))
        );

        fondo.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 125, 966, 473));

        jPanel7.setBackground(new java.awt.Color(255, 250, 160));

        jLabel10.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel10.setText("Total a pagar:");

        txtTotalPagar.setFont(new java.awt.Font("Arial", 0, 38)); // NOI18N
        txtTotalPagar.setText("$40.00");

        btnVender.setBackground(new java.awt.Color(174, 228, 68));
        btnVender.setFont(new java.awt.Font("Candara", 0, 40)); // NOI18N
        btnVender.setText("Vender");
        btnVender.setBorderPainted(false);
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnLimpiarVenta.setBackground(new java.awt.Color(247, 94, 94));
        btnLimpiarVenta.setFont(new java.awt.Font("Candara", 0, 40)); // NOI18N
        btnLimpiarVenta.setText("Limpiar");
        btnLimpiarVenta.setBorderPainted(false);
        btnLimpiarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarVentaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel11.setText("Paga con:");

        campoTxtPagar.setBackground(new java.awt.Color(240, 248, 255));
        campoTxtPagar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        campoTxtPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTxtPagarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel12.setText("Cambio:");

        txtCambio.setFont(new java.awt.Font("Arial", 0, 38)); // NOI18N
        txtCambio.setText("$0.00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(campoTxtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCambio))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnLimpiarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalPagar)
                            .addComponent(txtCambio)
                            .addComponent(campoTxtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        fondo.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 598, 966, 114));

        btnProveedores.setBackground(new java.awt.Color(135, 170, 220));
        btnProveedores.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.setBorder(null);
        btnProveedores.setBorderPainted(false);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        fondo.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(932, 11, 120, 56));

        btnRegEmpleado.setBackground(new java.awt.Color(135, 170, 220));
        btnRegEmpleado.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnRegEmpleado.setText("Reg Empleado");
        btnRegEmpleado.setBorder(null);
        btnRegEmpleado.setBorderPainted(false);
        btnRegEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEmpleadoActionPerformed(evt);
            }
        });
        fondo.add(btnRegEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1054, 11, 120, 56));

        btnProducto.setBackground(new java.awt.Color(135, 170, 220));
        btnProducto.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnProducto.setText("Producto");
        btnProducto.setBorder(null);
        btnProducto.setBorderPainted(false);
        fondo.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1176, 11, 120, 56));

        btnVentas.setBackground(new java.awt.Color(135, 170, 220));
        btnVentas.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setSelected(true);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        fondo.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(932, 69, 120, 56));

        btnCompras.setBackground(new java.awt.Color(135, 170, 220));
        btnCompras.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setBorder(null);
        btnCompras.setBorderPainted(false);
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        fondo.add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1054, 69, 120, 56));

        btnReportes.setBackground(new java.awt.Color(135, 170, 220));
        btnReportes.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        fondo.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1176, 69, 120, 56));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnRegEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegEmpleadoActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnLimpiarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarProductoActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnLimpiarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarVentaActionPerformed

    private void campoTxtPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTxtPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTxtPagarActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnLimpiarProducto;
    private javax.swing.JButton btnLimpiarVenta;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRegEmpleado;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVentas;
    private javax.swing.JTextField campoTxtPagar;
    private javax.swing.JComboBox<String> comboBoxCantidad;
    private javax.swing.JComboBox<String> comboBoxProducto;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea textInformacionProducto;
    private javax.swing.JLabel txtCambio;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtTotalPagar;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtVentasHoy;
    // End of variables declaration//GEN-END:variables
}
