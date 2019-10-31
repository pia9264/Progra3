package piasystemairline.Presentation.App;

import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import piasystemairline.Logic.Pais;
import piasystemairline.Logic.Ruta;


public class TableModel extends AbstractTableModel {
    List<Ruta> ruta;   

    public TableModel(List<Ruta> ruta) {
        this.ruta = ruta;
    }

    public List<Ruta> getPersonas() {
        return ruta;
    }

    public void setPersonas(List<Ruta> ruta) {
        this.ruta = ruta;
    }
    
    @Override
    public int getRowCount() {
        return ruta.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "Origin";
            case 1: return "";
            case 2: return "Destiny";
            case 3: return "";
            case 4: return "Price";
            case 5: return "Discount";
            default: return "";
        }        
    }

    @Override
    public Class<?> getColumnClass(int ColumnIndex){
    
        switch (ColumnIndex) {
            case 1: return Icon.class;
            case 3: return Icon.class;
            default: return super.getColumnClass(ColumnIndex);
        }
    
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ruta p=ruta.get(rowIndex);
        switch(columnIndex){
            case 0: return p.getOrigin().getName();
            case 1: return Flag(p.getOrigin().getPais());
            case 2: return p.getDestiny().getName();
            case 3: return Flag(p.getDestiny().getPais());
            case 4: return "$"+p.getPrice();
            case 5: return p.getDiscount()+"%";
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
