package piasystemairline.Presentation.EdicionVuelo;

import piasystemairline.Logic.Vuelo;


public class Controller {
 View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      vista.setControlador(this);
      vista.setModelEdit(model);
      vista.update(model,vista);
    }

    public void Obtenerlist(){
     modelo.setAviones(piasystemairline.Logic.Model.instance().ObtenerListAviones());
     modelo.setRutas(piasystemairline.Logic.Model.instance().ObtenerListRutas());
    }
    public void Show() {
     Vista.setVisible(true);
    }
    
    public void Add(Vuelo v) throws Exception{
    piasystemairline.Logic.Model.instance().AgregarVuelo(v);
    }
    
     void modificar(Vuelo v) throws Exception {
            piasystemairline.Logic.Model.instance().ModificarVuelo(v);
            modelo.addObserver(Vista);
    }

    void Delate(String id) throws Exception {
            piasystemairline.Logic.Model.instance().EliminarVuelo(id);
    }
    public Vuelo get(String id) throws Exception{
     return piasystemairline.Logic.Model.instance().ConsultarVuelo(id);
    }
    public void update(){
    Vista.update(modelo,Vista);
    }

    void AppShow() {
    piasystemairline.PIASystemAirline.ControllerAPP.OnButtons();
    }
    
}
