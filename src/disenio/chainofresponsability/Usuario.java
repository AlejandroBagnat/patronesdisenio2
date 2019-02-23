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
public class Usuario {
    public final String ID;
    public final String nombre;
    public final String Apellido;

    public Usuario(String ID, String nombre, String Apellido) {
        this.ID = ID;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }
}
