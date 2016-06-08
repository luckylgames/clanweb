package mcpeek.kevin.supercell.beans;

import java.net.URI;
import java.net.URISyntaxException;

public class UrlContainer {
    private URI smallImageURL;
    private URI mediumImageURL;
    private URI largeImageURL;

    public  String getSmallImageURL() {
        return convertURIToString(smallImageURL);
    }

    public void setSmallImageURL(String smallImageURL) {
        this.smallImageURL = convertStringToURI(smallImageURL);
    }

    public String getMediumImageURL() {
        return convertURIToString(mediumImageURL);
    }

    public void setMediumImageURL(String mediumImageURL) {
        this.mediumImageURL = convertStringToURI(mediumImageURL);
    }

    public String getLargeImageURL() {
        return convertURIToString(largeImageURL);
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = convertStringToURI(largeImageURL);
    }

    private URI convertStringToURI(String urlString) {
        try {
            return new URI(urlString);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return URI.create("");
    }

    private String convertURIToString(URI url) {
        return url.toString();
    }
}
