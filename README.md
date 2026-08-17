# git-tbd-actividad

Proyecto base (Java 17 + Spring Boot) para la actividad práctica de la clase
**1.1.2 Git y Modelos de Trabajo** — DOY0101 Ingeniería DevOps.

Expone una API REST muy simple para gestionar tareas (`Task`), pensada
únicamente como excusa para practicar comandos Git, GitFlow y Trunk-Based
Development. No requiere base de datos: los datos viven en memoria.

## Requisitos

- Java 17+
- Maven 3.8+ (o usar el propio Maven instalado en tu equipo; el proyecto no
  incluye wrapper para mantenerlo liviano)

## Cómo ejecutar

```bash
mvn spring-boot:run
```

La API queda disponible en `http://localhost:8080/api/tasks`.

- `GET /api/tasks` → lista las tareas.
- `POST /api/tasks` → crea una tarea (body JSON: `{"titulo": "...", "completada": false}`).

## Ejecutar pruebas

```bash
mvn test
```

## Uso en la actividad

Consulta la guía **"Actividad Práctica – Git, GitFlow y Trunk-Based
Development"** entregada por el docente. Este repositorio es el punto de
partida: se sube tal cual a GitHub y desde ahí cada estudiante/equipo trabaja
siguiendo las instrucciones de la guía.
