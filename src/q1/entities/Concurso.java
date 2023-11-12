package q1.entities;

import java.util.ArrayList;
import java.util.List;

public class Concurso {
	private static int qtd = 0;
	private Integer numero;
	private Integer ano;
	private String nome;
	private BancaExaminadora bancaExaminadora;
	private List<Candidato> candidatos = new ArrayList<Candidato>();
	
	public Concurso(Integer ano, String nome) {
		this.numero = ++qtd;
		this.ano = ano;
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BancaExaminadora getBancaExaminadora() {
		return bancaExaminadora;
	}

	public void setBancaExaminadora(BancaExaminadora bancaExaminadora) {
		this.bancaExaminadora = bancaExaminadora;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void addCandidato(Candidato candidato) {
		candidatos.add(candidato);
	}
	
	public void removeCandidato(Candidato candidato) {
		candidatos.remove(candidato);
	}

	@Override
	public String toString() {
		return "Concurso [numero=" + numero + ", ano=" + ano + ", nome=" + nome + ", bancaExaminadora="
				+ bancaExaminadora + ", candidatos=" + candidatos + "]";
	}
	
}
