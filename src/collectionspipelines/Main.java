package collectionspipelines;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	private static ClientRepository clientRepository;
	
	public static void main(String[] args) {
		Company company = new Company("RedHat");
		Client clientCompleto1 = new Client("Completo1", "completo1@email.com", company);
		Client clientCompleto2 = new Client("Completo2", "completo2@email.com", company);
		Client semEmpresa = new Client("Sem Empresa", "semempresa@email.com");
		Client semEmail = new Client("Sem Email");
		
		clientRepository = new ClientRepository(Arrays.asList(clientCompleto1, clientCompleto2, semEmpresa, semEmail));
		
		List<String> clientsMails = clientRepository.getClientMails();
		
		clientsMails.forEach(email -> System.out.println(email));
		
	}

}
