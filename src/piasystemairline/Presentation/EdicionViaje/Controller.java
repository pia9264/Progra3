/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piasystemairline.Presentation.EdicionViaje;

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
      Vista.setControlador(this);
      Vista.setModelEdit(modelo);
      Vista.update(modelo, this);
    }

    public void Show() {
    Vista.setVisible(true);
    }

    void AppShow() {
    piasystemairline.PIASystemAirline.ControllerAPP.OnButtons();
    }
    
}
