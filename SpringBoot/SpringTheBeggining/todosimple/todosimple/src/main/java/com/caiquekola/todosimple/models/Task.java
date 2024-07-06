package com.caiquekola.todosimple.models;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = Task.TABLE_NAME)
public class Task {

    protected static final String TABLE_NAME = "Task";


    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false,updatable = false)
    private User user;

    @Column(name = "description",nullable = false,length =255)
    @Size(min = 5, max = 255)
    @NotNull
    @NotEmpty
    private String description;


    public Task() {
    }

    public Task(Long id, User user, String description) {
        this.id = id;
        this.user = user;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public @Size(min = 5, max = 50) @NotNull @NotEmpty String getDescription() {
        return description;
    }

    public void setDescription(@Size(min = 5, max = 50) @NotNull @NotEmpty String description) {
        this.description = description;
    }
}
