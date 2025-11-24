# 🧮 Calculadora de Descuentos - TDD con PDCA

## 📋 Descripción del Proyecto
Proyecto de taller práctico que implementa una calculadora de descuentos aplicando el ciclo PDCA (Plan-Do-Check-Act) con la metodología TDD (Test-Driven Development).

## 👥 Integrantes del Grupo 3
1. **Gabriel Arguello** - Ciclo 1: Descuento Porcentual
2. **Joaquín Chacón** - Ciclo 2: Descuento Fijo
3. **Priscila Zuñiga** - Ciclo 3: Descuento Acumulado
4. **Diego Vega** - Ciclo 4: Validaciones y Casos Especiales

## 🎯 Funcionalidades Implementadas

### ✅ Ciclo 1: Descuento Porcentual
- **Método:** `aplicarDescuentoPorcentaje(double monto, double porcentaje)`
- **Descripción:** Aplica un descuento en porcentaje sobre el monto original
- **Ejemplo:** Descuento del 10% sobre $100 = $90

### ✅ Ciclo 2: Descuento Fijo
- **Método:** `aplicarDescuentoFijo(double monto, double descuento)`
- **Descripción:** Aplica un descuento de cantidad fija en dólares
- **Ejemplo:** Descuento de $5 sobre $100 = $95

### ✅ Ciclo 3: Descuento Acumulado
- **Método:** `aplicarDescuentoAcumulado(double monto, double porcentaje, double descuento)`
- **Descripción:** Aplica primero un descuento porcentual, luego un descuento fijo
- **Ejemplo:** 10% sobre $100 ($90) + $5 fijo = $85

### ✅ Ciclo 4: Validaciones
- Tests para casos extremos y validaciones
- Manejo de valores negativos
- Validación de descuentos mayores al monto

## 🚀 Cómo Ejecutar el Proyecto

### Prerrequisitos
- Java 17 o superior
- Maven 3.x
- GitHub Codespaces o IDE compatible

### Comandos Maven
```bash
