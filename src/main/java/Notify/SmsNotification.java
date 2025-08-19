package Notify;

public class SmsNotification extends Notification {
    private final String phone;
    public SmsNotification(String phone,String message ) {
        super(message, Priority.LOW);
        this.phone = phone;

    }
    @Override
    public void send() {
        System.out.println("sending to phone: " + phone);
        super.send();
    }

    public String getPhone() {
        return phone;
    }

}
