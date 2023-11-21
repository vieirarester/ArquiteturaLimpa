package task.app;

import java.util.Scanner;

import task.adapter.TaskRepository;
import task.framework.TaskMemoryRepository;
import task.useCase.TaskManager;

public class AppTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TaskRepository taskRepository = new TaskMemoryRepository();
        TaskManager taskManager = new TaskManager(taskRepository);

        System.out.println("Digite a descrição da task: ");
        String description = scanner.nextLine();

        taskManager.createTask(description);

        scanner.close();
        
    }
}
