package tms.lessons.tmsservletstopic.lesson31.patternStrategy;

public class PushNotification implements NotificationStrategy{
    @Override
    public void send() {
        System.out.println("sent by push notification");
    }
}
