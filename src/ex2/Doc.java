package ex2;

public class Doc {
		private Cliente cliente;
		private double quantia;
		

		public Doc(double quantia, Cliente cliente) {
			this.cliente = cliente;
			this.quantia = quantia;
		}
			
		public double getQuantia() {
			return quantia;
		}

		public void Tranferir(Cliente c1, Cliente c2, double quantia) {
			c1.sacar(quantia);
			c2.depositar(quantia);
		}
		
		public void exibirDoc() {
			cliente.exibirDados();
		}
}
