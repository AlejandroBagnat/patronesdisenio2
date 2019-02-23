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
public class Init implements Notificable<Integer> {
    private ContadorEspecial contadorEspecial = null;
    public Init() {
        contadorEspecial = new ContadorEspecial(this);
    }
    public static void main(String... params) {
        Init z = new Init();
        z.contadorEspecial.incrementar();
        z.contadorEspecial.incrementar();
        z.contadorEspecial.incrementar();
        z.contadorEspecial.incrementar();
    }

    @Override
    public void notificar(Integer x) {
        System.out.println(x);
    }
}
