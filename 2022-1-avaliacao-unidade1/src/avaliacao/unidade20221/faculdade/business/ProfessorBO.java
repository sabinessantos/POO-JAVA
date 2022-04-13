package avaliacao.unidade20221.faculdade.business;

 
import java.util.List;

import avaliacao.unidade20221.faculdade.domain.Professor;
 
import avaliacao.unidade20221.faculdade.persistence.ProfessorDAO;
 
 

public class ProfessorBO {


	public void CadastrarProfessor(Professor disciplina, String codigo) {
     
		DisciplinaBO disciplinabo = new DisciplinaBO();
		
		 String listaProfessor = "Matricula: "+disciplina.getMatricula()+" Nome: "+disciplina.getNome()+" Telefone: "+disciplina.getNumero()+""+disciplinabo.BuscarDisciplina(codigo);
		
		ProfessorDAO.persistir(listaProfessor);
}
	
	public boolean VerificaProfessor() {
		 
		List<String> professor = ProfessorDAO.obterTodas();
		if(professor.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}
 
	
}
