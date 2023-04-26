package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    @Qualifier("cat")
    private Animal animal1;

    @Autowired
    private Timer timer;


    public void whatAnimalSay() {
        System.out.println("say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("                        ");

        System.out.println("say:");
        System.out.println(animal1.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("                         ");
    }

    public Timer getTimer() {
        return timer;
    }
}
