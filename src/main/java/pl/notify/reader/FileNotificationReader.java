package pl.notify.reader;

import pl.notify.model.Notification;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileNotificationReader implements NotificationReader{
//    private List<Notification> notifications;

    public List<Notification> getNotifications () throws IOException {

        List<String> notificationsStrings = Files.readAllLines(Paths.get("notifications.csv"));
        List<Notification> notifications = new ArrayList<>();
        for (String notifyString: notificationsStrings){
            String [] split =notifyString.split(";");
            Notification notification = new Notification(split[0], split[1],split[2],split[3]);
            notifications.add(notification);
        }
        return notifications;
    }
}
