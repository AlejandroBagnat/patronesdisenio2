/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disenio.chainofresponsability;

/**
 *
 * @author educacionit
 */
public class UnaSegundaLogica implements GrabadorUsuario {

    private java.util.Date date;
    private GrabadorUsuarioTxt grabadorUsuarioTxt;
    private GrabadorUsuarioSQL grabadorUsuarioSQL;

    public UnaSegundaLogica(GrabadorUsuarioTxt grabadorUsuarioTxt, GrabadorUsuarioSQL grabadorUsuarioSQL) {
        this.grabadorUsuarioTxt = grabadorUsuarioTxt;
        this.grabadorUsuarioSQL = grabadorUsuarioSQL;
    }
    
    @Override
    public void grabar(Usuario u) {
        
        grabadorUsuarioTxt.grabar(u);
        
        if (/* fechaActual > 1 minuto con respecto a la fecha anterior */ true) {
            grabadorUsuarioSQL.grabar(u);
        }
    }
    
}
