package avaliacao.unidade20221.faculdade.tui;

import java.util.List;

import avaliacao.unidade20221.faculdade.business.DisciplinaBO;
import avaliacao.unidade20221.faculdade.business.ProfessorBO;
import avaliacao.unidade20221.faculdade.domain.Professor;
import avaliacao.unidade20221.faculdade.persistence.ProfessorDAO;

public class ProfessorTUI {

	
	public static void cadastrar() {
		 
		 DisciplinaBO  verificaDisciplina = new  DisciplinaBO ();
		 
		if( verificaDisciplina.VerificarDisciplina( )) {
		ProfessorBO Cadastrar_professor = new ProfessorBO();
		
		System.out.println("********** CADASTRO DE PESSOAS **********");
		int matricula = TuiUtil.obterInteger("Informe a matricula:");
		String nome = TuiUtil.obterString("Informe o nome:");
	    int numero = TuiUtil.obterInteger("Informe o numero:");
	    
	    verificaDisciplina.ListarDisciplina();
	    
	    String codigo = TuiUtil.obterString("\nInforme o codigo da disciplina:");

    	Professor professor = new Professor(matricula,nome,numero);
    	
        Cadastrar_professor.CadastrarProfessor(professor,codigo);
		}
		else {
			System.out.println("\nCadastre uma disciplina primeiro\n\n");
		}
	}
	
	
	public static void listar() {
		
		ProfessorBO  verificaProfessor = new ProfessorBO ();
		 
			if( verificaProfessor.VerificaProfessor( )) {
		
		
	List<String> listaProfessores = ProfessorDAO.obterTodas();
	  	 
	  	
	  	for (String listaProfessor : listaProfessores) {
	  		 
	  	             System.out.println(listaProfessor);
	  		}
			}
			else {
				System.out.println("\nNenhum professor cadastrado\n\n");
			}
	}
}
