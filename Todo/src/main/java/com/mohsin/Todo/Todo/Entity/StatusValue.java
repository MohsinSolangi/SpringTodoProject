package com.mohsin.Todo.Todo.Entity;

import jakarta.persistence.*;

@Entity
public class StatusValue {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String status;

    public StatusValue(long id, String status) {
        this.id = id;
        this.status = status;

    }

    public StatusValue() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Todo getTodo() {
        return todo;
    }

    public void setTodo(Todo todo) {
        this.todo = todo;
    }

    @OneToOne(mappedBy = "statusvalue" , cascade = CascadeType.ALL)
    private Todo todo;

}
