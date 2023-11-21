package task.framework;

import task.adapter.TaskRepository;
import task.entity.Task;

public class TaskMemoryRepository implements TaskRepository{

    @Override
    public void save(Task task) {
        System.out.println("#----------------------------------#");
        System.out.println("Uma nova task foi criada!");
        System.out.println("ID: "+ task.getId());
        System.out.println("Descrição: "+ task.getDescription());
        System.out.println("#----------------------------------#");
    }
    
}
