
package piasystemairline.Presentation.EdicionAsientos;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Seat;
import piasystemairline.Logic.Vuelo;
import piasystemairline.PIASystemAirline;

public class Controller {
    View Vista;
    Model modelo;
    private int[] N_Asiento;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      Vista.setControlador(this);
      Vista.setModelEdit(modelo);
      Vista.update(modelo, this);
      N_Asiento = new int[20];
    }
    
    public void ViewShow(){
    Vista.setVisible(true);
    }

    public void SetVuelo(Vuelo vuelo) {
        modelo.setSeat(piasystemairline.Logic.Model.instance().ListSeats(vuelo));
        modelo.setVuelo(vuelo);
        modelo.setA_Model(vuelo.getAvion().getM_Avion());
        Vista.CargarJtable();
    }

    void ActivarTiquete() {
    PIASystemAirline.Controler_Tiquete.Activar(N_Asiento);
    }
    
     public boolean Existe(int n) {
        for (int i = 0; i < modelo.getSeat().size(); i++) {
            if(modelo.getSeat().get(i).getNumero() == n) return true;
            }
        return false;
    }

    void Add(int n) {
        Seat s = new Seat();
        s.setId_vuelo(modelo.getVuelo().getId());
        s.setNumero(n);
        if(!Existe(n)){
            try {
                piasystemairline.Logic.Model.instance().AgregarSeat(s);
                System.out.print(modelo.getCantidad());
                N_Asiento[modelo.getCantidad()] = n;
                modelo.setCantidad(modelo.getCantidad()-1);
            } catch (Exception ex) {}
        modelo.setSeat(piasystemairline.Logic.Model.instance().
        ListSeats(modelo.getVuelo()));
        }
    }

    public void cantidad(int n) {
        modelo.setCantidad(n);
    }
}
