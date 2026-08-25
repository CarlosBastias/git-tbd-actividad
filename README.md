# git-tbd-actividad

## Descripción
API REST simple para gestionar una lista de tareas (`Task`), desarrollada en **Java 17 + Spring Boot**. El proyecto no usa base de datos: las tareas se almacenan en memoria mientras la aplicación está en ejecución. Su propósito es servir como excusa práctica para trabajar comandos de Git y el flujo **Trunk-Based Development (TBD)** en la asignatura DOY0101 – Ingeniería DevOps.

## Instalación

**Requisitos previos:**
- Java 17 o superior
- Maven 3.8 o superior

**Pasos:**
```bash
# Clonar el repositorio
git clone https://github.com/Saitraru/git-tbd-actividad.git
cd git-tbd-actividad

# Ejecutar la aplicación
mvn spring-boot:run
```

La API queda disponible en `http://localhost:8080/api/tasks`.

## Uso
Endpoints disponibles:

| Método | Endpoint | Descripción |
|---|---|---|
| `GET` | `/api/tasks` | Lista todas las tareas |
| `POST` | `/api/tasks` | Crea una tarea nueva |
| `PUT` | `/api/tasks/{id}/completada?completada=true` | Actualiza el estado de una tarea |
| `DELETE` | `/api/tasks/{id}` | Elimina una tarea |

Ejemplo de creación de una tarea:
```bash
curl -X POST http://localhost:8080/api/tasks \
  -H "Content-Type: application/json" \
  -d '{"titulo": "Practicar Trunk-Based Development", "completada": false}'
```

**Ejecutar pruebas:**
```bash
mvn test
```

## Estructura de ramas
- `main`: código estable, siempre desplegable.
- `feature/*`: nuevas funcionalidades de corta duración, se integran a `main` mediante Pull Request.

## Autores
- Carlos Bastias – Colaborador (fork inicial, gestión de Pull Requests)
- Fabián Sánchez – Colaborador (rama `dev`, commits y Pull Requests)
- [Nombre integrante 3] – Rol
