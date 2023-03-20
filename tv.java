package Televisao;

public class tv {
	public static void main(String[] args) {

		Televisao tv = new Televisao(true, 5, 9);
		tv.sintonizar(10);
		tv.dimunuirVolume();
		tv.dimunuirVolume();

		if (tv.estaLigada()) {
			System.out.println("A televisão está ligada no canal " + tv.getCanal() + "\n"
					+ "Qual é o volume da televisão? " + "O volume é " + tv.getVolume());
		} else {
			System.out.println("A televisão está desligada.");
		}
	}
}
