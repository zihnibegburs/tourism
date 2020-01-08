package tourism.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = {RequestMethod.GET, RequestMethod.POST})
    public String Deneme(Model model){

        model.addAttribute("page", "home");
        return "main/main";
    }
    
    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String Login(Model model){

        model.addAttribute("page", "login");
        return "main/main";
    }
    
    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public String Hello(Model model){

        model.addAttribute("page", "hello");
        return "main/main";
    }

}
