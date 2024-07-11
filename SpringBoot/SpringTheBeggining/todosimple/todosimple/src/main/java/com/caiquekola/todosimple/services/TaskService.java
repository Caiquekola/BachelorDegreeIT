package com.caiquekola.todosimple.services;

import com.caiquekola.todosimple.models.Task;
import com.caiquekola.todosimple.models.User;
import com.caiquekola.todosimple.repositories.TaskRepository;
import com.caiquekola.todosimple.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserService userService;

    public Task findById(Long id){
        Optional<Task> task = this.taskRepository.findById(id);
        return task.orElseThrow(()-> new RuntimeException("Não foram encontrados usuários" +
                "com esse ID!"));
    }

    public List<Task> findAllByUserId(Long userId){
        List<Task> tasks = this.taskRepository.findByUser_Id(userId);
        return tasks;
    }

    @Transactional
    public Task create(Task task){
        User user = this.userService.findById(task.getUser().getId());
        task.setId(null);
        task.setUser(user);
        task = this.taskRepository.save(task);
        return task;
    }

    @Transactional
    public Task update(Task task){
        Task newTask = findById(task.getId());
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
