package ru.rgordeev.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.rgordeev.profiles.services.PrinterService;

@SpringBootApplication
public class ProfilesApplication {

    @Autowired
    PrinterService printerService;

    public static void main(String[] args) {
        SpringApplication.run(ProfilesApplication.class, args);
    }

}
