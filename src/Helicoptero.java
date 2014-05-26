/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM1
 */
public class Helicoptero implements Volador{

    @Override
    public String despegar() {
       return "El helicoptero a despegado";
    }

    @Override
    public String aterrizar(int metros) {
        return "El avion ha aterrizado con un coste de "+(0.70*metros)+" €";
    }
    
}
