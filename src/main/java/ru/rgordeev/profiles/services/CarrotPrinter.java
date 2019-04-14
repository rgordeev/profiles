package ru.rgordeev.profiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("carrot")
public class CarrotPrinter implements PrinterService {
    @Override
    public String getTitle() {
        return "Carrot";
    }
}
