package mcpeek.kevin.supercell.beans;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class UrlContainerTest {
    private UrlContainer urlContainer;

    @Before
    public void setUp() throws Exception {
        urlContainer = new UrlContainer();
    }

    @Test
    public void setSmallImageURL_nullObject() throws Exception {
        urlContainer.setSmallImageURL((String) null);
        assertEquals("", urlContainer.getSmallImageURL());
    }

    @Test
    public void setSmallImageURL_invalidURL() throws Exception {
        urlContainer.setSmallImageURL("http://www. google.com");
        assertEquals("", urlContainer.getSmallImageURL());
    }

    @Test
    public void setSmallImageURL_validURL() throws Exception {
        urlContainer.setSmallImageURL("http://www.google.com");
        assertEquals("http://www.google.com", urlContainer.getSmallImageURL());
    }

    @Test
    public void setMediumImageURL_nullObject() throws Exception {
        urlContainer.setMediumImageURL((String) null);
        assertEquals("", urlContainer.getMediumImageURL());
    }

    @Test
    public void setMediumImageURL_invalidURL() throws Exception {
        urlContainer.setMediumImageURL("http://www. google.com");
        assertEquals("", urlContainer.getMediumImageURL());
    }

    @Test
    public void setMediumImageURL_validURL() throws Exception {
        urlContainer.setMediumImageURL("http://www.google.com");
        assertEquals("http://www.google.com", urlContainer.getMediumImageURL());
    }

    @Test
    public void setLargeImageURL_nullObject() throws Exception {
        urlContainer.setLargeImageURL((String) null);
        assertEquals("", urlContainer.getLargeImageURL());
    }

    @Test
    public void setLargeImageURL_invalidURL() throws Exception {
        urlContainer.setLargeImageURL("http://www. google.com");
        assertEquals("", urlContainer.getLargeImageURL());
    }

    @Test
    public void setLargeImageURL_validURL() throws Exception {
        urlContainer.setLargeImageURL("http://www.google.com");
        assertEquals("http://www.google.com", urlContainer.getLargeImageURL());
    }
}