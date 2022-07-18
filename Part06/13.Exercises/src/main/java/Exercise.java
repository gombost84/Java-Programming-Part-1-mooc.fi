
public class Exercise {
    
    private String name;
    private boolean isCompleted;
    
    public Exercise(String name) {
        this.name = name;
        this.isCompleted = false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean isComplete() {
        return this.isCompleted;
    }
    
    public void setComplete(boolean completion) {
        this.isCompleted = completion;
    }
    
}
