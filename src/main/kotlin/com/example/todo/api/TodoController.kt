package com.example.todo.api

import com.example.todo.domain.Todo
import com.example.todo.domain.TodoItem
import com.example.todo.repository.TodoItemRepository
import com.example.todo.repository.TodoRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.http.ResponseEntity
import org.springframework.util.ClassUtils.isPresent
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("todos")
class TodoController(
    val todoRepository: TodoRepository,
    val todoItemRepository: TodoItemRepository
) {
    @GetMapping
    fun getTodos(): ResponseEntity<*> {
        val todos = todoRepository.findAll();
        return ResponseEntity.ok(todos)
    }

    @GetMapping("/{id}")
    fun getTodo(@PathVariable id: Long): ResponseEntity<Todo> {
        val todo = todoRepository.findById(id)
        if (todo.isPresent) {
            return ResponseEntity.ok(todo.get());
        }
        throw IllegalArgumentException("으아아아")
    }

    @GetMapping("/{id}/items")
    fun getItems(@PathVariable id: Long): ResponseEntity<List<TodoItem>> {
        val todo = todoRepository.findById(id)
        return ResponseEntity.ok(todo?.get().items)
    }

//    @PostMapping
//    fun save(@RequestBody title: String): ResponseEntity<*> {
//        todoRepository.save(name)
//    }
}