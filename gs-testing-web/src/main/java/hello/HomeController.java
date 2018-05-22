package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    // Does not specify GET vs. PUT, POST, and so forth, because @RequestMapping maps all
    // HTTP operations by default. Use @RequestMapping(method=GET) to narrow this mapping.
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        String sWho ="HomeController::greeting";
        String sGreeting = "Hello, World!";
        System.out.println(sWho + "(): Returning \"" + sGreeting + "\", Moe...");
        return sGreeting;
    }

}
