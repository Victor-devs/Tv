package Televisao;

public class Televisao {
	
	private boolean ligada;
	private int canal;
	private int volume;
	
	public Televisao() {
	}
	
	public Televisao(boolean ligada, int canal, int volume) {
		this.ligada = ligada;
		this.canal = canal;
		this.volume = volume;
	}
	
	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar() {
		this.ligada = false;
	}
	
	public void sintonizar(int canal) {
		 this.canal = canal;
	}
	
	public void aumentarVolume() {
		 this.volume = volume += 1;
	}
	
	public void dimunuirVolume() {
		 this.volume = volume -= 1;
	}
	
	public boolean estaLigada() {
		return this.ligada;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public int getVolume() {
		return this.volume;
	}
}
