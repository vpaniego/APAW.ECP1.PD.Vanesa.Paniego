# APAW.ECP1.Vanesa.Paniego
> Este proyecto pretende desarrollar un ejemplo de práctica para aplicar patrones de diseño.

### Entrega
Un gráfico de las entidades y sus relaciones en UML (*.png, *.jpg, *.pdf)
El repositorio local,  .git comprimido en un fichero zip

### Ejercicios
(+2). Factoría con patrón Singleton de la entidad. Se almacenan y se buscan las entidades por su id de la entidad principal, como entidad principal se refiere a la entidad que posee la relación, pero la factoría no los crea, solo gestiona los objetos. Debe ir con test de prueba
(+2). Builder de la entidad. Debe ir con test de prueba
(+2). Patrón Composite de la entidad . La entidad no puede ser cambiada de su interfaz publico dado. Mediante el método view() se visualiza la id si es una entidad y name (String) si es una agrupación. Debe ir con test de prueba
(+2). Patrón Strategy. Buscar, comprender , explicar y realizar un ejemplo propio de su funcionamiento
(+2). A la Factoría anterior,  aplicarle el patrón Observer, para que cada vez que se añade un objeto nuevo, provoque un evento, es decir, se notifique a todos los observadores.  Debe ir con test de prueba

### Características
Debe realizarse commits frecuentes, (uno por clase o similar)

> ##### [Máster en Ingeniería Web por la Universidad Politécnica de Madrid (miw-upm)](http://miw.etsisi.upm.es)
> ##### Asignatura: *Arquitectura y Patrones para Aplicaciones Web*

### Estado del código

[![Build Status](https://travis-ci.org/miw-upm/IWVG-forge.svg?branch=develop)](https://travis-ci.org/miw-upm/IWVG-forge)

![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=es.upm.miw%3AIWVG-forge&metric=alert_status)


### Tecnologías necesarias
* Java
* Maven
* GitHub
* Travis-ci
* Sonarcloud
