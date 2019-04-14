package ru.rgordeev.profiles.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CatPrinter implements PrinterService {

    @Override
    public String getTitle() {
        return "Cat";
    }
}
