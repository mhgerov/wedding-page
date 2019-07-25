package org.mhgerov.weddingpage.si;

import org.mhgerov.weddingpage.orm.RegistryItem;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class RegistryItemsEnricher {

    public Map addRegistryItems(Map payload) {
        List<RegistryItem> registryList = new ArrayList<RegistryItem>();
        registryList.add(new RegistryItem("1","registry_cat.jpg","A THIRD Cat!", "Kitty & Beaker need a new friend...",500.0f, 301.25f));
        registryList.add(new RegistryItem("2", "registry_grill.jpg","Weber Gas Grill","For hosting our favorite donaters!",999f,0f));
        payload.put("registryList",registryList);
        return payload;

    }
}
