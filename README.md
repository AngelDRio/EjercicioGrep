# Ejercicio Grep

Este programa en Java muestra cómo ejecutar un proceso externo desde el propio código, en este caso el comando `grep`, que se utiliza habitualmente en sistemas Unix y Linux para buscar texto dentro de archivos o flujos de datos.

El programa define un conjunto de líneas de texto y ejecuta el comando `grep -i psp`, donde la opción `-i` permite realizar la búsqueda sin distinguir entre mayúsculas y minúsculas. A través de un flujo de salida, el programa envía esas líneas al proceso `grep`, como si el usuario las introdujera manualmente por la consola.

Posteriormente, el programa lee la salida generada por `grep` utilizando un flujo de entrada y muestra por pantalla únicamente aquellas líneas que contienen la palabra “psp”. De esta manera, se demuestra cómo Java puede comunicarse con procesos del sistema operativo mediante flujos de entrada y salida estándar.