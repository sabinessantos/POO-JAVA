package avaliacao.unidade20221.faculdade.business;

import java.util.List;

import avaliacao.unidade20221.faculdade.domain.Disciplina;
import avaliacao.unidade20221.faculdade.persistence.DisciplinaDAO;
 
public class DisciplinaBO {

	public void CadastrarDisciplina(Disciplina disciplina) {
        DisciplinaDAO.persistir(disciplina);
}


public String BuscarDisciplina(String codigo) {
	
	
	List<Disciplina> disciplinas = DisciplinaDAO.obterTodas();
	  String codigo_escolhido = null;
	  
	
	for (Disciplina disciplina : disciplinas) {
		 
		if(disciplina.getCodigo().equalsIgnoreCase(codigo)) {
			
			codigo_escolhido = "\nCodigo: "+disciplina.getCodigo()+";\tNome: "+disciplina.getNome()+"\t;Carga Horaria: "+disciplina.getCarga_horaria();
		 
		}
 
	}
	return codigo_escolhido;
}
	
public void ListarDisciplina() {
	List<Disciplina> disciplinas = DisciplinaDAO.obterTodas();
	   
	  System.out.println("******Disciplinas Disponiveis******");
	for (Disciplina disciplina : disciplinas) {
		
		 System.out.println("\nCodigo: "+disciplina.getCodigo()+" Nome: "+disciplina.getNome()+" Carga Horaria: "+disciplina.getCarga_horaria());
		}
}

public boolean VerificarDisciplina() {
	 
	List<Disciplina> disciplina = DisciplinaDAO.obterTodas();
	if(disciplina.isEmpty()) {
		return false;
	}
	else {
		return true;
	}
}
	
}
