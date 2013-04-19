
package UI;

import javax.swing.JOptionPane;
import prestamo.Main;

public class AniadirPrestamo extends javax.swing.JFrame {

    /** Creates new form GestionarPrestamo */
    public AniadirPrestamo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tIsbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tLibro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tAutor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        tFechaprestamo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tDiasprest = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Titulo Libro");

        jLabel2.setText("ISBN");

        tLibro.setEnabled(false);

        jLabel3.setText("Autor");

        tAutor.setEnabled(false);

        jLabel4.setText("Fecha Prestamo");

        tFechaprestamo.setEnabled(false);
        tFechaprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFechaprestamoActionPerformed(evt);
            }
        });

        jLabel5.setText("Dias a prestar");

        tDiasprest.setEnabled(false);

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir y no Guardar");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                            .addComponent(bBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                    .addComponent(tLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                    .addComponent(tAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tDiasprest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tFechaprestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSalir)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bBuscar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tFechaprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tDiasprest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalir)
                    .addComponent(bGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tFechaprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFechaprestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFechaprestamoActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
    String clave;
    clave = tIsbn.getText();

    if(clave.equals("")==false){

    int pos = Main.controlsoft.buscarLibros(clave);

    if(pos!=-1){
        tLibro.setText(Main.controlsoft.getLibros().get(pos).getNombre());
        tAutor.setText(Main.controlsoft.getLibros().get(pos).getAutor());
        tFechaprestamo.setText(Main.controlsoft.obtenerFechaActual());
        tDiasprest.setEnabled(true);
    }
    else{
    JOptionPane.showMessageDialog(this,"Libro Inexistente","Error",JOptionPane.ERROR_MESSAGE);
    tLibro.setText("");
    tAutor.setText("");
    tFechaprestamo.setText("");
    }
 }
 else{
     JOptionPane.showMessageDialog(this,"Ingrese ISBN que corresponde al Libro a buscar!","Error",JOptionPane.ERROR_MESSAGE);
 }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        //Verificar T.ISBN por si fue escrito nuevamente
    if(tLibro.getText().equals(Main.controlsoft.getLibros().get(Main.controlsoft.buscarLibros(tIsbn.getText())).getNombre())==false){
    for(int i=0; i<Main.controlsoft.getLibros().size();i++){
        if(tLibro.getText().equals(Main.controlsoft.getLibros().get(i).getNombre())==true){
            tIsbn.setText(Main.controlsoft.getLibros().get(i).getIsbn());
        }
    }
    }
    if(tIsbn.getText().equals("")==false && tDiasprest.getText().equals("")==false){
    long claveSocio = Long.parseLong(Main.mPrincipal.getNprestamo().gettDni().getText());
    Main.controlsoft.aniadirPrestamo(claveSocio,tIsbn.getText(),tLibro.getText(),tAutor.getText(),tFechaprestamo.getText(),Integer.parseInt(tDiasprest.getText()));
        }
    else
    if(tIsbn.equals("")==true)
        JOptionPane.showMessageDialog(this,"Ingrese ISBN que corresponde al Libro a buscar!","Error",JOptionPane.ERROR_MESSAGE);
    if(tDiasprest.equals("")==true && tIsbn.equals("")==false){
        JOptionPane.showMessageDialog(this,"Ingrese Cantidad de Dias del Prestamo","Error",JOptionPane.ERROR_MESSAGE);
        this.dispose();
    }
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AniadirPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tAutor;
    private javax.swing.JTextField tDiasprest;
    private javax.swing.JTextField tFechaprestamo;
    private javax.swing.JTextField tIsbn;
    private javax.swing.JTextField tLibro;
    // End of variables declaration//GEN-END:variables

}
