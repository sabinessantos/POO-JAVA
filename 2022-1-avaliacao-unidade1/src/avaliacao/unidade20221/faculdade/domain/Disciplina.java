package avaliacao.unidade20221.faculdade.domain;

public class Disciplina {
	
 private String codigo;
 private  String nome;
 private int carga_horaria;
 
 public Disciplina(String codigo,String nome,int carga_horario){
	 super();
	 this.codigo = codigo;
	 this.nome = nome;
	 this.carga_horaria = carga_horario;
 }
 
 
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getCarga_horaria() {
	return carga_horaria;
}
public void setCarga_horaria(int carga_horaria) {
	this.carga_horaria = carga_horaria;
}
 
 
	
}
