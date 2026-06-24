package tms.lessons.tmsservletstopic.lesson31.patternStrategy;

public class SMSNotification implements NotificationStrategy{
    @Override
    public void send() {
        System.out.println("sent notification by sms");
    }
}
