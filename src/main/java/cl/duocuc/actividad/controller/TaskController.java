package cl.duocuc.actividad.controller;

import cl.duocuc.actividad.model.Task;
import cl.duocuc.actividad.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> listar() {
        return taskService.listar();
    }

    @PostMapping
    public Task crear(@RequestBody Task task) {
        return taskService.crear(task);
    }

    @PutMapping("/{id}/completada")
    public Task actualizarEstado(@PathVariable Long id, @RequestParam boolean completada) {
        return taskService.actualizarEstado(id, completada);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable Long id) {
        return taskService.eliminar(id);
    }
}
//hola
