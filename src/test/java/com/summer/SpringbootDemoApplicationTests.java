package com.summer;

import com.summer.pojo.Dog;
import com.summer.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemoApplicationTests {
    @Autowired
    private Person person;
    @Autowired
    private Dog dog;
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
