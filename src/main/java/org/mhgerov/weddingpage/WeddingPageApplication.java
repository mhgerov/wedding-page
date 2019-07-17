package org.mhgerov.weddingpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@ImportResource("classpath:spring-integration.xml")
public class WeddingPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeddingPageApplication.class, args);
    }

    @Controller
    public class RootController {



    }

}
