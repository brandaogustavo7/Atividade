package casainteligente;

public class Porta {
	private String tipo;
	private boolean estado;
	
	public Porta() {
		
	}
	public String gettipo() {
		return this.tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean getestado() {
		return this.estado;
	}
	public void setestado(boolean estado) {
		this.estado = estado;
	}
	public void abrirPorta() {
		if(this.getestado()) {
			System.out.println("A porta está aberta.");
		}else {
			this.setestado(true);
			System.out.println("Porta aberta com sucesso!");
		}
		
	}
	public void fecharPorta() {
		if(this.getestado() == false) {
			System.out.println("A porta está fechada.");
		}else {
			this.setestado(false);
			System.out.println("Porta fechada com sucesso!");
		}
	}

}
