package Notify;

public class Notification {
    private final int id;
    private String message;
    private final Priority priority;
    private static int NextId = 1;


    public Notification() {
        this("empty", Priority.NORMAL);
    }


    public Notification(String message, Priority priority) {
        this.message = message;
        this.priority = priority;
        this.id = NextId++;
    }


    public void send(){
        System.out.println(this);
    }
    public void send(String extra){
        System.out.println(this + "/n" + extra);
    }
    @Override
    public String toString() {
        return String.format("Notification{id=%d, message='%s', priority=%s}", id, message, priority);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public Priority getPriority() {
        return priority;
    }
    public int getId() {
        return id;
    }
}


