package pl.notify.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.notify.config.AppConfig;

public class NotificationAppJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    }
}
