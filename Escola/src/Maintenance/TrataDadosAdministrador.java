package Maintenance;

import java.util.List;
import java.util.Scanner;

import Classes.Administrador;

public class TrataDadosAdministrador {
	public static boolean ValidaDadosAdministrador(Administrador administrador) {
		if (administrador.getEndereco().isEmpty())
			return false;
		
		if (administrador.getFuncao().isEmpty())
			return false;
		
		if (administrador.getIdade() == 0)
			return false;
		
		if (administrador.getNome().isEmpty())
			return false;
		
		if (administrador.getSalario() == 0)
			return false;
		
		if (administrador.getSetor().isEmpty())
			return false;
		
		return true;
	}
	
	public static void ImprimeDadosAdministradores(List<Administrador> administradores) {
		for (int idx = 0; idx < administradores.size(); ++idx) {
			System.out.println((idx + 1) + ".");
			ImprimeDadosAdministrador(administradores.get(idx));
		}
	}
	
	public static void ImprimeDadosAdministrador(Administrador administrador) {
		System.out.println("Endereco: " + administrador.getEndereco());
		System.out.println("Funcao: " + administrador.getFuncao());
		System.out.println("Idade: " + administrador.getIdade());
		System.out.println("Nome: " + administrador.getNome());
		System.out.println("Salario: " + administrador.getSalario());
		System.out.println("Setor: " + administrador.getSetor());
	}
	
	public static Administrador RequisitaDadosAdministrador() {
		Administrador administrador = new Administrador();
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Informe o nome do administrador: ");
		nome = sc.nextLine();
		administrador.setNome(nome);
		
		int idade;
		System.out.println("Informe a idade do administrador: ");
		idade = sc.nextInt();
		administrador.setIdade(idade);
		
		sc.nextLine();
		
		double salario;
		System.out.println("Informe o salário do administrador: ");
		salario = sc.nextDouble();
		administrador.setSalario(salario);
		
		sc.nextLine();
		
		String endereco;
		System.out.println("Informe o endereço do administrador: ");
		endereco = sc.nextLine();
		administrador.setEndereco(endereco);
		
		String funcao;
		System.out.println("Informe a função do administrador: ");
		funcao = sc.nextLine();
		administrador.setFuncao(funcao);
		
		String setor;
		System.out.println("Informe o setor do administrador: ");
		setor = sc.nextLine();
		administrador.setSetor(setor);
		
		if (!ValidaDadosAdministrador(administrador))
			return null;
	
		return administrador;
	}
}
