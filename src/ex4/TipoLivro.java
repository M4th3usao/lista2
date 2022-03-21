package Ex4;

public class TipoLivro {
	
	private String tipoLivro;
	private double preco;
	private String disponivel;
	
	private Book book;
	
	public TipoLivro(String TipoLivro, double preco, String disponivel, Book book) {
		
		this.tipoLivro = TipoLivro;
		this.preco = preco;
		this.book = book;
		this.disponivel = disponivel;		
		
	}
	
	public String getTipoLivro() {
		
		return tipoLivro;
	}
	
	public double getPreco() {
		
		return preco;
	}
	
	public void mostrar() {
		
		if (disponivel == "sim" ) {
			
			System.out.println("Formato: " + tipoLivro);
			System.out.println("Preço: " + preco);
			book.mostrar();
		} else {
			
			System.out.println("Não Disponivel");
			System.out.println("Formato: " + tipoLivro);
			System.out.println("Preço: " + preco);
			book.mostrar();
		}
		
	}

}
