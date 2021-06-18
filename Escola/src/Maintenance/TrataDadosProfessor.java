package Maintenance;

import java.util.List;
import java.util.Scanner;

import Classes.Professor;

public class TrataDadosProfessor {
	public static boolean ValidaDadosProfessor(Professor professor) {
		if (professor.getNome().isEmpty())
			return false;
		
		if (professor.getMateria().isEmpty())
			return false;
		
		if (professor.getIdade() == 0)
			return false;
		
		if (professor.getSalario() == 0)
			return false;
		
		if (professor.getEndereco().isEmpty())
			return false;
		
		return true;
	}
	
	public static void ImprimeDadosProfessores(List<Professor> professores) {
		for (int idx = 0; idx < professores.size(); ++idx) {
			System.out.println((idx + 1) + "");
			ImprimeDadosProfessor(professores.get(idx));
		}
	}
	
	public static void ImprimeDadosProfessor(Professor professor) {
		System.out.println("Nome: " + professor.getNome());
		System.out.println("Idade: " + professor.getIdade());
		System.out.println("Endereço: " + professor.getEndereco());
		System.out.println("Materia: " + professor.getMateria());
		System.out.println("Salario: " + professor.getSalario());
	}
	
	public static Professor RequisitaDadosProfessor() {
		Professor professor = new Professor();
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Informe o nome do professor");
		nome = sc.nextLine();
		professor.setNome(nome);
		
		int idade = 0;
		System.out.println("Informe a idade do professor: ");
		idade = sc.nextInt();
		professor.setIdade(idade);
		
		sc.nextLine();
		
		String materia;
		System.out.println("Informe a matéria do professor: ");
		materia = sc.nextLine();
		professor.setMateria(materia);
		
		String endereco;
		System.out.println("Informe o endereço do professor: ");
		endereco = sc.nextLine();
		professor.setEndereco(endereco);
		
		double salario;
		System.out.println("Informe o salário do professor: ");
		salario = sc.nextDouble();
		professor.setSalario(salario);
		
		sc.nextLine();
		
		if (!ValidaDadosProfessor(professor))
			return null;
		
		return professor;
	}
}
