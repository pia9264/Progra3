
package piasystemairline.Presentation.EdicionPagos;
import piasystemairline.PIASystemAirline;
import piasystemairline.Logic.FormaPago;

public class Controller {
    View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      Vista.setControlador(this);
      Vista.setModelEdit(modelo);
      Vista.update(modelo,this);
    }

    public void Show() {
     Vista.setVisible(true);
    }
    void add(FormaPago f) throws Exception {
            piasystemairline.Logic.Model.instance().AgregarFormaPago(f);
    }

    void delate(String id) throws Exception {
     piasystemairline.Logic.Model.instance().EliminarFormaPago(id);
    }

    FormaPago Get(String id) throws Exception {
         return piasystemairline.Logic.Model.instance().ConsultarFormaPago(id);
    }

    void AppShow() {
    PIASystemAirline.ControllerAPP.OnButtons();
    }   
}
