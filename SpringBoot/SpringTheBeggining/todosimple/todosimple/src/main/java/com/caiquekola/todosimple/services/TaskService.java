package com.caiquekola.todosimple.services;

import com.caiquekola.todosimple.models.Task;
import com.caiquekola.todosimple.models.User;
import com.caiquekola.todosimple.repositories.TaskRepository;
import com.caiquekola.todosimple.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserService userService;

    public Task findById(Long id){
        Optional<Task> task = Optional.ofNullable(taskService.findById(id));
        return task.orElseThrow(()-> new RuntimeException("Não foram encontrados usuários" +
                "com esse ID!"));
    }

    @Transactional
    public Task create(Task task){
        User user = userService.findById(task.getUser().getId());
        user.setId(null);
        task.setUser(user);
        task = this.taskRepository.save(task);
        return task;
    }

    @Transactional
    public Task update(Task task){
        Task newTask = findById(task.getId());
        newTask.setId(null);
        newTask.setDescription(task.getDescription());
        return this.taskRepository.save(newTask);
    }

    public void delete(Long id){
        Task task = findById(id);
        try{
            this.taskRepository.delete(task);
        } catch (Exception E){
            throw new RuntimeException("Erro de deleção");
        }
    }
}
