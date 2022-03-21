package ex3;

public class Teste {
public static void main(String[] args) {
		
		Bateria bat = new Bateria(100);
		Celular cel = new Celular ("Amanda",991324903, bat);
		cel.mostrarCelular();
		cel.ligarCelular();
		cel.desligarCelular();
		cel.somLigado();
	}
}
