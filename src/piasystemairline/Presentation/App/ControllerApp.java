
package piasystemairline.Presentation.App;
import piasystemairline.Logic.Persona;
import piasystemairline.PIASystemAirline;

public class ControllerApp {
    ModelApp model;
    PiaAPP vista;

    public ControllerApp(ModelApp model, PiaAPP vista) {
        this.model = model;
        this.vista = vista;
        vista.setControlador(this);
    }
    
   public void EdcionPersonaShow(){
   PIASystemAirline.Controler_Persona.Show();
   }
   public void EdcionAvionShow(){
   PIASystemAirline.Controler_Avion.Show();
   }
   public void EdcionRutaShow(){
   PIASystemAirline.Controler_Ruta.Show();
   }
   public void EdcionHorarioShow(){
   }

    public void OnButtons() {
    vista.PonerTodo();
    }

    public void ChangeNameAndIsAdmin(String name, char admin) {
    vista.UserActivate(name,admin);
    }

    Persona Existe(String user, String pass) throws Exception {
      Persona p = piasystemairline.Logic.Model.instance().ConsultaUser(user);
      if(pass.equals(p.getPass())){
      return p;
      }else{
      return p = new Persona(); 
      }
    }

    void appON() {
     piasystemairline.PIASystemAirline.ControllerAPP.OnButtons();
    }
    
    void SinginShow(){
      Usersingin u = new Usersingin();
      u.setController(this);
      vista.fondo.add(u);
      
    }
}
