package Notify;

public class Demo {
    public static void main(String[] args) {
        Notification[] notification = new Notification[]{
                new EmailNotification("mail-maquin@gmail.com", "notic"),
                new SmsNotification("791811111111", "numberyour"),
                new Notification("message", Priority.NORMAL)
        };
        for (Notification notifications : notification){
            notifications.send();
        }
        System.out.println("Общее количество уведомлений: " + notification.length);

    }
}

