
import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> todoList = new ArrayList<>();
    
    public TodoList() {
    }
    
    public void add(String task) {
        this.todoList.add(task);
    }
    
    public void print() {
        this.todoList.forEach(task -> {
            System.out.println((this.todoList.indexOf(task) + 1) + ": " + task);
        });
    }
    
    public void remove(int number) {
        this.todoList.remove(number - 1);
    }
}
