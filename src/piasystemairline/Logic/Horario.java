
package piasystemairline.Logic;

import java.sql.Date;


public class Horario {
    private String Dia;
    private String Hora;
    private String min;

    public Horario(String Dia, String Hora, String min) {
        this.Dia = Dia;
        this.Hora = Hora;
        this.min = min;
    }

    public Horario() {
        this.Dia = "";
        this.Hora = "";
        this.min = "";
    }
    
    
    
    
    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }
  
}
