package tms.lessons.tmsservletstopic.lesson31.patternStrategy;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailNotification()); // use email
        notificationService.execute();

        NotificationService notificationServiceSMS = new NotificationService(new SMSNotification()); // use SMS
        notificationServiceSMS.execute();
    }
}
