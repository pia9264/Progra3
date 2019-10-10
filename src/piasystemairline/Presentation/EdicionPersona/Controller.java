/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piasystemairline.Presentation.EdicionPersona;

import piasystemairline.Logic.Persona;

/**
 *
 * @author anibalchavesbadilla
 */
public class Controller {

    View vista;
    Model modelo;
    public Controller(Model PersonaModel, View PersonaVista) {
      modelo = PersonaModel;
      vista = PersonaVista;
      vista.setControlador(this);
      vista.setModelEdit(PersonaModel);
      vista.update(PersonaModel,PersonaVista);
    }
public void agregar(Persona p) throws Exception{
        piasystemairline.Logic.Model.instance().agregarPersona(p);
    }

    public void Show() {
      vista.setVisible(true);
    }

   
}
