
package piasystemairline.Presentation.App;
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
}
