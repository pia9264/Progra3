
package piasystemairline.Presentation.EdicionAsientos;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.fondo;

public class View extends javax.swing.JInternalFrame implements Observer {

    private int[] n_Asientos;
    public View() {
        cargarFondo();
        initComponents();
    }

    Model modelo;
    Controller controller;
    
    void setModelEdit(Model model) {
        this.modelo = model;
    }

    void setControlador(Controller aThis) {
         this.controller = aThis;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ready = new javax.swing.JButton();
        cantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(224, 231, 231));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        ready.setText("Ready");
        ready.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ready, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ready)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readyActionPerformed
        this.setVisible(false);
        controller.ActivarTiquete();
    }//GEN-LAST:event_readyActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
       if (evt.getClickCount() == 2 && modelo.getCantidad() !=0) {
        int fila = this.jTable1.rowAtPoint(evt.getPoint());
        int colum = this.jTable1.columnAtPoint(evt.getPoint());
        int n = (modelo.getA_Model().getSeatsPeRrow() *fila)+colum+1;
              controller.Add(n);
              if(modelo.getCantidad() ==0){
                 jTable1.setEnabled(false);
               }
              CargarJtable();
              
        } 
    }//GEN-LAST:event_TablaMouseClicked

    @Override
    public void update(Observable o, Object arg) {
     
    }
    
    public void CargarJtable() {
        jTable1.setModel(new TableModel(modelo.getSeat(),modelo.getVuelo(),controller));
        for(int i = 0; i < this.jTable1.getRowCount(); i++) {
        this.jTable1.setRowHeight(i,30);
    }
        cantidad.setText("Select:"+modelo.getCantidad()+" Seat");
    }

  private void cargarFondo(){
  fondo image=new fondo();
  image.setImage("/piasystemairline/Presentation/iconos/f.jpg");
  setContentPane(image);
 }
  

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantidad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton ready;
    // End of variables declaration//GEN-END:variables
}
