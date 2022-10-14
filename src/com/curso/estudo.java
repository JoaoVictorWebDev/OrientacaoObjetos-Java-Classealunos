package com.curso;

import java.util.Scanner;	

import javax.swing.JOptionPane;

import cursojava.classes.*;

import java.util.ArrayList;

import java.util.List;

public class estudo {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int qtd = 1; qtd <= 2; qtd++){

		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		String idade = JOptionPane.showInputDialog("Qual a sua idade?");
		String dataNasci = JOptionPane.showInputDialog("Qual a sua data de Nascimento?");
		String dataMatri = JOptionPane.showInputDialog("Qual a sua data de Matricula?");
		String NomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da sua Mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do seu Pai?");
		String serieMatriculada = JOptionPane.showInputDialog("Qual o nome da Escola?");
		String numeroCPF = JOptionPane.showInputDialog("Qual o seu CPF?");
		String registroGeral = JOptionPane.showInputDialog("Digite seu Registro Geral :");

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setDataNascimento(dataNasci);
		aluno.setDataMatricula(dataMatri);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setNomeEscola(NomeEscola);
		aluno.setNomeMae(nomeMae);
		aluno.setNomePai(nomePai);
		aluno.setSerieMatriculado(serieMatriculada);
		aluno.setNumeroCpf(numeroCPF);
		aluno.setRegistroGeral(registroGeral);
		
		for(int pos = 1; pos <=4 ; pos++){
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina:" + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Insira sua nota" + pos + "?");
			
			
			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina1(nomeDisciplina);
			disciplina.setN1(Double.valueOf(notaDisciplina));
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null,"Deseja Remover, Alguma coisa?");
		
		if(escolha == 0){
			
			
			int continuarRemover = 0;
			int posicao = 1;
			while(continuarRemover == 0){
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina? 1,2,3 ou 4");
				aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()- posicao);
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover");
			}
			
		}
        	
	     alunos.add(aluno);
		}
		
		for (Aluno aluno : alunos) {

			   if(aluno.getNome().equalsIgnoreCase("Joao")){
			    alunos.remove(aluno);
			    break;
		
		        
		        
			
      }else{
    	    System.out.println("Media do Aluno :" + aluno.getMediaNota());
	        System.out.println("Resultado = " + aluno.getAlunoAprovado2());
	        System.out.println("----------------------------------------");
	        System.out.println(aluno);  
      
      }
      }
       
       
	}
	
}
