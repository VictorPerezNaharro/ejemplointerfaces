/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM1
 */
public class Avion implements Volador{

    @Override
    public String despegar() {
        return "El avion a despegado";
    }

    @Override
    public String aterrizar(int metros) {
        return "El avion ha aterrizado con un coste de "+(0.85*metros)+" €";
    }
    
}
