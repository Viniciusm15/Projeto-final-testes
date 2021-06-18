package Maintenance;

import java.util.Scanner;

import Classes.Escola;

public class TrataDadosEscola {
	private TrataDadosAdministrador trataDadosAdministrador;
	private TrataDadosAluno trataDadosAluno;
	private TrataDadosProfessor trataDadosProfessor;
	
	public Escola requisitaDadosEscola() {
		Escola escola = new Escola();
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Informe o nome da escola: ");
		nome = sc.nextLine();
		escola.setNome(nome);
		
		String cnpj;
		System.out.println("Informe o CNPJ da escola: ");
		cnpj = sc.nextLine();
		escola.setCnpj(cnpj);
		
		String endereco;
		System.out.println("Informe o endereco da escola: ");
		endereco = sc.nextLine();
		escola.setEndereco(endereco);
		
		if (!validaDadosEscola(escola))
			return null;
		
		return escola;
	}
	
	public boolean validaDadosEscola(Escola escola) {
		if (escola.getNome().isEmpty())
			return false;
		
		if (escola.getCnpj().isEmpty())
			return false;
		
		if (escola.getEndereco().isEmpty())
			return false;
		
		return true;
	}
}
