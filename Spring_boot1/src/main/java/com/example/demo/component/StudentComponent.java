package com.example.demo.component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("student")
@Setter
@Getter
@ToString
public class StudentComponent {
    private int id;
    private String name;
    private int age;
}
