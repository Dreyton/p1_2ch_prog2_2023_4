package q2.application;

import q2.entities.Estagiario;
import q2.entities.Medico;
import q2.entities.Setor;

public class Program {

	public static void main(String[] args) {
		Setor s1 = new Setor();
		Medico m1 = new Medico("Orlando", 15000.0);
		Medico m2 = new Medico("Cynthia", 16500.0);
		Estagiario e1 = new Estagiario("Marcela", 400.0);
		Estagiario e2 = new Estagiario("Vitor", 450.0);
		s1.addMedico(m1);
		s1.addMedico(m2);
		s1.addEstagiario(e1);
		s1.addEstagiario(e2);
		e1.setNotaFinal(7.0);
		e2.setNotaFinal(8.5);

		System.out.println(s1);
		
		for (var estagiario : s1.getEstagiarios()) {
			if(estagiario.isAprovado())
				estagiario.aumentoBolsa(10.0);
		}
		System.out.println(s1);
		
		//=======================================
		Setor s2 = new Setor();
		Medico m3 = new Medico("Fátima", 15000.0);
		Medico m4 = new Medico("Romeu", 16500.0);
		Estagiario e3 = new Estagiario("Vanessa", 450.0);
		Estagiario e4 = new Estagiario("Asdrubal", 400.0);
		s2.addMedico(m3);
		s2.addMedico(m4);
		s2.addEstagiario(e3);
		s2.addEstagiario(e4);
		e3.setNotaFinal(7.5);
		e4.setNotaFinal(9.5);

		System.out.println(s2);
		
		for (var estagiario : s2.getEstagiarios()) {
			if(estagiario.isAprovado())
				estagiario.aumentoBolsa(10.0);
		}
		System.out.println(s2);
	}

}
