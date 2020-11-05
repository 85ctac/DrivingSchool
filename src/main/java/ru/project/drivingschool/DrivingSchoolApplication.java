package ru.project.drivingschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DrivingSchoolApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DrivingSchoolApplication.class, args);
    }

    //For WAR deployment
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DrivingSchoolApplication.class);
    }
}
