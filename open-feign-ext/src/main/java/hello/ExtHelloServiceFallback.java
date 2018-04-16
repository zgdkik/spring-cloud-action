package hello;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/ext/fallback")
@Component
public class ExtHelloServiceFallback implements ExtHelloService {

    @Override
    public String hello(@RequestParam("name") String name) {
        return "Error";
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User("Error", 0);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Error";
    }

}
