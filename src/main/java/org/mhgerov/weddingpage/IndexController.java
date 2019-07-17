package org.mhgerov.weddingpage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Value("${org.mhgerov.url}")
    String url;

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("url",url);
        return "index";
    }
}
