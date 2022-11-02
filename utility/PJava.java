import java.util.List;

public class PJava {
    public static void main(String[] args) {
        List<Task> tasks = List.of(
            new Task(15, "MagicSquare.java"),
            new Task(25, "SilyBake.java"),
            new Task(35, "SkyLine.java"),
            new Task(45, "Tower.java"),
            new Task(55, "Mazu.java")
        );
        TaskList taskList = new TaskList("Beta Programming",100, tasks);

        taskList.show();

    }
}

class Task {
    private Integer time;
    private String name;

    public Task(){}

    public Task(Integer time, String name) {
        this.time = time;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}

class TaskList {
    private List<Task> tasks;
    private String name;
    private Integer allTime;

    public TaskList(){}

    public TaskList(String name, Integer allTime, List<Task> tasks) {
        this.name = name;
        this.allTime = allTime;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public Integer getAllTime() {
        return allTime;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void show(){
        System.out.println("Name: " + name);
        System.out.println("AllTime: " + allTime);
        for(Task task : tasks){
            System.out.println("Task: " + task.getName() + " Time: " + task.getTime() * this.allTime );
        }
    }
}

