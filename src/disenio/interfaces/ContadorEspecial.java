/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disenio.interfaces;

/**
 *
 * @author educacionit
 */
public class ContadorEspecial {
    private Notificable<Integer> notificable;
    private int state = 0;
    
    public ContadorEspecial(Notificable notificable) {
        this.notificable = notificable;
    }
    public void incrementar() {
        state++;
        notificable.notificar(state);
    }
}
