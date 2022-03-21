package ex2;

public class Teste {
		public static void main(String[] args) {
			
			Cliente c1 = new Cliente("José Putin", 450.00, 832.53);
			Cliente c2 = new Cliente("Cleiton Rasta", 749.90, 1230.07);
			
			Doc doc = new Doc (600, c1);
			doc.Tranferir(c1, c2, 300);
			doc.exibirDoc();
			c2.exibirDados();
			
		}

}
