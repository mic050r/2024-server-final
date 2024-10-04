package org.example.mvc.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ModelAndViewController {

    @GetMapping("/test8")
    public ModelAndView test8() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("email", "abc");
        mv.addObject("addr", "seoul");
        mv.setViewName("test8"); // 뷰 이름 지정

        return mv;
    }
    @GetMapping("/test9")
    public ModelAndView test9() {
        ArrayList<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("park");
        list.add("kang");

        ModelAndView mv = new ModelAndView();
        mv.addObject("data", list);
        mv.setViewName("test9");
        return mv;
    }
}
