package avaliacao.unidade20221.faculdade.tui;

 

public class MenuTUI {
	private MenuTUI() {
	}

	public static void executar() {
		OpcaoMenuEnum opcaoSelecionada;
		do {
			exibirOpcoes();
			opcaoSelecionada = obterOpcaoSelecionada();
			executar(opcaoSelecionada);
		} while (!OpcaoMenuEnum.SAIR.equals(opcaoSelecionada));
	}

	private static void exibirOpcoes() {
		System.out.println("********** FACULDADE **********");
		for (OpcaoMenuEnum opcao : OpcaoMenuEnum.values()) {
			System.out.println(opcao.getDescricaoCompleta());
		}
	}

	private static OpcaoMenuEnum obterOpcaoSelecionada() {
		
		int opcaoSelecionada = TuiUtil.obterInteger("Informe a opção desejada:");
		return OpcaoMenuEnum.valueOfInt(opcaoSelecionada);
	 
	}

	private static void executar(OpcaoMenuEnum opcaoSelecionada) {
		switch (opcaoSelecionada) {
		case CADASTRAR_PROFESSOR:
			ProfessorTUI.cadastrar();
			break;
		case CADASTRAR_DISCIPLINA:
			DisciplinaTUI.cadastrar();
			break;
		case LISTA_PROFESSORES:
			ProfessorTUI.listar();
			break;
		case SAIR:
			System.out.println("XAU XAU...");
			break;
		}
	}
}
