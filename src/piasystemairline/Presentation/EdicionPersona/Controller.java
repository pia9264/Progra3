
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

    public void Show(char n) {
      vista.isAdmin = n;
      vista.welcome(n);
      vista.setVisible(true);
    }
    
    void appON() {
     piasystemairline.PIASystemAirline.ControllerAPP.OnButtons();
    }

    void setName(String name, char admin) {
    piasystemairline.PIASystemAirline.ControllerAPP.ChangeNameAndIsAdmin(name,admin);
    }

    public void CargarPersona(String user){
       Persona p = new Persona();
        try {
            p = piasystemairline.Logic.Model.instance().ConsultaUser(user);
        } catch (Exception ex) {
       
        }
       vista.Rellenar(p);
    }

   
}
