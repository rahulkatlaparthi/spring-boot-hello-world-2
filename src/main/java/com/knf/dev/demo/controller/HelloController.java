package com.knf.dev.demo; // Replace with your actual package

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private static final String DEFAULT_MESSAGE = "Hello World! Rahul Prudhvi Rahul";

    @GetMapping("/hello")
    public String getMessage() {
        return DEFAULT_MESSAGE;
    }

    @GetMapping("/helloWithParam")
    public String getMessageWithParam(@RequestParam(required = false) String name) {
        // Issue: No validation on the parameter; can lead to potential security issues
        return "Hello " + name + "!";
    }

    @GetMapping("/helloWithModel")
    public ModelAndView getModelAndView() {
        // Issue: Insecure usage of ModelAndView
        ModelAndView modelAndView = new ModelAndView("hello");
        Map<String, Object> model = new HashMap<>();
        model.put("message", "Hello World! Rahul Prudhvi Rahul");
        modelAndView.addAllObjects(model);
        return modelAndView;
    }

    @GetMapping("/helloWithException")
    public String getMessageWithException() {
        // Issue: This method always throws an exception, which should be handled properly
        throw new RuntimeException("This is an intentional exception!");
    }

    @GetMapping("/helloWithLogging")
    public String getMessageWithLogging() {
        // Issue: Logging sensitive information; avoid logging sensitive data
        System.out.println("Sensitive Information: Hello World! Rahul Prudhvi Rahul");
        return "Hello World!";
    }
}
