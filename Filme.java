package projeto;

import java.util.LinkedList;

public class Filme {

	private String titulo;
	private int anoLancamento;
	private Diretor diretor = new Diretor();
	private LinkedList<Ator> atores = new LinkedList<Ator>();
	private LinkedList<Musico> musicos = new LinkedList<Musico>();

	public LinkedList<Musico> getMusicos() {
		return musicos;
	}

	public void setMusicos(LinkedList<Musico> musicos) {
		this.musicos = musicos;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LinkedList<Ator> getAtores() {
		return atores;
	}

	public void setAtores(LinkedList<Ator> atores) {
		this.atores = atores;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String imprimeAtores() {
		String resultado = "";
		for(int i = 0; i < atores.size(); i++) {
			resultado += atores.get(i).toString() + "\n\n";
		}
		return resultado;
	}

	public String imprimeMusicos() {
		String resultado = "";
		for(int i = 0; i < musicos.size(); i++) {
			resultado += musicos.get(i).toString() + "\n\n";
		}
		return resultado;
	}

	@Override
	public String toString() {
		String resultado = "Filme: \n\n" + "Titulo : " + this.getTitulo() + " | " + "Ano de Lançamento : " + this.getAnoLancamento() + " \n\n" +"DIRETOR: \n\n" + diretor.toString() + "\n\nATORES: \n\n" + imprimeAtores() + "MUSICOS: \n \n" + imprimeMusicos();
		return resultado;
	}

}