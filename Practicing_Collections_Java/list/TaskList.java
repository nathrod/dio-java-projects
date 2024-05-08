package list;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description){
        Task task = new Task(description);
        this.tasks.add(task);
    }

    public void deleteTask(String description){
        List<Task> tasksToDelete = new ArrayList<>();
        for(Task task : tasks){
            if(task.getDescription().equalsIgnoreCase(description)){
                tasksToDelete.add(task);
            }
        }
        tasks.removeAll(tasksToDelete);
    }

    public void getTotalTasks(){
        System.out.println("Number of tasks: " + tasks.size());
    }

    public void showTasks(){
        for(Task task : tasks){
            System.out.println(task.getDescription());
        }
    }
}
