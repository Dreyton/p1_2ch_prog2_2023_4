package q1.entities;

public class Professor {
	private static int qtd = 0;
	private Integer matricula;
	private String nome;
	private boolean presidente;
	private boolean titular;

	public Professor(String nome, boolean presidente, boolean titular) {
		this.matricula = ++qtd;
		this.nome = nome;
		this.presidente = presidente;
		this.titular = titular;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isPresidente() {
		return presidente;
	}

	public void setPresidente(boolean presidente) {
		this.presidente = presidente;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Professor [matricula=" + matricula + ", nome=" + nome + ", presidente=" + presidente + ", titular="
				+ titular + "]";
	}

}
