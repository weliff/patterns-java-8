package collectionspipelines;

import java.util.List;
import java.util.stream.Collectors;

public class ClientRepository {
	
	private List<Client> clients;
	
	public ClientRepository(List<Client> clients) {
		this.clients = clients;
	}
	
	public List<String> getClientMails() {
		List<String> pipeline = clients.stream()
				.filter(client -> client.getCompany() != null)
				.map(client -> client.getEmail())
				.filter(email -> email != null)
				.collect(Collectors.toList());
		return pipeline;
		
	}

}
