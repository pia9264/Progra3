package piasystemairline.Presentation.EdicionAsientos;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import piasystemairline.Logic.ModeloAvion;
import piasystemairline.Logic.Seat;
import piasystemairline.Logic.Vuelo;


public class TableModel extends AbstractTableModel {
    List<Seat> seat;   
    ModeloAvion A_Model;
    Vuelo vuelo;
    int nAsiento = 0;
    Controller controller;
    
    public ModeloAvion getA_Model() {
        return A_Model;
    }

    public void setA_Model(ModeloAvion A_Model) {
        this.A_Model = A_Model;
    }

    public TableModel(List<Seat> seat,Vuelo v,Controller c) {
        this.seat = seat;
        this.A_Model = v.getAvion().getM_Avion();
        this.vuelo = v;
        this.controller = c;
    }
    public List<Seat> getSeats() {
        return seat;
    }

    public void setSeats(List<Seat> seat) {
        this.seat = seat;
    }
    
    @Override
    public int getRowCount() {
        return A_Model.getNumberRows();
    }

    @Override
    public int getColumnCount() {
        return A_Model.getSeatsPeRrow();
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "";
            case 1: return "";
            case 2: return "";
            case 3: return "";
            case 4: return "";
            case 5: return "";
            case 6: return "";
            case 7: return "";
            case 8: return "";
            case 9: return "";
            default: return "";
        }        
    }

    @Override
    public Class<?> getColumnClass(int ColumnIndex){
    
        switch (ColumnIndex) {
            case 0: return Icon.class;
            case 1: return Icon.class;
            case 2: return Icon.class;
            case 3: return Icon.class;
            case 4: return Icon.class;
            case 5: return Icon.class;
            case 6: return Icon.class;
            case 7: return Icon.class;
            case 8: return Icon.class;
            default: return super.getColumnClass(ColumnIndex);
        }
    
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
          if (nAsiento == A_Model.getCapacity()) nAsiento = 0;
          nAsiento++;
        switch(columnIndex){
            case 0: return SeatIMG(controller.Existe(nAsiento));
            case 1: return SeatIMG(controller.Existe(nAsiento));
            case 2: return SeatIMG(controller.Existe(nAsiento));
            case 3: return SeatIMG(controller.Existe(nAsiento));
            case 4: return SeatIMG(controller.Existe(nAsiento));
            case 5: return SeatIMG(controller.Existe(nAsiento));
            case 6: return SeatIMG(controller.Existe(nAsiento));
            case 7: return SeatIMG(controller.Existe(nAsiento));
            case 8: return SeatIMG(controller.Existe(nAsiento));
            default: return "";
          }
          
    }  
    
    private Icon SeatIMG(boolean e){
        if(e){
        return new ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/color2.png"));
        }else{
        return new ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/color1.png"));
        }   
    }

      
 
    }

