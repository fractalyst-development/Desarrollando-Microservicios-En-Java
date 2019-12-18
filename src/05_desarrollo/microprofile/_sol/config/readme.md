# Ejemplo MicroProfile Config 

## Introducción

Demostración de la utilización de **MicroProfile Config**

Para construir

    mvn clean package

Antes de ejecutar se deben asignar las variables del sistema operativo a utilizar

    export MP_CONFIG_VAR="Variable de Medioambiente (SO)" 

Para ejecutar el microservicio se debe pasar las propiedades de java

    java -jar -DJAVA_VAR="Propiedad Java (opción -D)" target/config-microbundle.jar

Para revisar la página de prueba abra en un navegador el siguiente enlace

    http://localhost:8080/index.html

## Código De Ejemplo

La clase **ConfigDemoController** muestra como recuperar variables mediante inyección y de manera programática en diferentes escenarios



## Más información sobre MicroProfile Config

Especificación MicroProfile Config [visitar](https://microprofile.io/project/eclipse/microprofile-config)












