
package piasystemairline.Presentation.EdicionVuelo;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultComboBoxModel;
import org.freixas.jcalendar.JCalendarCombo;
import piasystemairline.Logic.Ciudad;

public class View2 extends javax.swing.JInternalFrame implements Observer {
   public View2() {
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
    
 private void initComponents() {
        idaVueltaGrup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        origin = new javax.swing.JComboBox<>();
        destiny = new javax.swing.JComboBox<>();
        ida_vuelta = new javax.swing.JRadioButton();
        ida = new javax.swing.JRadioButton();
        Date1 = new JCalendarCombo();
        Date2 = new  JCalendarCombo();
        Adul_n = new javax.swing.JComboBox<>();
        Chil_n = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        find = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        close = new javax.swing.JButton();
        setBackground(new java.awt.Color(103, 153, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hello travelers. Where would you like go?");

        idaVueltaGrup.add(ida_vuelta);
        ida_vuelta.setText("Round-trip");

        idaVueltaGrup.add(ida);
        ida.setText("One-way");
        ida_vuelta.setSelected(true);
        Adul_n.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        Chil_n.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0","1", "2", "3", "4", "5", "6", "7" }));

        jLabel2.setFont(new java.awt.Font("Nadeem", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adults");

        jLabel3.setFont(new java.awt.Font("Nadeem", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Child");

        find.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        find.setText("Find deals");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(103, 153, 255));
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ida_vuelta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                        .addComponent(ida))
                                    .addComponent(origin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(destiny, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Adul_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Chil_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(find, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(close)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(origin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destiny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ida_vuelta)
                    .addComponent(ida))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chil_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adul_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(find, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close))
        );

        pack();
    }// </editor-fold>                        

    private void findActionPerformed(java.awt.event.ActionEvent evt) {                                     
     controller.BuscarVuelo(origin.getItemAt(origin.getSelectedIndex()),
     destiny.getItemAt(destiny.getSelectedIndex()),GetDay(1),GetDay(2));
    }                                    

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {                                      
      this.setVisible(false);
      controller.AppShow();
    }                                                        
    private javax.swing.JComboBox<String> Adul_n;
    private javax.swing.JComboBox<String> Chil_n;
    private JCalendarCombo Date1;
    private JCalendarCombo Date2;
    private javax.swing.JButton close;
    private javax.swing.JComboBox<Ciudad> destiny;
    private javax.swing.JButton find;
    private javax.swing.JComboBox<Ciudad>origin;
    private javax.swing.JRadioButton ida;
    private javax.swing.ButtonGroup idaVueltaGrup;
    private javax.swing.JRadioButton ida_vuelta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;              

    @Override
    public void update(Observable o, Object arg) {
    Centrar();
    cargarComboB();
    CargarJtable();
    }
    public void update2() {
    controller.ObtenerlistVuelo();
    CargarJtable();
    }
    private void Centrar() {
    Dimension desktopSize = this.getSize();
    this.setLocation((desktopSize.width/3),
    0);
    }
    
    
    private boolean getIdaVuelta(){
     if(ida_vuelta.isSelected()){return true;}
     return false;
    }
    private String GetDay(int n){
        String d ;
         if(n==1){d = Date1.getSelectedItem().toString();}
         else{d = Date2.getSelectedItem().toString();}
         String day = d.substring(0,2);
        switch (day) {
            case "lu":
                day = "Monday";
                break;
            case "ma":
                day = "Tuesday";
                break;
            case "mi":
                day = "Wednesday";
                break;
            case "ju":
                day = "Thursday";
                break;
            case "vi":
                day = "Friday";
                break; 
            case "sá":
                day = "Saturday";
                break;
            case "do":
                day = "Sunday";
                break;   
                
            
        }
        return day;
    }
    
    
      private void cargarComboB(){
         controller.ObtenerlistCiudad();
         DefaultComboBoxModel<Ciudad> c1 = new DefaultComboBoxModel<Ciudad>(modelo.getCiudades().toArray(new Ciudad[0]));
         DefaultComboBoxModel<Ciudad> c2 = new DefaultComboBoxModel<Ciudad>(modelo.getCiudades().toArray(new Ciudad[0]));
         this.destiny.setModel(c1);
         this.origin.setModel(c2);
     }
      
    private void CargarJtable() {
        jTable1.setModel(new TableModel(modelo.getVuelos()));
        for(int i = 0; i < this.jTable1.getRowCount(); i++) {
        this.jTable1.setRowHeight(i,30);
    }
    }
    
      private void TablaMouseClicked(java.awt.event.MouseEvent evt) {
          SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
      if (evt.getClickCount() == 2) {
        int fila = this.jTable1.rowAtPoint(evt.getPoint());
        controller.EnviarVueloClick(fila,
                 Integer.parseInt(Adul_n.getItemAt(Adul_n.getSelectedIndex())),
                 Integer.parseInt(Chil_n.getItemAt(Chil_n.getSelectedIndex())),getIdaVuelta()
        ,dt1.format(Date1.getDate()),dt1.format(Date2.getDate()));
        }
    } 
}
