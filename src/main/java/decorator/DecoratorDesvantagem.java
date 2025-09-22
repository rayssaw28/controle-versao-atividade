/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import dados.Dado;
import java.util.Random;

/**
 *
 * @author rayss
 */

public class DecoratorDesvantagem extends DecoratorDado {
    public DecoratorDesvantagem(Dado dado) {
        super(dado);
    }

    @Override
    public int rolar() {
        int r1 = super.rolar();
        int r2 = super.rolar();
        return Math.min(r1, r2);
    }
}

