package mcpeek.kevin.supercell.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;


public class SuperCellWebServiceClient {
	private Client restWebServiceClient;
	private WebTarget webServiceLocation;		
//	private final static String API_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6ImFkZmQ4MTNjLTE2MTctNDU5ZS04YTY3LWI3MzE0YWVmZGJjZiIsImlhdCI6MTQ2NDU2MzA1MCwic3ViIjoiZGV2ZWxvcGVyLzY4YzM0NzU0LWEwMjAtNDc3NS05OGYzLWJlMmYwMmE2NzM0OSIsInNjb3BlcyI6WyJjbGFzaCJdLCJsaW1pdHMiOlt7InRpZXIiOiJkZXZlbG9wZXIvc2lsdmVyIiwidHlwZSI6InRocm90dGxpbmcifSx7ImNpZHJzIjpbIjc1LjEzMi4xMzMuMTgxIl0sInR5cGUiOiJjbGllbnQifV19.RcKFUelnsFrLncy465uBG_PbdSBujgOH8riwaynAXI6jxtCdDvW28o9oesovzV1gz2T1zEtAsLFFj8GkwP-_CA";
	private final static String API_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjFjZjAwMjRkLWY5OWUtNGU1Ny04MGFhLTQ0Y2QzMTI5ZWQxNiIsImlhdCI6MTQ2NDU5NjAwNywic3ViIjoiZGV2ZWxvcGVyLzY4YzM0NzU0LWEwMjAtNDc3NS05OGYzLWJlMmYwMmE2NzM0OSIsInNjb3BlcyI6WyJjbGFzaCJdLCJsaW1pdHMiOlt7InRpZXIiOiJkZXZlbG9wZXIvc2lsdmVyIiwidHlwZSI6InRocm90dGxpbmcifSx7ImNpZHJzIjpbIjc1LjEzMi4xNDIuMTIxIl0sInR5cGUiOiJjbGllbnQifV19.bo3hYcVQj980MJXXBwr4fnhdCXWVtWurh8AaqIhdlSrJOedyC-WDBuWEn_jYa_IB2SSYlIlutPVgosKkd43EKQ";
	public SuperCellWebServiceClient() {
		this.restWebServiceClient = ClientBuilder.newClient();

	}
	
	public void setEndpoint(URI endpointURI) {
		this.webServiceLocation = restWebServiceClient.target(endpointURI);
		
	}

	public Response getResource(String webServiceResourcePath) {
		WebTarget resourceLocation = webServiceLocation.path(webServiceResourcePath);
		Invocation.Builder invocationBuilder = resourceLocation.request(MediaType.APPLICATION_JSON);
		invocationBuilder.header("Authorization", "Bearer " + API_TOKEN);
		return invocationBuilder.get();
	}
	public void disconnect() {
		restWebServiceClient.close();
	}

}
