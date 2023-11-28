package dev.otthon.sefaz.gcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class homeController {
    public String index() {
        return "index";
    }
}
