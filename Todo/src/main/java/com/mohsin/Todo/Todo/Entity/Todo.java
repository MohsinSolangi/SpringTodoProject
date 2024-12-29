package com.mohsin.Todo.Todo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "todo")
public class Todo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;
    private String description;

    public Todo(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Todo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusValue getStatusvalue() {
        return statusvalue;
    }

    public void setStatusvalue(StatusValue statusvalue) {
        this.statusvalue = statusvalue;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "completed")
    private StatusValue statusvalue;


}

