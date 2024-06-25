<h1 align="center">☠️ Aprobar o morir ☠️</h1>

---

**Ejercicio - Patrones OO2 - Parcial 8/6/2024**

Se requiere desarrollar un sistema de gestión de préstamos para un banco el cual ofrece dos tipos de préstamos: Simple y UVA. Este sistema permitirá a los clientes solicitar uno de los tipos de préstamos indicando el monto y la cantidad de cuotas.

En los préstamos simples, el interés se establece al momento de solicitarlo, por lo tanto el valor de las cuotas es constante durante todo el plazo del préstamo. En cambio, en los préstamos UVA, se utiliza el índice de inflación(*) por lo que el valor de la cuota varía mes a mes. Para ambos casos el cálculo del valor de la cuota se realiza dividiendo el monto solicitado entre la cantidad de cuotas y luego multiplicándolo por la tasa de interés.

Una vez que se ha solicitado el préstamo el banco verifica que la cuota no supere el 30% del salario declarado por el cliente. Si excede este límite, el préstamo es rechazado; de lo contrario, es aprobado.

Usted debe implementar las operaciones que permitan la siguiente funcionalidad:
- **Registrar un cliente:** indicando su nombre y el salario mensual.
- **Solicitar un préstamo:** Se crea un préstamo del tipo indicado con el monto solicitado y la cantidad de cuotas pedidas. Se registra el cliente que lo solicitó. Para los préstamos simples, se registra también la tasa de interés (un valor que conoce el banco). Si el valor de la cuota supera el 30% del sueldo declarado por el cliente, se registra como préstamo rechazado. Caso contrario se acepta.
- **Determinar el valor de una cuota:** Retorna el valor de una cuota según el tipo de préstamo, sin importar en qué situación se encuentre el préstamo, teniendo en cuenta el interés correspondiente.
- **Pagar una cuota de un préstamo:**
  - Si el préstamo está aceptado: Se registra el pago y se considera abonada una cuota más. Una vez alcanzada la cantidad de cuotas solicitadas, el préstamo se marca como Finalizado.
  - En cualquier otra situación, se genera un error.
- **Monto pagado de un préstamo:** Retorna el total abonado hasta el momento.
- **Monto restante de un préstamo:** Retorna el monto que resta pagar para finalizar. En ambos tipos de préstamos se debe determinar el valor de la cuota y multiplicarlo por la cantidad de cuotas restantes.
- **Gastos de cancelación de un préstamo:**
  - Si el préstamo está aceptado: Retorna el monto restante sumado a los gastos administrativos y gastos de sellado. Para los préstamos simples, el valor administrativo es del 10% del monto restante y el valor de sellado es $5000. Para los préstamos UVA, el valor administrativo es del 10% del monto restante y el valor de sellado está bonificado.
  - Si el préstamo está finalizado: Se retorna 0.
  - En otra situación: se genera un error.

(*) Ayuda:
- Para calcular el índice de inflación actualizado, puede utilizar la siguiente expresión
  ```double indiceActual = Indec.getIndiceInflacion();```
- Para generar un error puede utilizar
  ```throw new Error ("error");```

**Tareas:**
1. Modele una solución para el problema planteado. Si utiliza patrones, indique cuáles y marque los mismos en las clases de su diseño.
2. Implemente en Java la funcionalidad requerida.
3. Implemente un test para verificar la funcionalidad de solicitar un préstamo simple de 100 pesos en 10 cuotas con un interés del 5% para un cliente cuyo salario declarado es de 5000.
