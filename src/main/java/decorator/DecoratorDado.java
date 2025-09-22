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
public abstract class DecoratorDado implements Dado {
    protected Dado dado; 

    public DecoratorDado(Dado dado) {
        this.dado = dado;
    }

    @Override
    public int rolar() {
        return dado.rolar(); 
    }
}
