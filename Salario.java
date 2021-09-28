package Salário.copy;

Testefuncionario
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class TesteFuncionario {
	
    public static void main(String[] args) {
    	
        //criando objeto
    	
        Funcionario funcionario = new Funcionario();
        
        //apresentando objeto
        
        funcionario.numRegistro = 123456;
        funcionario.nome = "Reboleixon";
        funcionario.nivel = 'T';
        funcionario.salario = 4000;
        funcionario.afastado = false;
        
        //Apresentando funcionario
        
        System.out.println("\n\t\t\t --Funcionario-- \n");
        funcionario.exibirFuncionario();
        
        //apresentando salario com reajuste IR
        
        System.out.println("\n\t\t\t --Reajuste salario IR-- \n");
        funcionario.salarioIR();
        
        //apresentando salario com acrecimo
        
        System.out.println("\n\t\t\t --Salario com acrécimo-- \n");
        funcionario.acrecimoSalario();
    }



funcionario.java
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**

*/
    public class Funcionario {

    //Variaveis funcionario
	
    int numRegistro;
    String nome;
    char nivel;// [T | J | P | S ]
    double salario;
    boolean afastado;

    
    // apresentar funcionario
    
    public void exibirFuncionario(){
    System.out.println("Numero Registro:" + " " + numRegistro);
    System.out.println("Nome Funcionario:" + " " + nome);
    System.out.println("Nivel:" + " " + nivel);
    System.out.println("Salario: " + " " + salario);
    System.out.println("Afastado:" + " " + afastado);
    }
    
    
    // calculo salario IR
    
    public void salarioIR(){

    if(salario <=3000){
        salario = salario;
    }else if((salario > 3000) && (salario<=8000)){
        salario = salario - (0.1 * salario);
    }else if((salario > 8000) && (salario <=12000)){
        salario = salario - (0.2 * salario);
    }else{
        salario = salario - (0.3 * salario);
    }
    System.out.println("Salario: " + " " + salario);
    }

    //acrécimo salario
    
    public void acrecimoSalario(){
    if(nivel == 'T'){
        salario += 1000;
    }else if(nivel == 'J'){
        salario += 800;
    }else if(nivel == 'P'){
        salario += 500;
    }else if(nivel == 'S'){
        salario += 200;
    }
    System.out.println("Salario: " + " " + salario);
    }
}
}
