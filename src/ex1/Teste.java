package ex1;

public class Teste {
	public static void main(String[] args) {
		Partido c = new Partido();
		c.nome = " Partido dos Trabalhadores";
		c.ideologia = " socialista";
		c.sigla = " PT";
		c.numero = " 13";
		c.mostrarInfo();	
		Candidato m = new Candidato();
		m.nomeC = " José Putin";
		m.mostrarCand();

		Partido d = new Partido();
		d.nome = " Progressistas ";
		d.ideologia = " Liberalismo";
		d.sigla = " PP";
		d.numero = " 11";
		d.mostrarInfo();
		
		Partido e = new Partido();
		e.nome = " Partido da Social Democracia Brasileira";
		e.ideologia = " Liberalismo social";
		e.sigla = " PSDB";
		e.numero = " 45";  
		e.mostrarInfo();
		
		Partido f = new Partido();
		f.nome = " União Brasil";
		f.ideologia = " Conservadorismo liberal ";
		f.sigla = " UNIÃO";
		f.numero = " 44";
		f.mostrarInfo();
		
		Partido g = new Partido();
		g.nome = " Partido Social Democrático";
		g.ideologia = " Liberalismo social";
		g.sigla = " PSD";
		g.numero = " 55";
		g.mostrarInfo();
		
		
		Candidato h = new Candidato();
		h.nomeC = " José Putin";
		h.mostrarCand();
		
		
		Candidato i = new Candidato();
		i.nomeC = " Ana Banana";
		i.mostrarCand();
		
		Candidato j = new Candidato();
		j.nomeC = " Cleiton Rasta";
		j.mostrarCand();
		
		Candidato k = new Candidato();
		k.nomeC = " Thiago Simas";
		k.mostrarCand();
		
		Candidato l = new Candidato();
		l.nomeC = " Irineu";
		l.mostrarCand();
		
		
		
	}	
}
