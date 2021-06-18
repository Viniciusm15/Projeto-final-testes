package Maintenance;

import java.util.List;
import java.util.Scanner;

import Classes.Aluno;

public class TrataDadosAluno {
	public static void ImprimeDadosAlunos(List<Aluno> alunos) {
		for (int idx = 0; idx < alunos.size(); ++idx) {
			System.out.println((idx + 1) + ".");
			ImprimeDadosAluno(alunos.get(idx));
		}
	}
	
	public static void ImprimeDadosAluno(Aluno aluno) {
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Idade: " + aluno.getIdade());
		System.out.println("Endereco: " + aluno.getEndereco());
		System.out.println("Semestre: " + aluno.getSemestre());
		System.out.println("Matricula: " + aluno.getMatricula());
		System.out.println("Materias: ");
		aluno.getMaterias();
	}
	
	public static Aluno RequisitaDadosAluno() {
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Informe o nome do aluno");
		nome = sc.nextLine();
		aluno.setNome(nome);
		
		int idade;
		System.out.println("Informe a idade do aluno:");
		idade = sc.nextInt();
		aluno.setIdade(idade);
		
		sc.nextLine();
		
		String materia;
		System.out.println("Informe a matéria do aluno:");
		materia = sc.nextLine();
		aluno.setMaterias(materia);
		
		String endereco;
		System.out.println("Informe o endereço do aluno:");
		endereco = sc.nextLine();
		aluno.setEndereco(endereco);
		
		String matricula;
		System.out.println("Informe a matricula do aluno:");
		matricula = sc.nextLine();
		aluno.setMatricula(matricula);
		
		int semestre;
		System.out.println("Informe o semestre do aluno:");
		semestre = sc.nextInt();
		aluno.setSemestre(semestre);
		
		if (!ValidaDadosAluno(aluno))
			return null;
		
		return aluno;
	}
	
	public static boolean ValidaDadosAluno(Aluno aluno) {
		if (aluno.getNome().isEmpty())
			return false;
		
		if (aluno.getMatricula().isEmpty())
			return false;
		
		if (aluno.getIdade() == 0)
			return false;
		
		if (aluno.getSemestre() == 0)
			return false;
		
		if (aluno.getArrayMaterias().isEmpty())
			return false;
		
		if (aluno.getEndereco().isEmpty())
			return false;
		
		return true;
	}
}
