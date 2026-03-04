# 📋 Gestor de Tareas en Java (GTE)

[![es](https://img.shields.io/badge/lang-es-red.svg)](README.md)
![Status](https://img.shields.io/badge/estado-completado-brightgreen.svg)
![License](https://img.shields.io/badge/licencia-MIT-green)
![Java](https://img.shields.io/badge/Java-17%2B-orange)

Una aplicación de consola desarrollada en Java que permite gestionar una lista de tareas de forma sencilla e interactiva. El usuario puede añadir nuevas tareas y visualizar el listado completo con su estado (pendiente o completada) desde una interfaz de menú por terminal.

El proyecto está estructurado con buenas prácticas de orientación a objetos, separando la lógica en clases bien definidas: `Tarea`, `GestorTareas` y `Main`.

## 🚀 Primeros pasos

### Clonar el repositorio

```bash
git clone https://github.com/tu-usuario/GTE.git
```

### Compilar y ejecutar

```bash
cd GTE
javac -d build/classes src/gte/*.java
java -cp build/classes gte.Main
```

O simplemente abre el proyecto en **NetBeans IDE** y ejecútalo directamente desde el entorno.

## 🧩 Tecnologías

- Java 21.0.10
- NetBeans IDE (estructura de proyecto Ant)
- Javadoc para documentación

## 📂 Estructura del proyecto

```
GTE/
│
├── src/
│   └── gte/
│       ├── Main.java           # Punto de entrada, menú interactivo
│       ├── GestorTareas.java   # Lógica de gestión de la lista
│       └── Tarea.java          # Modelo de datos de una tarea
│
├── build/
│   └── classes/                # Clases compiladas
│
├── dist/
│   └── javadoc/                # Documentación generada
│
├── nbproject/                  # Configuración del proyecto NetBeans
├── build.xml                   # Script de compilación Ant
├── manifest.mf
└── README.md
```

## 📖 Uso de la aplicación

Al ejecutar el programa, se mostrará un menú en consola:

```
--- Gestor de Tareas ---
1. Añadir tarea
2. Listar tareas
0. Salir
Elige una opción:
```

- **Opción 1:** Solicita una descripción e introduce la tarea en la lista.
- **Opción 2:** Muestra todas las tareas con su estado `[ ]` pendiente o `[X]` completada.
- **Opción 0:** Cierra la aplicación.

## 📄 Javadoc

La documentación generada se encuentra en `dist/javadoc/`. Abre `dist/javadoc/index.html` en tu navegador para consultarla.

## ✒️ Autor

- NEFTALÍ DE JESÚS ESPINO RODRÍGUEZ
- VÍCTOR GABRIEL VERGARA ALEJANDRO
