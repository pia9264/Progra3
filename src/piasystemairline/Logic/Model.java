
package piasystemairline.Logic;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void agregarModeloAvion(ModeloAvion a) throws Exception{
       Datos.ModeloAvionAdd(a);
    }
    
    public void agregarRuta(Ruta r) throws Exception{
       Datos.RutaAdd(r);
    }
    
    public void agregarVuelo(Vuelo v) throws Exception{
       Datos.VueloAdd(v);
    }

    public void AgregarCuidad(Ciudad c) throws Exception{
      Datos.CiudadAdd(c);
    }
    
    public void AgregarPais(Pais p) throws Exception{
      Datos.PaisAdd(p);
    }
    
    public void AgregarReservacion(Reservacion r) throws Exception{
      Datos.ReservacionAdd(r);
    }
    
    public void AgregarTiquete(Tiquete t) throws Exception{
      Datos.TiqueteAdd(t);
    }
    
    public void AgregarFormaPago(FormaPago p) throws Exception{
      Datos.FormaPagoAdd(p);
    }
    
     public void agregarViaje(Viaje viaje) throws Exception {
       Datos.ViajeAdd(viaje);
     }
    // GetObjetos
    
    public Persona ConsultaUser(String user) throws Exception{
        Persona result = Datos.PersonaGet(user);
        return result;
    }
    
     public ModeloAvion ConsultarModeloAvion(String id) throws Exception {
            ModeloAvion result = Datos.ModeloAvionGet(id);
            return result;
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
        try {
            return Datos.PersonaSearch("");
        } catch (Exception ex) {
        return null;
        }
    }
    public List<Avion> ObtenerListAviones(){
        try {
            return Datos.AvionSearch("");
        } catch (Exception ex) {
          return null;
        }
    }
    public List<ModeloAvion> ObtenerListModeloAvion(){
        try {
            return Datos.ModeloAvionSearch("");
        } catch (Exception ex) {
          return null;
        }
    }
    public List<Ruta> ObtenerListRutas(){
        try {
            return Datos.RutaSearch("");
        } catch (Exception ex) {
        return null;
        }
    }
    
    // MODIFICAR
    
    public void ModificarPersona(Persona p) throws Exception {
     Datos.PersonaUpdate(p);
    }
    public void ModificarVuelo(Vuelo v) throws Exception {
     Datos.VueloUpdate(v);
    }
    public void ModificarAvion(Avion a) throws Exception {
     Datos.AvionUpdate(a);
    }
    public void ModificarModeloAvion(ModeloAvion m) throws Exception {
    Datos.ModeloAvionUpdate(m);
    }
    public void ModificarRuta(Ruta r) throws Exception {
    Datos.RutaUpdate(r);
    }
    public void ModificarCiudad(Ciudad c) throws Exception {
    Datos.CiudadUpdate(c);
    }
    
    public void ModificarPais(Pais p) throws Exception {
    Datos.PaisUpdate(p);
    }
    public void ModificarReservacion(Reservacion r) throws Exception {
    Datos.ReservacionUpdate(r);
    }
    public void ModificarTiquete(Tiquete t) throws Exception {
    Datos.TiqueteUpdate(t);
    }
    public void ModificarFormaPago(FormaPago f) throws Exception {
    Datos.FormaPagoUpdate(f);
    }
    
    
    

   // DELATES--------------------------------------------------
   
   
    public void EliminarModeloAvion(String id) {
        try {
            Datos.EliminarModeloAvion(id);
        } catch (Exception ex) {
        }
    }

    public void EliminarAvion(String text) {
        try {
            Datos.EliminarAvion(text);
        } catch (Exception ex) {
        }
    }

    public void EliminarPais(String text) {
        try {
            Datos.EliminarPais(text);
        } catch (Exception ex) {
        
        }
    }

    public Pais ConsultarPais(String text) {
        try {
            return Datos.PaisGet(text);
        } catch (Exception ex) {
        return null;
        }
    }

    public void EliminarCiudad(String text) {
        try {
            Datos.EliminarCiudad(text);
        } catch (Exception ex) {
        
        }
    }

    public Ciudad ConsultarCiudad(String id) {
        try {
            return Datos.CiudadGet(id);
        } catch (Exception ex) {
        return null;
        }
    }

    public List<Pais> ObtenerListPaises() {
       return Datos.PaisSearch("");
    }

}
