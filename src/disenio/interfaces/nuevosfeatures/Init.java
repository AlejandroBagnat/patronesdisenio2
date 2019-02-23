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
public class Init {
    private ContadorEspecial contadorEspecial = null;
    public Init() {
        contadorEspecial = new ContadorEspecial( z -> actualizarValor(z));
    }
    public static void main(String... params) {
        Init z = new Init();
        z.contadorEspecial.incrementar();
        z.contadorEspecial.incrementar();
        z.contadorEspecial.incrementar();
        z.contadorEspecial.incrementar();
    }
    public void actualizarValor(Integer x) {
        System.out.println(x);
    }
}
