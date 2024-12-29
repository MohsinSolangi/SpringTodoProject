package com.mohsin.Todo.Todo.dto;


import jakarta.validation.constraints.NotEmpty;

public class StatusValueDto {

    private Long Id;
    @NotEmpty(message = "status should not be empty")
    private String status;

    public StatusValueDto(Long id, String status) {
        Id = id;
        this.status = status;
    }

    public StatusValueDto() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
