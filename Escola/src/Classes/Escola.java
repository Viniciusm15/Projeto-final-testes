package Classes;

import java.util.ArrayList;
import java.util.List;

public class Escola {
	private String endereco;
	private String cnpj;
	private String nome;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private List<Administrador> administradores = new ArrayList<Administrador>();
	private List<Professor> professores = new ArrayList<Professor>();
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	
	public void setAlunos(Aluno aluno) {
		if (aluno != null)
			this.alunos.add(aluno);
	}
	
	public List<Administrador> getAdministradores() {
		return administradores;
	}
	
	public void setAdministradores(Administrador administrador) {
		this.administradores.add(administrador);
	}
	
	public List<Professor> getProfessores() {
		return professores;
	}
	
	public void setProfessores(Professor professor) {
		this.professores.add(professor);
	}
}
