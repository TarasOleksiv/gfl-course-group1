package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello", produces = "Application/json")
     public User index() {
         return  new User("Taras", "Hello!");
     }
     
     public static class User {
        private String name;
        private String message;

        public  User() {}

         public User(String name, String message) {
             this.name = name;
             this.message = message;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public String getMessage() {
             return message;
         }

         public void setMessage(String message) {
             this.message = message;
         }
     }
}
