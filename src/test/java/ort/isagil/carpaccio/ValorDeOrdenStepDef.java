/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ort.isagil.carpaccio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import cucumber.api.java.es.*;
import org.junit.Assert;

/**
 *
 * @author alumnoFI
 */
public class ValorDeOrdenStepDef {

    int cantidad;
    int precioUnitario;

    int resultado;

    @Dado("^una cantidad de (\\d+) items y el precio unitario (\\d+)$")
    public void dadoLaCantidadDeItemsYSuPrecioUnitario(int cantidad,
            int precioUnitario) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    @Cuando("^calculo el valor de la orden$")
    public void calculoElValorDeLaOrden() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.resultado = new Calculadora().Calcular(this.cantidad ,this.precioUnitario)  ;
    }

    @Entonces("^el resultado es (\\d+)$")
    public void elResultadoEs(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(arg1, this.resultado);
    }
}
