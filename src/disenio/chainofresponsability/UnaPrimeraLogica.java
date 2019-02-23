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
public class UnaPrimeraLogica implements GrabadorUsuario {

    private GrabadorUsuarioTxt grabadorUsuarioTxt;
    private GrabadorUsuarioSQL grabadorUsuarioSQL;

    public UnaPrimeraLogica(GrabadorUsuarioTxt grabadorUsuarioTxt, GrabadorUsuarioSQL grabadorUsuarioSQL) {
        this.grabadorUsuarioTxt = grabadorUsuarioTxt;
        this.grabadorUsuarioSQL = grabadorUsuarioSQL;
    }

    public void grabar(Usuario u) {
        
        grabadorUsuarioTxt.grabar(u);
        
        try {
            grabadorUsuarioSQL.grabar(u);
        }
        catch (Exception ex) {
        }        
    }
    
    
    
}
