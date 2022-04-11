package avaliacao.unidade20221.faculdade.persistence;

import java.util.ArrayList;
import java.util.List;

import avaliacao.unidade20221.faculdade.domain.Professor;

public class ProfessorDAO {

	
	private static List<Professor> professores = new ArrayList<>();

	public static void persistir(Professor professor) {
		professores.add(professor);
	}

	public static List<Professor> obterTodas() {
		return new ArrayList<>(professores);
	}
}
