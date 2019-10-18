
package piasystemairline.Presentation.EdicionRuta;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.Ruta;

public class View extends javax.swing.JInternalFrame implements Observer{

    public View() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        origin = new javax.swing.JComboBox<>();
        escale = new javax.swing.JComboBox<>();
        destiny = new javax.swing.JComboBox<>();
        close = new javax.swing.JButton();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delate = new javax.swing.JButton();
        shared = new javax.swing.JButton();

        jButton4.setText("jButton4");

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Duration");

        jLabel4.setText("Origin");

        jLabel5.setText("Escale");

        jLabel6.setText("Destiny");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(origin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(escale, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destiny, 0, 271, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(duration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(close)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(edit)
                        .addGap(18, 18, 18)
                        .addComponent(delate)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(origin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(escale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(destiny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
      this.setVisible(false);
      Limpiar();
      controller.AppShow();
    }//GEN-LAST:event_closeActionPerformed

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

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {
            controller.Add(ToRuta());
                 Limpiar();
        } catch (Exception ex) {
        id.setText("Ruta YA Existe!!");
        }
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try {
            controller.Edit(ToRuta());
            Limpiar();
        } catch (Exception ex) {
           id.setText("Ruta No Existe!!");
        }
    }//GEN-LAST:event_editActionPerformed

    private void delateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delateActionPerformed
        try {
            controller.Delate(id.getText());
             Limpiar();
        } catch (Exception ex) {
        id.setText("Ruta No Existe!!");
        }
    
    }//GEN-LAST:event_delateActionPerformed

    private void sharedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharedActionPerformed
        try {
            RenderRuta(Controller.Get(id.getText()));
        } catch (Exception ex) {
        id.setText("Ruta No EXISTE!!");
        }
    }//GEN-LAST:event_sharedActionPerformed

    @Override
    public void update(Observable o, Object arg) {
      CargarCombox();
    }

    
    public void Message(String txt){
        id.setText(txt);
    }
   Model modelo;
    Controller controller;
    
    void setControlador(Controller c) {
      this.controller = c;
    }

    void setModelEdit(Model m) {
     this.modelo = m;
    }

    private Ruta ToRuta(){
     Ruta r = new Ruta();
     r.setId(id.getText());
     r.setName(name.getText());
     r.setDuration(duration.getText());
     r.setOrigin(origin.getItemAt(origin.getSelectedIndex()));
     r.setScale(escale.getItemAt(escale.getSelectedIndex()));
     r.setDestiny(destiny.getItemAt(destiny.getSelectedIndex()));
     return r;
    }
    
     private void RenderRuta(Ruta r){
       name.setText(r.getName());
       duration.setText(r.getDuration());
       origin.setSelectedItem(r.getOrigin());
       escale.setSelectedItem(r.getScale());
       destiny.setSelectedItem(r.getDestiny());
     }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton close;
    private javax.swing.JButton delate;
    private javax.swing.JComboBox<Ciudad> destiny;
    private javax.swing.JTextField duration;
    private javax.swing.JButton edit;
    private javax.swing.JComboBox<Ciudad> escale;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<Ciudad> origin;
    private javax.swing.JButton shared;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
    id.setText("");
    name.setText("");
    duration.setText("");
    origin.setSelectedItem(new Ciudad());
    escale.setSelectedItem(new Ciudad());
    destiny.setSelectedItem(new Ciudad());
    }

    private void CargarCombox() {
     origin.setModel(new DefaultComboBoxModel<Ciudad>(modelo.getCiudades().toArray(new Ciudad[0])));
     escale.setModel(new DefaultComboBoxModel<Ciudad>(modelo.getCiudades().toArray(new Ciudad[0])));
     destiny.setModel(new DefaultComboBoxModel<Ciudad>(modelo.getCiudades().toArray(new Ciudad[0])));
    }
}
