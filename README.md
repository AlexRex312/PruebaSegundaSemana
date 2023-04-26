<!-- title: Prueba segunda semana -->

- [1. Clases](#1-clases)
- [2. Instalacion](#2-instalacion)
- [3. Descripcion](#3-descripcion)
- [4. Funcionalidades](#4-funcionalidades)
- [5. Uso](#5-uso)
- [6. Contribuir](#6-contribuir)
- [7. Historia](#7-historia)
- [8. Creditos y atribuciones](#8-creditos-y-atribuciones)
- [9. License](#9-license)

# 1. Clases 

El proyecto esta dividido en varias clases como veremos a continuacion, entre las cuales dispones de la superclase Vehiculo, y varias clases hijas de la misma como podrian ser coche, moto, camion, etc... Ademas de estas, tenemos una clase InputHandler donde controlamos los inputs que receibe nuestro programa, una interfaz Conducible que es aplicable para cada tipo de vehiculo y una clase manager donde controlar la creacion de los distintos tipos de vehiculos.

## 1.1. Clase Vehiculo

En este proyecto se define la superclase abstracta vehiculo, la cual se extiende en las siguientes clases hijas. Contiene todos los parametros que se han decidido comunes a todos los tipos de vehiculos independientemente de su tipo, asi como los metodos para arrancar, avanzar, retroceder y parar.

## 1.2. Clase Coche

En este proyecto se define la clase Barco que extiende la clase Vehiculo y cuyo unico parametro propio es el tipo de marchas de las que dispone.

## 1.3. Clase Barco

En este proyecto se define la clase Barco que extiende la clase Vehiculo y cuyo unico parametro propio es el tipo de barco.

## 1.4. Clase Moto

En este proyecto se define la clase Barco que extiende la clase Vehiculo y cuyo unico parametro propio es el tipo de moto.

## 1.5. Clase InputHandler

En esta clase se controlan los inputs que el usuario le da a nuestro programa, de manera que reforzamos la seguridad y evitamos errores de ejecu
cion en el mismo debidos a proporcionarle un tipo erroneo de datos.

## 1.6. Clase VehiculoManager

En esta clase controlaremos la creacion de los distintos tipos de vehiculos a los que da soporte nuestro programa.
## 2. Instalacion

En nuestro caso no necesitamos de ningun tipo de instalacion para nuestro programa, solamente ejecutar MyApp.java

## 3. Descripcion

La clase Barco representa un vehículo acuático y se utiliza para instanciar objetos que contienen información sobre el color, la marca, el precio, la matrícula y el tipo de barco. La clase también tiene un método para arrancar el barco y establecer la hora de inicio del viaje.
Funcionalidades

## 4. Funcionalidades

Veremos un ejemplo con la clase Barco, que tiene las siguientes funcionalidades:

    Constructor: Crea una instancia de Barco con un color, marca, precio, matrícula y tipo de barco.
    getTipoBarco(): Devuelve el tipo de barco.
    arrancar(): Arranca el barco y establece la hora de inicio del viaje. Si el barco ya está en marcha, muestra un mensaje de aviso.
    retroceder(int metros): Retrocede el barco la cantidad de metros indicada. Si el barco no está en marcha, muestra un mensaje de aviso.
    parar(): Para el barco y muestra la hora de inicio y fin del viaje. Si el barco no está en marcha, muestra un mensaje de aviso.
    avanzar(int distancia): Avanza el barco la cantidad de metros indicada. Si el barco no está en marcha, muestra un mensaje de aviso.
    imprimirDatos(): Muestra los datos del barco.

```java
Barco barco = new Barco("Azul", "Marca", "5000", "1234ABC", "Tipo de Barco");
String tipoBarco = barco.getTipoBarco();
barco.arrancar();
```

## 5. Uso

Cómo se debe usar el proyecto.

**Uso de las clases hijas**

Para utilizar cualqueira de las clases hijas de vehiculo, primero debe instanciar un objeto pasando los argumentos adecuados al constructor, el cual se encargara de utilizar a vehiculo para la creacion del tipo de vehiculo especificado. Luego, guardara en nuestra base de datos el vehiculo creado, ademas, se puede llamar a los métodos especificos de cada clase según sea necesario.

TODO: Terminar de implementar el CRUD de los vehiculos ya que actualmente solo esta terminada la opcion de create.

## 6. Contribuir

1. Fork it!
2. Crea tu feature branch: `git checkout -b my-new-feature`
3. Haz Commit de tus cambios: `git commit -am 'Add some feature'`
4. Push al branch: `git push origin my-new-feature`
5. Submit un pull request

## 7. Historia

- Version 0.1 (2023-04-19) - lanzamiento inicial
- Version 0.2 (2023-04-20) - añadido método avanzar()
- Version 0.3 (2023-04-21) - añadido método retroceder()
- Version 0.4 (2023-04-22) - añadido método parar()
- Version 0.5 (2023-04-23) - añadido resto de métodos
- Version 0.6 (2023-04-24) - Pruebas unitarias y correcciones
- Version 0.7 (2023-04-XX) - Añadido guardado de vehiculos en base de datos

## 8. Creditos y atribuciones

Lead Developer - Antoni (@antoni_dev)
Mentor - Carlos (@blah_blah)
Partial Developer - Alejandro (@AlexRex)

## 9. License

The MIT License (MIT)

Copyright (c) 2015 Chris Kibble

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
