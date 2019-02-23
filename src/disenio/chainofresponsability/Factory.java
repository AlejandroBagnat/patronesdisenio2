/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disenio.chainofresponsability;

import java.util.Stack;

/**
 *
 * @author educacionit
 */
public class Factory {
    
    private static GrabadorUsuarioMantieneHistorial grabadorUsuarioMantieneHistorial;
    
    public static GrabadorUsuario crearGrabadorUsuario() {
        // crear SQLConnection
        // crear path del archivo o carpeta de ticetks
        // crear GrabadorTxt
        // crear GrabadorSQL;
        
        grabadorUsuarioMantieneHistorial = new GrabadorUsuarioMantieneHistorial(new UnaSegundaLogica(
                new GrabadorUsuarioTxt(), 
                new GrabadorUsuarioSQL()
        ));
        return grabadorUsuarioMantieneHistorial;
    }
    public static Stack<Usuario> obtenerUltimos() {
        return grabadorUsuarioMantieneHistorial.obtenerStack();
    }
}
