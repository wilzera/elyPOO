package projeto;

import java.util.LinkedList;

public class Produtora {

	private LinkedList <Filme> filmes = new LinkedList<Filme>();
	private String nome;

	public LinkedList<Filme> getFilmes() {
		return filmes;
	}
	public void setFilmes(LinkedList<Filme> filmes) {
		this.filmes = filmes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		String resultado = this.getNome() + "\n\n";
		for(int i = 0; i < filmes.size(); i++) {
			resultado += filmes.get(i).toString() + "\n" + "=========================================================================================" + "\n\n";
		}
		return resultado;
	} 

}