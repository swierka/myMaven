package pl.notify.app;

import pl.notify.logger.ConsoleLogger;
import pl.notify.logger.NotifyLogger;
import pl.notify.reader.FileNotificationReader;
import pl.notify.reader.NotificationReader;
import pl.notify.sender.EmailNotificationSender;

import java.io.IOException;

public class NotificationApplication {
    public static void main(String[] args) {

       NotificationReader reader = new FileNotificationReader();
       EmailNotificationSender sender = new EmailNotificationSender();
       NotifyLogger logger = new ConsoleLogger();


        NotificationFacade app = new NotificationFacade(reader,sender,logger);
        try {
            app.sendNotifications();
        } catch (IOException e) {
            System.err.println("Nie udało się wysłać powiadomień");
        }

    }
}
