package q1.entities;

import java.util.ArrayList;
import java.util.List;

public class BancaExaminadora {
	private String portaria;
	private List<Professor> professores = new ArrayList<>();

	public BancaExaminadora(String portaria) {
		this.portaria = portaria;
	}

	public String getPortaria() {
		return portaria;
	}

	public void setPortaria(String portaria) {
		this.portaria = portaria;
	}

	public void addProfessor(Professor professor) {
		professores.add(professor);
	}

	public void removeProfessor(Professor professor) {
		professores.remove(professor);
	}

	@Override
	public String toString() {
		return "BancaExaminadora [portaria=" + portaria + ", professores=" + professores + "]";
	}

}
