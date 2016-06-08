package mcpeek.kevin.supercell.client;

import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

public class MainClass {
    public static void main(String args[]) {
        SuperCellWebServiceClient client = new SuperCellWebServiceClient();
        try {
            client.setEndpoint(new URI("https://api.clashofclans.com/v1"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        Response response = client.getResource("/clans/%238PYGRY2");
        String clanString = response.readEntity(String.class);
    }
}
