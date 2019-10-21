package piasystemairline.Presentation.EdicionPais;

import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import piasystemairline.Logic.Pais;


public class TableModel extends AbstractTableModel {
    List<Pais> paises;   

    public TableModel(List<Pais> paises) {
        this.paises = paises;
    }

    public List<Pais> getPersonas() {
        return paises;
    }

    public void setPersonas(List<Pais> paises) {
        this.paises = paises;
    }
    
    @Override
    public int getRowCount() {
        return paises.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "Id";
            case 1: return "Flag";
            case 2: return "Name";
            default: return "";
        }        
    }

    @Override
    public Class<?> getColumnClass(int ColumnIndex){
    
        switch (ColumnIndex) {
            case 1: return Icon.class;
            default: return super.getColumnClass(ColumnIndex);
        }
    
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pais p=paises.get(rowIndex);
        switch(columnIndex){
            case 0: return p.getId();
            case 1: return Flag(p);
            case 2: return p.getName();
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
