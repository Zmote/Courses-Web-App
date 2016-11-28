package ch.zmotions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zmote on 28.11.2016.
 * @author Zafer Dogan <a mailto="info@z-motions.ch">Zafer Dogan</a>
 * @version 1.0
 * @since 1.0
 */
@Controller
public class IndexController {

    @RequestMapping(value="/")
    public String index(){
        return "index";
    }
}
