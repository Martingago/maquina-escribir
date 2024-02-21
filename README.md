# Teorema de los Monos Infinitos

"Dale a un mono una máquina de escribir y tiempo infinito, en algún momento escribirá una novela de shakespeare"

Este programa en JAVA simula el conocido teorema de los monos infinitos, con algunas adaptaciones para simplificar el proceso:

- Unicamente se generan los 27 caracteres del abecedario español en minúsculas (Se excluyen: números, signos de puntuación, acentos, y carácteres especiales).
- La palabras que se generen serán del mismo tamaño que la palabra objetivo.
- El programa opera de manera secuencial, manteniéndose en una palabra específica hasta que se descubre. Una vez descubierta, el programa avanza a la siguiente palabra, continuando este proceso hasta que se completa toda la cadena de texto.

El programa opera sobre un texto predefinido ubicado en `src/FICHERO_ANALIZAR/Fichero_analizar.java` y ejecuta un patrón de diseño Productor/Consumidor. Inicializa tres hilos productores que generan palabras aleatorias y tres hilos consumidores encargados de validarlas hasta encontrar la palabra objetivo. Todo esto es gestionado por una clase directora: `src/model/main/DirectorAlgoritmoBusquedaPalabras.java`, que se encarga de administrar todas las palabras que se deben generar, así como de obtener la información general necesaria para el correcto funcionamiento del programa.


## Requisitos

- Java JDK 20

## Ejecución del Programa

Para ejecutar el programa, sigue estos pasos:

1. Navega hasta la carpeta `build/classes/`.
2. Dentro de la carpeta `build/classes/` abre una terminal y ejecutar el siguiente comando:
3. Ejecuta el archivo con el siguiente comando:

```bash
java main/Main_Maquina_escribir
```

## Historial de versiones

V1.0.0: Primera version de la aplicación:
- Realiza  dentro de la clase: `src/FICHERO_ANALIZAR/Fichero_analizar.java` una extracción de texto para ejecutar el hilo principal del programa.
- Guardado automático de las palabras descubiertas [fecha, hora, intentos necesarios para ser descubierta] cada vez que una palabra es descubierta y otro guardado automático cada 2 minutos.
- Guardado de estadísticas de ejecución del programa [Tiempo total de ejecución, número de palabras totales generadas, estadísticas de palabras].
- Emulación de palabras que se están generando.
- Posibilidad de pausar/reanudar el programa.

## Linkedin

https://www.linkedin.com/in/martin-gago-choren/

