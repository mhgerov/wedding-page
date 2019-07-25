package org.mhgerov.weddingpage.orm;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class RegistryItem {

    String id;
    String imgSrc;
    String title;
    String subText;
    float cost;
    float progress;

    public String costF() {
        return String.format("$%.2f", this.cost);
    }

    public String progressF() {
        return String.format("$%.2f", this.progress);
    }

    public String percentageF() {
        return String.format("%.2f%%", 100 * progress / cost);
    }

}
