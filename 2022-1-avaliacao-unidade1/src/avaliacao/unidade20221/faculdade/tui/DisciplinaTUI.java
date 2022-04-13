package avaliacao.unidade20221.faculdade.tui;

import avaliacao.unidade20221.faculdade.business.DisciplinaBO;
 
import avaliacao.unidade20221.faculdade.domain.Disciplina;
 

public class DisciplinaTUI {
	public static void cadastrar() {
	 
		System.out.println("********** CADASTRO DE DISCIPLINA **********");
		String codigo = TuiUtil.obterString("Informe o codigo:");
		String nome = TuiUtil.obterString("Informe o nome:");
	    int cargaHoraria = TuiUtil.obterInteger("Informe a carga horaria:");
	   
		
    	DisciplinaBO Cadastrar_Disciplina = new DisciplinaBO();
    	
    	Disciplina disciplina = new Disciplina(codigo,nome,cargaHoraria);
    	
    	Cadastrar_Disciplina.CadastrarDisciplina(disciplina);
    	System.out.println("Disciplina cadastrada com sucesso");
	}
}
