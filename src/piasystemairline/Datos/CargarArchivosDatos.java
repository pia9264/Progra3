
package piasystemairline.Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.FormaPago;
import piasystemairline.Logic.ModeloAvion;
import piasystemairline.Logic.Pais;
import piasystemairline.Logic.Ruta;
import piasystemairline.Logic.Vuelo;


public class CargarArchivosDatos extends Dao{
    public CargarArchivosDatos() {
     CargarArchivoPais();
     CargarArchivoCiudad();
     CargarArchivoRutas();
     CargarArchivoModeloAvion();
     CargarArchivoAvion();
     CargarArchivoVuelo();
     CargarArchivoFormaPago();
    }
    
    private void CargarArchivoPais() {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         archivo = new File ("src/piasystemairline/Datos/Archivos/Countries.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         while((linea=br.readLine())!=null){
         try{
         super.PaisAdd(new Pais(linea.substring(0,2),linea.substring(3)));
         }catch(Exception e){}
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }
    
    private void CargarArchivoCiudad() {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      try {
         archivo = new File ("src/piasystemairline/Datos/Archivos/cities.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         while((linea=br.readLine())!=null){
         String c = linea.substring(0,2)+"-"+linea.substring(3,4);
         try{
         Ciudad ciu = new Ciudad();
         ciu.setPais(super.PaisGet(linea.substring(0,2)));
         ciu.setId(c);
         ciu.setName(linea.substring(3));
         super.CiudadAdd(ciu);
         }catch(Exception e){}
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();  
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }
    
    private void CargarArchivoRutas() {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         archivo = new File ("src/piasystemairline/Datos/Archivos/Rutas.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         String[] datos = new String[8];
         int n=0;
         while((linea=br.readLine())!=null){
         datos[0] = "";
         datos[1] = ""; 
         datos[2] = "";
         datos[3] = "";
         datos[4] = ""; 
         datos[5] = "";
         datos[6] = "";
         datos[7] = ""; 
         try {
         for (int i = 0; i<=linea.length(); i++) {
                  if(linea.charAt(i)!='\t'){
                   datos[n]=datos[n]+linea.charAt(i);
                  }else{
                   n++;
                  }
             }
         }catch(Exception i){
          n=0;
          try{
           Ruta r = new Ruta();
           r.setId(datos[0]);
           r.setName(datos[1]);
           r.setDuration(datos[2]);
           r.setOrigin(super.CiudadGet(datos[3]));
           r.setDestiny(super.CiudadGet(datos[4]));
           r.setScale(super.CiudadGet(datos[5]));
           r.setPrice(Integer.parseInt(datos[6]));
           r.setDiscount(Integer.parseInt(datos[7]));
           super.RutaAdd(r);
           }catch(Exception e){}
         }
          
         
        }
        }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }
    
    private void CargarArchivoModeloAvion() {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         archivo = new File ("src/piasystemairline/Datos/Archivos/Airplanes.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         String[] datos = new String[3];
         int n=0;
         while((linea=br.readLine())!=null){
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
          try{
         super.ModeloAvionAdd(new ModeloAvion(datos[1],generaIntRange(1990,2019),datos[0],
             Integer.parseInt(datos[2]),Row,seatsRrow));
           }catch(Exception e){}
         }
          
         
        }
        }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }

    private void CargarArchivoAvion(){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         archivo = new File ("src/piasystemairline/Datos/Archivos/Aviones.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         String[] datos = new String[2];
         int n=0;
         while((linea=br.readLine())!=null){
         datos[0] = "";
         datos[1] = ""; 
         try {
         for (int i = 0; i<=linea.length(); i++) {
                  if(linea.charAt(i)!='\t'){
                   datos[n]=datos[n]+linea.charAt(i);
                  }else{
                   n++;
                  }
             }
         }catch(Exception i){
          n=0;
          try{
           Avion Av= new Avion();
           Av.setId(datos[0]);
           Av.setM_Avion(super.ModeloAvionGet(datos[1]));
           super.AvionAdd(Av);
           }catch(Exception e){}
         }
          
         
        }
        }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }
    
    private void CargarArchivoFormaPago() {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         archivo = new File ("src/piasystemairline/Datos/Archivos/FormaPago.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea,v1,v2;
         while((linea=br.readLine())!=null){
             boolean n = true;
             v1="";v2="";
             
             for (int i = 0; i < linea.length(); i++) {
                 if (linea.charAt(i)!='/') {
                  if(n){v1 = v1+linea.charAt(i);
                  }else{v2 = v2+linea.charAt(i);}   
                 }else{n=false;}
              }
             try{
             super.FormaPagoAdd(new FormaPago(v1,v2));
             }catch(Exception e){}
         }
        
      }catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }

}

    private void CargarArchivoVuelo() {
    File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         archivo = new File ("src/piasystemairline/Datos/Archivos/Vuelo.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         String[] datos = new String[5];
         int n=0;
         while((linea=br.readLine())!=null){
         datos[0] = "";
         datos[1] = "";
         datos[2] = "";
         datos[3] = ""; 
         datos[4] = "";
         try {
         for (int i = 0; i<=linea.length(); i++) {
                  if(linea.charAt(i)!='\t'){
                   datos[n]=datos[n]+linea.charAt(i);
                  }else{
                   n++;
                  }
             }
         }catch(Exception i){
          n=0;
          try{
           Vuelo v= new Vuelo();
           v.setId(datos[0]);
           v.setRuta(super.RutaGet(datos[1]));
           v.setAvion(super.AvionGet(datos[2]));
           v.setTime(datos[3]);
           v.setDay(datos[4]);
           super.VueloAdd(v);
           }catch(Exception e){}
         }
          
         
        }
        }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();
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

