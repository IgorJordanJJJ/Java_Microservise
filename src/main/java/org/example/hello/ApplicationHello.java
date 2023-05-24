package org.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationHello {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello world";
    }
}
