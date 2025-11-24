import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraDescuentosTest {
    
    CalculadoraDescuentos calc = new CalculadoraDescuentos();
    
    // ===== CICLO 1: Descuento Porcentaje =====
    // Prueba: Aplicar 15% de descuento sobre $200 debe resultar en $170
    // Cálculo: 200 - (200 * 0.15) = 200 - 30 = 170
    @Test
    public void testDescuentoPorcentaje(){
        double resultado = calc.aplicarDescuentoPorcentaje(200, 15);
        assertEquals(170, resultado);
    }
    
    // ===== CICLO 2: Descuento Fijo =====
    // Prueba: Restar $12 fijos de $80 debe resultar en $68
    // Cálculo: 80 - 12 = 68
    @Test
    public void testDescuentoFijo(){
        double resultado = calc.aplicarDescuentoFijo(80, 12);
        assertEquals(68, resultado);
    }
    
    // ===== CICLO 3: Descuento Acumulado =====
    // Prueba: Aplicar primero 20% sobre $150, luego restar $8 fijos
    // Cálculo: Paso 1: 150 - (150 * 0.20) = 150 - 30 = 120
    //          Paso 2: 120 - 8 = 112
    @Test
    public void testDescuentoAcumulado(){
        double resultado = calc.aplicarDescuentoAcumulado(150, 20, 8);
        assertEquals(112, resultado);
    }
    
    // ===== CICLO 4: Calcular Precio Final =====
    // Prueba: Calcular el precio final aplicando 25% y $15 sobre $250
    // Cálculo: Paso 1: 250 - (250 * 0.25) = 250 - 62.5 = 187.5
    //          Paso 2: 187.5 - 15 = 172.5
    @Test
    public void testCalcularPrecioFinal(){
        double resultado = calc.calcularPrecioFinal(250, 25, 15);
        assertEquals(172.5, resultado);
    }
    
    // Prueba: Validar que valores negativos se conviertan a 0 y positivos se mantengan
    // Cálculo: -30 → 0 (no puede haber precios negativos)
    //          75 → 75 (valor positivo se mantiene)
    @Test
    public void testValidarPrecioNegativo(){
        double resultadoNegativo = calc.validarPrecioNegativo(-30);
        assertEquals(0, resultadoNegativo);
        
        double resultadoPositivo = calc.validarPrecioNegativo(75);
        assertEquals(75, resultadoPositivo);
    }
}