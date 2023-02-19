package casainteligente;

public class Usuario {
	private String nome;
	private Casa casa[];
	private int i=0;
	
	public Usuario(String nome, Casa casa) {
		this.nome = nome;
		this.casa[i] = casa;
	
		
		
	}
	public void adicionarCasa(Casa casa) {
		if(this.casa[i] == null) {
			this.casa[i] = casa;
		}else {
			i++;
			this.casa[i] = casa;
		}
		
	}
	public void mostrarCasas() {
		
		for(int i = 0; i < this.i; i++) {
			System.out.println("teste");
		}
	}
}
