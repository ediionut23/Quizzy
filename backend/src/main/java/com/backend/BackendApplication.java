package com.backend;

import com.backend.model.User;
import com.backend.service.ExampleService;
import com.backend.service.FlashCardSetLevelService;
import com.backend.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BackendApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BackendApplication.class, args);
        UserService userservice = context.getBean(UserService.class);
        for(User user : userservice.getAllUsers()){
            System.out.println(user);
        }
        FlashCardSetLevelService flashcardService = context.getBean(FlashCardSetLevelService.class);
        flashcardService.setFlashcardLevel();
        SpringApplication.exit(context, () -> 0);
    }
}
