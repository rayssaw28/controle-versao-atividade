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

public class DecoratorBonusPenalidade extends DecoratorDado {
    private int bonusPenalidade;

    public DecoratorBonusPenalidade(Dado dado, int bonus) {
        super(dado);
        this.bonusPenalidade = bonus;
    }

    @Override
    public int rolar() {
        int resultado = super.rolar() + bonusPenalidade;
        return Math.max(0, resultado); 
}
}