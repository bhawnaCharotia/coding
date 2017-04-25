package com.project;
/**
 * Created by bhawna on 4/25/17.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class TestMonitoring {

    public  static void main(String [] args){
        System.out.print("in main application=============================================================");
        SpringApplication app = new SpringApplication(TestMonitoring.class);
        // app.setWebEnvironment(false);

        app.run(args);

    }
}
