package piasystemairline.Presentation.ReporteDeApp;

import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Reservacion;
import piasystemairline.Logic.Tiquete;
import piasystemairline.PIASystemAirline;

public class Controller {
    View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
        modelo = model;
        Vista = vista;
        Vista.setControlador(this);
        Vista.setModelEdit(modelo);
        Vista.update(modelo, this);
    }

    public void Show() {
        Vista.setVisible(true);
    }
    public void update() {
        Vista.update(modelo,Vista);
    }

    void cargarListaMeses(String mes) throws Exception {
        piasystemairline.Logic.Model.instance().ConsultaTiquetePorMes(mes);
    }

    void cargarListaAnno(String anno) throws Exception {
        piasystemairline.Logic.Model.instance().ConsultaTiquetePorAnno(anno);
    }
    
    /*void cargarListaUsuarioPorAvion(String avion) throws Exception{
        piasystemairline.Logic.Model.instance().ConsultarUsuarioPorAvion();
    }

    void cargarListaRutas(String ruta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
    
   
}
