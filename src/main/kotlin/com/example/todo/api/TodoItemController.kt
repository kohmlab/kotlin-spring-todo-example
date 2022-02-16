package com.example.todo.api

import com.example.todo.repository.TodoItemRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("todo/{id}")
class TodoItemController(
    val todoItemRepository: TodoItemRepository
) {
    @GetMapping
    fun getItems(): ResponseEntity<*> {
        val todos = todoItemRepository.findBy
        return ResponseEntity.ok(todos)
    }
}