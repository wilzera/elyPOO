package projeto;

public class Diretor extends Pessoa{

	public String toString() {
		String resultado = "Nome: " + this.getNome() + " | " + "Nascimento: " + this.getDataNascimento();
		return resultado;
	}


}

