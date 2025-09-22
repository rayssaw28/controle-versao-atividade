/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.Random;

/**
 *
 * @author rayss
 */

public class DadoConcreto implements Dado {
    private int lados;
    private Random random;

    public DadoConcreto(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    @Override
    public int rolar() {
        return random.nextInt(lados) + 1;
    }

    public int getLados() {
        return lados;
    }
}
