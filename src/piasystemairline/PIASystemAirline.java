
package piasystemairline;

// PUEDE VER ESTO! ?

// SI SI LO VEO

public class PIASystemAirline {

    
    public static void main(String[] args) {
        
        //-------------------------PERSONA-------------------------------
       piasystemairline.Presentation.EdicionPersona.Model PersonaModel = 
               new piasystemairline.Presentation.EdicionPersona.Model();
       piasystemairline.Presentation.EdicionPersona.View PersonaVista = 
               new piasystemairline.Presentation.EdicionPersona.View();
       piasystemairline.Presentation.EdicionPersona.Controller PersonaController = 
               new piasystemairline.Presentation.EdicionPersona.Controller(PersonaModel,PersonaVista);
    
       Controler_Persona = PersonaController;
   //--------------------------- AvionModelo----------------------------------    
       piasystemairline.Presentation.EdicionModelAvion.Model ModelAvionModelo = 
               new piasystemairline.Presentation.EdicionModelAvion.Model();
       piasystemairline.Presentation.EdicionModelAvion.View AvionModeloVista = 
               new piasystemairline.Presentation.EdicionModelAvion.View();
       piasystemairline.Presentation.EdicionModelAvion.Controller AvionModeloController = 
               new piasystemairline.Presentation.EdicionModelAvion.Controller(ModelAvionModelo,AvionModeloVista);
       Controler_AvionModelo = AvionModeloController;
       
    //-------------------------AVION---------------------------------
       piasystemairline.Presentation.EdicionAvion.Model AvionModel = 
               new piasystemairline.Presentation.EdicionAvion.Model();
       piasystemairline.Presentation.EdicionAvion.View AvionVista = 
               new piasystemairline.Presentation.EdicionAvion.View();
       piasystemairline.Presentation.EdicionAvion.Controller AvionController = 
               new piasystemairline.Presentation.EdicionAvion.Controller(AvionModel,AvionVista);
        
      Controler_Avion = AvionController;
   //---------------------------Ciudades y Paises-------------------------------
       piasystemairline.Presentation.EdicionCiudad.Model CiudadModel = 
               new piasystemairline.Presentation.EdicionCiudad.Model();
       piasystemairline.Presentation.EdicionCiudad.View CiudadVista = 
               new piasystemairline.Presentation.EdicionCiudad.View();
       piasystemairline.Presentation.EdicionCiudad.Controller CiudadController = 
               new piasystemairline.Presentation.EdicionCiudad.Controller(CiudadModel,CiudadVista);
        
      Controler_Ciudad = CiudadController;
      
       piasystemairline.Presentation.EdicionPais.Model PaisModel = 
               new piasystemairline.Presentation.EdicionPais.Model();
       piasystemairline.Presentation.EdicionPais.View PaisVista = 
               new piasystemairline.Presentation.EdicionPais.View();
       piasystemairline.Presentation.EdicionPais.Controller PaisController = 
               new piasystemairline.Presentation.EdicionPais.Controller(PaisModel,PaisVista);
        
      Controler_Pais = PaisController;
    //------------------------RUTA-------------------
       piasystemairline.Presentation.EdicionRuta.Model RutaModel = 
               new piasystemairline.Presentation.EdicionRuta.Model();
       piasystemairline.Presentation.EdicionRuta.View RutaVista = 
               new piasystemairline.Presentation.EdicionRuta.View();
       piasystemairline.Presentation.EdicionRuta.Controller RutaController = 
               new piasystemairline.Presentation.EdicionRuta.Controller(RutaModel,RutaVista);

        Controler_Ruta = RutaController;
        
          //------------------------Vuelo-------------------
       piasystemairline.Presentation.EdicionVuelo.Model VueloModel = 
               new piasystemairline.Presentation.EdicionVuelo.Model();
       piasystemairline.Presentation.EdicionVuelo.View VueloVista = 
               new piasystemairline.Presentation.EdicionVuelo.View();
       piasystemairline.Presentation.EdicionVuelo.Controller VueloController = 
               new piasystemairline.Presentation.EdicionVuelo.Controller(VueloModel,VueloVista);

        Controler_Vuelo = VueloController;
        
        
    //----------------------------APP--------------------------------
       piasystemairline.Presentation.App.ModelApp AppModel = 
               new piasystemairline.Presentation.App.ModelApp();
       piasystemairline.Presentation.App.PiaAPP AppVista = 
               new piasystemairline.Presentation.App.PiaAPP();
       AppVista.fondo.add(PersonaVista);
       piasystemairline.Presentation.App.ControllerApp AppController = 
               new piasystemairline.Presentation.App.ControllerApp(AppModel,AppVista);
        ControllerAPP=AppController;
        
        
        AppVista.setVisible(true);
        AppVista.fondo.add(AvionVista);
        AppVista.fondo.add(AvionModeloVista);
        AppVista.fondo.add(PaisVista);
        AppVista.fondo.add(CiudadVista);
        AppVista.fondo.add(RutaVista);
        AppVista.fondo.add(VueloVista);
       
    }
    public static piasystemairline.Presentation.EdicionCiudad.Controller Controler_Ciudad;
    public static piasystemairline.Presentation.EdicionPais.Controller Controler_Pais;
    public static piasystemairline.Presentation.EdicionAvion.Controller Controler_Avion;
    public static piasystemairline.Presentation.EdicionModelAvion.Controller Controler_AvionModelo;
    public static piasystemairline.Presentation.EdicionRuta.Controller Controler_Ruta;
    public static piasystemairline.Presentation.EdicionVuelo.Controller Controler_Vuelo;
    public static piasystemairline.Presentation.EdicionPersona.Controller Controler_Persona;
    public static piasystemairline.Presentation.App.ControllerApp ControllerAPP;
  
}
