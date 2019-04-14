package ru.rgordeev.profiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dog")
public class DogPrinter implements PrinterService {
    @Override
    public String getTitle() {
        return "Dog";
    }
}
