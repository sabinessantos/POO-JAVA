package avalicao.unidade20221.faculdade.business;

import java.util.List;

import avaliacao.unidade20221.faculdade.domain.Disciplina;
import avaliacao.unidade20221.faculdade.persistence.DisciplinaDAO;

 

public class DisciplinaBO {

	public void CadastrarDisciplina(Disciplina disciplina) {
        DisciplinaDAO.persistir(disciplina);
}


public String BuscarMesa(String codigo) {
	
	
	List<Disciplina> disciplinas = DisciplinaDAO.obterTodas();
	  String codigo_escolhido = null;
	  
	
	for (Disciplina disciplina : disciplinas) {
		 
		if(disciplina.getCodigo().equalsIgnoreCase(codigo)) {
			
			codigo_escolhido = "\nCodigo: "+disciplina.getCodigo()+";\tNome: "+disciplina.getNome()+"\t;Carga Horaria: "+disciplina.getCarga_horaria();
		 
		}
 
	}
	return codigo_escolhido;
}
	
	
}
