package org.example.mvc.home;

import org.example.mvc.dto.ModelDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/model")
public class ModelController {

    @GetMapping("/test7")
    public String test2(Model model) {
        model.addAttribute("name", "kim");
        model.addAttribute("age", "30");
        return "test7";
    }

    @GetMapping("/test1")
    public String test1() {
        return "test10";
    }

    @GetMapping("/test2")
    public String test2() {
        return "test11";
    }

    @PostMapping("/test1")
    public String sum(@RequestParam("num") int num, Model model) {
        model.addAttribute("result", num);
        return "test10";
    }

    @PostMapping("/test/{num}")
    public String sum2(@PathVariable("num") int num, Model model) {
        model.addAttribute("result", num);
        return "test10";
    }

    @PostMapping("/test2")
    public String sum3(@ModelAttribute ModelDTO modelDTO, Model model) {
        model.addAttribute("result", modelDTO);
        return "test11";
    }
}
