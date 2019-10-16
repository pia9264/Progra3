/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piasystemairline.Presentation.EdicionModelAvion;

import java.util.logging.Level;
import java.util.logging.Logger;
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
      vista.update(model,vista);
    }

    public void Show() {
     Vista.setVisible(true);
    }

    void Add(ModeloAvion m) throws Exception {
      piasystemairline.Logic.Model.instance().agregarModeloAvion(m);
      Vista.setVisible(false);
    }
    
    public void Cargar(String id){
     ModeloAvion m = new ModeloAvion();
        try {
            m = piasystemairline.Logic.Model.instance().ConsultarModeloAvion(id);
        } catch (Exception ex) {
        }
    }
    
    public void Eliminar(String id) {
        try {
            piasystemairline.Logic.Model.instance().EliminarModeloAvion(id);
        } catch (Exception ex) {
        }
    }
    
   public void Modificar(ModeloAvion m){
        try {
            piasystemairline.Logic.Model.instance().ModificarModeloAvion(m);
        } catch (Exception ex) {
        }
   }
}
