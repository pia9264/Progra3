package piasystemairline.Presentation.EdicionVuelo;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import piasystemairline.Logic.Pais;
import piasystemairline.Logic.Vuelo;


public class TableModel extends AbstractTableModel {
    List<Vuelo> vuelos;   

    public TableModel(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public List<Vuelo> Get() {
        return vuelos;
    }

    public void Set(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
    
    @Override
    public int getRowCount() {
        return vuelos.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "Day";
            case 1: return "Hour";
            case 2: return "From";
            case 3: return "";
            case 4: return "To";
            case 5: return "";
            default: return "";
        }        
    }

    @Override
    public Class<?> getColumnClass(int ColumnIndex){
    
        switch (ColumnIndex) {
            case 3: return Icon.class;
            case 5: return Icon.class;
            default: return super.getColumnClass(ColumnIndex);
        }
    
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vuelo v=vuelos.get(rowIndex);
        if(!"0".equals(v.getId())){
        switch(columnIndex){
            case 0: return v.getDay();
            case 1: return v.getTime();
            case 2: return v.getRuta().getOrigin().toString();
            case 3: return Flag(v.getRuta().getOrigin().getPais());
            case 4: return v.getRuta().getDestiny().toString();
            case 5: return Flag(v.getRuta().getDestiny().getPais());
            default: return "";
        }
        }else{return "";}
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
