/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piasystemairline.Presentation.EdicionModelAvion;

import piasystemairline.Logic.ModeloAvion;

/**
 *
 * @author anibalchavesbadilla
 */
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
        piasystemairline.PIASystemAirline.Controler_Avion.update();
    }
    public void Eliminar(String id) throws Exception {
        piasystemairline.Logic.Model.instance().EliminarModeloAvion(id);
    }
    public void Modificar(ModeloAvion m) throws Exception{
        piasystemairline.Logic.Model.instance().ModificarModeloAvion(m);
    }
    void MenuAvionShow() {
        piasystemairline.PIASystemAirline.Controler_Avion.Show();
    }
    public ModeloAvion getModeloAvion(String id) throws Exception {
        return piasystemairline.Logic.Model.instance().ConsultarModeloAvion(id);
    }
    void Delate(String id) throws Exception {
        piasystemairline.Logic.Model.instance().EliminarModeloAvion(id);
        piasystemairline.PIASystemAirline.Controler_Avion.update();
    }
}
