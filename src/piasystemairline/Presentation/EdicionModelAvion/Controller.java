
package piasystemairline.Presentation.EdicionModelAvion;

import piasystemairline.PIASystemAirline;
import piasystemairline.Logic.ModeloAvion;

public class Controller {
    View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      vista.setControlador(this);
      vista.setModelEdit(model);
      vista.update(model, this);
    }

    public void Show() {
     Vista.setVisible(true);
    }

    void Add(ModeloAvion m) throws Exception {
        piasystemairline.Logic.Model.instance().AgregarModeloAvion(m);
        Vista.LimpiarTodo();
        PIASystemAirline.Controler_Avion.update();
    }
    public void Eliminar(String id) throws Exception {
        piasystemairline.Logic.Model.instance().EliminarModeloAvion(id);
    }
    public void Modificar(ModeloAvion m) throws Exception{
        piasystemairline.Logic.Model.instance().ModificarModeloAvion(m);
    }
    void MenuAvionShow() {
        PIASystemAirline.Controler_Avion.Show();
    }
    public ModeloAvion getModeloAvion(String id) throws Exception {
        return piasystemairline.Logic.Model.instance().ConsultarModeloAvion(id);
    }
    void Delate(String id) throws Exception {
        piasystemairline.Logic.Model.instance().EliminarModeloAvion(id);
        PIASystemAirline.Controler_Avion.update();
    }
  
}
