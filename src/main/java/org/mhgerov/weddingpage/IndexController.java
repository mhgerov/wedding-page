package org.mhgerov.weddingpage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

//@Controller
public class IndexController {

//    @GetMapping("/")
    public String getIndex(Model model) {
        List<RegistryItem> registryList = Arrays.asList(new RegistryItem("registry_cat.jpg","A THIRD Cat!,", "Kitty & Beaker need a new friend...",500.0f, 301.25f));
        model.addAttribute("registryList",registryList);
        return "index";
    }

}
