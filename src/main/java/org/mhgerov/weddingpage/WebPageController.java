package org.mhgerov.weddingpage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
@RequestMapping("/")
public class WebPageController {

    final String requestUrl = "http://example.localdomain";

    @GetMapping
    public String test(Map<String, Object> model) {
        model.put("url",requestUrl);
        return "dashboard";
    }
}
