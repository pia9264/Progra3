
package piasystemairline.Presentation.EdicionTiquete;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import piasystemairline.Logic.Tiquete;

public class View extends javax.swing.JInternalFrame  implements Observer  {

    public View() {
        initComponents();
    }
    private int n = 1;
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

        Lugar_Ida = new javax.swing.JLabel();
        trip = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        ciudadorigen = new javax.swing.JLabel();
        horaOrigen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        duracion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        back_fecha = new javax.swing.JLabel();
        CiudadDestiny = new javax.swing.JLabel();
        horadestiny = new javax.swing.JLabel();
        back_CiudadDestiny = new javax.swing.JLabel();
        back_horadestiny = new javax.swing.JLabel();
        back_ciudadorigen = new javax.swing.JLabel();
        back_horaOrigen = new javax.swing.JLabel();
        back_durationl = new javax.swing.JLabel();
        back_duracion = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ForPerson = new javax.swing.JLabel();
        totanForperson = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        taxes = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        payment = new javax.swing.JButton();
        noregistred = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descuento = new javax.swing.JLabel();
        seats = new javax.swing.JButton();
        TextSeat = new javax.swing.JLabel();

        setBackground(new java.awt.Color(98, 240, 238));

        Lugar_Ida.setFont(new java.awt.Font("Arial Hebrew", 1, 18)); // NOI18N
        Lugar_Ida.setText("Costa rica - Peru");

        trip.setForeground(new java.awt.Color(102, 102, 102));
        trip.setText("Round trip 1 adult ");

        jLabel1.setText("DEPARTURE");

        fecha.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        fecha.setText("Fecha");

        ciudadorigen.setForeground(new java.awt.Color(102, 102, 102));
        ciudadorigen.setText("Ciudadorigen");

        horaOrigen.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        horaOrigen.setText("Hora");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Duration");

        duracion.setText("duracion");

        jLabel3.setText("--------------------------------------------");

        back.setText("RETURN");

        back_fecha.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        back_fecha.setText("Fecha back");

        CiudadDestiny.setForeground(new java.awt.Color(102, 102, 102));
        CiudadDestiny.setText("CiudadDestino");

        horadestiny.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        horadestiny.setText("Hora");

        back_CiudadDestiny.setForeground(new java.awt.Color(51, 51, 51));
        back_CiudadDestiny.setText("CiudadDestino");

        back_horadestiny.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        back_horadestiny.setText("Hora");

        back_ciudadorigen.setForeground(new java.awt.Color(51, 51, 51));
        back_ciudadorigen.setText("Ciudadorigen");

        back_horaOrigen.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        back_horaOrigen.setText("Hora");

        back_durationl.setForeground(new java.awt.Color(51, 51, 51));
        back_durationl.setText("Duration");

        back_duracion.setText("duracion");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-cancel.png"))); // NOI18N
        close.setText("Cancel");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel5.setText("---------------------------------------------");

        jLabel6.setFont(new java.awt.Font("Al Tarikh", 1, 24)); // NOI18N
        jLabel6.setText("Payment detail");

        ForPerson.setBackground(new java.awt.Color(255, 255, 255));
        ForPerson.setForeground(new java.awt.Color(51, 51, 51));
        ForPerson.setText("Flight for 1 person");

        totanForperson.setForeground(new java.awt.Color(51, 51, 51));
        totanForperson.setText("$100.00");

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Taxes and fees");

        taxes.setForeground(new java.awt.Color(51, 51, 51));
        taxes.setText("$30.00");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel11.setText("TOTAL");

        total.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        total.setText("$130.00");

        payment.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-banknotes.png"))); // NOI18N
        payment.setText("Payment ");
        payment.setEnabled(false);
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        noregistred.setForeground(new java.awt.Color(255, 0, 0));
        noregistred.setText("Not registered yet");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Discount");

        descuento.setForeground(new java.awt.Color(51, 51, 51));
        descuento.setText("$10");

