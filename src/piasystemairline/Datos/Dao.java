package piasystemairline.Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.Escalas;
import piasystemairline.Logic.FormaPago;
import piasystemairline.Logic.ModeloAvion;
import piasystemairline.Logic.Pais;
import piasystemairline.Logic.Persona;
import piasystemairline.Logic.Registro;
import piasystemairline.Logic.Reservacion;
import piasystemairline.Logic.Ruta;
import piasystemairline.Logic.Tiquete;
import piasystemairline.Logic.Vuelo;


public class Dao {
    RelDatabase db;
    
    public Dao(){
        db= new RelDatabase();
    }
// -------------------------------AGREGAR--------------------------------------
    
    public void PersonaAdd(Persona p) throws Exception{
        String sql="insert into Usuario (user,pass,name,lastname,email,"
                + "dateBirth,address,workPhone,mobile,Registro_id,isAdmin)"
                + " values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,p.getUser(),p.getPass(),p.getName(),p.getLastName(),
                p.getEmail(),p.getDatebirth(),p.getAddress(),p.getWorkphone(),
                p.getMobile(),p.getRegistro().getId(),p.getIsAdmin());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona ya existe");
        }
    }
    
     public void VueloAdd(Vuelo v) throws Exception {
    String sql="insert into Vuelo (id,Ruta_id,Reservacion_id,Avion_id,departureDate,price,returnDate)"+
         "values('%s','%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,v.getId(),v.getRuta().getId(),v.getReserva().getId(),
                v.getAvion().getId(),v.getRepartureDate(),
                Integer.toString(v.getPrice()),v.getReturnDate());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Vuelo ya existe");
        }
    }
    
    public void AvionAdd(Avion a)throws Exception {
     String sql="insert into Avion (id,ModeloAvion_id) values('%s','%s')";
        sql=String.format(sql,a.getId(),a.getM_Avion().getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Avion ya existe");
        }
    }
   
    public void ModeloAvionAdd(ModeloAvion a)throws Exception {
     String sql="insert into ModeloAvion (id,age,capacity,numberRows,seatsPeRrow,"
             + "trademark) values('%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,a.getId(),Integer.toString(a.getAge()),
                Integer.toString(a.getCapacity()),Integer.toString(a.getNumberRows()),
                Integer.toString(a.getSeatsPeRrow()),a.getTrademark());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Avion ya existe");
        }
    }

    public void RutaAdd(Ruta r) throws Exception {
    String sql="insert into Ruta (id,name,duration,origin_name,destiny_name,Escalas_id)"+
         "values('%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,r.getId(),r.getName(),r.getDuration(),
                r.getOrigin().getName(),r.getDestiny().getName(),r.getScale().getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ruta ya existe");
        }
    }
    
    public void EscalaAdd(Escalas e) throws Exception {
    String sql="insert into Escalas (id,Detalle,Ciudad_name)"+
         "values('%s','%s','%s')";
        sql=String.format(sql,e.getId(),e.getDetail(),e.getCity().getName());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ruta ya existe");
        }
    }
    
    public void CiudadAdd(Ciudad c) throws Exception {
    String sql="insert into Ciudad (name,Pais_name)"+
         "values('%s','%s')";
        sql=String.format(sql,c.getName(),c.getPais().getName());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ciudad ya existe");
        }
    }
    
    public void PaisAdd(Pais p) throws Exception {
    String sql="insert into Pais (name) "+
         "values('%s')";
        sql=String.format(sql,p.getName());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Pais ya existe");
        }
    }
    
    public void RegistroAdd(Registro r) throws Exception {
    String sql="insert into Registro (id,Vuelo_id) values('%s','%s')";
        sql=String.format(sql,r.getId(),r.getVuelo().getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Registro ya existe");
        }
    }
    
    
    public void ReservacionAdd(Reservacion r) throws Exception {
    String sql="insert into Reservacion (id,Tiquete_id,Date) "
            + "values('%s','%s','%s')";
        sql=String.format(sql,r.getId(),r.getTiquet().getId(),r.getDate());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Reservacion ya existe");
        }
    }
    
    public void TiqueteAdd(Tiquete t) throws Exception {
    String sql="insert into Tiquete (id,FormaPago_id) "
            + "values('%s','%s')";
        sql=String.format(sql,t.getId(),t.getFPago().getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Tiquete ya existe");
        }
    }
    
    public void FormaPagoAdd(FormaPago f) throws Exception {
    String sql="insert into FormaPago (id,data) "
            + "values('%s','%s')";
        sql=String.format(sql,f.getId(),f.getData());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("FormaPago ya existe");
        }
    }
    
    
    
    
    
    
    
    
 //---------------------------UPDATES--------------------------------------- //////////////////////////////////////////////////////////////  
    
    
    
    
    
    
    
    public void PersonaUpdate(Persona p) throws Exception{
        String sql="update Usuario set pass='%s',name='%s',"
                + "lastname='%s',email='%s',dateBirth='%s',address='%s',"
                + "workphone='%s',mobile='%s',Vuelo_id='%s' where user='%s' ";
        sql=String.format(sql,p.getName(),p.getLastName(),
                p.getEmail(),p.getDatebirth(),p.getAddress(),p.getWorkphone(),
                p.getMobile(),p.getRegistro().getId(),p.getUser());
        
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona no existe");
        }
    }
    public void ModeloAvionUpdate(ModeloAvion m) throws Exception {
       String sql="update ModeloAvion set age='%s',capacity='%s',"
               + "numberRows='%s',seatsPeRrow='%s',trademark='%s'"
               + " where id='%s'";
        sql=String.format(sql,Integer.toString(m.getAge()),
                Integer.toString(m.getCapacity()),Integer.toString(m.getNumberRows()),
                Integer.toString(m.getSeatsPeRrow()),m.getTrademark(),m.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("ModeloAvion no existe");
        }
    }
     public void VueloUpdate(Vuelo v) throws Exception {
      String sql="update Vuelo set Ruta_id='%s',Reservacion_id='%s'"
              + ",Avion_id='%s',departureDate='%s',price='%s',returnDate='%s' where id='%s'";
        sql=String.format(sql,v.getRuta().getId(),v.getReserva().getId(),
                v.getAvion().getId(),v.getRepartureDate(),
                Integer.toString(v.getPrice()),v.getReturnDate(),v.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Vuelo no existe");
        }
     }

    public void AvionUpdate(Avion a) throws Exception {
    String sql="update Avion set ModeloAvion_id='%s' where id='%s' ";
        sql=String.format(sql,a.getM_Avion().getId(),a.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Avion no existe");
        }
    }

    public void RutaUpdate(Ruta r) throws Exception {
    String sql="update Ruta set name='%s',duration='%s',origin_name='%s',"
            + "destiny_name='%s',Escalas_id='%s' where id='%s'";
        sql=String.format(sql,r.getName(),r.getDuration(),
                r.getOrigin().getName(),r.getDestiny().getName(),
                r.getScale().getId(),r.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ruta no existe");
        }
    }

    public void EscalaUpdate(Escalas e) throws Exception {
     String sql="update Escalas set Detalle='%s',Ciudad_name='%s' where id='%s'";
        sql=String.format(sql,e.getDetail(),e.getCity().getName(),e.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ruta no existe");
        }
    }

    public void CiudadUpdate(Ciudad c) throws Exception {
    String sql="update Ciudad set Pais_name='%s' where name='%s' ";
        sql=String.format(sql,c.getPais().getName(),c.getName());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ciudad no existe");
        }
    }

    public void PaisUpdate(Pais p) throws Exception {
    String sql="update Pais set name='%s' ";
        sql=String.format(sql,p.getName());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Pais no existe");
        }
    }

    public void RegistroUpdate(Registro r) throws Exception {
    String sql="update Registro set Vuelo_id='%s' where id='%s' ";
        sql=String.format(sql,r.getVuelo().getId(),r.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Registro no existe");
        }
    }

    public void ReservacionUpdate(Reservacion r) throws Exception {
    String sql="update Reservacion set Tiquete_id='%s',Date='%s' where id='%s'";
        sql=String.format(sql,r.getTiquet().getId(),r.getDate(),r.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Reservacion no existe");
        }
    }

    public void TiqueteUpdate(Tiquete t) throws Exception {
    String sql="update Tiquete set FormaPago_id='%s' where id='%s' ";
        sql=String.format(sql,t.getFPago().getId(),t.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Tiquete no existe");
        }
    }

    public void FormaPagoUpdate(FormaPago f) throws Exception {
    String sql="update FormaPago set data='%s' where id='%s' ";
        sql=String.format(sql,f.getData(),f.getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("FormaPago no existe");
        }
    }
    
    
    
    
    
 //--------------------------SHARES--------------------------------------------
    
    
    
    
    
   
    public List<Persona>PersonaSearch(String nombre) throws Exception{
        List<Persona> resultado = new ArrayList<Persona>();
        try {
            String sql="select * from "+
                    "Usuario p inner join Registro r on p.Registro_id=r.id "+
                    "where p.name like '%%%s%%'";
            sql=String.format(sql,nombre);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(persona(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<ModeloAvion>ModeloAvionSearch(String id){
        List<ModeloAvion> resultado = new ArrayList<ModeloAvion>();
        try {
            String sql="select * from "+
                    "ModeloAvion m where m.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(modeloAvion(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<Avion> AvionSearch(String id) throws Exception {
      List<Avion> resultado = new ArrayList<Avion>();
        try {
            String sql="select * from "+
                    "Avion a inner join ModeloAvion m on a.ModeloAvion_id=m.id "+
                    "where a.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(avion(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<Pais> PaisSearch(String id) {
     List<Pais> resultado = new ArrayList<Pais>();
        try {
            String sql="select * from "+
                    "Pais p inner where v.name like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(pais(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<Ciudad> CiudadSearch(String id) throws Exception {
      List<Ciudad> resultado = new ArrayList<Ciudad>();
        try {
            String sql="select * from "+
                    "Ciudad c inner join Pais p on c.Pais_name=p.name "+
                    "where c.name like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(ciudad(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<Escalas> EscalasSearch(String id) throws Exception {
      List<Escalas> resultado = new ArrayList<Escalas>();
        try {
            String sql="select * from "+
                    "Escalas e inner join Ciudad c on e.Ciudad_name=c.name "+
                    "where e.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(escalas(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<Ruta> RutaSearch(String id) throws Exception {
     List<Ruta> resultado = new ArrayList<Ruta>();
        try {
            String sql="select * from "+
                    "Ruta r inner join Ciudad c join Escalas e on r.origin_name=c.name "+
                    "r.destiny_name=c.name r.Escala_id=e.id "+
                    "where r.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(ruta(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    
    public List<FormaPago> FormaPagoSearch(String id) {
     List<FormaPago> resultado = new ArrayList<FormaPago>();
        try {
            String sql="select * from "+
                    "FormaPago f inner where f.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(formaPago(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    public List<Tiquete> TiqueteSearch(String id) throws Exception {
      List<Tiquete> resultado = new ArrayList<Tiquete>();
        try {
            String sql="select * from "+
                    "Tiquete t inner join FormaPago f on t.FormaPago_id=f.id "+
                    "where t.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(tiquete(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
     public List<Reservacion> ReservacionSearch(String id) throws Exception {
      List<Reservacion> resultado = new ArrayList<Reservacion>();
        try {
            String sql="select * from "+
                    "Reservacion r inner join Tiquete t on r.Tiquete_id=t.id "+
                    "where r.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(reservacion(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    
    public List<Vuelo> VueloSearch(String id) throws Exception {
     List<Vuelo> resultado = new ArrayList<Vuelo>();
        try {
            String sql="select * from "+
                    "Vuelo v inner join Reservacion r join Ruta ru join Avion a "
                    +"on v.Avion_id=a.id v.Reservacion_id=r.id v.Ruta_id=ru.id "
                    +"where v.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(vuelo(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
        
    public List<Registro> RegistroSearch(String id) throws Exception {
      List<Registro> resultado = new ArrayList<Registro>();
        try {
            String sql="select * from "+
                    "Registro r inner join Vuelo v on r.Vuelo_id=v.id "+
                    "where r.id like '%%%s%%'";
            sql=String.format(sql,id);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(registro(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }

    
   
//--------------------------GETS------------------------------------
   public Persona PersonaGet(String id) throws Exception{
        String sql="select * from "+
                    "Usuario p inner join Registro r on p.Registro_id=r.id "+
                    "where p.User like '%%%s%%' ";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return persona(rs);
        }
        else{
            throw new Exception ("Persona no Existe");
        }
    }
   
   
    public ModeloAvion ModeloAvionGet(String id) throws Exception {
       String sql="select * from "+
                    "ModeloAvion m where m.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return modeloAvion(rs);
        }
        else{
            throw new Exception ("Persona no Existe");
        }
    }
   public Avion AvionGet(String id) throws Exception {
       String sql="select * from "+
                    "Avion a where a.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return avion(rs);
        }
        else{
            throw new Exception ("Avion no Existe");
        }
    }    
     public Pais PaisGet(String id) throws Exception {
       String sql="select * from "+
                    "Pais p where p.name like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return pais(rs);
        }
        else{
            throw new Exception ("Pais no Existe");
        }
    }
   public Ciudad CiudadGet(String id) throws Exception {
       String sql="select * from "+
                    "Ciudad c where c.name like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return ciudad(rs);
        }
        else{
            throw new Exception ("Ciudad no Existe");
        }
    }
   
    public Escalas EscalasGet(String id) throws Exception {
       String sql="select * from "+
                    "Escalas e where e.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return escalas(rs);
        }
        else{
            throw new Exception ("Escalas no Existe");
        }
    }
    
     public Ruta RutaGet(String id) throws Exception {
       String sql="select * from "+
                    "Ruta r where r.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return ruta(rs);
        }
        else{
            throw new Exception ("Ruta no Existe");
        }
    }
     
    public FormaPago FormaPagoGet(String id) throws Exception {
       String sql="select * from "+
                    "FormaPago f where f.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return formaPago(rs);
        }
        else{
            throw new Exception ("FormaPago no Existe");
        }
    }
    
    public Tiquete TiqueteGet(String id) throws Exception {
       String sql="select * from "+
                    "Tiquete t where t.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return tiquete(rs);
        }
        else{
            throw new Exception ("Tiquete no Existe");
        }
    }
    
    public Reservacion ReservacionGet(String id) throws Exception {
       String sql="select * from "+
                    "Reservacion r where r.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return reservacion(rs);
        }
        else{
            throw new Exception ("Reservacion no Existe");
        }
    }
   
    public Vuelo VueloGet(String id) throws Exception {
       String sql="select * from "+
                    "Vuelo v where v.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return vuelo(rs);
        }
        else{
            throw new Exception ("Vuelo no Existe");
        }
    }
     public Registro RegistroGet(String id) throws Exception {
       String sql="select * from "+
                    "Registro r where r.id like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return registro(rs);
        }
        else{
            throw new Exception ("Registro no Existe");
        }
    }
    
//-------------------------DELATES--------------------------------------   
   
   
   
   
    public void PersonaDelete(Persona p) throws Exception{
        String sql="delete from Usuario where id='%s'";
        sql = String.format(sql,p.getUser());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona no existe");
        }
    }

    public void EliminarModeloAvion(String id) throws Exception {
        String sql="delete from ModeloAvion where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("ModeloAvion no existe");
        }
    }
    public void EliminarAvion(String id) throws Exception {
        String sql="delete from Avion where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Avion no existe");
        }
    }
    public void EliminarPais(String id) throws Exception {
        String sql="delete from Pais where name='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Pais no existe");
        }
    }
    public void EliminarCiudad(String id) throws Exception {
        String sql="delete from Ciudad where name='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ciudad no existe");
        }
    }
    public void EliminarEscala(String id) throws Exception {
        String sql="delete from Escalas where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Escala no existe");
        }
    }
    public void EliminarRuta(String id) throws Exception {
        String sql="delete from Ruta where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Ruta no existe");
        }
    }
    public void EliminarFormaPago(String id) throws Exception {
        String sql="delete from FormaPago where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("FormaPago no existe");
        }
    }
    public void EliminarTiquete(String id) throws Exception {
        String sql="delete from Tiquete where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Tiquete no existe");
        }
    }
    public void EliminarReservacion(String id) throws Exception {
        String sql="delete from Reservacion where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Reservacion no existe");
        }
    }
    
    public void EliminarVuelo(String id) throws Exception {
        String sql="delete from Vuelo where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Vuelo no existe");
        }
    }
    
    public void EliminarRegistro(String id) throws Exception {
        String sql="delete from Registro where id='%s'";
        sql = String.format(sql,id);
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Registro no existe");
        }
    }
