package piasystemairline.Presentation.EdicionVuelo;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.Vuelo;


public class Controller {
    View1 Vista1;
    View2 Vista2;
    Model modelo;
    public Controller(Model model, View1 vista1,View2 vista2) {
      modelo = model;
      Vista1 = vista1;
      Vista2 = vista2;
      ObtenerlistVuelo();
      vista1.setControlador(this);
      vista1.setModelEdit(model);
      vista1.update(model,vista1);
      vista2.setControlador(this);
      vista2.setModelEdit(model);
      vista2.update(model,vista2);
    }

    public void ObtenerlistCiudad(){
     modelo.setCiudades(piasystemairline.Logic.Model.instance().ObtenerListCiudades());
    }
     public void ObtenerlistAvion(){
     modelo.setAviones(piasystemairline.Logic.Model.instance().ObtenerListAviones());
    } 
     public void ObtenerlistRuta(){
     modelo.setRutas(piasystemairline.Logic.Model.instance().ObtenerListRutas());
    }
     public void ObtenerlistVuelo(){
     modelo.setVuelos(piasystemairline.Logic.Model.instance().ObtenerListVuelos());
    }
   
    
    public void ShowV1() {
     Vista1.setVisible(true);
    }
    public void ShowV2() {
     Vista2.setVisible(true);
    }
    public void Add(Vuelo v) throws Exception{
      piasystemairline.Logic.Model.instance().AgregarVuelo(v);
      Vista2.update2();
    }
    
    void modificar(Vuelo v) throws Exception {
            piasystemairline.Logic.Model.instance().ModificarVuelo(v);
            Vista2.update2();
            modelo.addObserver(Vista1);
    }

    void Delate(String id) throws Exception {
            piasystemairline.Logic.Model.instance().EliminarVuelo(id);
            Vista2.update2();
    }
    public Vuelo get(String id) throws Exception{
     return piasystemairline.Logic.Model.instance().ConsultarVuelo(id);
    }
    public void update(){
    Vista1.update(modelo,Vista1);
    Vista2.update(modelo,Vista2);
    }

    void AppShow() {
    piasystemairline.PIASystemAirline.ControllerAPP.bandera= true;
    piasystemairline.PIASystemAirline.ControllerAPP.OnButtons();
    }

    public void BuscarVuelo(Ciudad origin,Ciudad destiny,String day1,String day2) {
        Vuelo filtro = new Vuelo();
        if("0".equals(destiny.getId())){
         destiny.setId("%%");
        }
        filtro.getRuta().setDestiny(destiny);
        filtro.getRuta().setOrigin(origin);
        filtro.setDay(day1);
        modelo.setVuelos(piasystemairline.Logic.Model.instance().FindVueloList(filtro));
        Vista2.update(modelo,this);
    }        

    void EnviarVueloClick(int fila, int Adult, int child,boolean isIdayvuelta,String Fecha1,String Fecha2) {
        piasystemairline.PIASystemAirline.Controler_Tiquete.setTiqueteDetalles(
               modelo.getVuelos().get(fila).getId(),Adult,child,isIdayvuelta,Fecha1,Fecha2);
        Vista2.setVisible(false);
        piasystemairline.PIASystemAirline.Controler_Tiquete.Show();
    }
}
