
package piasystemairline.Presentation.EdicionPagos;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import piasystemairline.Logic.FormaPago;
public class View extends javax.swing.JInternalFrame implements Observer {

    public View() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delate = new javax.swing.JButton();
        shared = new javax.swing.JButton();

        jLabel1.setText("ID");

        jLabel2.setText("Data");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(data)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(close)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(add)
                        .addGap(29, 29, 29)
                        .addComponent(delate)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(add)
                    .addComponent(delate)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
       Limpiar();
       this.setVisible(false);
       controller.AppShow();
    }//GEN-LAST:event_closeActionPerformed

    private void sharedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharedActionPerformed
        try {
            FormaPago p = controller.Get(id.getText());
            id.setText(p.getId());
            data.setText(p.getData());
           
        } catch (Exception ex) {
            id.setText("NO EXISTE!!");
        }
    }//GEN-LAST:event_sharedActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
         try {
            controller.add(new FormaPago(id.getText(),data.getText()));
            Limpiar();
        } catch (Exception ex) {
            id.setText("YA EXISTE!!");
        }
    }//GEN-LAST:event_addActionPerformed

    private void delateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delateActionPerformed
       try {
            controller.delate(id.getText());
            Limpiar();
        } catch (Exception ex) {
            id.setText("NO EXISTE!!");
        }
    }//GEN-LAST:event_delateActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        if(id.getText().isEmpty()){
        delate.setEnabled(false);
        add.setEnabled(false);
        shared.setEnabled(false);
      }else{
        delate.setEnabled(true);
        add.setEnabled(true);
        shared.setEnabled(true);
      }
    }//GEN-LAST:event_idKeyReleased

    @Override
    public void update(Observable o, Object arg) {
    Centrar();
    }

    
    private void Centrar() {
    Dimension desktopSize = this.getSize();
    this.setLocation((desktopSize.width),
    (desktopSize.height/2 - JFrame.HEIGHT));
    }
   private void Limpiar() {
      id.setText("");
      data.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton close;
    private javax.swing.JTextField data;
    private javax.swing.JButton delate;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton shared;
    // End of variables declaration//GEN-END:variables
}
