package pl.notify.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class NotificationAppSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Benas-confing.xml");
        NotificationFacade facade = context.getBean("facade", NotificationFacade.class);
        try {
            facade.sendNotifications();
        } catch (IOException e) {
            System.err.println("Nie moza wyswietlic powiadomien");
        }
    }
}
