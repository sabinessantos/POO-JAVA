package avalicao.unidade20221.faculdade.business;

import java.util.List;
 
import avaliacao.unidade20221.faculdade.domain.Professor;
 
import avaliacao.unidade20221.faculdade.persistence.ProfessorDAO;

public class ProfessorBO {


	public void CadastrarProfessor(Professor disciplina) {
        ProfessorDAO.persistir(disciplina);
}
	
	
	public String BuscarProfessor() {
		
		
		List<Professor> professores = ProfessorDAO.obterTodas();
		  String  professor_escolhido = null;
		  
		
		for (Professor professor : professores) {
		 
			professor_escolhido = null;
			 
		}
		return professor_escolhido;
	}
	
}