//-------------------OTHERS--------------------------------------------
    
    private Persona persona(ResultSet rs) throws Exception{
        try {
            Persona p=new Persona();
            p.setUser(rs.getString("user"));
            p.setPass(rs.getString("pass"));
            p.setName(rs.getString("name"));
            p.setLastName(rs.getString("lastName"));
            p.setDatebirth(rs.getString("datebirth"));
            p.setEmail(rs.getString("email"));
            p.setWorkphone(rs.getString("workPhone"));
            p.setAddress(rs.getString("address"));
            p.setMobile(rs.getString("mobile"));
            p.setIsAdmin(rs.getString("isAdmin").charAt(0));
            p.setRegistro(RegistroGet(rs.getString("Registro_id")));
            return p;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    
     private ModeloAvion modeloAvion(ResultSet rs) {
      ModeloAvion m = new ModeloAvion();
        try {
            m.setId(rs.getString("id"));
            m.setAge(Integer.parseInt(rs.getString("age")));
            m.setCapacity(Integer.parseInt(rs.getString("capacity")));
            m.setNumberRows(Integer.parseInt(rs.getString("numberRows")));
            m.setSeatsPeRrow(Integer.parseInt(rs.getString("seatsPeRrow")));
            m.setTrademark(rs.getString("trademark"));
            return m;
        } catch (SQLException ex) {
          return null;
        }
     }
     private Avion avion(ResultSet rs) throws Exception{
     Avion a = new Avion();
     try {
         a.setId(rs.getString("id"));
         a.setM_Avion(ModeloAvionGet(rs.getString("ModeloAvion_id")));
         return a;
     } catch (SQLException ex) {
         return null;
     }
     }
     
    private Pais pais(ResultSet rs) {
    Pais p = new Pais();
     try {
         p.setName(rs.getString("name"));
         return p;
     } catch (SQLException ex) {
         return null;
     }
    }

    private Ciudad ciudad(ResultSet rs) throws Exception {
      Ciudad c = new Ciudad();
     try {
         c.setName(rs.getString("name"));
         c.setPais(PaisGet(rs.getString("Pais_name")));
         return c;
     } catch (SQLException ex) {
         return null;
     }
    }

    private Escalas escalas(ResultSet rs) throws Exception {
    Escalas e = new Escalas();
     try {
         e.setId(rs.getString("id"));
         e.setDetail(rs.getString("Detalle"));
         e.setCity(CiudadGet(rs.getString("Ciudad_name")));
         return e;
     } catch (SQLException ex) {
         return null;
     }
    }

    private Ruta ruta(ResultSet rs) throws Exception {
        Ruta r = new Ruta();
    try {
         r.setId(rs.getString("id"));
         r.setName(rs.getString("name"));
         r.setDuration(rs.getString("duration"));
         r.setOrigin(CiudadGet(rs.getString("origin_name")));
         r.setDestiny(CiudadGet(rs.getString("destiny_name")));
         r.setScale(EscalasGet(rs.getString("Escalas_id")));
         return r;
     } catch (SQLException ex) {
         return null;
     }
    }
    
    private FormaPago formaPago(ResultSet rs) {
    FormaPago f = new FormaPago();
     try {
         f.setId(rs.getString("id"));
         f.setData(rs.getString("data"));
         return f;
     } catch (SQLException ex) {
         return null;
     }
    }

    private Tiquete tiquete(ResultSet rs) throws Exception {
    Tiquete t = new Tiquete();
     try {
         t.setId(rs.getString("id"));
         t.setFPago(FormaPagoGet(rs.getString("FormaPago_id")));
         return t;
     } catch (SQLException ex) {
         return null;
     }
    }

    private Reservacion reservacion(ResultSet rs) throws Exception {
    Reservacion r = new Reservacion();
     try {
         r.setId(rs.getString("id"));
         r.setDate(rs.getString("Date"));
         r.setTiquet(TiqueteGet(rs.getString("Tiquete_id")));
         return r;
     } catch (SQLException ex) {
         return null;
     }
    }

    private Vuelo vuelo(ResultSet rs) throws Exception {
        Vuelo v = new Vuelo(); 
        try {
         v.setId(rs.getString("id"));
         v.setRepartureDate(rs.getString("departureDate"));
         v.setReturnDate(rs.getString("returnDate"));
         v.setPrice(Integer.parseInt(rs.getString("price")));
         v.setAvion(AvionGet(rs.getString("Avion_id")));
         v.setRuta(RutaGet(rs.getString("Ruta_id")));
         v.setReserva(ReservacionGet(rs.getString("Reservacion_id")));
         return v;
     } catch (SQLException ex) {
         return null;
     }
    }
    
    private Registro registro(ResultSet rs) throws Exception {
    Registro r = new Registro();
     try {
         r.setId(rs.getString("id"));
         r.setVuelo(VueloGet(rs.getString("Vuelo_id")));
         return r;
     } catch (SQLException ex) {
         return null;
     }
    }

    

    


   

    

    

   

   

    
     
}
