
package piasystemairline.Presentation.EdicionPagos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import piasystemairline.PIASystemAirline;
import piasystemairline.Logic.FormaPago;
import piasystemairline.Logic.Reservacion;

public class Controller {
    View Vista;
    View2 Vista2;
    Model modelo;
    public Controller(Model model, View vista, View2 vista2) {
      modelo = model;
      Vista = vista;
      Vista2 = vista2;
      Vista.setControlador(this);
      Vista.setModelEdit(modelo);
      Vista.update(modelo,this);
      Vista2.setControlador(this);
      Vista2.setModelEdit(modelo);
      Vista2.update(modelo,this);
      
    }

    public void Show() {
     
     Vista.setVisible(true);
    }
    public void Show2() {
      Vista2.CargarDatos();
      Vista2.setVisible(true);
    }
    void add(FormaPago f) throws Exception {
            piasystemairline.Logic.Model.instance().AgregarFormaPago(f);
    }
    void addRecerbacion(Reservacion R) throws Exception {
      PIASystemAirline.Controler_Reserva.Add(R);
      PIASystemAirline.Controler_Tiquete.setIdPago(R);
    }
   
    public void ObtenerReservaciones(){
     modelo.setReservaciones(piasystemairline.Logic.Model.instance().
             ObtenerListReservaciones());
    }
    public void ObtenerFormasPago(){
     modelo.setF(piasystemairline.Logic.Model.instance().ObtenerFormasPago());
    }
    public void ObtenerPersona(){
     modelo.setP(PIASystemAirline.Controler_Persona.Get());
    }
    void delate(String id) throws Exception {
     piasystemairline.Logic.Model.instance().EliminarFormaPago(id);
    }

    FormaPago Get(String id) throws Exception {
         return piasystemairline.Logic.Model.instance().ConsultarFormaPago(id);
    }

    String getIdtiquete() {
     return PIASystemAirline.Controler_Tiquete.idTiquete();
    }
    void AppShow() {
    PIASystemAirline.ControllerAPP.bandera= true;
    PIASystemAirline.ControllerAPP.OnButtons();
    }
    void TiqueteShowEnable() {
     PIASystemAirline.Controler_Tiquete.update();
    }

 
}
