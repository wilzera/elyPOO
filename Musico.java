package projeto;

public class Musico extends Pessoa{

	private String estiloMusical;

	public String getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}

	@Override
	public String toString() {
		String resultado = "Nome: " + this.getNome() + " | " + " Data Nascimento: " + this.getDataNascimento() + " | " + " Estilo Musical: " + this.getEstiloMusical();
		return resultado;
	}


}


