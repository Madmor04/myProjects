package com.example.sweater;

import com.example.sweater.domain.Message;
import com.example.sweater.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo")
public class GreetingController {

    @Autowired
    private MessageRepo messageRepo;

    @GetMapping(path = "/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Model model) {
        Iterable<Message> messages = messageRepo.findAll();
        model.addAttribute("messages", messages);
        return "main";
    }

    @PostMapping
    public @ResponseBody String add(@RequestParam String text, @RequestParam String tag, Model model) {
        Message message = new Message(text, tag);
        messageRepo.save(message);
        Iterable<Message> messages = messageRepo.findAll();
        model.addAttribute("messages", messages);
        return "main";
    }
}