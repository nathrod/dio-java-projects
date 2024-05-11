package set;

import java.util.HashSet;
import java.util.Set;

public class TaskList {
    private Set<Task> taskList;

    public TaskList(){
        taskList = new HashSet<>();
    }

    public void addTask(String description){
        taskList.add(new Task(description, false));
    }

    public void removeTask(String description){
        Task taskToRemove = null;
        for(Task t : taskList){
            if(t.getDescription().equalsIgnoreCase(description)){
                taskToRemove = t;
                break;
            }
        }
        taskList.remove(taskToRemove);
    }

    public void displayTasks(){
        System.out.println(taskList);
    }

    public void countTasks(){
        System.out.println(taskList.size());
    }

    public Set<Task> getCompletedTasks(){
        Set<Task> completedTasks = new HashSet<>();
        for(Task t : taskList){
            if(t.isCompleted()){
                completedTasks.add(t);
                break;
            }
        }
        return completedTasks;
    }

    public Set<Task> getPendingTasks(){
        Set<Task> pendingTasks = new HashSet<>();
        for(Task t : taskList){
            if(!t.isCompleted()){
                pendingTasks.add(t);
                break;
            }
        }
        return pendingTasks;
    }

    public void markTaskAsCompleted(String description){
        for(Task t : taskList){
            if(t.getDescription().equalsIgnoreCase(description)){
                t.setCompleted(true);
                break;
            }
        }
    }

    public void markTaskAsPending(String description){
        for(Task t : taskList){
            if(t.getDescription().equalsIgnoreCase(description)){
                t.setCompleted(false);
                break;
            }
        }
    }

    public void clearTaskList(){
        for(Task t : taskList){
            taskList.remove(t);
        }
    }
}
