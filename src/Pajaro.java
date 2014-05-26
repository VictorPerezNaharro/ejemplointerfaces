/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM1
 */
public class Pajaro implements Volador {

    @Override
    public String despegar() {
        return "El pajaro echa a volar.";
    }

    @Override
    public String aterrizar(int metros) {
        return "El pajaro aterriza despues de desplazarse "+metros+" a quemado "+metros*0.5+" calorias, ahora esta mas delgado.";
    }
    
}
