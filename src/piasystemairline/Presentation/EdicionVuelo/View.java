package piasystemairline.Presentation.EdicionVuelo;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.Ruta;
import piasystemairline.Logic.Vuelo;


public class View extends javax.swing.JInternalFrame implements Observer{

 
    public View() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        routes = new javax.swing.JComboBox<>();
        airplane = new javax.swing.JComboBox<>();
        dia = new javax.swing.JComboBox<>();
        hora = new javax.swing.JComboBox<>();
        min = new javax.swing.JComboBox<>();
        close = new javax.swing.JButton();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delate = new javax.swing.JButton();
        share = new javax.swing.JButton();

        jLabel1.setText("ID");

        jLabel2.setText("Route");

        jLabel3.setText("AirPlane");

        jLabel4.setText("Day and Hour");

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
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

        share.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-google_web_search.png"))); // NOI18N
        share.setEnabled(false);
        share.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(routes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(airplane, 0, 270, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(share, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(min, 0, 63, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(close)
                        .addGap(18, 18, 18)
                        .addComponent(add)
                        .addGap(18, 18, 18)
                        .addComponent(edit)
                        .addGap(18, 18, 18)
                        .addComponent(delate)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(share, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(routes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(airplane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(add)
                    .addComponent(edit)
                    .addComponent(delate))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
          Limpiar();
          this.setVisible(false);
          controller.AppShow();
    }//GEN-LAST:event_closeActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
     if(id.getText().isEmpty()){
        add.setEnabled(false);
        edit.setEnabled(false);
        delate.setEnabled(false);
        share.setEnabled(false);
      }else{
        add.setEnabled(true);
        edit.setEnabled(true);
        delate.setEnabled(true);
        share.setEnabled(true);
      }
    }//GEN-LAST:event_idKeyReleased

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {
            controller.Add(ToVuelo());
            Limpiar();
        } catch (Exception ex) {
            id.setText("YA EXISTE!!");
        }
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try {
            controller.modificar(ToVuelo());
            Limpiar();
        } catch (Exception ex) {
            id.setText("NO EXISTE!!");
        }
    }//GEN-LAST:event_editActionPerformed

    private void delateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delateActionPerformed
        try {
            controller.Delate(id.getText());
            Limpiar();
        } catch (Exception ex) {
          id.setText("NO EXISTE!!");
        }
    }//GEN-LAST:event_delateActionPerformed

    private void shareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareActionPerformed
        try {
            RenderVuelo(controller.get(id.getText()));
        } catch (Exception ex) {
           id.setText("NO EXISTE!!");
        }
    }//GEN-LAST:event_shareActionPerformed

    @Override
    public void update(Observable o, Object arg) {
     Centrar();
     cargarComboB();
    }


    private void Centrar() {
    Dimension desktopSize = this.getSize();
    this.setLocation((desktopSize.width/2),
    (desktopSize.height/2 - JFrame.HEIGHT));
    }
    
     private void cargarComboB(){
         controller.Obtenerlist();
         DefaultComboBoxModel<Avion> a = new DefaultComboBoxModel<Avion>(modelo.getAviones().toArray(new Avion[0]));
         DefaultComboBoxModel<Ruta> r = new DefaultComboBoxModel<Ruta>(modelo.getRutas().toArray(new Ruta[0]));
         if(a.getSize()>1 && r.getSize()>1){
           this.airplane.setModel(a);
           this.routes.setModel(r);
             for (int i = 0; i < 60; i++) {
                   if(i<10){this.min.addItem("0"+i);}
                   else{this.min.addItem(""+i);}
             }
         }else{
           id.setEnabled(false);
           id.setText("No Existen Rutas O Aviones!!");
         }
     }
     
    private Vuelo ToVuelo() {
        return new Vuelo(id.getText(),hora.getItemAt(hora.getSelectedIndex())+":"+
                min.getItemAt(min.getSelectedIndex())+":00",
                dia.getItemAt(dia.getSelectedIndex()),
                airplane.getItemAt(airplane.getSelectedIndex()),
                routes.getItemAt(routes.getSelectedIndex()));
     }
     
    private void RenderVuelo(Vuelo v) {
     id.setText(v.getId());
     routes.setSelectedItem(v.getRuta());
     airplane.setSelectedItem(v.getAvion());
     dia.setSelectedItem(v.getDay());
     hora.setSelectedItem(v.getTime().substring(0,2));
     min.setSelectedItem(v.getTime().substring(3,5));
    }
     
     private void Limpiar(){
     id.setText("");
     routes.setSelectedItem(new Ruta());
     airplane.setSelectedItem(new Avion());
     dia.setSelectedItem("Monday");
     hora.setSelectedItem("00");
     min.setSelectedItem("00");
     }
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JComboBox<Avion> airplane;
    private javax.swing.JButton close;
    private javax.swing.JButton delate;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JButton edit;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> min;
    private javax.swing.JComboBox<Ruta> routes;
    private javax.swing.JButton share;
    // End of variables declaration//GEN-END:variables

    

    
    
}
