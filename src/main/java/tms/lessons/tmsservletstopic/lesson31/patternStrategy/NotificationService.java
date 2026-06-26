package tms.lessons.tmsservletstopic.lesson31.patternStrategy;

public class NotificationService {
    private NotificationStrategy notificationStrategy;

    public NotificationService(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void execute(){
        notificationStrategy.send();
    }
}
