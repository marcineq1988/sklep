package com.mpikula.sklep.controlers;

import com.mpikula.sklep.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class MainController {

    @GetMapping("/")
    public String sayHello(Model model) {

        List<String> listaRandomowychStringow = Arrays.asList("Marcin", "Emilia", "Krzysztof", "Eustachy");

        model.addAttribute("name", "Marcin");
        model.addAttribute("names", listaRandomowychStringow);

        return "index";
    }

    @GetMapping("toLoginPage")
    public String goToLoginPage(Model model) {

        /*User user = new User("marcineq1988", "haslo",
                "Marcin", "Pikula", "Wroclaw", "59-800", "Kamienna",
                115, 27, "687443222");*/

        User user = new User();

        model.addAttribute("user", user);

        return "login";
    }
}
