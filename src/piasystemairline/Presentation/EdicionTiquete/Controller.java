
package piasystemairline.Presentation.EdicionTiquete;

import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Reservacion;
import piasystemairline.Logic.Tiquete;
import piasystemairline.PIASystemAirline;

public class Controller {
    View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      Vista.setControlador(this);
      Vista.setModelEdit(modelo);
      Vista.update(modelo, this);
    }

    public void Show() {
        Vista.setVisible(true);
        modelo.setTiquetes(piasystemairline.Logic.Model.instance().ObtenerListTiquetes());
    }
    public void setTiqueteDetalles(String id, int Adult, int child,boolean isidavuelta,String Fecha1,String Fecha2) {
        try {
        modelo.setVuelo(piasystemairline.Logic.Model.instance().ConsultarVuelo(id));
        Tiquete v = new Tiquete();
        v.setVuelo(modelo.getVuelo());
        v.setDepartureDate(Fecha1);
        v.setReturnDate(Fecha2);
        v.setPrice(calcularprecio(Adult,child,isidavuelta,
        modelo.getVuelo().getRuta().getPrice()));
        modelo.setTiquete(v);
        Vista.RenderViaje(v,Adult,child,isidavuelta);
        } catch (Exception ex) {}
    }

    private int calcularprecio(int Adult, int child, boolean idavuelta, int price) {
        int n = 1;
        if(idavuelta){n = 2;}
        return ((price*Adult)+((price/2)*child))*n;
    }

    void vueloShow() {
    PIASystemAirline.Controler_Vuelo.ShowV2();
    }

    boolean verificarRegistro() {
      return PIASystemAirline.Controler_Persona.IsRegistred();
    }

    public void update() {
    Vista.update(modelo,Vista);
    }

    void ShowPago() {
    PIASystemAirline.Controler_FPago.Show2();
    }

    public void setIdPago(Reservacion R) {
     modelo.getTiquete().setReservacion(R);
        try {
            piasystemairline.Logic.Model.instance().AgregarTiquete(modelo.getTiquete());
            Vista.setVisible(false);
            PIASystemAirline.ControllerAPP.bandera = true;
            PIASystemAirline.ControllerAPP.OnButtons();
        } catch (Exception ex) {
        }
    }

   public String idTiquete(){
   return modelo.getTiquete().getId();
   }

    void ElegirAsiento(int n) {
       PIASystemAirline.Controler_Asientos.ViewShow();
       PIASystemAirline.Controler_Asientos.cantidad(n);
       PIASystemAirline.Controler_Asientos.SetVuelo(modelo.getVuelo());
    }
    public void Activar(int[] N_Asiento) {
    Vista.activar(N_Asiento);
    }

}
