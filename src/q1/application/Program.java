package q1.application;

import q1.entities.BancaExaminadora;
import q1.entities.Candidato;
import q1.entities.Concurso;
import q1.entities.Professor;

public class Program {

	public static void main(String[] args) {
		Concurso c1 = new Concurso(2021, "Concurso Docente 1");
		
		Candidato ca1 = new Candidato("João", "12347-89");
		Candidato ca2 = new Candidato("Maria", "42367-01");
		c1.addCandidato(ca1);
		c1.addCandidato(ca2);

		Professor p1 = new Professor("Leandro", true, true);//presidente
		Professor p2 = new Professor("Mariana", false, true);
		Professor p3 = new Professor("Fernanda", false, true);
		Professor p4 = new Professor("Reginaldo", false, false);//suplente
		
		BancaExaminadora be1 = new BancaExaminadora("1234/2021");
		be1.addProfessor(p1);
		be1.addProfessor(p2);
		be1.addProfessor(p3);
		be1.addProfessor(p4);
		c1.setBancaExaminadora(be1);
		
		ca1.setNotaProvaEscrita(7.5);
		ca1.setNotaProvaDidatica(8.5);
		ca1.setNotaProvaMemorial(9.5);
		ca1.setNotaProvaTitulos(7.1);

		ca2.setNotaProvaEscrita(8.5);
		ca2.setNotaProvaDidatica(9.5);
		ca2.setNotaProvaMemorial(9.0);
		ca2.setNotaProvaTitulos(8.1);
		
		System.out.println(c1);
		
		//============================
		
		Concurso c2 = new Concurso(2024, "Concurso Docente 2");
		
		Candidato ca3 = new Candidato("Aurélio", "12457-80");
		Candidato ca4 = new Candidato("Joana", "42787-04");
		c2.addCandidato(ca3);
		c2.addCandidato(ca4);

		Professor p5 = new Professor("Aline", true, true);//presidente
		Professor p6 = new Professor("Claudio", false, true);
		Professor p7 = new Professor("Diego", false, true);
		Professor p8 = new Professor("Elton", false, false);//suplente
		
		BancaExaminadora be2 = new BancaExaminadora("201/2024");
		be2.addProfessor(p5);
		be2.addProfessor(p6);
		be2.addProfessor(p7);
		be2.addProfessor(p8);
		c2.setBancaExaminadora(be2);
		
		ca3.setNotaProvaEscrita(7.1);
		ca3.setNotaProvaDidatica(9.8);
		ca3.setNotaProvaMemorial(9.7);
		ca3.setNotaProvaTitulos(8.33);

		ca4.setNotaProvaEscrita(8.75);
		ca4.setNotaProvaDidatica(9.25);
		ca4.setNotaProvaMemorial(7.0);
		ca4.setNotaProvaTitulos(7.1);
		
		System.out.println(c2);
	}

}
