/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piasystemairline.Presentation.App;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class PiaAPP extends javax.swing.JFrame implements Observer{
   ControllerApp controlador;
    public PiaAPP() {
        cargarFondo();
        initComponents();
        PantallaCompleta();
        salir.setVisible(false);
        Aministra.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        historia = new javax.swing.JButton();
        contactenos = new javax.swing.JButton();
        referente = new javax.swing.JButton();
        buscarVuelo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        singup = new javax.swing.JMenuItem();
        singin = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        Aministra = new javax.swing.JMenu();
        Aircraft = new javax.swing.JMenuItem();
        Cities = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Routes = new javax.swing.JMenuItem();
        Payment = new javax.swing.JMenuItem();
        Reports = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        historia.setBackground(new java.awt.Color(51, 0, 255));
        historia.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        historia.setText("Historia");
        historia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiaActionPerformed(evt);
            }
        });

        contactenos.setBackground(new java.awt.Color(51, 0, 255));
        contactenos.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        contactenos.setText("Contactenos");
        contactenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        contactenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactenosActionPerformed(evt);
            }
        });

        referente.setBackground(new java.awt.Color(51, 0, 255));
        referente.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        referente.setText("Referente institucional");
        referente.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        referente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenteActionPerformed(evt);
            }
        });

        buscarVuelo.setBackground(new java.awt.Color(51, 0, 255));
        buscarVuelo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        buscarVuelo.setText("Buscar Vuelo");
        buscarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarVueloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(referente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                .addGap(283, 283, 283))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(buscarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(referente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(historia, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contactenos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jMenu1.setText("NAME");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("USER");
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMenu2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        singup.setText("Sign up");
        singup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singupActionPerformed(evt);
            }
        });
        jMenu2.add(singup);

        singin.setText("Sign in");
        singin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singinActionPerformed(evt);
            }
        });
        jMenu2.add(singin);

        salir.setText("Log out");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu2.add(salir);

        jMenuBar1.add(jMenu2);

        Aministra.setText(" Administration");

        Aircraft.setText("Aircraft");
        Aircraft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AircraftActionPerformed(evt);
            }
        });
        Aministra.add(Aircraft);

        Cities.setText("Cities and Countries");
        Cities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitiesActionPerformed(evt);
            }
        });
        Aministra.add(Cities);

        jMenuItem1.setText("Routes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Aministra.add(jMenuItem1);

        Routes.setText("Flights");
        Routes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoutesActionPerformed(evt);
            }
        });
        Aministra.add(Routes);

        Payment.setText("Payment Methods");
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        Aministra.add(Payment);

        Reports.setText("Reports");
        Aministra.add(Reports);

        jMenuBar1.add(Aministra);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historiaActionPerformed

    private void contactenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactenosActionPerformed

    private void referenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenteActionPerformed

    private void singinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singinActionPerformed
          
           QuitarTodo();
        if ("Sign in".equals(singin.getText())) {
           singup.setEnabled(false);
           singin.setEnabled(false);
           controlador.SinginShow();
        }
    }//GEN-LAST:event_singinActionPerformed

    private void singupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singupActionPerformed
        QuitarTodo();
        if ("Sign up".equals(singup.getText())) {
            controlador.EdcionPersonaShow(); 
        }else{
            try {
                controlador.EdcionPersonaShow();
                controlador.CargarDatosPersonas(jMenu2.getText());
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_singupActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
     singup.setText("Sign up");
     singin.setText("Sign in");
     salir.setVisible(false);
     Aministra.setVisible(false);
     jMenu2.setText("USER");
    }//GEN-LAST:event_salirActionPerformed

    private void buscarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarVueloActionPerformed

    private void AircraftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AircraftActionPerformed
        QuitarTodo();
        controlador.EdcionAvionShow();
    }//GEN-LAST:event_AircraftActionPerformed

    private void CitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitiesActionPerformed
        QuitarTodo();
        controlador.EdicionCiudadesPaises();
    }//GEN-LAST:event_CitiesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        QuitarTodo();
        controlador.EdcionRutaShow();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void RoutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoutesActionPerformed
        QuitarTodo();
        controlador.EdicionVueloShow();
    }//GEN-LAST:event_RoutesActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        QuitarTodo();
        controlador.EdicionFormaPago();
    }//GEN-LAST:event_PaymentActionPerformed

 public void QuitarTodo(){
         singup.setEnabled(false);
         singin.setEnabled(false);
         buscarVuelo.setVisible(false);
         contactenos.setVisible(false);
         historia.setVisible(false);
         referente.setVisible(false);     
 }
 
public void PonerTodo(){
         buscarVuelo.setVisible(true);
         contactenos.setVisible(true);
         historia.setVisible(true);
         referente.setVisible(true);
         singup.setEnabled(true);
         singin.setEnabled(true);
 }



 void setControlador(ControllerApp c) {
     this.controlador = c;
 }

 public void IsAdmin(){
 
 }
 
 private void cargarFondo(){
  fondo image=new fondo();
  image.setImage("/piasystemairline/Presentation/iconos/a.jpg");
  setContentPane(image);
 }
 private void PantallaCompleta(){
  fondo.setOpaque(false);
  this.setExtendedState(JFrame.MAXIMIZED_BOTH);
  this.fondo.setBounds(this.getX(),this.getY(),this.getWidth(),this.getHeight());
}
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Aircraft;
    private javax.swing.JMenu Aministra;
    private javax.swing.JMenuItem Cities;
    private javax.swing.JMenuItem Payment;
    private javax.swing.JMenuItem Reports;
    private javax.swing.JMenuItem Routes;
    private javax.swing.JButton buscarVuelo;
    private javax.swing.JButton contactenos;
    public javax.swing.JPanel fondo;
    private javax.swing.JButton historia;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton referente;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem singin;
    private javax.swing.JMenuItem singup;
    // End of variables declaration//GEN-END:variables

    void UserActivate(String name, char admin) {
      this.jMenu2.setText(name);
        if (admin == '1') {
        Aministra.setVisible(true);
        singup.setText("My Infomation");
        singin.setText("Previous Reservations");
        singup.setEnabled(true);
        singin.setEnabled(true);
        salir.setVisible(true);
        }else{    
        singup.setText("My Infomation");
        singin.setText("Previous Reservations");
        singup.setEnabled(true);
        singin.setEnabled(true);
        salir.setVisible(true);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
   
    }
}
