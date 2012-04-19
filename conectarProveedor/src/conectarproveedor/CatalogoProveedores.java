/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conectarproveedor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class CatalogoProveedores extends javax.swing.JFrame {

    /**
     * Creates new form CatalogoProveedores
     */
    public CatalogoProveedores() {
        initComponents();
    }

    public void mostrar(ResultSet consulta) throws SQLException {
        jTextFieldclave.setText(consulta.getString(1));
         jTextFieldrazon.setText(consulta.getString(2));
          jTextFieldrfc.setText(consulta.getString(3));
           jTextFielddomicilio.setText(consulta.getString(4));
            jTextFieldtelefono.setText(consulta.getString(5));
             jTextFieldcorreo.setText(consulta.getString(6));
              jTextFieldpagina.setText(consulta.getString(7));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        jbtnmostrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        button2 = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        label1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldclave = new javax.swing.JTextField();
        jTextFieldrazon = new javax.swing.JTextField();
        jTextFieldrfc = new javax.swing.JTextField();
        jTextFieldtelefono = new javax.swing.JTextField();
        jTextFielddomicilio = new javax.swing.JTextField();
        jTextFieldcorreo = new javax.swing.JTextField();
        jTextFieldpagina = new javax.swing.JTextField();
        jbtnguardar = new javax.swing.JButton();
        jbtnprimero = new javax.swing.JButton();
        jbtnsiguiente = new javax.swing.JButton();
        jbtnatras = new javax.swing.JButton();
        jbtnultimo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("RFC:");

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Clave del Proveedor:");

        jbtnmostrar.setText("Mostrar");
        jbtnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmostrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Página Web:");

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
        label3.setText("Razón Social:");

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Módulo de Captura de Proveedores");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Domicilio:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Teléfono:");

        jTextFielddomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddomicilioActionPerformed(evt);
            }
        });

        jbtnguardar.setText("Guardar");
        jbtnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarActionPerformed(evt);
            }
        });

        jbtnprimero.setText("<-");
        jbtnprimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnprimeroActionPerformed(evt);
            }
        });

        jbtnsiguiente.setText(">");
        jbtnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsiguienteActionPerformed(evt);
            }
        });

        jbtnatras.setText("<");
        jbtnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnatrasActionPerformed(evt);
            }
        });

        jbtnultimo.setText("->");
        jbtnultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnultimoActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jbtnprimero)
                                .addGap(34, 34, 34)
                                .addComponent(jbtnatras)))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnsiguiente)
                                .addGap(53, 53, 53)
                                .addComponent(jbtnultimo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldclave)
                                .addComponent(jTextFieldrazon)
                                .addComponent(jTextFieldrfc)
                                .addComponent(jTextFielddomicilio)
                                .addComponent(jTextFieldtelefono)
                                .addComponent(jTextFieldcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(jTextFieldpagina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnguardar)
                    .addComponent(jbtnmostrar)
                    .addComponent(jButton1))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
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
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldrazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldrfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFielddomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldpagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnprimero)
                            .addComponent(jbtnsiguiente)
                            .addComponent(jbtnatras)
                            .addComponent(jbtnultimo))
                        .addGap(65, 102, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnmostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmostrarActionPerformed
    try {
        conectar miconexion=new conectar();    
    String cons="select * from proveedor";
     consulta=miconexion.consulta(cons);
 consulta.next();
            mostrar(consulta);
 
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
}//GEN-LAST:event_jbtnmostrarActionPerformed

private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_button2ActionPerformed

private void jTextFielddomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddomicilioActionPerformed
 // TODO add your handling code here:
}//GEN-LAST:event_jTextFielddomicilioActionPerformed

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed

    try {
        //Instancias nuestra clase conectar
        conectar miconexion= new conectar();
        //Reemplaza valores 
        String sentenciaInsert="insert into proveedor values (?,?,?,?,?,?,?)";
        miconexion.prepararSentencias=miconexion.miconexion.prepareStatement(sentenciaInsert);
        miconexion.prepararSentencias.setString(1,jTextFieldclave.getText());
        miconexion.prepararSentencias.setString(2,jTextFieldrazon.getText());
        miconexion.prepararSentencias.setString(3,jTextFieldrfc.getText());
        miconexion.prepararSentencias.setString(4,jTextFielddomicilio.getText());
        miconexion.prepararSentencias.setString(5,jTextFieldtelefono.getText());
        miconexion.prepararSentencias.setString(6,jTextFieldcorreo.getText());
        miconexion.prepararSentencias.setString(7,jTextFieldpagina.getText());
       
        miconexion.prepararSentencias.executeUpdate();
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_jbtnguardarActionPerformed

    private void jbtnprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnprimeroActionPerformed
     try {  
         consulta.first();
         mostrar(consulta);
    }catch (Exception e){       
        System.out.println(e.getMessage());
    }    
    }//GEN-LAST:event_jbtnprimeroActionPerformed

    private void jbtnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnatrasActionPerformed
       //Boton anterior
         try {  
         consulta.previous();
         mostrar(consulta);
    }catch (Exception e){       
        System.out.println(e.getMessage());
    }    
        
    }//GEN-LAST:event_jbtnatrasActionPerformed

        private void jbtnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsiguienteActionPerformed
        // Siguiente
            try {  
         consulta.next();
         mostrar(consulta);
    }catch (Exception e){       
        System.out.println(e.getMessage());
    }    
    }//GEN-LAST:event_jbtnsiguienteActionPerformed

    private void jbtnultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnultimoActionPerformed
        // Ultimo
        try {  
         consulta.last();
         mostrar(consulta);
    }catch (Exception e){       
        System.out.println(e.getMessage());
    }    
    }//GEN-LAST:event_jbtnultimoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Limpiar
      
            jTextFieldclave.setText(""); 
            jTextFieldrazon.setText(""); 
            jTextFieldrfc.setText(""); 
            jTextFielddomicilio.setText(""); 
           jTextFieldtelefono.setText(""); 
            jTextFieldcorreo.setText(""); 
             jTextFieldpagina.setText("");
       
    }//GEN-LAST:event_jButton1ActionPerformed
    

   public static void main(String args[]) {
    
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run()
{
                new CatalogoProveedores().setVisible(true);
            }
        });
    }

 ResultSet consulta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldclave;
    private javax.swing.JTextField jTextFieldcorreo;
    private javax.swing.JTextField jTextFielddomicilio;
    private javax.swing.JTextField jTextFieldpagina;
    private javax.swing.JTextField jTextFieldrazon;
    private javax.swing.JTextField jTextFieldrfc;
    private javax.swing.JTextField jTextFieldtelefono;
    private javax.swing.JButton jbtnatras;
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
