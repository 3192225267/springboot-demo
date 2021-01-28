package com.summer.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;
@Component
//prefix前缀需要和yml配置文件里的匹配。
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = {"classpath:person.yaml"})

public class Person {
    private String name;
    private String age;
    private Boolean happy;
    private Date birth;
    private Map<String,String> maps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Boolean getHappy() {
        return happy;
    }

    public void setHappy(Boolean happy) {
        this.happy = happy;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }




    public Person() {
    }

    public Person(String name, String age, Boolean happy, Date birth, Map<String, String> maps) {
        this.name = name;
        this.age = age;
        this.happy = happy;
        this.birth = birth;
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", happy=" + happy +
                ", birth=" + birth +
                ", maps=" + maps +
                '}';
    }
}
