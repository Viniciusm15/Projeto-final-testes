package Classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private int idade;
	private String matricula;
	private int semestre;
	List<String> materias = new ArrayList<String>();
	private String endereco;
	int camposTratados;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int idade, String matricula, int semestre, String endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.semestre = semestre;
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public int getSemestre() {
		return semestre;
	}
	
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public void getMaterias() {
		for (int idx = 0; idx < this.materias.size(); ++idx) {
			System.out.println(getMateria(this.materias.get(idx)));
		}
	}
	
	public List<String> getArrayMaterias() {
		return this.materias;
	}
	
	public String getMateria(String materia) {
		return materia;
	}
	
	public void setMaterias(String materia) {
		this.materias.add(materia);
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
