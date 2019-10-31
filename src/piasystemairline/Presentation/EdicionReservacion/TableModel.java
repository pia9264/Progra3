package piasystemairline.Presentation.EdicionReservacion;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import piasystemairline.Logic.Pais;
import piasystemairline.Logic.Reservacion;


public class TableModel extends AbstractTableModel {
    List<Reservacion> reresvaciones;   
    Controller controller;
    Model model;
    public TableModel(List<Reservacion> reresvaciones,Controller controller,Model model) {
        this.reresvaciones = reresvaciones;
        this.controller = controller;
        this.model = model;
    }

    public List<Reservacion> getPersonas() {
        return reresvaciones;
    }

    public void setPersonas(List<Reservacion> reresvaciones) {
        this.reresvaciones = reresvaciones;
    }
    
    @Override
    public int getRowCount() {
        return reresvaciones.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "DATE";
            case 1: return "TIME";
            case 2: return "PAYMENT";
            case 3: return "PRICE";
            case 4: return "ORIGIN";
            case 5: return "DESTINY";
            default: return "";
        }        
    }

    @Override
    public Class<?> getColumnClass(int ColumnIndex){
    
        switch (ColumnIndex) {
            case 4: return Icon.class;
            case 5: return Icon.class;
            default: return super.getColumnClass(ColumnIndex);
        }
    
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reservacion r=reresvaciones.get(rowIndex);
        controller.cargarTiquete(r.getTiqueteID());
        switch(columnIndex){
            case 0: return r.getDate().substring(0,10);
            case 1: return r.getDate().substring(11);
            case 2: return r.getFpago().getId();
            case 3: return "$"+model.getTiquete().getPrice();
            case 4: return Flag(model.getTiquete().getVuelo().getRuta().getOrigin().getPais());
            case 5: return Flag(model.getTiquete().getVuelo().getRuta().getDestiny().getPais());
            default: return "";
        }
    }  
    
    private Icon Flag(Pais p){
    String file = "";
    file = p.getId()+".png";
          try {
          return new ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/flags/"+file));
        } catch (Exception ex) {
          return new ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/flags/0.png"));
        }
        
    }
}
