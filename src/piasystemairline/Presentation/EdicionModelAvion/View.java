/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piasystemairline.Presentation.EdicionModelAvion;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import piasystemairline.Logic.ModeloAvion;

public class View extends javax.swing.JInternalFrame implements Observer {

    public View() {
        initComponents();
        rellenerCombo();
        Centrar();
        add.setEnabled(false);
        edit.setEnabled(false);
        shared.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        trademark = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        capacity = new javax.swing.JTextField();
        numberRows = new javax.swing.JTextField();
        CB_SeatRows = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        shared = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delate = new javax.swing.JButton();

        jLabel1.setText("TradeMark");

        jLabel2.setText("Age");

        jLabel3.setText("Capacity");

        jLabel4.setText("Number of Rows");

        jLabel5.setText("Seats for Rows");

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        shared.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-google_web_search.png"))); // NOI18N
        shared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharedActionPerformed(evt);
            }
        });

        jButton2.setText("Closed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delate.setText("Delate");
        delate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addComponent(jLabel5)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(trademark, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberRows, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_SeatRows, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add)
                .addGap(35, 35, 35)
                .addComponent(edit)
                .addGap(18, 18, 18)
                .addComponent(delate)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trademark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numberRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CB_SeatRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(edit)
                    .addComponent(jButton2)
                    .addComponent(delate))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       LimpiarTodo();
       this.setVisible(false);
       controller.MenuAvionShow();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
         ModeloAvion m = new ModeloAvion(id.getText(),Integer. parseInt(age.getText()),
                    trademark.getText(),Integer. parseInt(capacity.getText()),
                    Integer. parseInt(numberRows.getText()),CB_SeatRows.getSelectedIndex()+6);
        try {
            controller.Add(m);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
         ModeloAvion m = new ModeloAvion(id.getText(),Integer. parseInt(age.getText()),
                    trademark.getText(),Integer. parseInt(capacity.getText()),
                    Integer. parseInt(numberRows.getText()),CB_SeatRows.getSelectedIndex()+6);
        try {
            controller.Modificar(m);
        } catch (Exception ex) {}
    }//GEN-LAST:event_editActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
      
    }//GEN-LAST:event_idKeyPressed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped

    }//GEN-LAST:event_idKeyTyped

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
     if(id.getText().isEmpty()){
        add.setEnabled(false);
        edit.setEnabled(false);
        shared.setEnabled(false);
        delate.setEnabled(false);
      }else{
        add.setEnabled(true);
        edit.setEnabled(true);
        shared.setEnabled(true);
        delate.setEnabled(true);
      }
    }//GEN-LAST:event_idKeyReleased

    private void sharedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharedActionPerformed
        ModeloAvion m = new ModeloAvion();
        m = controller.getModeloAvion(id.getText());
        age.setText(Integer.toString(m.getAge()));
        capacity.setText(Integer.toString(m.getCapacity()));
        numberRows.setText(Integer.toString(m.getNumberRows()));
        trademark.setText(m.getTrademark());
        CB_SeatRows.setSelectedIndex(m.getSeatsPeRrow()-6);
    }//GEN-LAST:event_sharedActionPerformed

    private void delateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delateActionPerformed
       controller.Delate(id.getText());
    }//GEN-LAST:event_delateActionPerformed

    
    Model modelo;
    Controller controller;
    
    void setControlador(Controller c) {
      this.controller = c;
    }

    void setModelEdit(Model m) {
     this.modelo = m;
    }

   public void LimpiarTodo(){
    age.setText("");
    capacity.setText("");
    id.setText("");
    numberRows.setText("");
    trademark.setText("");
   }
   private void rellenerCombo(){
       for (int i = 6; i < 10; i++) {
           CB_SeatRows.addItem(Integer.toString(i));
          }
   }
    private void Centrar() {
    Dimension desktopSize = this.getSize();
    this.setLocation((desktopSize.width),
    (desktopSize.height/2 - JFrame.HEIGHT));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_SeatRows;
    private javax.swing.JButton add;
    private javax.swing.JTextField age;
    private javax.swing.JTextField capacity;
    private javax.swing.JButton delate;
    private javax.swing.JButton edit;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField numberRows;
    private javax.swing.JButton shared;
    private javax.swing.JTextField trademark;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
   
    }
}
