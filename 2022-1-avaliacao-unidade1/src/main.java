

import java.util.List;
import java.util.Scanner;

 import avalicao.unidade20221.faculdade.business.*;
 import avaliacao.unidade20221.faculdade.domain.*;
 import avaliacao.unidade20221.faculdade.persistence.*;
 
 
 
public class main {

	public static void main(String[] args) {
	 
		menu();
 
	}
	
	public static void menu() {

		Scanner leia = new Scanner(System.in);
		
		int cont = 0;
		int i = 1;
		
		while(cont==0) {
		System.out.println("1-Cadastrar Professor\n2-Cadastrar Disciplina\n3-Lista de professores\n4-Sair");
	    int opcao = leia.nextInt();
	  
	    switch(opcao) {
	    case 1 :
	    	ProfessorBO Cadastrar_professor = new ProfessorBO();
	    	
	    	System.out.println("Digite a matricula:");
	    	int matricula = leia.nextInt();
	    	
	    	System.out.println("Digite o nome:");
	    	String nomeProfessor = leia.next();
	    	
	    	System.out.println("Digite o numero");
	    	int numero = leia.nextInt();
	    	
	    	Professor professor = new Professor(matricula,nomeProfessor,numero);
	    	
	    	Cadastrar_professor.CadastrarProfessor(professor);
	    	
	       break;
	       
	    case 2:
	    	
    	DisciplinaBO Cadastrar_Disciplina = new DisciplinaBO();
	    	
	    	System.out.println("Digite o codigo da disciplina:");
	    	String codigo = leia.next();
	    	
	    	System.out.println("Digite o nome:");
	    	String nomeDisciplina = leia.next();
	    	
	    	System.out.println("Digite a carga horaria");
	    	int cargaHoraria = leia.nextInt();
	    	
	    	Disciplina disciplina = new Disciplina(codigo,nomeDisciplina,cargaHoraria);
	    	
	    	Cadastrar_Disciplina.CadastrarDisciplina(disciplina);
 
	    	break;
	    	
	    case 3:
	 
	    	break;
	    	
	    case 4:
	    
           break;
	}
	   
		}

		leia.close();
	}
	
	
}
