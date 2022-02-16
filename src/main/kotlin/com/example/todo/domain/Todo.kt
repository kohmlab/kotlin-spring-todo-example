package com.example.todo.domain

import javax.persistence.*

@Entity
@Table(name = "Todo")
data class Todo (
    @Id
    @Column(name = "id")
    var id: Long? = 0L,

    @Column(name = "title")
    var title: String = "",

    @OneToMany
    @JoinColumn(name = "todoId")
    var items: List<TodoItem>
)