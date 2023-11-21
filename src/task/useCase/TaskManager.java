package task.useCase;

import task.entity.Task;
import task.adapter.TaskRepository;

public class TaskManager {

    private TaskRepository taskRepository;

    public TaskManager(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public void createTask(String description){
        Task task = new Task(description);
        taskRepository.save(task);
    }
    
}
