package ex3;

public class Celular {
		private String cliente;
		private int identificador;
		private boolean celular;
		private Bateria bateria;
		
		public Celular(String cliente, int identificador, Bateria bateria) {
			this.cliente = cliente;
			this.identificador = identificador;
			this.bateria = bateria;
		}

		public String getCliente() {
			return cliente;
		}

		public int getIdentificador() {
			return identificador;
		}

		public Bateria getBateria() {
			return bateria;
		}
		
		public void ligarCelular() {
			if (bateria.getCarga() > 20) {
				bateria.descarregar();
				bateria.descarregar();
				System.out.println("Cliente: " + cliente);
				celular = true;
			}else {
				System.out.println("Bateria Fraca!");
			}
		}
		
		public void desligarCelular() {
			System.out.println("O dispositivo está sendo desligado!");
			bateria.descarregar();
			celular = false;
		}
		
		public void somLigado() {
			if (celular = true && bateria.getCarga() >= 10) {
				System.out.println("O som foi ativado!");
			}
		}
			
		public void mostrarCelular() {
			System.out.println("==+==+==+==+==+==+Dados+==+==+==+==+==+==+==");
			System.out.println("Cliente: " + cliente);
			System.out.println("Número identificador: " + identificador);
			bateria.exibirCarga();
			System.out.println("==+==+==+==+==+==+==+==+==+==+==+==+==+==+==");
		}
}
