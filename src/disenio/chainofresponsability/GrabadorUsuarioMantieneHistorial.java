/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disenio.chainofresponsability;

import java.util.*;

public class GrabadorUsuarioMantieneHistorial implements GrabadorUsuario {

    private UnaSegundaLogica segundaLogica = null;
    private Stack<Usuario> stackUsuario = new Stack<Usuario>();
    
    public GrabadorUsuarioMantieneHistorial(UnaSegundaLogica segundaLogica) {
        this.segundaLogica = segundaLogica;
    }   
    
    public Stack<Usuario> obtenerStack() {
        return stackUsuario;
    }
    
    public void grabar(Usuario u) {
        segundaLogica.grabar(u);
        stackUsuario.push(u);
    }
    
}
