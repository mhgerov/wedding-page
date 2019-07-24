package org.mhgerov.weddingpage;

public class RegistryItem {
    public String imgSrc;
    public String title;
    public String subText;
    public float cost;
    public float progress;

    public String costF() {return String.format("$%.2f",this.cost);}
    public String progressF() {return String.format("$%.2f",this.progress);}
    public String percentageF() {return String.format("%.2f%%",100*progress/cost);}

    public RegistryItem(String imgSrc, String title, String subText, float cost, float progress) {
        this.imgSrc = imgSrc;
        this.title = title;
        this.subText = subText;
        this.cost = cost;
        this.progress = progress;
    }
}
