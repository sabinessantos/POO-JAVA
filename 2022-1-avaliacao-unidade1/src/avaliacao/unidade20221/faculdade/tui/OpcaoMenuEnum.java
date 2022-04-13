package avaliacao.unidade20221.faculdade.tui;

 
public enum OpcaoMenuEnum {
 
	CADASTRAR_PROFESSOR(1, "Cadastrar Professor"),

	CADASTRAR_DISCIPLINA(2, "Cadastrar Disciplina"),

	LISTA_PROFESSORES(3, "Lista de Professores"),
 
	SAIR(4, "Sair");

	private Integer codigo;
	private String descricao;

	private OpcaoMenuEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDescricaoCompleta() {
		return codigo + " - " + descricao;
	}

	public static OpcaoMenuEnum valueOfInt(Integer codigo) {
		for (OpcaoMenuEnum opcaoMenu : values()) {
			
			if (opcaoMenu.codigo.equals(codigo)) {
				return opcaoMenu;
			}
		 
		}
	 
		throw new IllegalArgumentException("Opção invalida");
	}
}
