TesteEstudante
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudante;

import java.util.Scanner;


public class Salário {
    public static void main(String[] args) {
        
        //criação do objeto
    	
         Aluno estudante = new Aluno();
         
         //apresentando objeto
         estudante.RegistroAluno = 19013;
         estudante.nome = "Marcus";
         estudante.nota = 'B';
         estudante.aulas = 10;
         estudante.frequencia = 7;
         estudante.matriculaTrancada = false || true;
         
         //Apresentando estudante
         
          System.out.println("\n\t\t\t -- Estudante -- \n");
          estudante.exibirAluno();
          
          
          //metodo frequencia
          
          estudante.responderChamada();
              
          //Apresentando frequencia
          
          System.out.println("\n\t\t\t --Horas Aulas-- \n");
          estudante.exibirChamada();
          
          
          //metodo matricula
          
          estudante.Matricula();
          
          //Apresentando matricula
          
          System.out.println("\n\t\t\t --Matricula-- \n");
          estudante.exibirMatricula();
    }



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */



public class Estudante {

	// variaveis estudante

	int RegistroAluno;
	String nome;
	char nota; // MB, B, R, I
	double aulas;
	double frequencia;
	boolean matriculaTrancada;

	// variavel de suporte para matricula

	String texto = "";

	// Apresentar aluno
	
	public void exibirAluno() {

		System.out.println("Registro Aluno: " + " " + RegistroAluno);
		System.out.println("Nome aluno: " + " " + nome);
		System.out.println("Nota aluno: " + " " + nota);

	}

	// metodo chamada

	public void responderChamada() {
		frequencia *= 1.25;
		aulas *= 1.25;
	}

	// Apresentar metodo chamada

	public void exibirChamada() {
		System.out.println("frequencia minima necessarias: " + " " + aulas);
		System.out.println("Horas frequentadas:" + " " + frequencia);
	}

	// metodo matricula

	public void Matricula() {

		if (matriculaTrancada = frequencia >= aulas)
			texto = "Aberta";
		else if (matriculaTrancada = frequencia < aulas)
			texto = "Trancada";
	}

	// Apresentar metodo matricula

	public void exibirMatricula() {
		System.out.println("Matricula:" + " " + texto);
	}
}

}
