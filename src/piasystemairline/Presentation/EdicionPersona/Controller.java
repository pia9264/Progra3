
package piasystemairline.Presentation.EdicionPersona;

import piasystemairline.Logic.Persona;


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
        vista.setVisible(false);
    }

    public void Show() {
      vista.setVisible(true);
    }

   
}
