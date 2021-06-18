package Application;

import java.util.Scanner;

import Classes.Escola;
import Maintenance.RequisitaDados;
import Maintenance.TrataDadosAdministrador;
import Maintenance.TrataDadosAluno;
import Maintenance.TrataDadosProfessor;

public class Main {
	public static void MostraMenu() {
		System.out.println("1. Cadastra aluno");
		System.out.println("2. Cadastra professor");
		System.out.println("3. Cadastra administrador");
		System.out.println("4. Imprime aluno");
		System.out.println("5. Imprime professor");
		System.out.println("6. Imprime administrador");
		System.out.println("0. Sair");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Escola escola = new Escola();
		
		String nome;
		System.out.println("Informe o nome da escola: ");
		nome = sc.nextLine();
		
		String cnpj;
		System.out.println("Informe o CNPJ da escola: ");
		cnpj = sc.nextLine();
		
		String endereco;
		System.out.println("Informe o endereço da escola: ");
		endereco = sc.nextLine();
		
		escola.setNome(nome);
		escola.setCnpj(cnpj);
		escola.setEndereco(endereco);
		
		int opcao = 0;
		
		do {
			MostraMenu();
			opcao = sc.nextInt();
			
			switch (opcao) {
				case 1: escola.setAlunos(TrataDadosAluno.RequisitaDadosAluno()); break;
				case 2: escola.setProfessores(TrataDadosProfessor.RequisitaDadosProfessor()); break;
				case 3: escola.setAdministradores(TrataDadosAdministrador.RequisitaDadosAdministrador()); break;
				case 4: TrataDadosAluno.ImprimeDadosAlunos(escola.getAlunos()); break;
				case 5: TrataDadosProfessor.ImprimeDadosProfessores(escola.getProfessores()); break;
				case 6: TrataDadosAdministrador.ImprimeDadosAdministradores(escola.getAdministradores()); break;
			}
		} while (opcao != 0);
		
	}
}
