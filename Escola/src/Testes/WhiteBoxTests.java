package Testes;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import Classes.Aluno;
import Classes.Escola;
import Maintenance.TrataDadosAluno;
import Maintenance.TrataDadosEscola;

public class WhiteBoxTests {
	
	@Test
	public void validaDadosAlunoTest() {
		
		Aluno aluno = alunoTeste();
		aluno.setMaterias("MatériaA");
		
		boolean resultado = TrataDadosAluno.ValidaDadosAluno(aluno);
		
		assertThat(resultado, is(true));
	}
	
	@Test
	public void validaDadosEscolaTest () {
		
		Escola escola = new Escola();
		escola.setNome("ABC");
		escola.setCnpj("90.079.123/0001-52");
		escola.setEndereco("EnderecoForTest");
		
		boolean resultado = new TrataDadosEscola().validaDadosEscola(escola);
		
		assertThat(resultado, is(true));
	}
	
	private Aluno alunoTeste() {
		return new Aluno("NomeForTest", 18, "202120801740", 4, "EnderecoForTest");
	}
}
