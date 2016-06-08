package mcpeek.kevin.supercell.beans;

import java.io.Serializable;

public class League implements Serializable{
    private Integer id;
    private String name;
    private UrlContainer iconUrls;

    public League() {}

    public UrlContainer getIconUrls() {
        return iconUrls;
    }

    public void setIconUrls(UrlContainer iconUrls) {
        this.iconUrls = iconUrls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
