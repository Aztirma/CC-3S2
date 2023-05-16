<a name="br1"></a>**Pregunta 4 (6 puntos) (a)**

(a) ¿Qué son las pruebas efectivas y sistemáticas? Referencia: **https://www.effective-software-**

**testing.com/effective-and-systematic (1 punto)**

Las pruebas efectivas y sistemáticas son un enfoque disciplinado y estructurado para diseñar y ejecutar pruebas
de software. Se basan en comprender los requisitos, diseñar casos de prueba exhaustivos y estructurados, utilizar
pruebas basadas en especificaciones y propiedades, considerar las dependencias y emplear técnicas de simulación. 
El objetivo es mejorar la calidad del software al garantizar pruebas completas y significativas. Este enfoque
ayuda a identificar y corregir errores de manera más eficiente, evitando la pérdida de tiempo y recursos en pruebas
innecesarias. Además, proporciona una base sólida para el diseño y mantenimiento del conjunto de pruebas. Al seguir
este enfoque, los ingenieros de pruebas pueden obtener resultados más confiables y contribuir a un software más robusto y confiable.

(b) Pruebas (2 puntos)

Dada esta especificación:

![a](https://github.com/Aztirma/CC-3S2/assets/89436252/77b2b489-90cd-45b7-a5d5-681a82c18984)


(a) Comienza a implementar una estrategia de prueba sistemática para esta función
 escribiendo una buena partición del espacio de entrada solo en el límite de entrada, es
 decir, la partición no debe mencionar ni el texto ni el delimitador.

a) Límite < 0: Prueba con un límite negativo, lo que significa que no hay un límite
 superior en el número de elementos a devolver. Por ejemplo, limit = -1.
b) Límite = 0: Prueba con un límite igual a cero, lo que implica que no se deben devolver
 elementos. Por ejemplo, limit = 0.

c) Límite > 0: Prueba con un límite positivo para limitar el número máximo de elementos
 a devolver. Por ejemplo, limit = 3.




<a name="br2"></a>(b) Ahora, escriba una buena partición del espacio de entrada sobre la relación entre el límite
 y las ocurrencias del delimitador en el texto. Tu partición debe mencionar las tres
 entradas.

a) Sin ocurrencias del delimitador en el texto: Prueba con un texto que no contiene el
 delimitador. Por ejemplo, texto = "Hola Mundo" y delimitador = ','.

b) Menos de (límite-1) ocurrencias del delimitador en el texto: Prueba con un texto que
 contiene menos ocurrencias del delimitador que el límite especificado menos uno. Por
 ejemplo, texto = "Uno-Dos-Tres-Cuatro-Cinco", delimitador = '-' y límite = 3.
c) Igual o más de (límite-1) ocurrencias del delimitador en el texto: Prueba con un texto
 que contiene igual o más ocurrencias del delimitador que el límite especificado menos
 uno. Esto debería generar una excepción IllegalArgumentException. Por ejemplo,
 texto = "Uno-Dos-Tres-Cuatro-Cinco-Seis", delimitador = '-' y límite = 4.
