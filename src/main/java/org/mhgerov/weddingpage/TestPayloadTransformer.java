package org.mhgerov.weddingpage;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TestPayloadTransformer {

    public Map<String, Object> transform(Message<?> in) {
        System.out.println(in.getPayload().getClass());
        Map<String,Object> model = new HashMap<String,Object>();
        List<RegistryItem> registryList = Arrays.asList(new RegistryItem("registry_cat.jpg","A THIRD Cat!,", "Kitty & Beaker need a new friend...",500.0f, 301.25f));

        model.put("registryList",registryList);
        model.put("name","Harold");
        return model;

    }
}
