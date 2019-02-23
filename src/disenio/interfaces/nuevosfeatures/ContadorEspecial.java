/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disenio.interfaces.nuevosfeatures;

import disenio.interfaces.*;
import java.util.function.Consumer;

/**
 *
 * @author educacionit
 */
public class ContadorEspecial {
    private Consumer<Integer> notificable;
    private int state = 0;
    
    public ContadorEspecial(Consumer<Integer> notificable) {
        this.notificable = notificable;
    }
    public void incrementar() {
        state++;
        notificable.accept(state);
    }
}
