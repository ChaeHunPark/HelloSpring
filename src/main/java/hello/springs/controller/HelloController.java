package hello.springs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello") //url Mapping!
    public String hello(Model model){
        model.addAttribute("data", "Hello!");
        return "hello"; // templates/hello.html을 찾아줍니다.
    }

    @GetMapping("hello-mvc") //url Mapping!
    public String HelloMvc(@RequestParam("name") String name, Model model){ //name의 파라미터를 받는다.
        model.addAttribute("name",name);
        return "hello-template"; // templates/hello.html 파일을 찾아줍니다.
    }
    //http://localhost:8080/hello-mvc?name=파라미터!
}
