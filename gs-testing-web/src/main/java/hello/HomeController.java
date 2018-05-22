package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    
    public static final String S_HELLO_WORLD = "Hello, World!";

    // Does not specify GET vs. PUT, POST, and so forth, because @RequestMapping maps all
    // HTTP operations by default. Use @RequestMapping(method=GET) to narrow this mapping.
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        String sWho ="HomeController::greeting";
        System.out.println(sWho + "(): Returning \"" + S_HELLO_WORLD + "\", Moe...");
        return S_HELLO_WORLD;
    }

}
