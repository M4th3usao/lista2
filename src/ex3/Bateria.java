package ex3;

public class Bateria {
		private double carga;

		public Bateria(double carga) {
			this.carga = carga;
		}

		public void carregar() {
			carga = carga + 5;
		}
		
		public void descarregar() {
			carga = carga -10;
		}
		public double getCarga() {
			return carga;
		}
		
		public void exibirCarga() {
			System.out.println("Carga: " + carga);
		}
}
