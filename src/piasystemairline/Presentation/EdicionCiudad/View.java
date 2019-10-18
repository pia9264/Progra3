/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piasystemairline.Presentation.EdicionCiudad;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.Pais;



public class View extends javax.swing.JInternalFrame implements Observer {
     private Controller controller;
     private Model model;
    public View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        pais = new javax.swing.JComboBox<>();
        close = new javax.swing.JButton();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        addContries = new javax.swing.JButton();
        delate = new javax.swing.JButton();
        shared = new javax.swing.JButton();

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Countries");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.setEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.setEnabled(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        addContries.setText("Add Country");
        addContries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addContriesActionPerformed(evt);
            }
        });

        delate.setText("Delate");
        delate.setEnabled(false);
        delate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delateActionPerformed(evt);
            }
        });

        shared.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-google_web_search.png"))); // NOI18N
        shared.setEnabled(false);
        shared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(close)
                        .addGap(67, 67, 67)
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name)
                            .addComponent(id)
                            .addComponent(pais, 0, 251, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addContries)
                            .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(delate)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addContries))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(add)
                    .addComponent(edit)
                    .addComponent(delate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void addContriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addContriesActionPerformed
        controller.PaisesShow();
    }//GEN-LAST:event_addContriesActionPerformed

    private void delateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delateActionPerformed
        controller.Delate(id.getText());
        limpiar();
    }//GEN-LAST:event_delateActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        Ciudad c = new Ciudad();
        c.setId(id.getText());
        c.setName(name.getText());
        c.setPais(pais.getItemAt(pais.getSelectedIndex()));
        controller.Edit(c);
        limpiar();
    }//GEN-LAST:event_editActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
       this.setVisible(false);
       limpiar();
       controller.AppShow();
    }//GEN-LAST:event_closeActionPerformed

    private void sharedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharedActionPerformed
     Ciudad c = controller.Shared(id.getText());
     id.setText(c.getId());
     name.setText(c.getName());
     pais.setSelectedItem(c.getPais());
    }//GEN-LAST:event_sharedActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       Ciudad c = new Ciudad();
       c.setId(id.getText());
       c.setName(name.getText());
       c.setPais(pais.getItemAt(pais.getSelectedIndex()));
       controller.Add(c);
       limpiar();
    }//GEN-LAST:event_addActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
     if(id.getText().isEmpty()){
        delate.setEnabled(false);
        add.setEnabled(false);
        edit.setEnabled(false);
        shared.setEnabled(false);
      }else{
        delate.setEnabled(true);
        add.setEnabled(true);
        shared.setEnabled(true);
        edit.setEnabled(true);
      }
    }//GEN-LAST:event_idKeyReleased

    @Override
    public void update(Observable o, Object arg) {
     cargarComboB();
     Centrar();
    }

    void setControlador(Controller aThis) {
     controller = aThis;
    }

    void setModelEdit(Model modelo) {
     model = modelo;
    }
   
    private void limpiar(){
     this.id.setText("");
     this.name.setText("");
     pais.setSelectedItem(new Pais());
    }
     private void cargarComboB(){
         this.pais.setModel(new DefaultComboBoxModel<Pais>(model.getPaises().toArray(new Pais[0])));  
     }
      private void Centrar() {
    Dimension desktopSize = this.getSize();
    this.setLocation((desktopSize.width/2),
    (desktopSize.height/2 - JFrame.HEIGHT));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton addContries;
    private javax.swing.JButton close;
    private javax.swing.JButton delate;
    private javax.swing.JButton edit;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<Pais> pais;
    private javax.swing.JButton shared;
    // End of variables declaration//GEN-END:variables
}
