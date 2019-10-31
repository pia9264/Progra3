
package piasystemairline.Presentation.EdicionPersona;

import piasystemairline.Logic.Persona;
import piasystemairline.PIASystemAirline;


public class Controller {

    View vista;
    Usersingin sing;
    Model modelo;
    public Controller(Model PersonaModel, View PersonaVista,Usersingin singVista) {
      modelo = PersonaModel;
      sing = singVista;
      vista = PersonaVista;
      vista.setControlador(this);
      vista.setModelEdit(PersonaModel);
      sing.setControlador(this);
      sing.setModelEdit(PersonaModel);
      vista.update(PersonaModel,PersonaVista);
    }
public void Add(Persona p) throws Exception{
        piasystemairline.Logic.Model.instance().AgregarPersona(p);
        PIASystemAirline.Controler_Persona.Set(p);
        vista.setVisible(false);
        vista.limpiar();
    }

    public void Show() {
      vista.isAdmin = modelo.getPersona().getIsAdmin();
      vista.welcome(modelo.getPersona().getIsAdmin());
      vista.setVisible(true);
    }
    
    void appON() {
     PIASystemAirline.Controler_Tiquete.update();
     PIASystemAirline.ControllerAPP.OnButtons();
    }

    void setName(String name, char admin) {
     PIASystemAirline.ControllerAPP.ChangeNameAndIsAdmin(name,admin);
    }
   public void setIsAdmin(){
    modelo.getPersona().setIsAdmin('1');
   }
    public void RenderP() throws Exception{
       vista.RenderPersona(modelo.getPersona());
    }

    public void Set(Persona p) {
     modelo.setPersona(p);
    }
    public Persona Get() {
     return modelo.getPersona();
    }
 
    public boolean IsRegistred(){
      if(modelo.getPersona().getUser().length()!=0) return true;
      
      return false;
    }

    public void update() {
    vista.update(modelo,vista);
    }

    public void singShow() {
    sing.setVisible(true);
    }

  
    public Persona Existe(String user, String pass) throws Exception {
      Persona p = piasystemairline.Logic.Model.instance().ConsultaUser(user);
      modelo.setPersona(p);
      if(pass.equals(p.getPass())){
      return p;
      }else{
      return p = new Persona(); 
      }
    }

    void ChangeNameAndIsAdmin(Persona p) {
     PIASystemAirline.ControllerAPP.ChangeNameAndIsAdmin(p.getName(),p.getIsAdmin());
    }

    void Edit(Persona p) throws Exception {
        piasystemairline.Logic.Model.instance().ModificarPersona(p);
        PIASystemAirline.Controler_Persona.Set(p);
        vista.setVisible(false);
        vista.limpiar();
        PIASystemAirline.ControllerAPP.OnButtons();
    }
   
}
