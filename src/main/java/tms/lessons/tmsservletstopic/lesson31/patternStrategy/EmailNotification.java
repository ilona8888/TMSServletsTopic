package tms.lessons.tmsservletstopic.lesson31.patternStrategy;

public class EmailNotification implements NotificationStrategy{
    @Override
    public void send() {
        System.out.println("sent notification to email");
    }
}
