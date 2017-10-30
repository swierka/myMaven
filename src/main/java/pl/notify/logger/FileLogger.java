package pl.notify.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements NotifyLogger {
    @Override
    public void log(String message) {
        try
                (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))){ //true oznacza ze dopisuje a nie nadpisuje
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}