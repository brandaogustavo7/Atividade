package casainteligente;

public class Luz {
	private int potencia;
	private String temperatura;
	private boolean estado;
	
	public Luz() {
		
	}
	public int getpotencia() {
		return this.potencia;
	}
	public void setpotencia(int potencia) {
		this.potencia = potencia;
	}
	public String gettemperatura() {
		return this.temperatura;
	}
	public void settemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public boolean getestado() {
		return this.estado;
	}
	public void setestado(boolean estado) {
		this.estado = estado;
	}
	
	public void ligarLuz() {
		
	
		if(this.getestado()){
			System.out.println("A luz já está acessa.");
		}else{
			this.setestado(true);
			System.out.println("Luz acessa com sucesso! ");
		}
	}
		public void desligarLuz() {
			if(this.getestado() == false) {
				System.out.println("A luz já está desligada!");
			}else{
				this.setestado(false);
				System.out.println("Luz desliga com sucesso!");
			}
				
			
		}

}
