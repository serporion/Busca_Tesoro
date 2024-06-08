# Proyecto Busca el Tesoro

Este proyecto está creado en Java y fue desarrollado inicialmente en NetBeans. Define una clase llamada `Busca_Tesoro`, con varios atributos públicos estáticos usados para el diseño de un tablero apoyado por una array bidimensional que recoge las coordenadas de una posición en el mismo.

## Descripción

Juego "A buscar el tesoro". Se coloca una mina y se coloca un tesoro de forma aleatoria en un cuadrante de cuatro filas por cinco columnas. El usuario intentará averiguar dónde está el tesoro. Si hay una mina cerca después de un intento, se avisará de que está cerca.

## Estructura del Proyecto

```plaintext
Busca_Tesoro/
├── src/
│   └── Busca_Tesoro/
│               ├── Busca_Tesoro.java
└── pom.xml
```


## Requisitos
- Java 17
- Maven 3.6.0 o superior


## Instalación
Clona el repositorio:

```sh
git clone https://github.com/serporion/Busca_Tesoro.git
cd Busca_Tesoro
```

## Instala las dependencias y compila el proyecto:

```sh
mvn clean install
```

## Ejecución
Para ejecutar la aplicación, usa el siguiente comando:

```sh
java -cp target/Busca_Tesoro-0.0.1-SNAPSHOT.jar Busca_Tesoro.Busca_Tesoro
```

Para ejecutar la aplicación desde el Archivo JAR Generado

Generar paquete jar compilando con Maven:
  
```sh   
mvn clean package
```
Ejecutar el .jar
```sh   
java -jar target/Busca_Tesoro-0.0.1-SNAPSHOT.jar
```

O en cualquier IDE como por ejemplo Eclipse yendo a File / Import / Maven / Existing Maven Projects, o como por ejemplo en NetBeans yendo a File / Open Project. En cuanto importes tendrás las dependencias del proyecto instaladas.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.



## Contacto y Soporte

Para más información, puedes consultar el documento de descripción del proyecto en la carpeta doc.

Puedes contactar de las siguientes maneras:

- **Nombre**: Oscar
- **Correo Electrónico**: [serporionGit@hotmail.com](mailto:serporionGit@hotmail.com)
- **GitHub**: [serporion](https://github.com/serporion)


Si tienes alguna pregunta, encuentras un problema o tienes una sugerencia, por favor, abre un issue en este repositorio. Seguiremos el progreso y las discusiones a través de los issues para mantener todo organizado.

Puedes abrir un nuevo issue [aquí](https://github.com/serporion/Busca_Tesoro/issues/new). Las contribuciones son bienvenidas
