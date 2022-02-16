package com.example.todo.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "TodoItem")
data class TodoItem(
    @Id
    @Column(name = "id")
    var id: Long = 0L,

//    @Column(name = "todoId")
//    var todoId: Long = 0L,

    @Column(name = "item")
    var item: String = ""
)
