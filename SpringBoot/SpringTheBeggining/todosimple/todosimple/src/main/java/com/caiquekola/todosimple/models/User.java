package com.caiquekola.todosimple.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = User.TABLE_NAME)
public class User {
    public static final String TABLE_NAME = "user";
    public interface CreateUser{}
    public interface UpdateUser{}
    //Validações

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true)
    private Long id;


    @Column(name = "username",unique = true,
            nullable = false,length = 50)
    @NotNull(groups = CreateUser.class)
    @NotEmpty(groups = CreateUser.class)
    @Size(groups = CreateUser.class, min = 5, max = 50)
    private String username;


    //Poderia ser NotBlank
    //Senha só poder escrita, nunca é lida e retornada ao usuário
    @JsonProperty(access = Access.WRITE_ONLY)
    @Column(name = "password",
            nullable = false,length = 50)
    @NotNull(groups = {CreateUser.class,UpdateUser.class})
    @NotEmpty(groups = CreateUser.class)
    @Size(groups = CreateUser.class,min = 5, max = 50)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Task> tasks = new ArrayList<>();

    public User() {
    }

    public User(Long id, String username, String password, List<Task> tasks) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tasks = tasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
