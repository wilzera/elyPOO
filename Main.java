package projeto;

public class Main {

	public static void main(String[] args) {


		Filme f1 = new Filme();
		f1.setTitulo("Vingadores");
		f1.setAnoLancamento(2012);

		
		Ator a1 = new Ator();
		a1.setNome("João");
		a1.setDataNascimento("10/03/2000");
		a1.setNascionalidade("São Sebastião do Paraíso");

		Ator a2 = new Ator();
		a2.setNome("Valéria");
		a2.setDataNascimento("12/12/2014");
		a2.setNascionalidade("São Paulo");

		
		Musico m1 = new Musico();
		m1.setNome("Rubens");
		m1.setDataNascimento("13/04/1972");
		m1.setEstiloMusical("Rock");

		Musico m2 = new Musico();
		m2.setNome("Enzo");
		m2.setDataNascimento("05/01/1995");
		m2.setEstiloMusical("Sertanejo");

		Diretor d1 = new Diretor();
		d1.setNome("Quentin Tarantino");
		d1.setDataNascimento("27/03/1963");

		f1.getAtores().add(a1);
		f1.getAtores().add(a2);
		f1.getMusicos().add(m1);
		f1.getMusicos().add(m2);
		f1.setDiretor(d1);
	
		Filme f2 = new Filme();
		f2.setTitulo("Titanic");
		f2.setAnoLancamento(1998);

		Ator a3 = new Ator();
		a3.setNome("José");
		a3.setDataNascimento("01/02/2001");
		a3.setNascionalidade("Paraisópolis");

		Ator a4 = new Ator();
		a4.setNome(" Sabrina ");
		a4.setDataNascimento("02/05/1993");
		a4.setNascionalidade("Goiás");

		// MUSICOS
		Musico m3 = new Musico();
		m3.setNome("Gusttavo Lima");
		m3.setDataNascimento("19/08/1982");
		m3.setEstiloMusical("Sertanejo");

		Musico m4 = new Musico();
		m4.setNome(" Sidoka ");
		m4.setDataNascimento("23/08/1984");
		m4.setEstiloMusical("Trap");

		Diretor d2 = new Diretor();
		d2.setNome(" Zath Barney");
		d2.setDataNascimento("03/06/1991");

		f2.getAtores().add(a3);
		f2.getAtores().add(a4);
		f2.getMusicos().add(m3);
		f2.getMusicos().add(m4);
		f2.setDiretor(d2);

		Produtora produtora = new Produtora();

		produtora.setNome("---------------------- CIMUSIC PRODUÇÕES ----------------------");

		produtora.getFilmes().add(f1);
		produtora.getFilmes().add(f2);

		System.out.println(produtora);



	}

}