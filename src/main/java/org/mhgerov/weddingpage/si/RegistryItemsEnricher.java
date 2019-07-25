package org.mhgerov.weddingpage.si;

import org.mhgerov.weddingpage.orm.RegistryItem;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class RegistryItemsEnricher {

    public Map addRegistryItems(Map payload) {
        List<RegistryItem> registryList = Arrays.asList(new RegistryItem("registry_cat.jpg","A THIRD Cat!", "Kitty & Beaker need a new friend...",500.0f, 301.25f));

        payload.put("registryList",registryList);
        return payload;

    }
}
