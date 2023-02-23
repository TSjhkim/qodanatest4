package hello;

import org.springframework.wler;
import org.springframework.web.bind.aquestMapping;

@RestCtroller
public class  {
    
    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
