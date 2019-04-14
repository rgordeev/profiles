package ru.rgordeev.profiles;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;
import ru.rgordeev.profiles.services.PrinterService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfilesApplicationTests {

    @Autowired
    PrinterService printerService;

    @Test
    public void injectDog() {
        Assert.assertEquals("Dog", printerService.getTitle());
    }

    @Test
    public void injectCat() {
        Assert.assertEquals("Cat", printerService.getTitle());
    }

    @Test
    public void injectCarrot() {
        Assert.assertEquals("Carrot", printerService.getTitle());
    }

}
