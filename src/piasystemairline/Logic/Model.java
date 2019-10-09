
package piasystemairline.Logic;

import java.util.List;
import piasystemairline.Datos.Dao;

public class Model {
    Dao Datos;
    static Model the_instance;
    
    
    public Model() {
        Datos = new Dao();
    }
    
    // LOS AGREGAR 
    public void agregarPersona(Persona p) throws Exception{
       Datos.PersonaAdd(p);
    }
    
    public void agregarAvion(Avion a) throws Exception{
       Datos.AvionAdd(a);
    }
    
    public void agregarRuta(Ruta r) throws Exception{
       Datos.RutaAdd(r);
    }
    
    //  INSTANCE
    public static Model instance(){
       if (the_instance == null) {
           the_instance = new Model();
       }
       return the_instance;
   }
    
    // OBTENER LISTAS
    
    public List<Persona> ObtenerListPersonas(){
     return Datos.PersonaSearch("");
    }
    public List<Avion> ObtenerListAviones(){
     return Datos.AvionSearch("");
    }
    public List<Ruta> ObtenerListRutas(){
     return Datos.RutaSearch("");
    }
    
    // MODIFICAR
    
    public void ModificarPersona(Persona p) throws Exception {
     Datos.PersonaUpdate(p);
    }
    
    public void ModificarAvion(Avion a) throws Exception {
     Datos.AvionUpdate(a);
    }
    public void ModificarRuta(Ruta r) throws Exception {
     Datos.RutaUpdate(r);
    }
    
    
    
}
