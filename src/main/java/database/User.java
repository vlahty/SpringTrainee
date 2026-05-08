package database;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.ToString;

@ToString
public class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @PostConstruct
    private void init(){
        System.out.println("init");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("destroy");
    }
}
