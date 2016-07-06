package collectionspipelines;

import collectionspipelines.Company;

public class Client {
	private String nome;
	private String email;
	private Company company;
	
	public Client(String nome, String email, Company company) {
		super();
		this.nome = nome;
		this.email = email;
		this.company = company;
	}
	
	public Client(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public Client(String nome) {
		this.nome = nome;
	}
	
	public Company getCompany() {
		return company;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
}
