# Primer ejercicio de Eclemma (Caja Blanca) Mayor,menor o igual.

El orden para hacer nuestras pruebas de caja blnca es: 

1. Grafo del flujo del programa.
   
2. Complejidad ciclomática.
   
3. Caminos independientes. Tabla con las siguientes columnas:
 - Número del camino
 - Nodos/aristas del camino
 - Prueba (valores de las condiciones)
 - Entrada (variables)
 - Salida (resultado esperado)

4. Ficheros .java del código.
   
5. Pantallazo de la vista Coverage con el 100% de cobertura en los métodos implicados (herramienta Eclemma). Muestra las vistas 100% de complejidad, ramas. líneas de código.

Descomponemos nuestro programa para poder hacer el grafo y nos será de utilidad:

![imagen1](img/img1.PNG)

Una vez que tengamos nuestra programa con todos sus nodos haremos el grafo.

## Grafo del flujo

![imagen2](img/img2.PNG)

Se explicará más detalladamente los caminos en el punto 3.

## Complejidad ciclomática

Hay 3 formas de hacer la complejidad:

### Método de las Aristas

La fórmula sería: (Aristas-Nodos)+2

Las aristas son las flechas que salen de que nodo (subrayado con amarillo).

![imagen](img/img3.PNG)

Y los nodos son las condiciones o resultados dados.(numerados en rojo)

Con lo cual la fórmula quedaría así:

VG = (A-N) +2

VG = (8-7) + 2

VG = 3

La complejidad resulta que es 3, en las otras 2 formas nos debe de salir lo mismo, para verificar que está bien.

### Método nodos Predicados

Son los nodos de los que salen 2 o más flechas.

La fórmula es:

VG = Nodos Predicados + 1
VG = 2+1 = 3

![imagen4](img/img4.PNG)

### Método de las Regiones

Regiones delimitadas por nodos y aristas. Se considera región la parte externa.

VG = 3

![imagen5](img/img5.PNG)

## Camino Independiente

En cada camino se ha de añadir una arista nueva 

![imagen6](img/img6.PNG)

**El primer camino nos indica que los 2 números son iguales con lo cual es verdadero.**

![imagen7](img/img7.PNG)

**El segundo camino es si a es mayor que b con lo cual a será mayor en este caso.**

![imagen8](img/img8.PNG)

**El camino 3 es si b es mayor que a.**

![imagen9](img/img9.PNG)

## Ficheros .java

[Mayor,Menor o Igual](SubidaNotaJunio/src/mayorOIguales/MayorOIguales.java)

[TestEclemma](SubidaNotaJunio/src/mayorOIguales/MayorOIgualesTest.java)

## Pantallazo con las Vistas

### Vistas con 100% en test y clase

![imagen10](img/img10.PNG)

![imagen11](img/img11.PNG)

### Instrucciones código bytes

![imagen12](img/img12.PNG)

### Ramas

![imagen13](img/img13.PNG)

### Líneas

![imagen14](img/img14.PNG)

### Métodos

![imagen15](img/img15.PNG)

### Complejidad

![imagen16](img/img16.PNG)