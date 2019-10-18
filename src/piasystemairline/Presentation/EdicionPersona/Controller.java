
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
public void Add(Persona p) throws Exception{
        piasystemairline.Logic.Model.instance().AgregarPersona(p);
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

    public void Get(String user) throws Exception{
       Persona p = new Persona();
       p = piasystemairline.Logic.Model.instance().ConsultaUser(user);
       vista.RenderPersona(p);
    }

   
}
