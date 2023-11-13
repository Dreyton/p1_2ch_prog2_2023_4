package q2.entities;

import java.util.ArrayList;
import java.util.List;

public class Setor {
	private static int qtd = 0;
	private Integer codigo;
	private List<Medico> medicos = new ArrayList<>();
	private List<Estagiario> estagiarios = new ArrayList<>();

	public Setor() {
		this.codigo = ++qtd;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public List<Medico> getMedicos() {
		return medicos;
	}

	public List<Estagiario> getEstagiarios() {
		return estagiarios;
	}

	public void addMedico(Medico medico) {
		medicos.add(medico);
	}

	public void removeMedico(Medico medico) {
		medicos.remove(medico);
	}

	public void addEstagiario(Estagiario estagiario) {
		estagiarios.add(estagiario);
	}

	public void removeEstagiario(Estagiario estagiario) {
		estagiarios.remove(estagiario);
	}

	@Override
	public String toString() {
		return "Setor [codigo=" + codigo + ", medicos=" + medicos + ", estagiarios=" + estagiarios + "]";
	}

}
