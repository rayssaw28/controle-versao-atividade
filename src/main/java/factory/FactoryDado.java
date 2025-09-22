/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import dados.Dado;
import dados.DadoConcreto;

/**
 *
 * @author rayss
 */
public class FactoryDado {
    
public static Dado criar(String tipo) {
        switch (tipo.toUpperCase()) {
            case "D6":
                return new DadoConcreto(6);
            case "D10":
                return new DadoConcreto(10);
            case "D20":
                return new DadoConcreto(20);
            default:
                throw new IllegalArgumentException("Tipo de dado inválido: " + tipo);
        }
    }
}
