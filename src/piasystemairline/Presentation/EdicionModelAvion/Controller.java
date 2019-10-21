/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piasystemairline.Presentation.EdicionModelAvion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;
import piasystemairline.Logic.ModeloAvion;

/**
 *
 * @author anibalchavesbadilla
 */
public class Controller {
    View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      vista.setControlador(this);
      vista.setModelEdit(model);
      CargarArchivo();
      vista.update(model, this);
    }

    public void Show() {
     Vista.setVisible(true);
    }

    void Add(ModeloAvion m) throws Exception {
        piasystemairline.Logic.Model.instance().AgregarModeloAvion(m);
        Vista.LimpiarTodo();
        piasystemairline.PIASystemAirline.Controler_Avion.update();
    }
    public void Eliminar(String id) throws Exception {
        piasystemairline.Logic.Model.instance().EliminarModeloAvion(id);
    }
    public void Modificar(ModeloAvion m) throws Exception{
        piasystemairline.Logic.Model.instance().ModificarModeloAvion(m);
    }
    void MenuAvionShow() {
        piasystemairline.PIASystemAirline.Controler_Avion.Show();
    }
    public ModeloAvion getModeloAvion(String id) throws Exception {
        return piasystemairline.Logic.Model.instance().ConsultarModeloAvion(id);
    }
    void Delate(String id) throws Exception {
        piasystemairline.Logic.Model.instance().EliminarModeloAvion(id);
        piasystemairline.PIASystemAirline.Controler_Avion.update();
    }
    
     private void CargarArchivo() {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         archivo = new File ("src/piasystemairline/Datos/Airplanes.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         String[] datos = new String[3];
         int n=0;
         while((linea=br.readLine())!=null){
         System.out.println(linea);
         datos[0] = "";
         datos[1] = ""; 
         datos[2] = "";
         try {
         for (int i = 0; i < 25; i++) {
                  if(linea.charAt(i)!=' '){
                   datos[n]=datos[n]+linea.charAt(i);
                  }else{
                   n++;
                  }
             }
         }catch(Exception i){
          n=0;
          int seatsRrow = generaIntRange(6,9);
          int Row = Integer.parseInt(datos[2])/seatsRrow;
         Add(new ModeloAvion(datos[1],generaIntRange(1990,2019),datos[0],
             Integer.parseInt(datos[2]),Row,seatsRrow));
         }
          
         
        }
        }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();
               //ObtenerlistPaises();
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }
     
     
public static int generaIntRange(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
}
}
