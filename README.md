Resumen
Este Repositorio contiene la Automatización de pruebas para la aplicación travelosity la cual contiene las siguientes transacciones:

* Cruises
* Package
* RentCar
* ReservationFlights
* ReservationRoom

Navegador Google Chrome vr. 91.0.4472.77 ChromeDriver vr. 91.0.4472.19

Comandos Basicos:
* Ejecución de las pruebas y generación del reporte:

gradle clean test aggregate

* Ejecución de un runner especifico:

gradle test --tests=NombreRunner+Runner 

* Volver a ejecutar los testcases fallidos:

gradle test --tests=NombreRunner+Runner  --tests=FailedRunner 

Requisitos mínimos para ejecución adecuada de automatización:

* [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 1.8 o superior.
* [Google Chrome](https://www.google.com/intl/es/chrome/) Versión 75.0.3770.80 o superior.
* Conexión a internet para lograr descargar las dependencias necesarias

Estos requerimientos son necesarios ya que la automatización esta desarrollada en el lenguaje Java y se ejecuta sobre el navegador de Google Chrome; por otro lado para que Gradle logre descargar las dependencias requeridas es indispensable estar conectato a la red.

La automatización se puede ejecutar con Gradle localmente o con Gradle Wrapper generado en la compilacion del proyecto.

Resumen de codificación: 
Se utiliza BDD como metodología de desarrollo, siendo Serenity BDD el framework de automatización en el cual se implementa la generación de documentación viva la cual permite observar el paso a paso de la ejecución de la prueba con su respectiva evidencia, adicionalmente se usa Screenplay como patrón de arquitectura segregando el proyecto en distintas capas de abstracción.

* features:
Se redactan los casos prueba y escenarios en lenguaje Gherkin para fácil entendimiento por parte del negocio siguiendo la estructura “Given [rol] When[característica] Then [los beneficios]” y sus variaciones, con estos definiéndose el comportamiento de las transacciones a automatizar.

* Step Definitions:
Son clases que realizan la implementacion en java de los escenarios planteados en el feature.

* Tasks:
Son clases que contienen un conjunto de interacciones las cuales permiten realizar una actividad del proceso.

* Interactions:
Una interacción representa una acción directa del usuario con la interfaz como ingresar datos en campos o dar click en botones.

* Questions:
Es la capa donde se verifican los resultados de las operaciones realizadas en las capas anteriores.

* User interface:
Son las clases que mapean los componentes de una interfaz de usuario.

* Integration:
Capa creada para integraciones con otros subsistemas.

* Util:
Capa trasnversal al proyecto para reutilización de metodos.

* Model:
Una capa donde se encontrarán todos los objetos complejos de negocio, como personas o cuentas bancarias para ser usados dentro de cualquier capa del proyecto.

* Exceptions:
Clases con las cuáles se le da control a los comportamientos inesperados de la automatización en tiempo de ejecución.
