public class CalculadoraDescuentos {
    
    public double aplicarDescuentoPorcentaje(double monto, double porcentaje) {
        return monto - (monto * porcentaje / 100);
    }
    
    public double aplicarDescuentoFijo(double monto, double descuento) {
        double resultado = monto - descuento;
        return resultado < 0 ? 0 : resultado;
    }
    
    public double aplicarDescuentoAcumulado(double monto, double porcentaje, double descuento) {
        double conPorcentaje = aplicarDescuentoPorcentaje(monto, porcentaje);
        return aplicarDescuentoFijo(conPorcentaje, descuento);
    }
    
    public double calcularPrecioFinal(double montoOriginal, double porcentaje, double descuentoFijo) {
        return aplicarDescuentoAcumulado(montoOriginal, porcentaje, descuentoFijo);
    }
    
    public double validarPrecioNegativo(double montoFinal) {
        if (montoFinal < 0) {
            return 0;
        }
        return montoFinal;
    }
}