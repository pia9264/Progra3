
package piasystemairline;


public class PIASystemAirline {

    
    public static void main(String[] args) {
        
        //-------------------------PERSONA-------------------------------
       piasystemairline.Presentation.EdicionPersona.Model PersonaModel = 
               new piasystemairline.Presentation.EdicionPersona.Model();
       piasystemairline.Presentation.EdicionPersona.View PersonaVista = 
               new piasystemairline.Presentation.EdicionPersona.View();
       piasystemairline.Presentation.EdicionPersona.Controller PersonaController = 
               new piasystemairline.Presentation.EdicionPersona.Controller(PersonaModel,PersonaVista);
    
      //-------------------------AVION---------------------------------
       piasystemairline.Presentation.EdicionAvion.Model AvionModel = 
               new piasystemairline.Presentation.EdicionAvion.Model();
       piasystemairline.Presentation.EdicionAvion.View AvionVista = 
               new piasystemairline.Presentation.EdicionAvion.View();
       piasystemairline.Presentation.EdicionAvion.Controller AvionController = 
               new piasystemairline.Presentation.EdicionAvion.Controller(AvionModel,AvionVista);
    //------------------------RUTA-------------------
       piasystemairline.Presentation.EdicionRuta.Model RutaModel = 
               new piasystemairline.Presentation.EdicionRuta.Model();
       piasystemairline.Presentation.EdicionRuta.View RutaVista = 
               new piasystemairline.Presentation.EdicionRuta.View();
       piasystemairline.Presentation.EdicionRuta.Controller RutaController = 
               new piasystemairline.Presentation.EdicionRuta.Controller(RutaModel,RutaVista);
    //----------------------------APP--------------------------------
       piasystemairline.Presentation.App.ModelApp AppModel = 
               new piasystemairline.Presentation.App.ModelApp();
       piasystemairline.Presentation.App.PiaAPP AppVista = 
               new piasystemairline.Presentation.App.PiaAPP();
       piasystemairline.Presentation.App.ControllerApp AppController = 
               new piasystemairline.Presentation.App.ControllerApp(AppModel,AppVista);
    
    }
    
}
