# Kata FizzBuzz - Testing & TDD con Java

Este proyecto consiste en la resolución de la clásica **Kata FizzBuzz** utilizando el lenguaje **Java** y aplicando la metodología **TDD** (Desarrollo Guiado por Pruebas). El objetivo principal es practicar la escritura de tests unitarios antes de la implementación de la lógica.

## 📋 Instrucciones del Ejercicio
El programa consiste en una función que toma números enteros positivos y devuelve su representación en cadena siguiendo estas reglas:

* **Fizz**: Si el número es múltiplo de **3**.
* **Buzz**: Si el número es múltiplo de **5**.
* **FizzBuzz**: Si el número es múltiplo de **3** y de **5**.
* **Número**: Si no se cumple ninguna de las anteriores, se devuelve el número como cadena.

### Ejemplo de salida (del 1 al 15):
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz

---

## 🛠️ Requisitos del Proyecto
- [x] Escribir la función que convierte los números en la cadena solicitada.
- [x] Implementar en el método `main` el código que imprime el resultado por pantalla.
- [x] Escribir todos los tests unitarios necesarios para validar la lógica.
- [x] Documentar el resultado de los tests en este README.

---

## 🧪 Sección de Tests
Se han utilizado tests parametrizados con **JUnit 5** para cubrir diferentes escenarios, incluyendo múltiplos de 3, múltiplos de 5 y múltiplos de ambos.

### Captura de resultados:

<img width="383" height="212" alt="CapturaTestFizzbuzz" src="https://github.com/user-attachments/assets/c2e4e9ce-af23-4548-82bb-c17e44448590" /><img width="300" height="220" alt="image" src="https://github.com/user-attachments/assets/06cbc115-cbb4-494b-a6d1-9a1beadccb47" />


---

## 🚀 Cómo ejecutar el proyecto
1. Clona el repositorio.
2. Abre el proyecto en tu IDE (IntelliJ IDEA recomendado).
3. Asegúrate de tener configurado el SDK de Java y las dependencias de JUnit 5.
4. Ejecuta la clase `Main.java` para ver la impresión en consola.
5. Ejecuta la clase de test `FizzBuzzTest.java` para verificar que la lógica es correcta.

---

## 📝 Notas de desarrollo
Este ejercicio sigue las pautas indicadas en la clase del **02/03/26**, enfocándose en la importancia de fallar el test primero (Red), hacerlo pasar (Green) y luego limpiar el código (Refactor).
