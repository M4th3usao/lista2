package Ex4;

public class Book {

		private String nLivro, nAutor;
		
		
		public Book(String nLivro, String nAutor) {
			
			this.nAutor = nAutor;
			this.nLivro = nLivro;
			
		}
		
		public void mostrar() {
			
			System.out.println("livro: " + nLivro);
			System.out.println("Autor: " + nAutor);
			System.out.println("<----------JUMP--------->");
			
		}
		
}

