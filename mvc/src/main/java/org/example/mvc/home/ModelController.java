package org.example.mvc.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelController {

    @GetMapping("/test7")
    public String test2(Model model) {
        model.addAttribute("name", "kim");
        model.addAttribute("age", "30");
        return "test7";
    }
}
