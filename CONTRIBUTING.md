# Guía de Contribución

## Flujo de trabajo (Trunk-Based Development)
1. Actualizar la rama principal:
   `git pull origin main`
2. Crear una rama de corta duración:
   `git checkout -b feature/nombre-funcionalidad`
3. Realizar los cambios y confirmarlos:
   `git add .`
   `git commit -m "feat: descripción del cambio"`
4. Subir la rama al repositorio remoto:
   `git push origin feature/nombre-funcionalidad`
5. Abrir un Pull Request hacia `main` y solicitar revisión.
6. Una vez aprobado, fusionar (merge) el Pull Request y eliminar la rama.

## Convención de commits
- `feat:` nueva funcionalidad (ej. `feat: agrega endpoint para eliminar tareas`)
- `fix:` corrección de errores
- `docs:` cambios en documentación (README, CONTRIBUTING, comentarios)
- `test:` cambios o adición de pruebas
- `refactor:` cambios internos que no alteran el comportamiento

## Revisión de Pull Requests
- Todo cambio debe ser revisado por al menos otro integrante del equipo antes de fusionarse a `main`.
- Las ramas `feature/*` deben tener una vida corta: se recomienda integrarlas a `main` en menos de un día de trabajo, siguiendo el principio de Trunk-Based Development.
- `main` es la rama protegida y estable: siempre debe compilar y pasar las pruebas (`mvn test`).
