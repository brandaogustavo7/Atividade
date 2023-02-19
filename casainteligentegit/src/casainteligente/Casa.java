package casainteligente;

public class Casa {
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	private String cidade;
	private Pavimento andar[];
	private int quant;
	
	public Casa(String logradouro, String numero, String bairro, String cep, String cidade, int quant) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.andar = new Pavimento[quant];
		
		
	}
}
