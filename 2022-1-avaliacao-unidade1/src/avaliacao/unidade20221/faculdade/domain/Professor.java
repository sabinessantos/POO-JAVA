package avaliacao.unidade20221.faculdade.domain;

public class Professor {

	private int matricula;
	private String nome;
	private String numero;
 
	public Professor(int matricula,String nome,String numero) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.numero = numero;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
 
 	
	
}
