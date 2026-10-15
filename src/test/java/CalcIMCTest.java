import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcIMCTest {

    @Test
    void calculaImcComPesoEAlturaInformados() {
        CalcIMC calculadora = new CalcIMC();

        assertEquals(24.49, calculadora.calcularIMC(75.0, 1.75), 0.01);
    }
}
