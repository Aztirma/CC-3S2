 **Alumna: Zuñiga Chicaña, Alejandra Aztirma Código: 20202142E**

**PREGUNTA 2**

Para la pregunta 2, se procedió a reutilizar el código del TicTacToe.

Requisito1: colocación de piezas

Requisito2: agregar soporte para dos jugadores

Requisito3: agregar condiciones ganadores

Requisito4: condiciones de empate

**Requisito 1: colocación de piezas**

**Prueba: límites del tablero I**

Todo lo que tenemos que hacer es crear el método jugar y asegurarnos de que arroja RuntimeException
cuando el argumento x es menor que 1 o mayor que 3 (el tablero es 3x3).

*Debes ejecutar esta prueba tres veces. La primera vez, debería fallar porque el método jugar no existe.*
![1](https://github.com/Aztirma/CC-3S2/assets/89436252/de8e8d95-c833-4b8b-8356-1b81b892c953)

*Una vez que se agrega, debería fallar porque no se lanza RuntimeException.*
![2](https://github.com/Aztirma/CC-3S2/assets/89436252/ae1742df-ede7-4b24-bf97-0ed1f02c5e01)


*La tercera vez, debería tener éxito porque el código que corresponde a esta prueba está completamente
implementado.*
![3](https://github.com/Aztirma/CC-3S2/assets/89436252/0393d0bf-2fe3-44bb-933c-48e114b3519e)


**Prueba: límite de tablero II**

Realiza la implementación de esta especificación es casi la misma que la anterior.
![4](https://github.com/Aztirma/CC-3S2/assets/89436252/3a6df4df-2fe0-4450-ac03-5bb9c69f230b)


**Prueba: lugar ocupado**

Una vez establecidos los límites del tablero, ahora solo falta asegurar de que se pongan en lugares
desocupados, se creó la prueba para esto y se complementó el método Jugar.
![5](https://github.com/Aztirma/CC-3S2/assets/89436252/4eafb0f3-28ac-4feb-87ad-e96f03bb0383)

Se tiene esta salida debido a que aún no se complementó el método jugar, se procede a
complementar y ahora si la prueba pasa.

![6](https://github.com/Aztirma/CC-3S2/assets/89436252/c4094116-3901-45fb-9488-bc840f795d5d)

Prueba pasada una vez se implementa el código

![7](https://github.com/Aztirma/CC-3S2/assets/89436252/ac48a0b4-17c1-4647-bd51-ec127edd823d)

Ahora nos pide Refactorizar el método Jugar, esto para que se tenga un mejor entendimiento del
código
![8](https://github.com/Aztirma/CC-3S2/assets/89436252/f5157cf5-d24e-41fa-9c1e-3268cfe3d19d)


**Requisito 2: agregar soporte para dos jugadores**

El siguiente requisito se dividió en estas 3 pruebas:

\- El primer turno lo debe jugar el jugador X.

\- Si el último turno fue jugado por X, entonces el próximo turno debe ser jugado por O



- Si el último turno fue jugado por O, entonces el próximo turno debe ser jugado por X

Procederemos a escribir las pruebas, antes que la implementación del método, en este caso el
método getTurn();

**Prueba – X juega primero**

Se creó la prueba para que el método proximoJugador devuelva X. Pero al pasar ejecutarlo se ve
que no se compila puesto que aún no se creó dicho método.
![9](https://github.com/Aztirma/CC-3S2/assets/89436252/576bcfb8-3396-4037-9c59-73343e6be19b)


Se implementó el método ProximoJugador, el cual devuelve el turno inicial, en este caso X. Esta
implementación inicial solo cumple con la primera prueba. En las pruebas posteriores, refinaremos
este código para determinar correctamente qué jugador debe jugar a continuación.

![10](https://github.com/Aztirma/CC-3S2/assets/89436252/d834f745-15f7-4b5b-867a-622cc91f595d)

Ahora si una vez creado nuestro método nuestra prueba pasa.
![11](https://github.com/Aztirma/CC-3S2/assets/89436252/4bd3c9c9-f8f2-4e4a-ae1c-a5904753946e)


**Prueba: O juego justo después de X**


Como hemos estado haciendo, primero se implemento la prueba, por ende, la prueba falló ya que
no se implemento el método jugar

![12](https://github.com/Aztirma/CC-3S2/assets/89436252/72717ed4-8906-40e1-af4e-978afcf6c577)

El método jugar ya existe, pero falta las condiciones necesarias para que pueda pasar la prueba
![13](https://github.com/Aztirma/CC-3S2/assets/89436252/6cb8a921-aa6e-423f-9b7e-e4aa063094e9)


**Prueba: X juega justo después de O**

No se implementó nada al método ProximoJugador y aun así la prueba ha pasado, como se sugirió
se desechará esta prueba, pero de todos modos aquí se deja una captura de la prueba.

![14](https://github.com/Aztirma/CC-3S2/assets/89436252/db4e1c1b-2723-480c-a8cb-38e4d0aa2208)

**Requisito 3: agregar condiciones ganadoras
Prueba: por defecto no hay ganador**

En esta prueba, se crea una instancia de TicTacToe y se llama al método jugar() con una posición
válida en el tablero (en este caso, la posición (1, 1)). Luego se verifica que el resultado del método
jugar() sea false, lo cual indica que no hay ganador.

![15](https://github.com/Aztirma/CC-3S2/assets/89436252/b127ca87-e2ad-4a3e-a70f-8e498d96ffef)



**Prueba – condición ganadora I**

Se realizó la implementación del método jugar y de esta manera se procedió a hacer la prueba
respectiva para verificar esta condición.
![16](https://github.com/Aztirma/CC-3S2/assets/89436252/5f90a61e-1ee0-4866-9b1b-63d187c8bf4b)

![17](https://github.com/Aztirma/CC-3S2/assets/89436252/9f928d0a-eb05-4c80-8212-db6c7ec72ac4)

Nuevamente se procedió a refactorizar el método Jugar, para poder realizar los siguientes casos
sobre las condiciones ganadoras.

![18](https://github.com/Aztirma/CC-3S2/assets/89436252/480be1fd-836d-4575-8c38-d4b2b48c5aca)



En esta refactorización, se creó un método separado llamado hayGanador() que se encarga de
verificar si hay un ganador en las líneas horizontales. El método jugar() ahora simplemente llama a
hayGanador() y retorna el resultado.

**Prueba – condición ganadora II**

Esta implementación es similar a la anterior
![19](https://github.com/Aztirma/CC-3S2/assets/89436252/95864210-bf02-4125-96c8-fe4fa342b494)


También se implementó el método hayGanador() para verificar la ganancia vertical:

![20](https://github.com/Aztirma/CC-3S2/assets/89436252/5861b845-7db9-4aa0-9e25-b2863304abb9)



<a name="br9"></a>**Prueba – condición ganador** III

La prueba "ganarDiagonalSuperiorIzquierdaInferiorDerecha" verifica si el juego detecta
correctamente una ganancia en la línea diagonal superior izquierda a inferior derecha.

![21](https://github.com/Aztirma/CC-3S2/assets/89436252/f72625dc-faa9-423e-93c0-d58baea36a4b)

Por otro lado se tuvo que implementar nuevamente el método hayGanador(), se verifica tanto la
ganancia en líneas horizontales, verticales y diagonales, asegurando que todas las condiciones
ganadoras estén cubiertas.
![22](https://github.com/Aztirma/CC-3S2/assets/89436252/e6546f43-0c4d-4b36-9bab-ade01339ee9d)

**Prueba – condición ganadora IV**



Finalmente, existe la última condición ganadora posible para abordar: El jugador gana cuando se
forma la diagonal desde la parte inferior izquierda hasta la parte superior derecha
![23](https://github.com/Aztirma/CC-3S2/assets/89436252/03ed6a3f-3631-48b1-a8dd-7e43ad5046bf)

Con esta implementación, se verifican todas las condiciones ganadoras posibles, incluyendo las
líneas diagonales desde la parte inferior izquierda hasta la parte superior derecha.

![24](https://github.com/Aztirma/CC-3S2/assets/89436252/21a55567-3273-4859-ae7b-77bda7f70d40)


**Refactorización**

![25](https://github.com/Aztirma/CC-3S2/assets/89436252/b7271bbc-83f3-4697-97c1-8f7e0af984ae)



En esta refactorización, el bucle existente condiciones adicionales para verificar las dos diagonales.
Esto reutiliza el bucle existente y evita la duplicación de código.

**Requisito 4: condiciones de empate**

Se creó por ultima la prueba para el caso de empate, en este caso la prueba no funciona debido a
que no se implementó aún el método hayEmpate()
![26](https://github.com/Aztirma/CC-3S2/assets/89436252/e1850536-0d71-472c-abaf-6adb7d262946)

Se implementó el método hayEmpate para que así la prueba anteriormente mencionada pueda
pasar.

![27](https://github.com/Aztirma/CC-3S2/assets/89436252/017a56cc-cf6b-41d7-bcb3-72e3de688b75)


Una vez implementado, la prueba paso.
![28](https://github.com/Aztirma/CC-3S2/assets/89436252/e3ef78d2-15ad-4855-aa61-1f6d8cb82e63)


Por último, nos piden nuevamente un refactorización usando un método llamado esGanador() a
pesar de que no esté al alcance la última prueba.
![29](https://github.com/Aztirma/CC-3S2/assets/89436252/ce0fd70c-48a1-4b6a-8915-e3fe1e11f0f9)
![30](https://github.com/Aztirma/CC-3S2/assets/89436252/17cedafd-e0d7-4165-9db4-0b6095fca0f4)
![31](https://github.com/Aztirma/CC-3S2/assets/89436252/c7990268-9a14-45be-8216-3423ab863e84)

Con esta refactorización, se mejora la claridad y legibilidad del código al separar las
responsabilidades de verificación de empate y ganador en métodos individuales. Esto facilita el
mantenimiento y comprensión del código,

