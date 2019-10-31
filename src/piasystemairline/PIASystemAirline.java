
package piasystemairline;

// PUEDE VER ESTO! ?

import piasystemairline.Datos.CargarArchivosDatos;


// SI SI LO VEO

public class PIASystemAirline {

    
    public static void main(String[] args) {
        
        Inicio ini = new Inicio();
        ini.setVisible(true);
         CargarArchivosDatos d = new CargarArchivosDatos();
      //---------------------------Ciudades y Paises-------------------------------   
       piasystemairline.Presentation.EdicionPais.Model PaisModel = 
               new piasystemairline.Presentation.EdicionPais.Model();
       piasystemairline.Presentation.EdicionPais.View PaisVista = 
               new piasystemairline.Presentation.EdicionPais.View();
       piasystemairline.Presentation.EdicionPais.Controller PaisController = 
               new piasystemairline.Presentation.EdicionPais.Controller(PaisModel,PaisVista);
       Controler_Pais = PaisController;
       ini.jProgressBar1.setValue(10);
           piasystemairline.Presentation.EdicionCiudad.Model CiudadModel = 
               new piasystemairline.Presentation.EdicionCiudad.Model();
       piasystemairline.Presentation.EdicionCiudad.View CiudadVista = 
               new piasystemairline.Presentation.EdicionCiudad.View();
       piasystemairline.Presentation.EdicionCiudad.Controller CiudadController = 
               new piasystemairline.Presentation.EdicionCiudad.Controller(CiudadModel,CiudadVista);
        ini.jProgressBar1.setValue(20);
      Controler_Ciudad = CiudadController;
       //--------------------------- AvionModelo----------------------------------    
       piasystemairline.Presentation.EdicionModelAvion.Model ModelAvionModelo = 
               new piasystemairline.Presentation.EdicionModelAvion.Model();
       piasystemairline.Presentation.EdicionModelAvion.View AvionModeloVista = 
               new piasystemairline.Presentation.EdicionModelAvion.View();
       piasystemairline.Presentation.EdicionModelAvion.Controller AvionModeloController = 
               new piasystemairline.Presentation.EdicionModelAvion.Controller(ModelAvionModelo,AvionModeloVista);
       Controler_AvionModelo = AvionModeloController;
       ini.jProgressBar1.setValue(30);
      //-------------------------PERSONA-------------------------------
       piasystemairline.Presentation.EdicionPersona.Model PersonaModel = 
               new piasystemairline.Presentation.EdicionPersona.Model();
       piasystemairline.Presentation.EdicionPersona.View PersonaVista = 
               new piasystemairline.Presentation.EdicionPersona.View();
       piasystemairline.Presentation.EdicionPersona.Usersingin SingVista = 
               new piasystemairline.Presentation.EdicionPersona.Usersingin();
       piasystemairline.Presentation.EdicionPersona.Controller PersonaController = 
               new piasystemairline.Presentation.EdicionPersona.Controller(PersonaModel,PersonaVista,SingVista);
              Controler_Persona = PersonaController;
        ini.jProgressBar1.setValue(40);
     //-------------------------AVION---------------------------------
       piasystemairline.Presentation.EdicionAvion.Model AvionModel = 
               new piasystemairline.Presentation.EdicionAvion.Model();
       piasystemairline.Presentation.EdicionAvion.View AvionVista = 
               new piasystemairline.Presentation.EdicionAvion.View();
       piasystemairline.Presentation.EdicionAvion.Controller AvionController = 
               new piasystemairline.Presentation.EdicionAvion.Controller(AvionModel,AvionVista);
        
      Controler_Avion = AvionController;
      ini.jProgressBar1.setValue(50);
    //------------------------RUTA-------------------
       piasystemairline.Presentation.EdicionRuta.Model RutaModel = 
               new piasystemairline.Presentation.EdicionRuta.Model();
       piasystemairline.Presentation.EdicionRuta.View RutaVista = 
               new piasystemairline.Presentation.EdicionRuta.View();
       piasystemairline.Presentation.EdicionRuta.Controller RutaController = 
               new piasystemairline.Presentation.EdicionRuta.Controller(RutaModel,RutaVista);

        Controler_Ruta = RutaController;
        ini.jProgressBar1.setValue(60);
          //------------------------Vuelo-------------------
       piasystemairline.Presentation.EdicionVuelo.Model VueloModel = 
               new piasystemairline.Presentation.EdicionVuelo.Model();
       piasystemairline.Presentation.EdicionVuelo.View1 VueloVista1 = 
               new piasystemairline.Presentation.EdicionVuelo.View1();
        piasystemairline.Presentation.EdicionVuelo.View2 VueloVista2 = 
               new piasystemairline.Presentation.EdicionVuelo.View2();
       piasystemairline.Presentation.EdicionVuelo.Controller VueloController = 
               new piasystemairline.Presentation.EdicionVuelo.Controller(VueloModel,VueloVista1,VueloVista2);

        Controler_Vuelo = VueloController;
        ini.jProgressBar1.setValue(70);
      //-------------------------------FORMA DE PAGO-------------------------
        piasystemairline.Presentation.EdicionPagos.Model FormaPagoModel = 
               new piasystemairline.Presentation.EdicionPagos.Model();
       piasystemairline.Presentation.EdicionPagos.View FormaPagoVista = 
               new piasystemairline.Presentation.EdicionPagos.View();
         piasystemairline.Presentation.EdicionPagos.View2 FormaPagoVista2 = 
               new piasystemairline.Presentation.EdicionPagos.View2();
       piasystemairline.Presentation.EdicionPagos.Controller FormaPagoController = 
               new piasystemairline.Presentation.EdicionPagos.Controller(FormaPagoModel,FormaPagoVista,FormaPagoVista2);
     
      Controler_FPago = FormaPagoController;
      ini.jProgressBar1.setValue(80);
      
      //-------------------------------Asientos-------------------------
        piasystemairline.Presentation.EdicionTiquete.Model TiqueteModel = 
               new piasystemairline.Presentation.EdicionTiquete.Model();
        piasystemairline.Presentation.EdicionTiquete.View TiqueteVista = 
               new piasystemairline.Presentation.EdicionTiquete.View();
        piasystemairline.Presentation.EdicionTiquete.Controller TiqueteController = 
               new piasystemairline.Presentation.EdicionTiquete.Controller(TiqueteModel,TiqueteVista);
     
      Controler_Tiquete = TiqueteController;
      
       //-------------------------------Tiquete-------------------------
        piasystemairline.Presentation.EdicionAsientos.Model AsientosModel = 
               new piasystemairline.Presentation.EdicionAsientos.Model();
        piasystemairline.Presentation.EdicionAsientos.View AsientosVista = 
               new piasystemairline.Presentation.EdicionAsientos.View();
        piasystemairline.Presentation.EdicionAsientos.Controller AsientosController = 
               new piasystemairline.Presentation.EdicionAsientos.Controller(AsientosModel,AsientosVista);
     
      Controler_Asientos = AsientosController;
      
      
      ini.jProgressBar1.setValue(90);
       //-------------------------------Reservacion-------------------------
        piasystemairline.Presentation.EdicionReservacion.Model ReservaModel = 
               new piasystemairline.Presentation.EdicionReservacion.Model();
       piasystemairline.Presentation.EdicionReservacion.View ReservaVista = 
               new piasystemairline.Presentation.EdicionReservacion.View();
       piasystemairline.Presentation.EdicionReservacion.Controller ReservaController = 
               new piasystemairline.Presentation.EdicionReservacion.Controller(ReservaModel,ReservaVista);
      Controler_Reserva = ReservaController;       
     //----------------------------APP--------------------------------
       piasystemairline.Presentation.App.ModelApp AppModel = 
               new piasystemairline.Presentation.App.ModelApp();
       piasystemairline.Presentation.App.PiaAPP AppVista = 
               new piasystemairline.Presentation.App.PiaAPP();
       piasystemairline.Presentation.App.ControllerApp AppController = 
               new piasystemairline.Presentation.App.ControllerApp(AppModel,AppVista);
        ControllerAPP=AppController;
        ini.jProgressBar1.setValue(95);
      
        
        AppVista.fondo.add(PersonaVista);
        AppVista.fondo.add(SingVista);
        AppVista.fondo.add(AvionVista);
        AppVista.fondo.add(AvionModeloVista);
        AppVista.fondo.add(PaisVista);
        AppVista.fondo.add(CiudadVista);
        AppVista.fondo.add(RutaVista);
        AppVista.fondo.add(VueloVista1);
        AppVista.fondo.add(VueloVista2);
        AppVista.fondo.add(AsientosVista);
        AppVista.fondo.add(TiqueteVista);
        AppVista.fondo.add(ReservaVista);
        AppVista.fondo.add(FormaPagoVista);
        AppVista.fondo.add(FormaPagoVista2);
        ini.jProgressBar1.setValue(100);
        ini.setVisible(false);
        AppVista.setVisible(true);
    }
    public static piasystemairline.Presentation.EdicionCiudad.Controller Controler_Ciudad;
    public static piasystemairline.Presentation.EdicionPais.Controller Controler_Pais;
    public static piasystemairline.Presentation.EdicionAvion.Controller Controler_Avion;
    public static piasystemairline.Presentation.EdicionModelAvion.Controller Controler_AvionModelo;
    public static piasystemairline.Presentation.EdicionRuta.Controller Controler_Ruta;
    public static piasystemairline.Presentation.EdicionVuelo.Controller Controler_Vuelo;
    public static piasystemairline.Presentation.EdicionPersona.Controller Controler_Persona;
    public static piasystemairline.Presentation.EdicionPagos.Controller Controler_FPago;
    public static piasystemairline.Presentation.EdicionAsientos.Controller Controler_Asientos;
    public static piasystemairline.Presentation.EdicionTiquete.Controller Controler_Tiquete;
    public static piasystemairline.Presentation.EdicionReservacion.Controller Controler_Reserva;
    public static piasystemairline.Presentation.App.ControllerApp ControllerAPP;
   
}
