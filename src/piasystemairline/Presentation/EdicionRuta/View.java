
package piasystemairline.Presentation.EdicionRuta;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
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
        origin = new javax.swing.JComboBox<>();
        escale = new javax.swing.JComboBox<>();
        destiny = new javax.swing.JComboBox<>();
        close = new javax.swing.JButton();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delate = new javax.swing.JButton();
        shared = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hora = new javax.swing.JComboBox<>();
        min = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        discount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setBackground(new java.awt.Color(98, 240, 238));

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Duration");

        jLabel4.setText("Origin");

        jLabel5.setText("Escale");

        jLabel6.setText("Destiny");

        id.setEditable(false);

        name.setEditable(false);

        origin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                originItemStateChanged(evt);
            }
        });

        escale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escaleActionPerformed(evt);
            }
        });

        destiny.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                destinyItemStateChanged(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-circled_left_2.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-add.png"))); // NOI18N
        add.setText("Add");
        add.setEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-edit.png"))); // NOI18N
        edit.setText("Edit");
        edit.setEnabled(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-trash.png"))); // NOI18N
        delate.setText("Delate");
        delate.setEnabled(false);
        delate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delateActionPerformed(evt);
            }
        });

        shared.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-google_web_search.png"))); // NOI18N
        shared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharedActionPerformed(evt);
            }
        });

        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });

        jLabel7.setText("Price");

        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "24", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        min.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("Routes Management");

        discount.setText("0");
        discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discountKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel9.setText("%");

        jLabel10.setText("Discount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(close)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add)
                        .addGap(18, 18, 18)
                        .addComponent(edit)
                        .addGap(18, 18, 18)
                        .addComponent(delate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(escale, 0, 224, Short.MAX_VALUE)
                            .addComponent(origin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destiny, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(price)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
      this.setVisible(false);
      Limpiar();
      controller.AppShow();
    }//GEN-LAST:event_closeActionPerformed

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

    private void originItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_originItemStateChanged
   id.setText(origin.getItemAt(origin.getSelectedIndex()).getId().substring(0,2)+
   "-"+escale.getItemAt(escale.getSelectedIndex()).getId().substring(0,2)+
   "-"+destiny.getItemAt(destiny.getSelectedIndex()).getId().substring(0,2));
   
   name.setText(origin.getItemAt(origin.getSelectedIndex()).getPais().getName()
   +"/"+destiny.getItemAt(destiny.getSelectedIndex()).getPais().getName());
    }//GEN-LAST:event_originItemStateChanged

    private void destinyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_destinyItemStateChanged
   id.setText(origin.getItemAt(origin.getSelectedIndex()).getId().substring(0,2)+
   "-"+escale.getItemAt(escale.getSelectedIndex()).getId().substring(0,2)+
   "-"+destiny.getItemAt(destiny.getSelectedIndex()).getId().substring(0,2));
        
   name.setText(origin.getItemAt(origin.getSelectedIndex()).getPais().getName()
   +"/"+destiny.getItemAt(destiny.getSelectedIndex()).getPais().getName());
    }//GEN-LAST:event_destinyItemStateChanged

    private void escaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escaleActionPerformed
   id.setText(origin.getItemAt(origin.getSelectedIndex()).getId().substring(0,2)+
   "-"+escale.getItemAt(escale.getSelectedIndex()).getId().substring(0,2)+
   "-"+destiny.getItemAt(destiny.getSelectedIndex()).getId().substring(0,2));
    }//GEN-LAST:event_escaleActionPerformed

    private void discountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyReleased
     if(discount.getText().length()>2){
     String s = discount.getText().substring(0,2);
      discount.setText(s);
     }     
    }//GEN-LAST:event_discountKeyReleased

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
        if(!price.getText().isEmpty()){
         add.setEnabled(true);
         close.setEnabled(true);
         delate.setEnabled(true);
         edit.setEnabled(true);
        }
    }//GEN-LAST:event_priceKeyReleased

    @Override
    public void update(Observable o, Object arg) {
      
      CargarCombox();
      Centrar();
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
     r.setDuration(hora.getItemAt(hora.getSelectedIndex())+":"+
     min.getItemAt(min.getSelectedIndex()));
     r.setOrigin(origin.getItemAt(origin.getSelectedIndex()));
     r.setScale(escale.getItemAt(escale.getSelectedIndex()));
     r.setDestiny(destiny.getItemAt(destiny.getSelectedIndex()));
     r.setPrice(Integer.parseInt(price.getText()));
     if(discount.getText().isEmpty()){discount.setText("0");}
     r.setDiscount(Integer.parseInt(discount.getText()));
     return r;
    }
    
     private void RenderRuta(Ruta r){
       name.setText(r.getName());
       hora.setSelectedItem(r.getDuration().substring(0,2));
       min.setSelectedItem(r.getDuration().substring(3,5));
       origin.setSelectedItem(r.getOrigin());
       escale.setSelectedItem(r.getScale());
       destiny.setSelectedItem(r.getDestiny());
       price.setText(String.valueOf(r.getPrice()));
       discount.setText(String.valueOf(r.getDiscount()));
     }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton close;
    private javax.swing.JButton delate;
    private javax.swing.JComboBox<Ciudad> destiny;
    private javax.swing.JTextField discount;
    private javax.swing.JButton edit;
    private javax.swing.JComboBox<Ciudad> escale;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> min;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<Ciudad> origin;
    private javax.swing.JTextField price;
    private javax.swing.JButton shared;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
    id.setText("");
    name.setText("");
    hora.setSelectedIndex(0);
    min.setSelectedIndex(0);
    price.setText("");
    discount.setText("0");
    origin.setSelectedItem(new Ciudad());
    escale.setSelectedItem(new Ciudad());
    destiny.setSelectedItem(new Ciudad());
    }

    private void CargarCombox() {
     origin.setModel(new DefaultComboBoxModel<Ciudad>(modelo.getCiudades().toArray(new Ciudad[0])));
     escale.setModel(new DefaultComboBoxModel<Ciudad>(modelo.getCiudades().toArray(new Ciudad[0])));
     destiny.setModel(new DefaultComboBoxModel<Ciudad>(modelo.getCiudades().toArray(new Ciudad[0])));
    }
    private void Centrar() {
    Dimension desktopSize = this.getSize();
    this.setLocation((desktopSize.width - JFrame.WIDTH),
    (desktopSize.height/5- JFrame.HEIGHT/2));
    }
}
