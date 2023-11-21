package task.adapter;
import task.entity.Task;

public interface TaskRepository {
    void save(Task task);
}