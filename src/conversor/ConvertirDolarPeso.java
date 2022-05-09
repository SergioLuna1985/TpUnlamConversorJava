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
public class ConvertirDolarPeso extends Conversor{
    public static final Double TIPOCAMBIO = 121.75;

    @Override
    public String getLabelValor1() {
        return "Dolar";
    }

    @Override
    public String getLabelValor2() {
        return "Pesos";
    }

    @Override
    public Double convertirValor1Valor2(Double dolar) {
        return dolar * TIPOCAMBIO;
    }

    @Override
    public Double convertirValor2Valor1(Double peso) {
        return peso / TIPOCAMBIO;
    }

    @Override
    public String toString() {
        return "Dolar - Peso";
    }
    
}