        seats.setText("choose seat");
        seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsActionPerformed(evt);
            }
        });

        TextSeat.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(back_horaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(back_ciudadorigen))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(back_CiudadDestiny)
                                    .addComponent(back_horadestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(back_durationl)
                                    .addComponent(back_duracion))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(back)
                                    .addComponent(back_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ForPerson)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taxes)
                            .addComponent(totanForperson, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descuento))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(total)
                        .addGap(56, 56, 56))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noregistred, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(close)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(payment)))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(trip, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Lugar_Ida, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextSeat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ciudadorigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(horaOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CiudadDestiny)
                                    .addComponent(horadestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(duracion))
                                .addGap(27, 27, 27)))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Lugar_Ida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trip, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ciudadorigen)
                    .addComponent(jLabel2)
                    .addComponent(CiudadDestiny))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaOrigen)
                    .addComponent(duracion)
                    .addComponent(horadestiny))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back_fecha)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_ciudadorigen)
                    .addComponent(back_durationl)
                    .addComponent(back_CiudadDestiny))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_horaOrigen)
                    .addComponent(back_duracion)
                    .addComponent(back_horadestiny))
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ForPerson)
                    .addComponent(totanForperson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taxes)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(descuento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(total))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(noregistred)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payment))
                    .addComponent(close))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
      controller.vueloShow();
      this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
       ToTiquete();
       controller.ShowPago();
       close.setEnabled(false);
    }//GEN-LAST:event_paymentActionPerformed

    private void seatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsActionPerformed
        this.seats.setEnabled(false);
        this.close.setEnabled(false);
        controller.ElegirAsiento(n);
    }//GEN-LAST:event_seatsActionPerformed

    @Override
    public void update(Observable o, Object arg) {
        Centrar();
        close.setEnabled(true);
        noregistred.setVisible(!controller.verificarRegistro());
        payment.setEnabled(controller.verificarRegistro());
    }

    public Tiquete ToTiquete(){
     double d = Double.valueOf(total.getText().substring(1));
     int n = (int)d;
     modelo.getTiquete().setPrice(n);
     String date = modelo.getTiquete().getDepartureDate()+" "+horaOrigen.getText();
     modelo.getTiquete().setDepartureDate(date);
     date = modelo.getTiquete().getReturnDate()+" "+back_horaOrigen.getText();
     modelo.getTiquete().setReturnDate(date);
     modelo.getTiquete().setId(String.valueOf(modelo.getTiquetes().size()+1));
     return modelo.getTiquete();
    }
    
    
   void RenderViaje(Tiquete v, int Adult, int child, boolean idavuelta) {
    n = Adult+child;
    payment.setEnabled(controller.verificarRegistro());
    noregistred.setVisible(!controller.verificarRegistro());
    Lugar_Ida.setText(v.getVuelo().getRuta().getOrigin().getPais().getName()
+" / "+v.getVuelo().getRuta().getDestiny().getPais().getName());
     trip.setText(dato(Adult,child,idavuelta));
     fecha.setText(v.getDepartureDate());
     ciudadorigen.setText(v.getVuelo().getRuta().getOrigin().getName());
     horaOrigen.setText(v.getVuelo().getTime());
     CiudadDestiny.setText(v.getVuelo().getRuta().getDestiny().getName());
     horadestiny.setText(time(v));
     duracion.setText(v.getVuelo().getRuta().getDuration());
//-----------------------------------------

if(!idavuelta){
    back.setVisible(false);
    back_CiudadDestiny.setVisible(false);
    back_ciudadorigen.setVisible(false);
    back_duracion.setVisible(false);
    back_durationl.setVisible(false);
    back_fecha.setVisible(false);
    back_horaOrigen.setVisible(false);
    back_horadestiny.setVisible(false);
}else{
    back_CiudadDestiny.setText(v.getVuelo().getRuta().getOrigin().getName());
    back_ciudadorigen.setText(v.getVuelo().getRuta().getDestiny().getName());
    back_duracion.setText(v.getVuelo().getRuta().getDuration());
    back_fecha.setText(v.getReturnDate());
    String h = String.valueOf(RandomIntIntRange(0,23));
    String m = String.valueOf(RandomIntIntRange(0,59));
    if(m.length()==1){m = "0"+m;}
    if(h.length()==1){h = "0"+h;}
    String date = h+":"+m+":00";
    back_horaOrigen.setText(date);
    v.getVuelo().setTime(date);
    back_horadestiny.setText(time(v));;
}
//---------------------------------------
    if(child !=0){
    ForPerson.setText("Flight for "+ Adult+" Adult and "+child+" Child");
    }else{ForPerson.setText("Flight for "+ Adult+" Adult");}
    totanForperson.setText("$"+String.valueOf(v.getPrice())+".00");
    double f = v.getPrice()*0.13;
    double to = v.getPrice()+f;
     taxes.setText("$"+String.valueOf(f));
     double d = v.getVuelo().getRuta().getDiscount();
     double des = v.getPrice()*(d/(double)100);
     descuento.setText("$"+ des);
     total.setText("$"+String.valueOf(to-des));

    }

        private String dato(int Adult, int child, boolean idavuelta){
       String s = "";
    if(idavuelta){
        s = "Round trip, ";
    }else{
       s = "One way, ";
    }
    if(Adult != 0){
      s = s+Adult+" Adult " ;
    }
    if(child != 0){
     s = s+"and "+child+" Child" ;
    }
    return s;
        } 
        

    private String time(Tiquete v) {
        String n1 = v.getVuelo().getTime().substring(0,2);
        String n2 = v.getVuelo().getRuta().getDuration().substring(0,2);
        int time = Integer.parseInt(n1)+Integer.parseInt(n2);
        if(time>=24){
         time = time-24;
        }
        
       return String.valueOf(time)+":"+v.getVuelo().getTime().substring(3,5)+":00"; 
    }
  
    private void Centrar() {
    Dimension desktopSize = this.getSize();
    this.setLocation((desktopSize.width + (desktopSize.width/3)),
    0);
    }
    
  public static int RandomIntIntRange(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
}
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CiudadDestiny;
    private javax.swing.JLabel ForPerson;
    private javax.swing.JLabel Lugar_Ida;
    private javax.swing.JLabel TextSeat;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back_CiudadDestiny;
    private javax.swing.JLabel back_ciudadorigen;
    private javax.swing.JLabel back_duracion;
    private javax.swing.JLabel back_durationl;
    private javax.swing.JLabel back_fecha;
    private javax.swing.JLabel back_horaOrigen;
    private javax.swing.JLabel back_horadestiny;
    private javax.swing.JLabel ciudadorigen;
    private javax.swing.JButton close;
    private javax.swing.JLabel descuento;
    private javax.swing.JLabel duracion;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel horaOrigen;
    private javax.swing.JLabel horadestiny;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel noregistred;
    private javax.swing.JButton payment;
    private javax.swing.JButton seats;
    private javax.swing.JLabel taxes;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totanForperson;
    private javax.swing.JLabel trip;
    // End of variables declaration//GEN-END:variables

    void activar() {
        
    }

    void activar(int[] N_Asiento) {
        this.seats.setEnabled(true);
        this.close.setEnabled(true);
        String s = "Seats: ";
        for (int i = 1; i <=n; i++) {
            s = s+N_Asiento[i]+" ";
        }
        this.TextSeat.setText(s);
    }

   

}
