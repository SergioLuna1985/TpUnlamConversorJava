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
public class ConvertirMetrosCentimetros extends Conversor{
    
    public static final Double CIEN = 100.00;

    @Override
    public String getLabelValor1() {
        return "Metros";
    }

    @Override
    public String getLabelValor2() {
        return "Centimetros";
    }

    @Override
    public Double convertirValor1Valor2(Double metros) {
        return metros * CIEN;
    }

    @Override
    public Double convertirValor2Valor1(Double centimetros) {
        return centimetros / CIEN;
    }

    @Override
    public String toString() {
        return "Metro - Centimetro";
    }

    
    
}
