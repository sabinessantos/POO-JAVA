package avaliacao.unidade20221.faculdade.persistence;

import java.util.ArrayList;
import java.util.List;

import avaliacao.unidade20221.faculdade.domain.Disciplina;

public class DisciplinaDAO {

	
	private static List<Disciplina> disciplinas = new ArrayList<>();

	public static void persistir(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	public static List<Disciplina> obterTodas() {
		
		return new ArrayList<>(disciplinas);
	}
}
