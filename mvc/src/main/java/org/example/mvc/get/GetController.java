package org.example.mvc.get;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetController {

    @GetMapping("/test1")
    public String test1(HttpServletRequest http) {
        String d1 = http.getParameter("data1");
        String d2= http.getParameter("data2");
        String d3 = http.getParameter("data3");

        System.out.println("data1 : " + d1);
        System.out.println("data2 : " + d2);
        System.out.println("data3 : " + d3);

        return "test1";
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest http) {
        String d1 = http.getParameter("data1"); // 단일 값 가져오기
        String d3[] = http.getParameterValues("data3"); // 배열 값 가져오기
        for(String s : d3) System.out.println(s);

        return "result";
    }
}