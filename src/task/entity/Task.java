package task.entity;

public class Task {
    private static int nextId = 1;
    private int id;
    private String description;

    public Task(String description){
        this.id = nextId++;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}