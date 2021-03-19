package ru.flamesyt.springcourse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringcourseApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void givenAnnotationConfig_whenLookupMethodCalled_ThenNewDriverCreated() {
        ApplicationContext javaConfigContext =
                new AnnotationConfigApplicationContext(SpringcourseApplication.class);
        Car car = javaConfigContext.getBean(Car.class);
        assertEquals(car.drive("John"), "The engine started and driver John is ready to drive");
        assertEquals(car.drive("Michel"), "The engine started and driver Michel is ready to drive");
    }

}
