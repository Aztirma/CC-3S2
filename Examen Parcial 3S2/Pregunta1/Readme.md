<a name="br1"></a>**Alumna: Zuñiga Chicaña, Alejandra Aztirma Código: 20202142E**

**Pregunta 1**

Al consultar la siguiente lista de miembros:

List<Member> miembros = List.of(

PremiumMember("Abejita Azul"),

new VipMember("Kaperucita Feliz"),

new FreeMember("Inspectora Motita")

);

Nos muestra una excepción debido a que como se dijo en el texto, es decir no se efectua la
compatibilidad con LSP puesto que un free member no puede organizar torneos, la siguiente
captura nos muestra esto una vez ejecutado nuestro código
  ![1](https://github.com/Aztirma/CC-3S2/assets/89436252/3e43209c-9a4f-4194-a3ec-ee217a001bc4)


Ahora, lo que el problema nos pide es:

**Rediseña la solución para obtener un código compatible con LSP a través de un proceso de
refactorización.**

En este caso para que la refactorización “sea visible” se procedió a crear otra clase llamada
ChessClub, en la cual se encontrará la refactorización de los métodos para hacer posible que
nuestro código sea compatible con LSP.

En nuestro código original se creó la clase main.
![2](https://github.com/Aztirma/CC-3S2/assets/89436252/c9078136-23cf-4d9f-9c6e-5784a132c9c2)

Aquí se observa la clase ChessClub, la cual itera sobre una lista de miembros y muestra si pueden
unirse a un torneo y, si son TournamentParticipant, también intenta organizar un torneo. Si un
miembro no implementa TournamentParticipant, se muestra un mensaje indicando que no
pueden organizar torneos.

  ![3](https://github.com/Aztirma/CC-3S2/assets/89436252/175d87e4-ff80-4489-8dab-a7a770454434)

Una vez modificado el código, este nos da una salida como se muestra a continuación:
  ![4](https://github.com/Aztirma/CC-3S2/assets/89436252/bf5a15f5-30b0-46da-9c8d-46e13b9e20e4)


