
package piasystemairline.Presentation.EdicionAvion;

import java.awt.Dimension;
import java.util.Observable;

import java.util.Observer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.ModeloAvion;

public class View extends javax.swing.JInternalFrame implements Observer {

    public View() {
        initComponents();
        Centrar();
    }

    Model modelo;
    Controller controller;
    
    void setControlador(Controller c) {
      this.controller = c;
    }

    void setModelEdit(Model m) {
     this.modelo = m;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        delate = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        closed = new javax.swing.JButton();
        Modelos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Aircraft management");

        jLabel2.setText("ID");

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delate.setText("Delate");
        delate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delateActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        closed.setText("Closed");
        closed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closedActionPerformed(evt);
            }
        });

        jLabel3.setText("Modelos");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-google_web_search.png"))); // NOI18N

        jButton2.setText("Add Model");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Modelos, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(closed, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(add)
                        .addGap(48, 48, 48)
                        .addComponent(edit)
                        .addGap(59, 59, 59)
                        .addComponent(delate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Modelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(delate)
                    .addComponent(edit)
                    .addComponent(closed))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
       controller.addModelo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
    if(id.getText().isEmpty()){
        add.setEnabled(false);
        edit.setEnabled(false);
        delate.setEnabled(false);
      }else{
        add.setEnabled(true);
        edit.setEnabled(true);
        delate.setEnabled(true);
      }
    }//GEN-LAST:event_idKeyReleased

    private void closedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closedActionPerformed
       this.setVisible(false);
       Limpiar();
       controller.appON();
    }//GEN-LAST:event_closedActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        controller.Add(ToAvion());
        Limpiar();
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
      controller.modificar(ToAvion());
      Limpiar();
    }//GEN-LAST:event_editActionPerformed

    private void delateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delateActionPerformed
       controller.Delate(id.getText());
       Limpiar();
    }//GEN-LAST:event_delateActionPerformed

    private Avion ToAvion(){
     return new Avion(id.getText(),Modelos.getItemAt(Modelos.getSelectedIndex()));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<ModeloAvion> Modelos;
    private javax.swing.JButton add;
    private javax.swing.JButton closed;
    private javax.swing.JButton delate;
    private javax.swing.JButton edit;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables


    private void Centrar() {
    Dimension desktopSize = this.getSize();
    this.setLocation((desktopSize.width/2),
    (desktopSize.height/2 - JFrame.HEIGHT));
    }
    
     private void cargarComboB(){
         this.Modelos.setModel(new DefaultComboBoxModel<ModeloAvion>(modelo.getModelos().toArray(new ModeloAvion[0])));  
     }

    private void Limpiar(){
    id.setText("");
    Modelos.setSelectedItem(new ModeloAvion());
    }
    @Override
    public void update(Observable o, Object arg) {
     controller.Obtenerlist();
     cargarComboB();
    }
}
