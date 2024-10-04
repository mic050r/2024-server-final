package org.example.mvc.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/sub/test1")
    @ResponseBody // return값이 텍스트로 그냥 출력
    public String test() {
        return "test";
    }

    @GetMapping("/sub/test2")
    public String test2() {
        return "test2";
    }

    @GetMapping("/sub/test3")
    public String test3() {
        return "test3";
    }
}
