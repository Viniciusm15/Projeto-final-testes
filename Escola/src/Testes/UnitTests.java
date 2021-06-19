package Testes;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import Classes.Aluno;

public class UnitTests {
	
	@Test
	public void getNomeAlunoTest() {
		
		Aluno aluno = alunoTeste();
		
		assertThat(aluno.getNome(), is("NomeForTest"));
	}
	
	@Test
	public void criarObjetoAlunoTest() {
		
		Aluno aluno = alunoTeste();
		
		assertThat(aluno.getNome(), is("NomeForTest"));
		assertThat(aluno.getIdade(), is(18));
		assertThat(aluno.getMatricula(), is("202120801740"));
		assertThat(aluno.getSemestre(), is(4));
		assertThat(aluno.getEndereco(), is("EnderecoForTest"));
	}
	
	private Aluno alunoTeste() {
		return new Aluno("NomeForTest", 18, "202120801740", 4, "EnderecoForTest");
	}
}
