- Diseño de Software - Módulo 2
- Ejercitación 2.2
Ejercicio 7: Generador Central de Números de Atención
Contexto del problema:
La recepción de un hospital dispone de tres terminales que entregan números para trámites administrativos. Cada terminal utiliza un contador independiente, por lo que se generan números repetidos y se producen confusiones en la atención.

Objetivo de aprendizaje:
Mantener un contador único mediante Singleton y compartirlo entre diferentes componentes.

Requisitos funcionales:

Generar números de atención consecutivos a partir de uno.

Registrar desde qué terminal se solicitó cada número.

Consultar el último número emitido sin incrementar el contador.

Mostrar el historial de números entregados.

Restricciones técnicas:

El contador debe pertenecer a una única instancia Singleton.

Las terminales no deben poder modificar directamente el contador.

Las tres terminales deben ejecutarse en el mismo proceso y solicitar números de forma secuencial.

Se deben simular al menos veinte solicitudes alternadas sin generar números repetidos.
***
# Lógica y Funcionamiento del Programa:
    Para resolver el problema de los números duplicados, utilicé el patrón Singleton para centralizar la lógica de conteo en una única instancia compartida por todas las terminales del hospital.

- Clase Turno: Actúa como entidad de datos, guardando el número asignado y el nombre de la terminal que lo solicitó.

- Clase GeneradorTurnos: Es el Singleton. Contiene un atributo contador de tipo entero inicializado en cero, y una lista para el historial. Al encapsular el contador como private, se cumple la restricción de que ninguna terminal pueda alterarlo directamente (por ejemplo, reiniciarlo o saltar números). La única vía de modificación es el método generarNumero(), que incrementa el contador internamente, crea el objeto Turno y lo guarda en el historial. También se incluyó un método de consulta (consultarUltimoNumero()) que simplemente retorna el valor actual del atributo sin alterarlo.

- Clase Main: En el entorno de prueba, se instanciaron tres referencias al Singleton simulando las terminales A, B y C. Para cumplir con la restricción de las veinte solicitudes secuenciales alternadas, utilicé un bucle for de 20 iteraciones con lógica de módulo (% 3) para distribuir equitativamente las llamadas al método generarNumero() entre las tres variables. Al imprimir el historial completo, se demostró visualmente que los turnos del 1 al 20 se generaron en perfecto orden correlativo sin ningún salto ni número repetido.
***
# Ejecucion por consola
![Captura de pantalla 2026-11-11 210107.png](Captura%20de%20pantalla%202026-11-11%20210107.png)