package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import service.UserService;
import service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "hello";
    }

    @GetMapping(value = "/users")
    public String showUsers(ModelMap model) {
        model.addAttribute("getAllUsers", userService.getAllUsers());
        return "users";
    }
}
