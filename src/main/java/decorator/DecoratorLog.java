/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import dados.Dado;

/**
 *
 * @author rayss
 */

public class DecoratorLog extends DecoratorDado {

    public DecoratorLog(Dado dado) {
        super(dado);
    }

    @Override
    public int rolar() {
        int resultado = super.rolar();
        return resultado;
    }
}
