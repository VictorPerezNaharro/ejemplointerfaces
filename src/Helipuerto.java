
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM1
 */
public class Helipuerto {
    //HOLIO
    ArrayList<Volador> helicopteros = new ArrayList<>();
            
    void añadir(Volador v){
        helicopteros.add(v);
    }
    
    boolean eliminar(int numero){
        if(helicopteros.size()>numero){
            helicopteros.remove(numero);
            return true;
        }else{
            return false;
        }
    }
    
    String aterrizar(int helicoptero, int metros){
        return "";
    }
    
    String despegar(int helicoptero){
        
        return "";
    }
    
}
