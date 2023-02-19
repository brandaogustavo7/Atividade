package casainteligente;

public class Cortina {
	private String modelo;
	private boolean estado;
	
	public Cortina() {
		
	}
	public String getmodelo() {
		return this.modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean getestado() {
		return this.estado;
	}
	public void setestado(boolean estado) {
		this.estado = estado;
	}
	
	public void abrirCortina() {
		if(this.getestado()) {
			System.out.println("Cortina já está aberta");
		}else {
			this.setestado(true);
			System.out.println("Cortina aberta com sucesso!");
		}
		
	}
	public void fecharCortina() {
		if(this.getestado()== false) {
			System.out.println("Cortina já está fechada!");
		}else {
			this.setestado(false);
			System.out.println("Cortina fechada com sucesso!");
		}
	}
}
