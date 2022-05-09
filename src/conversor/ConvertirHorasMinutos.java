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
public class ConvertirHorasMinutos extends Conversor{
    private final Double REFERENCIA = 60.0;

    @Override
    public String getLabelValor1() {
        return "Horas";
    }

    @Override
    public String getLabelValor2() {
        return "Minutos";
    }

    @Override
    public Double convertirValor1Valor2(Double hora) {
        return hora * REFERENCIA;
    }

    @Override
    public Double convertirValor2Valor1(Double minuto) {
        return minuto / REFERENCIA;
    }

    @Override
    public String toString() {
        return "Horas - Minutos";
    }
    
    
}
