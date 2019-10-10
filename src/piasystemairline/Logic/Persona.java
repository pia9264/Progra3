
package piasystemairline.Logic;


public class Persona {

   private String user;
   private String pass;
   private String name;
   private String lastName;
   private String email;
   private String datebirth;
   private String address;
   private String workphone;
   private String mobile;
   private Vuelo vuelo;
   private char isAdmin;
   
   
    public Persona(String user, String pass, String name, String lastName, 
            String email, String datebirth, String address, String workphone, 
            String mobile,char isAdmin,Vuelo vuelo) {
        this.user = user;
        this.pass = pass;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.datebirth = datebirth;
        this.address = address;
        this.workphone = workphone;
        this.mobile = mobile;
        this.isAdmin = isAdmin;
        this.vuelo = vuelo;
    }
    public Persona() {
        this.user = "";
        this.pass = "";
        this.name = "";
        this.lastName = "";
        this.email = "";
        this.datebirth = "";
        this.address = "";
        this.workphone = "";
        this.mobile = "";
        this.isAdmin = 0;
    
    }
    public char getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(char isAdmin) {
        this.isAdmin = isAdmin;
    }

  
 

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
   

   
     /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the datebirth
     */
    public String getDatebirth() {
        return datebirth;
    }

    /**
     * @param datebirth the datebirth to set
     */
    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the workphone
     */
    public String getWorkphone() {
        return workphone;
    }

    /**
     * @param workphone the workphone to set
     */
    public void setWorkphone(String workphone) {
        this.workphone = workphone;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    
}
