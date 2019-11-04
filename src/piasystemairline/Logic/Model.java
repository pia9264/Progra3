
package piasystemairline.Logic;

import java.util.List;

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
    public void AgregarFormaPago(FormaPago p) throws Exception{
      Datos.FormaPagoAdd(p);
    }
    
    public void AgregarTiquete(Tiquete viaje) throws Exception {
       Datos.TiqueteAdd(viaje);
    }
     
    public void AgregarSeat(Seat s) throws Exception {
       Datos.AsientoAdd(s);
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
    
    public Vuelo ConsultarVuelo(String id) throws Exception {
        return Datos.VueloGet(id);
    }
    
    public FormaPago ConsultarFormaPago(String id) throws Exception {
        return Datos.FormaPagoGet(id);
    }
    public Tiquete ConsultarTiquete(String id) throws Exception {
       return Datos.TiqueteGet(id);
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
        try{   
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
    public List<FormaPago> ObtenerFormasPago() {
        try {
            return Datos.FormaPagoSearch("");
        } catch (Exception ex) {
            return null;
        }
    }
    public List<Reservacion> ObtenerListReservaciones() {
           try {
            return Datos.ReservacionSearch("");
        } catch (Exception ex) {
            return null;
        }
    }
    public List<Vuelo> ObtenerListVuelos() {
     try {
            return Datos.VueloSearch("");
        } catch (Exception ex) {
            return null;
        }
    }
    

    
     public List<Vuelo> FindVueloList(Vuelo filtro){
    try {
            return Datos.FindVueloList(filtro);
        } catch (Exception ex) {
            return null;
        }
     }
     
       public List<Ruta> ObtenerListRutasDescuento() {
        try {
            return Datos.RutaDescuentoSearch();
        } catch (Exception ex) {
            return null;
        }
    }
       
    public List<Tiquete> ObtenerListTiquetes() {
    try {
            return Datos.TiquetesSearch("");
        } catch (Exception ex) {
            return null;
        }
    }
    
    public List<Reservacion> ObtenerListaReservaPersona(Persona p) {
    try {
            return Datos.ListaReservaPersonaSearch(p);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public List<Seat> ListSeats(Vuelo v) {
       try {
            return Datos.SeatSearch(v.getId());
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
    public void ModificarFormaPago(FormaPago f) throws Exception {
    Datos.FormaPagoUpdate(f);
    }

   // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%DELATE
   
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

    public void EliminarVuelo(String id) throws Exception {
       Datos.EliminarVuelo(id);
    }

    public void EliminarFormaPago(String id) throws Exception {
       Datos.EliminarFormaPago(id);
    }

    public void ConsultaTiquetePorMes(String mes) throws Exception {
        Datos.ListaFacturacionPorMes(mes);
    }

    public void ConsultaTiquetePorAnno(String anno) throws Exception {
        Datos.ListaFacturacionPorAnno(anno);
    }

    public void ConsultarUsuarioPorAvion(String avion) throws Exception {
        Datos.ListadoClientesPorAvion(avion);
    }


    

    

    



 



  






}
