package avaliacao.unidade20221.faculdade.persistence;

import java.util.ArrayList;
import java.util.List;


public class ProfessorDAO {

	
	private static List<String> professores = new ArrayList<>();

	public static void persistir(String professor) {
		professores.add(professor);
	}

	public static List<String> obterTodas() {
		return new ArrayList<>(professores);
	}
}
