package casainteligente;

public class ArCond {
	private String marca;
	private float temperatura;
	private int potencia;
	private boolean estado;
	
	public ArCond(){
		
	}
	public String getmarca() {
		return this.marca;
	}
	public void setmarca(String marca) {
		this.marca = marca;
	}
	public float gettemperatura() {
		return this.temperatura;
	}
	public void settemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public int getpotencia() {
		return this.potencia;
	}
	public void setpotencia(int potencia) {
		this.potencia = potencia;
	}
	public boolean getestado() {
		return this.estado;
	}
	public void setestado(boolean estado) {
		this.estado = estado;
	}
	public void ligarArCond() {
		if(this.getestado()) {
			System.out.println("Ar condicionado já está ligado!");
		}else {
			this.setestado(true);
			System.out.println("Ar condicionado ligado com sucesso!");
			
		}
		
	}
	public void desligarArCond() {
		if(this.getestado() == false) {
			System.out.println("Ar condicionado já está desligado!");
		}else {
			this.setestado(false);
			System.out.println("Ar condicionado desligado com sucesso!");
		}
	}
	public void aumentarTemp() {
		if(this.getestado() && this.gettemperatura() >= 5 && this.gettemperatura() < 30) {
			this.settemperatura(this.gettemperatura() + 5);
			
		}else {
			System.out.println("Não foi possivel aumentar a temperatura.");
			System.out.println("Ar desligado!!");
		}
	}
	public void diminuirTemp() {
		if(this.getestado() && this.gettemperatura() >= 5 && this.gettemperatura() < 30) {
			this.settemperatura(this.gettemperatura() - 5);
			
		}else {
			System.out.println("Não foi possivel diminuir a temperatura.");
			System.out.println("Ar desligado!!");
		}
		
	}
}
