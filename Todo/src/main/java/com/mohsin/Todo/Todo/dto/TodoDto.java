package com.mohsin.Todo.Todo.dto;


import jakarta.validation.constraints.NotEmpty;

public class TodoDto {


    private Long Id;
    @NotEmpty(message = "Title should not be empty")
    private String title;
    @NotEmpty(message = "Description should not be empty")
    private String description;

    public TodoDto(Long id, String title, String description) {
        Id = id;
        this.title = title;
        this.description = description;
    }

    public TodoDto() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
}
