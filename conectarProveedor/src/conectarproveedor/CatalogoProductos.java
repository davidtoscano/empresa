/*
Autor David Toscano
 */
package conectarproveedor;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogoProductos extends javax.swing.JFrame {

    /**
     * Creates new form CatalogoProductos
     */
    public CatalogoProductos() {
        initComponents();
    }

    public void mostrar(ResultSet consulta) throws SQLException
    {
        jTextFieldclaveproducto.setText(consulta.getString(1));
          jTextFielddescripcion.setText(consulta.getString(2));
               jTextFieldprecio.setText(consulta.getString(3));
            //    jComboBoxunidad.setSelectedItem(consulta.getString(3));
             jTextFieldtelefono.setText(consulta.getString(4));
               jTextFieldcorreo.setText(consulta.getString(5));
               jTextFieldpagina.setText(consulta.getString(6));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        button2 = new java.awt.Button();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbtnguardar = new javax.swing.JButton();
        jbtnmostrar = new javax.swing.JButton();
        jbtnprimero = new javax.swing.JButton();
        jbtnatras = new javax.swing.JButton();
        jbtnsiguiente = new javax.swing.JButton();
        jbtnultimo = new javax.swing.JButton();
        jTextFieldclaveproducto = new javax.swing.JTextField();
        jTextFielddescripcion = new javax.swing.JTextField();
        jTextFieldprecio = new javax.swing.JTextField();
        jTextFieldtelefono = new javax.swing.JTextField();
        jTextFieldcorreo = new javax.swing.JTextField();
        jTextFieldpagina = new javax.swing.JTextField();
        jbtnconsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxunidad = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Teléfono:");

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Módulo de Captura de Productos");

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Clave del Producto:");

        button2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button2.setLabel("Cancelar");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Correo Electrónico:");

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("Descripción:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Página Web:");

        jbtnguardar.setIcon(new javax.swing.ImageIcon("D:\\iconos\\guardarnetbeans.ico")); // NOI18N
        jbtnguardar.setText("Guardar");
        jbtnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarActionPerformed(evt);
            }
        });

        jbtnmostrar.setText("Mostrar");
        jbtnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmostrarActionPerformed(evt);
            }
        });

        jbtnprimero.setText("<-");
        jbtnprimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnprimeroActionPerformed(evt);
            }
        });

        jbtnatras.setText("<");
        jbtnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnatrasActionPerformed(evt);
            }
        });

        jbtnsiguiente.setText(">");
        jbtnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsiguienteActionPerformed(evt);
            }
        });

        jbtnultimo.setText("->");
        jbtnultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnultimoActionPerformed(evt);
            }
        });

        jbtnconsultar.setText("Consultar");
        jbtnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnconsultarActionPerformed(evt);
            }
        });

        jLabel1.setText("Unidad");

        jComboBoxunidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cm", "dm", "m", " " }));
        jComboBoxunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxunidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldclaveproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jbtnguardar))
                                    .addComponent(jTextFielddescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(jTextFieldtelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(jTextFieldcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(jTextFieldpagina, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(jComboBoxunidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbtnconsultar)
                                            .addComponent(jbtnmostrar))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnprimero)
                                .addGap(34, 34, 34)
                                .addComponent(jbtnatras)
                                .addGap(58, 58, 58)
                                .addComponent(jbtnsiguiente)
                                .addGap(53, 53, 53)
                                .addComponent(jbtnultimo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(292, 292, 292))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldclaveproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnguardar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFielddescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldpagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnconsultar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jbtnmostrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnprimero)
                    .addComponent(jbtnsiguiente)
                    .addComponent(jbtnatras)
                    .addComponent(jbtnultimo))
                .addGap(51, 51, 51)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed

        try {
            //Instancias nuestra clase conectar
            conectar miconexion = new conectar();
            //Reemplaza valores 
            String sentenciaInsert = "insert into producto values (?,?,?,?,?,?)";
            miconexion.prepararSentencias = miconexion.miconexion.prepareStatement(sentenciaInsert);
           
            miconexion.prepararSentencias.setString(1, jTextFieldclaveproducto.getText());
            miconexion.prepararSentencias.setString(2, jTextFielddescripcion.getText());
            miconexion.prepararSentencias.setString(3, jTextFieldprecio.getText());
           // miconexion.prepararSentencias.setString(3, jComboBoxunidad.getSelectedItem());
            miconexion.prepararSentencias.setString(4, jTextFieldtelefono.getText());
            miconexion.prepararSentencias.setString(5, jTextFieldcorreo.getText());
            miconexion.prepararSentencias.setString(6, jTextFieldpagina.getText());

            miconexion.prepararSentencias.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtnguardarActionPerformed

    private void jbtnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmostrarActionPerformed
        try {
            conectar miconexion = new conectar();
            String cons = "select * from producto";
            consulta = miconexion.consulta(cons);
            consulta.next();
            mostrar(consulta);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtnmostrarActionPerformed

    private void jbtnprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnprimeroActionPerformed
        try {
            consulta.first();
            mostrar(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtnprimeroActionPerformed

    private void jbtnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnatrasActionPerformed
        //Boton anterior
        try {
            consulta.previous();
            mostrar(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jbtnatrasActionPerformed

    private void jbtnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsiguienteActionPerformed
        // Siguiente
        try {
            consulta.next();
            mostrar(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtnsiguienteActionPerformed

    private void jbtnultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnultimoActionPerformed
        // Ultimo
        try {
            consulta.last();
            mostrar(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jbtnultimoActionPerformed

    private void jbtnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnconsultarActionPerformed
    //Boton Consultar
       // String r=jTextFieldclaveproducto.getText();
        //ConectarProveedor.consulta(r);
    }//GEN-LAST:event_jbtnconsultarActionPerformed

    private void jComboBoxunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxunidadActionPerformed
        // jCombobox
    }//GEN-LAST:event_jComboBoxunidadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CatalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CatalogoProductos().setVisible(true);
            }
        });
    }
    ResultSet consulta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private javax.swing.JComboBox jComboBoxunidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldclaveproducto;
    private javax.swing.JTextField jTextFieldcorreo;
    private javax.swing.JTextField jTextFielddescripcion;
    private javax.swing.JTextField jTextFieldpagina;
    private javax.swing.JTextField jTextFieldprecio;
    private javax.swing.JTextField jTextFieldtelefono;
    private javax.swing.JButton jbtnatras;
    private javax.swing.JButton jbtnconsultar;
    private javax.swing.JButton jbtnguardar;
    private javax.swing.JButton jbtnmostrar;
    private javax.swing.JButton jbtnprimero;
    private javax.swing.JButton jbtnsiguiente;
    private javax.swing.JButton jbtnultimo;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
