
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
      
//    //------------------------RUTA-------------------
//       piasystemairline.Presentation.EdicionRuta.Model RutaModel = 
//               new piasystemairline.Presentation.EdicionRuta.Model();
//       piasystemairline.Presentation.EdicionRuta.View RutaVista = 
//               new piasystemairline.Presentation.EdicionRuta.View();
//       piasystemairline.Presentation.EdicionRuta.Controller RutaController = 
//               new piasystemairline.Presentation.EdicionRuta.Controller(RutaModel,RutaVista);

//        Controler_Ruta = RutaController;
//    //----------------------------APP--------------------------------
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
//       AppVista.fondo.add(RutaVista);
       
       
    }
    
    public static piasystemairline.Presentation.EdicionAvion.Controller Controler_Avion;
    public static piasystemairline.Presentation.EdicionModelAvion.Controller Controler_AvionModelo;
    public static piasystemairline.Presentation.EdicionRuta.Controller Controler_Ruta;
    public static piasystemairline.Presentation.EdicionPersona.Controller Controler_Persona;
    public static piasystemairline.Presentation.App.ControllerApp ControllerAPP;
  
}
