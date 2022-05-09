/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Sergio.Luna
 */
public class ConvertirGigabyteMegabyte extends Conversor{
    
    private final Double REFERENCIA = 1024.0;
    
    @Override
    public String getLabelValor1() {
        return "Gibabyte";
    }

    @Override
    public String getLabelValor2() {
        return "Megabyte";
    }

    @Override
    public Double convertirValor1Valor2(Double Gigabyte) {
        return Gigabyte * REFERENCIA;
    }

    @Override
    public Double convertirValor2Valor1(Double Megabyte) {
        return Megabyte / REFERENCIA;
    }

    @Override
    public String toString() {
        return "Gigabyte - Megabyte";
    }
    
    
}
