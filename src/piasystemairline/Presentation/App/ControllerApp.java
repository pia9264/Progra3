
package piasystemairline.Presentation.App;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.FormaPago;
import piasystemairline.Logic.ModeloAvion;
import piasystemairline.Logic.Pais;
import piasystemairline.Logic.Persona;
import piasystemairline.Logic.Reservacion;
import piasystemairline.Logic.Ruta;
import piasystemairline.Logic.Tiquete;
import piasystemairline.Logic.Vuelo;
import piasystemairline.PIASystemAirline;

public class ControllerApp {
    ModelApp model;
    PiaAPP vista;
    public boolean bandera = true;
    public ControllerApp(ModelApp model, PiaAPP vista) {
       
          this.model = model;
          this.vista = vista;
          vista.setControlador(this);
          vista.setModel(model);
          try {InicializarBase();} catch (Exception ex) {}
          VerificarExisteAdmin();
          vista.update(model, this);
   }
   
   public void Obtenerlist(){
    model.setRutas(piasystemairline.Logic.Model.instance().ObtenerListRutasDescuento());
    }
   public void EdcionPersonaShow(){
   PIASystemAirline.Controler_Tiquete.update();
   PIASystemAirline.Controler_Persona.Show();
   }
   public void EdcionAvionShow(){
   PIASystemAirline.Controler_Avion.Show();
   bandera = false;
   }
   public void EdcionRutaShow(){
   PIASystemAirline.Controler_Ruta.Show();
   bandera = false;
   }
   
    void RegistroShow() {
    PIASystemAirline.Controler_Reserva.Show();
   bandera = false;
    }
    void EdicionCiudadesPaises() {
    PIASystemAirline.Controler_Ciudad.Show();
    bandera = false;
    }
    
    void EdicionVueloShowV1() {
    PIASystemAirline.Controler_Vuelo.ShowV1();
    bandera = false;
    }
    
    
    void EdicionVueloShowV2() {
     PIASystemAirline.Controler_Vuelo.ShowV2();
     bandera = false;
    }
    
    void EdicionFormaPago() {
    PIASystemAirline.Controler_FPago.Show();
    bandera = false;
    }
    public void OnButtons() {
     if(bandera){vista.PonerTodo();}
      vista.ponersing();
    
    }
    void EdicionViaje() {
        PIASystemAirline.Controler_Tiquete.Show();
        bandera = false;
    }

    public void ChangeNameAndIsAdmin(String name, char admin) {
    vista.UserActivate(name,admin);
    }

    void SinginShow(){
    PIASystemAirline.Controler_Persona.singShow();
    }

    void CargarDatosPersonas() throws Exception {
     PIASystemAirline.Controler_Persona.Show();
     PIASystemAirline.Controler_Persona.RenderP();
    }
    
    private void InicializarBase() throws Exception{
      piasystemairline.Logic.Model.instance().AgregarPais(new Pais());
      piasystemairline.Logic.Model.instance().AgregarCuidad(new Ciudad());
      piasystemairline.Logic.Model.instance().AgregarRuta(new Ruta());
      piasystemairline.Logic.Model.instance().AgregarModeloAvion(new ModeloAvion());
      piasystemairline.Logic.Model.instance().AgregarAvion(new Avion());
      piasystemairline.Logic.Model.instance().AgregarVuelo(new Vuelo());
      piasystemairline.Logic.Model.instance().AgregarFormaPago(new FormaPago());
      piasystemairline.Logic.Model.instance().AgregarReservacion(new Reservacion());
      piasystemairline.Logic.Model.instance().AgregarTiquete(new Tiquete());
   }

    private void VerificarExisteAdmin(){
       if(piasystemairline.Logic.Model.instance().ObtenerListPersonas().isEmpty()){
            vista.setVisible(true);
            vista.QuitarTodo();
            piasystemairline.PIASystemAirline.Controler_Persona.setIsAdmin();
            piasystemairline.PIASystemAirline.Controler_Persona.Show();
       }
    }

    void SalirUser() {
    PIASystemAirline.Controler_Persona.Set(new Persona());
    PIASystemAirline.Controler_Tiquete.update();
    }



    public void update(){
    vista.update(model, this);
    }

    void EnviarVueloClick(int fila) {
     Ruta r = model.getRutas().get(fila);
     vista.QuitarTodo();
     EdicionVueloShowV2();
     piasystemairline.PIASystemAirline.Controler_Vuelo.BuscarVuelo(r.getOrigin(),r.getDestiny(),"%%","");
    }

    void Edcionasientos() {
     piasystemairline.PIASystemAirline.Controler_Asientos.ViewShow();
    }

   


    

}
