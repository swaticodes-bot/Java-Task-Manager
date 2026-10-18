import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    record Task(String title, boolean completed) {}

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Review Java collections", false));
        tasks.add(new Task("Practise algorithms", true));
        tasks.add(new Task("Write unit tests", false));

        tasks.forEach(task -> System.out.printf("[%s] %s%n",
                task.completed() ? "x" : " ", task.title()));

        long pending = tasks.stream().filter(task -> !task.completed()).count();
        System.out.println("Pending tasks: " + pending);
    }
}
