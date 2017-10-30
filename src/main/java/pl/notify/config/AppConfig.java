package pl.notify.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.notify.logger.ConsoleLogger;
import pl.notify.logger.NotifyLogger;
import pl.notify.reader.FileNotificationReader;
import pl.notify.reader.NotificationReader;

@Configuration
public class AppConfig {

    @Bean
    public NotificationReader notificationReader (){
        FileNotificationReader reader = new FileNotificationReader();
        return reader;
    }

    public NotifyLogger notifyLogger (){
        ConsoleLogger logger = new ConsoleLogger();
        return logger;
    }


}
