package ru.bse71.example.spring.httpinvoker.receiver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.bse71.example.spring.httpinvoker.api.TimeConverter;

@Controller
public class ReceiverController {

    private final TimeConverter timeConverter;

    @Autowired
    public ReceiverController(TimeConverter timeConverter) {
        this.timeConverter = timeConverter;
    }

    @GetMapping("/time")
    public String getService(Model model) {
        model.addAttribute("time", timeConverter.convertToSeconds(5, 6));
        return "/WEB-INF/time.jsp";
    }

}
