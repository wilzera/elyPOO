package projeto;

public class Ator extends Pessoa {

	private String nascionalidade;

	public String getNascionalidade() {
		return nascionalidade;
	}

	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}

	@Override
	public String toString() {
		String resultado = "Nome: " + this.getNome() + " | " +  "Nascimento: " + this.getDataNascimento() + " | " + " Nacionalidade: " + this.getNascionalidade();
		return resultado;
	}

}


