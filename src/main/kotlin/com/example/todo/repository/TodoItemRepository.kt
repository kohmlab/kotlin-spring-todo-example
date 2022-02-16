package com.example.todo.repository

import com.example.todo.domain.TodoItem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoItemRepository: JpaRepository<TodoItem, Long>