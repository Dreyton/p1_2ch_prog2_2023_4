package q2.entities;

public class Estagiario {
	private String nome;
	private Double valorBolsa;
	private Double notaFinal;

	public Estagiario(String nome, Double valorBolsa) {
		this.nome = nome;
		this.valorBolsa = valorBolsa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(Double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}

	public Double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(Double notaFinal) {
		this.notaFinal = notaFinal;
	}

	public boolean isAprovado() {
		return notaFinal >= 8;
	}

	public void aumentoBolsa(double taxa) {//taxa em porcentagem
		setValorBolsa(valorBolsa * (1.0 + taxa/100.0));
	}
	
	@Override
	public String toString() {
		return "Estagiario [nome=" + nome + ", valorBolsa=" + valorBolsa + ", notaFinal=" + notaFinal
				+ ", isAprovado()=" + isAprovado() + "]";
	}

}
