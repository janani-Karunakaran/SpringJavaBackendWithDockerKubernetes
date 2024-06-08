package com.example.interview.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalTime;

@Entity
@Table(name="todos")
public class Todo {
    @Id
            @Column(name="title")
    String title;

    @Column(name="description")
    String description;

    @Column(name="status")
    String status;

    @Column(name="duedate")
    LocalTime duedate;

    public Todo() {
    }

    public Todo(String title, String description, String status, LocalTime duedate) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.duedate = duedate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalTime getDuedate() {
        return duedate;
    }

    public void setDuedate(LocalTime duedate) {
        this.duedate = duedate;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", duedate=" + duedate +
                '}';
    }
}
