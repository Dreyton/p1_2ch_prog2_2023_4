package q1.entities;

public class Candidato {
	private static int qtd = 0;
	private Integer numeroInscricao;
	private String nome;
	private String rg;
	private double notaProvaEscrita;
	private double notaProvaDidatica;
	private double notaProvaMemorial;
	private double notaProvaTitulos;
	// private double notaFinal;

	public Candidato(String nome, String rg) {
		this.numeroInscricao = ++qtd;
		this.nome = nome;
		this.rg = rg;
	}

	public Integer getNumeroInscricao() {
		return numeroInscricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getNotaProvaEscrita() {
		return notaProvaEscrita;
	}

	public void setNotaProvaEscrita(double notaProvaEscrita) {
		this.notaProvaEscrita = notaProvaEscrita;
	}

	public double getNotaProvaDidatica() {
		return notaProvaDidatica;
	}

	public void setNotaProvaDidatica(double notaProvaDidatica) {
		this.notaProvaDidatica = notaProvaDidatica;
	}

	public double getNotaProvaMemorial() {
		return notaProvaMemorial;
	}

	public void setNotaProvaMemorial(double notaProvaMemorial) {
		this.notaProvaMemorial = notaProvaMemorial;
	}

	public double getNotaProvaTitulos() {
		return notaProvaTitulos;
	}

	public void setNotaProvaTitulos(double notaProvaTitulos) {
		this.notaProvaTitulos = notaProvaTitulos;
	}

	public double getNotaFinal() {
		double notaPreliminar = (notaProvaEscrita + notaProvaDidatica + notaProvaMemorial) / 3.0;
		return (notaPreliminar + notaProvaTitulos) / 2.0;
	}

	public boolean isAprovado() {
		return getNotaFinal() >= 7;
	}

	@Override
	public String toString() {
		return "Candidato [numeroInscricao=" + numeroInscricao + ", nome=" + nome + ", rg=" + rg + ", notaProvaEscrita="
				+ notaProvaEscrita + ", notaProvaDidatica=" + notaProvaDidatica + ", notaProvaMemorial="
				+ notaProvaMemorial + ", notaProvaTitulos=" + notaProvaTitulos + ", notaFinal=" + getNotaFinal() 
				+ ", aprovado?=" + isAprovado() + "]";
	}

}
