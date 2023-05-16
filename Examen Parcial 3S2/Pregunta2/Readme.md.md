<a name="br1"></a>**Alumna: Zuñiga Chicaña, Alejandra Aztirma Código: 20202142E**

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

![img.png](img.png)

*Una vez que se agrega, debería fallar porque no se lanza RuntimeException.*

![2.png](Examen Parcial 3S2/Pregunta2/imagenes/1.png)
*La tercera vez, debería tener éxito porque el código que corresponde a esta prueba está completamente
implementado.*
![3.png](..%2F..%2F..%2F..%2F..%2FDownloads%2Fsofr%2F3.png)
**Prueba: límite de tablero II**
![4.png](..%2F..%2F..%2F..%2F..%2FDownloads%2Fsofr%2F4.png)



Realiza la implementación de esta especificación es casi la misma que la anterior.

**Prueba: lugar ocupado**

Una vez establecidos los límites del tablero, ahora solo falta asegurar de que se pongan en lugares
desocupados, se creó la prueba para esto y se complementó el método Jugar.
![5.png](..%2F..%2F..%2F..%2F..%2FDownloads%2Fsofr%2F5.png)
Se tiene esta salida debido a que aún no se complementó el método jugar, se procede a
complementar y ahora si la prueba pasa.
![6.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F6.png)


Prueba pasada una vez se implementa el código
![7.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F7.png)
Ahora nos pide Refactorizar el método Jugar, esto para que se tenga un mejor entendimiento del
código
![8.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F8.png)
**Requisito 2: agregar soporte para dos jugadores**

El siguiente requisito se dividió en estas 3 pruebas:

- El primer turno lo debe jugar el jugador X.

- Si el último turno fue jugado por X, entonces el próximo turno debe ser jugado por O



- Si el último turno fue jugado por O, entonces el próximo turno debe ser jugado por X

Procederemos a escribir las pruebas, antes que la implementación del método, en este caso el
método getTurn();

**Prueba – X juega primero**

Se creó la prueba para que el método proximoJugador devuelva X. Pero al pasar ejecutarlo se ve
que no se compila puesto que aún no se creó dicho método.
![9.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F9.png)
Se implementó el método ProximoJugador, el cual devuelve el turno inicial, en este caso X. Esta
implementación inicial solo cumple con la primera prueba. En las pruebas posteriores, refinaremos
este código para determinar correctamente qué jugador debe jugar a continuación.
![10.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F10.png)
Ahora si una vez creado nuestro método nuestra prueba pasa.
![11.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F11.png)
**Prueba: O juego justo después de X**

Como hemos estado haciendo, primero se implemento la prueba, por ende, la prueba falló ya que
no se implemento el método jugar
![12.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F12.png)


El método jugar ya existe, pero falta las condiciones necesarias para que pueda pasar la prueba
![13.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F13.png)
**Prueba: X juega justo después de O**

No se implementó nada al método ProximoJugador y aun así la prueba ha pasado, como se sugirió
se desechará esta prueba, pero de todos modos aquí se deja una captura de la prueba.
![14.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F14.png)
**Requisito 3: agregar condiciones ganadoras**

**Prueba: por defecto no hay ganador**

En esta prueba, se crea una instancia de TicTacToe y se llama al método jugar() con una posición
válida en el tablero (en este caso, la posición (1, 1)). Luego se verifica que el resultado del método
jugar() sea false, lo cual indica que no hay ganador.

![15.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F15.png)


**Prueba – condición ganadora I**

Se realizó la implementación del método jugar y de esta manera se procedió a hacer la prueba
respectiva para verificar esta condición.
![16.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F16.png)


![17.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F17.png)

Nuevamente se procedió a refactorizar el método Jugar, para poder realizar los siguientes casos
sobre las condiciones ganadoras.
![18.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F18.png)
En esta refactorización, se creó un método separado llamado hayGanador() que se encarga de
verificar si hay un ganador en las líneas horizontales. El método jugar() ahora simplemente llama a
hayGanador() y retorna el resultado.

**Prueba – condición ganadora II**

Esta implementación es similar a la anterior
![19.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F19.png)
También se implementó el método hayGanador() para verificar la ganancia vertical:
![20.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F20.png)



**Prueba – condición ganador** III

La prueba "ganarDiagonalSuperiorIzquierdaInferiorDerecha" verifica si el juego detecta
correctamente una ganancia en la línea diagonal superior izquierda a inferior derecha.
![21.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F21.png)
Por otro lado se tuvo que implementar nuevamente el método hayGanador(), se verifica tanto la
ganancia en líneas horizontales, verticales y diagonales, asegurando que todas las condiciones
ganadoras estén cubiertas.
![22.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F22.png)
**Prueba – condición ganadora IV**



Finalmente, existe la última condición ganadora posible para abordar: El jugador gana cuando se
forma la diagonal desde la parte inferior izquierda hasta la parte superior derecha
![23.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F23.png)

Con esta implementación, se verifican todas las condiciones ganadoras posibles, incluyendo las
líneas diagonales desde la parte inferior izquierda hasta la parte superior derecha.
![24.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F24.png)

**Refactorización**

![25.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F25.png)


 En esta refactorización, el bucle existente condiciones adicionales para verificar las dos diagonales.
Esto reutiliza el bucle existente y evita la duplicación de código.

**Requisito 4: condiciones de empate**

Se creó por ultima la prueba para el caso de empate, en este caso la prueba no funciona debido a
que no se implementó aún el método hayEmpate()

![26.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F26.png)

Se implementó el método hayEmpate para que así la prueba anteriormente mencionada pueda
pasar.

![27.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F27.png)

Una vez implementado, la prueba puedo ser ejecutada.
![28.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F28.png)

Por último, nos piden nuevamente un refactorización usando un método llamado esGanador() a
pesar de que no esté al alcance la última prueba.

![29.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F29.png)
![30.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F30.png)
![31.png](..%2F..%2F..%2F..%2F..%2FPictures%2Fsoft%2F31.png)
<a name="br13"></a>Con esta refactorización, se mejora la claridad y legibilidad del código al separar las
responsabilidades de verificación de empate y ganador en métodos individuales. Esto facilita el
mantenimiento y comprensión del código,
