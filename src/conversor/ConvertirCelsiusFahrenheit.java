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
public class ConvertirCelsiusFahrenheit extends Conversor{

    @Override
    public String getLabelValor1() {
        return "Grados Celsius";
    }

    @Override
    public String getLabelValor2() {
        return "Grados Fahrenheit";
    }

    @Override
    public Double convertirValor1Valor2(Double celsius) {
        return (celsius * 1.8) + 32;
    }

    @Override
    public Double convertirValor2Valor1(Double fahrenheit) {
        return (fahrenheit - 32) * 0.5556;
    }

    @Override
    public String toString() {
        return "Celsius - Fahrenheit";
    }
    
    
    
}
