
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
    
      //  INSTANCE
    public static Model instance(){
       if (the_instance == null) {
           the_instance = new Model();
       }
       return the_instance;
   }
    
    
    
    
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% LOS AGREGAR 
    public void AgregarPersona(Persona p) throws Exception{
       Datos.PersonaAdd(p);
    }
    
    public void AgregarAvion(Avion a) throws Exception{
       Datos.AvionAdd(a);
    }
    
    public void AgregarModeloAvion(ModeloAvion a) throws Exception{
       Datos.ModeloAvionAdd(a);
    }
    
    public void AgregarRuta(Ruta r) throws Exception {
      Datos.RutaAdd(r);
    }
    
    public void AgregarVuelo(Vuelo v) throws Exception{
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
    
     public void AgregarViaje(Viaje viaje) throws Exception {
       Datos.ViajeAdd(viaje);
     }
     
     
     
     
     
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%GetObjetos
    
    public Persona ConsultaUser(String user) throws Exception{
        return Datos.PersonaGet(user);
    }
    public ModeloAvion ConsultarModeloAvion(String id) throws Exception {
        return Datos.ModeloAvionGet(id);
    }
    public Ruta ConsultaRuta(String id) throws Exception {
        return Datos.RutaGet(id);
    }
    public Ciudad ConsultarCiudad(String id) throws Exception {
         return Datos.CiudadGet(id);
    }
    public Pais ConsultarPais(String text) throws Exception {
            return Datos.PaisGet(text);
    }
    
    
    
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%OBTENER LISTAS
    
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
            return Datos.ModeloAvionSearch("");
    }
    public List<Ruta> ObtenerListRutas(){
        try {
            return Datos.RutaSearch("");
        } catch (Exception ex) {
           return null;
        }
    }
    public List<Ciudad> ObtenerListCiudades(){
        try {
            return Datos.CiudadSearch("");
        } catch (Exception ex) {
            return null;
        }
    }
    public List<Pais> ObtenerListPaises() {
        try {
            return Datos.PaisSearch("");
        } catch (Exception ex) {
            return null;
        }
    }
    
    
    
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%MODIFICAR
    
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
    
    
    
    
    
    

   // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%DELATES
   
   
    public void EliminarModeloAvion(String id) throws Exception {
            Datos.EliminarModeloAvion(id);
    }
    public void EliminarAvion(String text)throws Exception {
            Datos.EliminarAvion(text);
    }
    public void EliminarPais(String text) throws Exception {
            Datos.EliminarPais(text);
    }
    public void EliminarCiudad(String text) throws Exception {
            Datos.EliminarCiudad(text);
    }
    public void EliminarRuta(String id) throws Exception {
       Datos.EliminarRuta(id);
    }

}
