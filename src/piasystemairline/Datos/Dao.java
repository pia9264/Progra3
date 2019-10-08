package piasystemairline.Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.Persona;
import piasystemairline.Logic.Ruta;
import piasystemairline.Logic.Vuelo;


public class Dao {
    RelDatabase db;
    
    public Dao(){
        db= new RelDatabase();
    }
// -------------------------------AGREGAR--------------------------------------
    
    public void PersonaAdd(Persona p) throws Exception{
        String sql="insert into persona (user,pass,name,lastname,email,"
                + "dateBirth,address,workphone,mobile,Vuelo_id)"+
                   "values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,p.getUser(),p.getName(),p.getLastName(),
                p.getEmail(),p.getDatebirth(),p.getAddress(),p.getWorkphone(),
                p.getMobile(),p.getVuelo().getId());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona ya existe");
        }
    }
    
    public void AvionAdd(Avion a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void PersonaAdd(Ruta r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    
//     public void EstadoAdd(EstadoCivil e) throws Exception {
//        String sql="insert into estado (codigo,detalle) "+
//                "values('%s','%s')";
//        sql=String.format(sql,e.getCodigo(),e.getDetalle());
//        int count=db.executeUpdate(sql);
//        if (count==0){
//            throw new Exception("Estado ya existe");
//        }
//     
//     }
    
    
 //---------------------------UPDATES---------------------------------------   
    
    
    public void PersonaUpdate(Persona p) throws Exception{
        String sql="update persona set user='%s',pass='%s',name='%s',"
                + "lastname='%s',email='%s',dateBirth='%s',address='%s',"
                + "workphone='%s',mobile='%s',Vuelo_id='%s'";
        sql=String.format(sql,p.getUser(),p.getName(),p.getLastName(),
                p.getEmail(),p.getDatebirth(),p.getAddress(),p.getWorkphone(),
                p.getMobile(),p.getVuelo().getId());
        
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona no existe");
        }
    }
    
    
    public void AvionUpdate(Avion a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void RutaUpdate(Ruta r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 //--------------------------SHARES--------------------------------------------
    
        public List<Persona>PersonaSearch(String nombre){
        List<Persona> resultado = new ArrayList<Persona>();
        try {
            String sql="select * from "+
                    "persona p inner join Vuelo v on v.Vuelo_id=v.id "+
                    "where p.user like '%%%s%%'";
            sql=String.format(sql,nombre);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(persona(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
        
    public List<Avion> AvionSearch(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Ruta> RutaSearch(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public List<Vuelo> VueloSearch(String Descripcion){
        List<Vuelo> resultado = new ArrayList<Vuelo>();
        try {
            String sql="select * from "+
                    "Vuelo v "+
                    "where v.id like '%%%s%%'";
            sql=String.format(sql,Descripcion);
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resultado.add(Estado(rs));
            }
        } catch (SQLException ex) { }
        return resultado;
    }
    
    
//--------------------------GETS------------------------------------
   public Persona PersonaGet(String id) throws Exception{
        String sql="select * from "+
                    "persona p inner join vuelo v on p.vuelo=v.id "+
                    "where p.user like '%%%s%%'";
        sql = String.format(sql,id);
        ResultSet rs =  db.executeQuery(sql);
        if (rs.next()) {
            return persona(rs);
        }
        else{
            throw new Exception ("Persona no Existe");
        }
    }
   
//-------------------------DELATES--------------------------------------   
   
   
   
   
    public void PersonaDelete(Persona p) throws Exception{
        String sql="delete from persona where id='%s'";
        sql = String.format(sql,p.getUser());
        int count=db.executeUpdate(sql);
        if (count==0){
            throw new Exception("Persona no existe");
        }
    }



    
//-------------------OTHERS--------------------------------------------
    
    private Persona persona(ResultSet rs){
        try {
            Persona p=new Persona();
            p.setUser(rs.getString("id"));
            p.setPass(rs.getString("pass"));
            p.setName(rs.getString("name"));
            p.setLastName(rs.getString("lastName"));
            p.setDatebirth(rs.getString("datebirth"));
            p.setEmail(rs.getString("email"));
            p.setWorkphone(rs.getInt("workPhone"));
            p.setAddress(rs.getString("address"));
            p.setMobile(rs.getInt("mobile"));
            p.setVuelo(new Vuelo());

            return p;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    private Vuelo Estado(ResultSet rs){
        Vuelo v = new Vuelo();
        try {
            v.setId(rs.getString("id"));
            v.setDate(rs.getString("date"));
            v.setDateBack(rs.getString("dateBack"));
            v.setDestiny(rs.getString("destiny"));
            v.setOrigin(rs.getString("origin"));
            v.setQuantity(rs.getInt("quantity"));
           return v;
        } catch (SQLException ex) {
           return null;
        }
       
        
    }
     
}
