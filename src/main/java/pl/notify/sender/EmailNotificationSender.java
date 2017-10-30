package pl.notify.sender;

import pl.notify.model.Notification;

public class EmailNotificationSender implements NotificationSender {

    public void send (Notification notification){
        System.out.println("Sending email to "+notification.getEmail());
    }
}
